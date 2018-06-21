/*
Program name: RightRotate.java
Purpose:      Move the rightmost digit in a number to the leftmost position
              e.g.  738392 --> 273839
*/

public class RightRotate{
  public static void main(String[] args) {

    // input number
    int inputNumber = 738392;
    int newNumber;

    newNumber = RightRotate(inputNumber);

    System.out.println("The original number was " + inputNumber +
    "\nThe right-rotated number is " + newNumber);

  }

  public static int RightRotate(int n) {

    int rightMostDigit, otherDigits, quotient, position;

    rightMostDigit = n % 10;
    otherDigits = n / 10;
    quotient = n / 10;
    position = 1;

    while (quotient > 0) {
      quotient /= 10;
      position *= 10;
    }

    return (rightMostDigit * position) + otherDigits;

  }
}
