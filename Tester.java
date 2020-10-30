public class Tester {
  public static void main(String args[]) {
    // Point first = new Point(3, 4);
    // System.out.println(first);
    // Point second = new Point(first);
    // System.out.println(second);
    // Point third = new Point(0, 0);
    // System.out.println(first.distanceTo(third));
    // System.out.println(first.equals(second));
    // System.out.println(first.equals(third));
    double x1 = Double.parseDouble(args[0]);
    double y1 = Double.parseDouble(args[1]);
    double x2 = Double.parseDouble(args[2]);
    double y2 = Double.parseDouble(args[3]);
    double x3 = Double.parseDouble(args[4]);
    double y3 = Double.parseDouble(args[5]);
    Triangle tri = new Triangle(x1, y1, x2, y2, x3, y3);
    // System.out.println(tri);
    System.out.println(tri.classify());
    System.out.println(tri.getPerimeter());
    System.out.println(tri.getArea());

}
}
//Test Cases

//java testTriangle -2 0 0 0 1 0: scalene, 6.0, 0.0
//java testTriangle 2 0 -1 1.73205 -1 -1.73205: equilateral, 10.3923, 5.1961
//java testTriangle 0 0 3 0 3 4: scalene, 12.0, 6.0
//java testTriangle 0 0 1 0 0 1: isosceles, 3.4142, 0.5
//java testTriangle 0 12 5 0 -9 0: scalene 42.0 84.0
