import net.sf.saxon.functions.ConstantFunction;

import java.util.*;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] diceArr = {1, 2, 3, 4, 5, 6};
        return diceArr;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        if (customer.equals("Ergun")) {
            String[] order = {"beyti", "pizza", "hamburger", "tea"};
            return order;
        }
        else if (customer.equals("Erik")) {
            String[] order = {"sushi", "pasta", "avocado", "coffee"};
            return order;
        }
        else {
            String[] emptyOrder = new String[3];
            return emptyOrder;
        }
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int arrLen = array.length;
        int minNum = array[0];
        int maxNum = array[0];
        for (int num: array) {
            if (num > maxNum) {
                maxNum = num;
            }
            if (num < minNum) {
                minNum = num;
            }
        }
        return (maxNum - minNum);
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.
        if (x == 1) {
            list.add(x);
            return list;
        }

        list.add(x);
        if (x % 2 == 0) {
            x /= 2;
        }
        else {
            x = 3 * x + 1;
        }
        return hailstoneHelper(x, list);
    }
}
