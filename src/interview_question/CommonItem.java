package interview_question;

import java.util.*;
import java.util.stream.Stream;

public class CommonItem {

    /* Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
  For Example:
  const array1 = ['a', 'b', 'c', 'x'];
  const array2 = ['z', 'y', 'i'];
  should return false.
  -----------
  const array1 = ['a', 'b', 'c', 'x'];
  const array2 = ['z', 'y', 'x'];
  should return true.
  2 parameters - arrays - no size limit
  return true or false
  */

    public static void main(String[] args) {
        Object[] array1 = {'a', 'b', 'c', 'x'};
        Object[] array2 = {'z', 'y', 'o', 'a'};
        boolean result = findCommonItem3(array1, array2);
        System.out.println(result);
    }

    /**
     * A "naive" approach for solving the question, with
     * time complexity of O(a * b) - exponential
     * space complexity of O(1) - constant.
     * Please note that we have to use {@link Objects#equals(Object, Object)} method so strings would work properly and we are using the
     * equals method in {@link Objects} class so we could accept null inputs without null exception
     * @param array1 - the first input array
     * @param array2 - the second input array
     * @return A boolean indicating whether those two arrays have any common items
     */
    public static boolean findCommonItem(Object[] array1, Object[] array2) {
        for (Object obj1 : array1) {
            for (Object boj2 : array2) {
                if (obj1.equals(boj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * A better solution which includes the use of {@link HashSet}, here we are using {@link HashSet}
     * and NOT {@link HashMap} (key, value data structure) as it was demonstrated in the course as
     * there is no reason to store true for each key and we can check for common objects using the {@link HashSet#contains(Object)} method.
     * time complexity of O(b) - linear
     * space complexity of O(a) - linear
     * @param array1 - the first input array
     * @param array2 - the second input array
     * @return A boolean indicating whether those two arrays have any common items
     */
    public static boolean findCommonItem2(Object[] array1, Object[] array2) {
        Set<Object> mapOfFirstArray = new HashSet<Object>();
        for (Object obj1 : array1) {
            mapOfFirstArray.add(obj1);
        }
        for (Object obj2 : array2) {
            if (mapOfFirstArray.contains(obj2)) {
                return true;
            }
        }
        return false;
    }

    /**
     * A better and cleaner solution which includes the use of {@link HashSet}, here we are using {@link HashSet}
     * and NOT {@link HashMap} (key, value data structure) as it was demonstrated in the course as
     * there is no reason to store true for each key and we can check for common objects using the {@link HashSet#contains(Object)} method.
     * This method also takes advantage of features added in Java SE8 ({@link Stream})
     * time complexity of O(b) - linear
     * space complexity of O(a) - linear
     * @param array1 - the first input array
     * @param array2 - the second input array
     * @return A boolean indicating whether those two arrays have any common items
     */
    public static boolean findCommonItem3(Object[] array1, Object[] array2) {
        HashSet<Object> mapOfArray = new HashSet<>(Arrays.asList(array1));
        return Stream.of(array2).anyMatch(mapOfArray::contains);
    }
}