package Helpers;

import java.util.Arrays;
import java.util.Iterator;

public class Helpers {
  public static void print(Object... args) {
    if (args.getClass() != Object[].class) {
      System.out.println(getStringRepresentation(args));
      return;
    }

    StringBuilder sb = new StringBuilder();
    for (Object arg : args) {
      sb.append(getStringRepresentation(arg)).append(" ");
    }
    System.out.println(sb.toString().trim());
  }

  private static String getStringRepresentation(Object arg) {
    if (arg.getClass().isArray()) {
      Class<?> type = arg.getClass().getComponentType();
      if (type.isPrimitive()) {
        if (type == int.class)
          return Arrays.toString((int[]) arg);
        if (type == double.class)
          return Arrays.toString((double[]) arg);
        if (type == float.class)
          return Arrays.toString((float[]) arg);
        if (type == long.class)
          return Arrays.toString((long[]) arg);
        if (type == short.class)
          return Arrays.toString((short[]) arg);
        if (type == byte.class)
          return Arrays.toString((byte[]) arg);
        if (type == char.class)
          return Arrays.toString((char[]) arg);
        if (type == boolean.class)
          return Arrays.toString((boolean[]) arg);
      }
      Object[] objects = (Object[]) arg;
      return Arrays.deepToString(objects);
    }

    if (arg instanceof Iterable) {
      StringBuilder sb = new StringBuilder();
      sb.append("[");
      Iterator<?> iterator = ((Iterable<?>) arg).iterator();
      if (iterator.hasNext()) {
        sb.append(getStringRepresentation(iterator.next()));
      }
      while (iterator.hasNext()) {
        sb.append(", ").append(getStringRepresentation(iterator.next()));
      }
      sb.append("]");
      return sb.toString();
    }

    return arg.toString();
  }

  public static void main(String[] args) {
    print(7);
  }
}
