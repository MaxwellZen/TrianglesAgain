public class Triangle {
  private Point v1, v2, v3;
  public static double round(double x) {
    return Math.round(x*1e4)*1e-4;
  }
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle (double x1, double y1, double x2, double y2, double x3, double y3) {
    Point a = new Point(x1, y1);
    Point b = new Point(x2, y2);
    Point c = new Point(x3, y3);
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea() {
    double a = v1.distanceTo(v2), b = v2.distanceTo(v3), c = v3.distanceTo(v1);
    double s = getPerimeter() / 2;
    return Math.sqrt(s * (s-a) * (s-b) * (s-c));
  }
  public String classify() {
    double a = round(v1.distanceTo(v2));
    double b = round(v2.distanceTo(v3));
    double c = round(v3.distanceTo(v1));
    if (a == b && b == c) return "equilateral";
    if (a == b || b == c || a == c) return "isosceles";
    return "scalene";
  }
}
