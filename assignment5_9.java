import java.util.Scanner;

class Main {

  /*
   * Separates number into digits and multiplies them.
   */
  static int multiplyDigits(int number) {
    int digit;
    int multiplied = 1;

    // Keep stripping number of digits until it becomes zero.
    while (number > 0) {
      digit = number % 10;
      number = number / 10;
      multiplied *= digit;
    }

    return multiplied;
  }

  /*
   * Asks for a number, shows the digits multiplied.
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;

    System.out.println("Please insert a number.");
    number = input.nextInt();
    System.out.println("The digits multiplied are: ");
    System.out.println(multiplyDigits(number));
  }
}

