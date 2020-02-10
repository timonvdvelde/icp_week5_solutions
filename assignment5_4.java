class Main {
  /*
   * Converts temperature in Fahrenheit to Celsius.
   */
  static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  /*
   * Converts temperature in Celsius to Fahrenheit.
   */
  static double celsiusToFahrenheit(double celsius) {
    return celsius * 9 / 5 + 32;
  }

  /*
   * Prints two tables showing conversion between various
   * temperatures in Fahrenheit and Celsius.
   */
  public static void main(String[] args) {
    double celsius, fahrenheit;

    System.out.println("Celsius Fahrenheit");

    for (int i = 0; i < 110; i+=10) {
      celsius = i;
      fahrenheit = celsiusToFahrenheit(celsius);
      System.out.printf("%6.2f  %6.2f\n", celsius, fahrenheit);
    }

    System.out.println();
    System.out.println("Fahrenheit Celsius");

    for (int i = 0; i < 110; i+=10) {
      fahrenheit = i;
      celsius = fahrenheitToCelsius(fahrenheit);
      System.out.printf("%6.2f     %6.2f\n", fahrenheit, celsius);
    }
  }
}
