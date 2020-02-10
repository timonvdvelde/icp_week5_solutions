import java.util.Scanner;

class Main {

  /*
   * Prints an n*n matrix of random ones and zeros
   */
  static void printMatrix(int n) {
    int random;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        random = (int) (Math.random() * 2);
        System.out.printf("%d ", random);
      }
      System.out.println();
    }
  }

  /*
   * Asks for user to specify size of matrix, then prints it.
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;

    System.out.println("What size of matrix do you want?");
    n = input.nextInt();

    printMatrix(n);
  }
}
