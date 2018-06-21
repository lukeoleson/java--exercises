/*
Program name: FindDivisibleByXY.java
Purpose:      Find and display all the numbers divisible by either x or y
              between 1 and 100.
*/

public class  FindDivisibleByXY {
    public static void main(String[] args) {

        int x = 3, y = 7;

        int i = 1;
        while(i <= 100) {

        if ((i % x) == 0)
            System.out.println(i);

        else if ((i % y) == 0)
            System.out.println(i);

        i++;

        }
    }
}
