import java.util.Scanner;

class Main {
  
  /*
   * Takes a string and returns its reverse
   */
  static String reverse(String number) {
    String reversed = "";

    // start looping at the end of the original string
    // add characters to reversed string.
    for (int i = number.length() - 1; i >= 0; i--) {
      reversed += number.charAt(i);
    }

    return reversed;
  }

  /*
   * Checks if the string is the same reversed. Returns true or false.
   */
  static boolean isPalindrome(String number) {
    String reversed = reverse(number);

    if (number.equals(reversed)) {
      return true;
    }

    return false;
  }

  /*
   * Asks the user for a number, prints if the number is a palindrome.
   */ 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String number;

    System.out.println("Please enter a number");
    number = input.nextLine();

    // we could/should check if the input contains only digits

    if (isPalindrome(number)) {
      System.out.println("Palindrooome!");
    }
    else {
      System.out.println("Not a palindrome.");
    }
    

  }

}

