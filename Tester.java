public class Tester {
  public static void main(String args[]) {
    Point first = new Point(3, 4);
    System.out.println(first);
    Point second = new Point(first);
    System.out.println(second);
    Point third = new Point(0, 0);
    System.out.println(first.distanceTo(third));
    System.out.println(first.equals(second));
    System.out.println(first.equals(third));
  }
}
