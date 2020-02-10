import java.util.Scanner;

class Main {

  /*
   * Counts the number of letters in string s.
   */
  static int countLetters(String s) {
    int counter = 0;
    
    // For each character in the string, checks if it's a letter
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i))) {
        counter += 1;
      }
    }

    return counter;
  }

  /*
   * Asks the user for a string, then prints how many letters
   * are in the string.
   */
  public static void main(String[] args) {
    int letters;
    String in;
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a string:");
    in = input.nextLine();

    letters = countLetters(in);
    System.out.printf("The string contains %d letters\n", letters); 
  }
}
