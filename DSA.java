import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DSA {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> noDupes = new HashSet<>();
        for (int num : nums) {
            noDupes.add(num);
        }

        if (noDupes.size() < nums.length) {
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
    



}
