package lecture5;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 4/14/2016.
 */
public class SumOfEnteredValue {
    public static void main(String[] args) {
        System.out.println("Please enter some value");
        Scanner enterValue = new Scanner(System.in);
        int sum = 0;
        int nextValue = 0;
        do {
            sum += nextValue;
            nextValue = enterValue.nextInt();
        } while (nextValue > 0);
        System.out.println(sum);
    }
}
