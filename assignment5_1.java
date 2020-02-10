import java.util.Scanner;

class Main {

  /*
   * Calculates the area of a polygon with n sides and radius r.
   */
  static double polygonSurface(int n, double r) {
    double s = 2 * r * Math.sin(Math.PI / n);
    double area = (n * s * s) / (4 * Math.tan(Math.PI / n));

    return area;
  }

  /*
   * Asks user for n and r to calculate area of polygon.
   */
  public static void main(String[] args) {
    double radius, area;
    int n;
    Scanner input = new Scanner(System.in);

    // Get input
    System.out.println("How many sides does your figure have?");
    n = input.nextInt();
    System.out.println("What is the radius?");
    radius = input.nextDouble();

    // Calculate area.
    area = polygonSurface(n, radius);

    // Output
    System.out.printf("Its surface area is %.2f\n", area);
  }
}

