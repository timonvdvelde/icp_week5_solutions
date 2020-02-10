import java.util.Scanner;

class Main {

  /*
   * Finds the greatest common denominator between a and b.
   */
  static int greatestDenominator(int a, int b) {
    int denominator = 0;

    // Loops from 0 to max(a, b) to test denominators
    for (int i = 1; i < Math.max(a, b); i++) {
      if (a % i == 0 && b % i == 0) {
        denominator = i;
      }
    }

    return denominator;
  }

  /*
   * Asks user for two numbers, then finds their gcd.
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b;

    System.out.println("Please input two integers.");
    a = input.nextInt();
    b = input.nextInt();

    System.out.println("Greatest common denominator is: ");
    System.out.println(greatestDenominator(a, b));

  }
}
