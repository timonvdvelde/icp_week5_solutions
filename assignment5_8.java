import java.util.Scanner;

class Main {

  /*
   * Counts the number of letters in string s.
   */
  static int countLetter(String s, char ch) {
    int counter = 0;
    
    // For each character in the string, checks if it's a letter
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ch) {
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
    char ch;
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a string:");
    in = input.nextLine();

    System.out.println("Please enter a character:");
    ch = input.nextLine().charAt(0);

    letters = countLetter(in, ch);
    System.out.printf("The string contains the letter '%s' %d times\n",ch, letters); 
  }
}
