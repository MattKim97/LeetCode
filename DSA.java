import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DSA {

    public boolean containsDuplicate(int[] numbs) {
        Set<Integer> noDupes = new HashSet<>();
        for (int num : numbs) {
            noDupes.add(num);
        }

        if (noDupes.size() < numbs.length) {
            return true;
        } else {
            return false;
        }
    }
    // create a set to store the numbers
    // iterate through the array
    // add each number to the set
    // if the set size is less than the array length, return true
    // else return false
    // Time complexity: O(n)
    // Space complexity: O(n)

    public boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    // convert the strings to char arrays
    // sort the char arrays
    // compare the sorted char arrays
    // return the result
    // Time complexity: O(n log n)
    // Space complexity: O(n)

    public int[] twoSum(int[] numb, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] solutions = new int[2];
        for (int i = 0; i < numb.length; i++) {
            int remainder = target - numb[i];
            if (hashMap.get(remainder) != null) {
                solutions[0] = hashMap.get(remainder);
                solutions[1] = i;
                break;
            } else {
                hashMap.put(numb[i], i);
            }
        }
        return solutions;
    }

    // create a hashmap to store the numbers
    // iterate through the array
    // calculate the remainder
    // if the remainder is in the hashmap, return the indices
    // else add the number to the hashmap
    // Time complexity: O(n)
    // Space complexity: O(n)


}
