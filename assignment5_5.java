class Main {

  /*
   * Returns whether a given number is prime or not.
   */
  static boolean isPrime(int candidate) {
    // Make sure we start at the right number.
    if (candidate < 2) {
      return false;
    }

    boolean prime = true;

    for (int i = 2; i < candidate; i++) {
      // Clearly number is not prime.
      if (candidate % i == 0) {
        prime = false;
        break;
      }
    }

    return prime;
  }

  /*
   * Uses while loop to find first 150 primes.
   */
  public static void main(String[] args) {
    int counter = 0, candidate = 0;

    // Keep going until we find 150 prime numbers
    while (counter < 150) {
      if (isPrime(candidate)) {
        System.out.printf("%3d ", candidate);
        counter += 1;

        // Print new lines when appropriate
        if (counter % 10 == 0) {
          System.out.println();
        }
      }
      // Always increment to test new candidate.
      candidate += 1;
    }
    
  }
}


