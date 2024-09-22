import java.util.*;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.isEmpty()) {
            return 0;
        }
        int listSum = 0;
        for (int num: L) {
            listSum += num;
        }
        return listSum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evenList = new ArrayList<>();
        for (int num: L) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        Set<Integer> set1 = new HashSet<>(L1);
        Set<Integer> set2 = new HashSet<>(L2);
        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (String word: words) {
            if (word.indexOf(c) != -1) {
                count += 1;
            }
        }
        return count;
    }
}
