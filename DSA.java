import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

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

    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store the sorted string as key and list of anagrams as value
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str : strs) {
            // Convert the string to a character array, sort it, and then convert it back to
            // a string
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);

            // If the sorted string is already a key, add the original string to its list
            if (!anagramsMap.containsKey(sortedStr)) {
                anagramsMap.put(sortedStr, new ArrayList<>());
            }
            anagramsMap.get(sortedStr).add(str);
        }

        // Create the result list from all the values in the map
        return new ArrayList<>(anagramsMap.values());
    }

    // create a hashmap to store the sorted string as key and list of anagrams as
    // value
    // iterate through the array
    // convert the string to a character array, sort it, and then convert it back to
    // a string
    // if the sorted string is already a key, add the original string to its list
    // create the result list from all the values in the map
    // Time complexity: O(n k log k)
    // Space complexity: O(n k)

    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) {
            int[] oneAns = new int[1];
            oneAns[0] = nums[0];
            return oneAns;
        }

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }

        int[] results = hashMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();

        return results;
    }

    // create a hashmap to store the numbers
    // iterate through the array
    // if the number is not in the hashmap, add it
    // else increment the value
    // sort the hashmap by value in descending order
    // limit the results to k
    // convert the results to an array
    // return the results
    // Time complexity: O(n log n)
    // Space complexity: O(n)

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] productLeft = new int[length];
        int[] productRight = new int[length];
        int[] product = new int[length];

        productLeft[0] = 1;
        for (int i = 1; i < length; i++) {
            productLeft[i] = productLeft[i - 1] * nums[i - 1];
        }

        productRight[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            productRight[i] = productRight[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            product[i] = productLeft[i] * productRight[i];
        }

        return product;
    }

    // create three arrays to store the product of the left, right, and final
    // product
    // iterate through the array to calculate the product of the left
    // iterate through the array to calculate the product of the right
    // iterate through the array to calculate the final product
    // return the final product
    // Time complexity: O(n)
    // Space complexity: O(n)

    public boolean isPalindrome(String s) {
        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder stringBuilder = new StringBuilder(cleanS);

        stringBuilder.reverse();

        String reversedS = stringBuilder.toString();

        return cleanS.equalsIgnoreCase(reversedS);
    }

    // remove all non-alphanumeric characters from the string
    // reverse the string
    // compare the original string to the reversed string
    // return the result
    // Time complexity: O(n)

    public int maxArea(int[] height) {
        int maxVolume = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int maxHeight = Math.min(height[left], height[right]);
            int instVol = maxHeight * (right - left);
            maxVolume = Math.max(maxVolume, instVol);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxVolume;
    }

    // create a variable to store the maximum volume
    // create two pointers to store the left and right indices
    // iterate through the array
    // calculate the maximum height
    // calculate the instant volume
    // update the maximum volume
    // move the pointers
    // return the maximum volume
    // Time complexity: O(n)
    // Space complexity: O(1)

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate the profit if we sell at the current price
            int profit = prices[i] - minPrice;
            // Update the maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    // create a variable to store the maximum profit
    // create a variable to store the minimum price
    // iterate through the array
    // update the minimum price
    // calculate the profit if we sell at the current price
    // update the maximum profit
    // return the maximum profit
    // Time complexity: O(n)
    // Space complexity: O(1)

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('{', '}');
        bracketPairs.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            char currentBracket = s.charAt(i);

            if (bracketPairs.containsKey(currentBracket)) {
                stack.push(currentBracket);
            } else {
                // Check if stack is empty or if the popped character does not match
                if (stack.isEmpty() || bracketPairs.get(stack.pop()) != currentBracket) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // create a stack to store the brackets
    // create a hashmap to store the bracket pairs
    // iterate through the string
    // if the bracket is an opening bracket, push it to the stack
    // else check if the stack is empty or if the popped character does not match
    // return false
    // return true if the stack is empty
    // Time complexity: O(n)
    // Space complexity: O(n)

    // public ListNode reverseList(ListNode head) {
    //     ListNode previous = null; 
    //     ListNode current = head;   
    //     ListNode next = null;   

    //     while (current != null) {
    //         next = current.next;   
    //         current.next = previous; 
    //         previous = current;    
    //         current = next;         
    //     }

    //     return previous;    
    // }

    // create three pointers to store the previous, current, and next nodes
    // iterate through the linked list
    // update the pointers
    // return the previous node
    // Time complexity: O(n)
    // Space complexity: O(1)

    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //     ListNode current1 = list1;
    //     ListNode current2 = list2;
    //     ListNode head = null;
        
    //     if (list1 == null && list2 == null) {
    //         return null; 
    //     }
    //     if (list1 == null) {
    //         return list2; 
    //     }
    //     if (list2 == null) {
    //         return list1; 
    //     }
    //     if (list1.val < list2.val) {
    //         head = list1;
    //         current1 = current1.next;
    //     } else {
    //         head = list2;
    //         current2 = current2.next;
    //     }

    //     ListNode tail = head;

    //     while (current1 != null && current2 != null) {
    //         if (current1.val < current2.val) {
    //             tail.next = current1;
    //             current1 = current1.next;
    //         } else {
    //             tail.next = current2;
    //             current2 = current2.next;
    //         }
    //         tail = tail.next;
    //     }

    //     if (current1 != null) {
    //         tail.next = current1;
    //     } else if (current2 != null) {
    //         tail.next = current2;
    //     }

    //     return head; 
    // }

    // create pointers to store the current and next nodes for both lists
    // create a pointer to store the head of the merged list
    // check if both lists are empty
    // check if one of the lists is empty
    // check which list has the smaller value and set the head to that list
    // set the tail to the head
    // iterate through the lists
    // set the tail next to the smaller value
    // move the tail
    // check if one of the lists is empty
    // return the head
    // Time complexity: O(n)
    // Space complexity: O(1)

    //     public void reorderList(ListNode head) {
    // if (head == null || head.next == null) return;

    // // Step 1: Find the middle of the list using slow and fast pointers
    // ListNode slow = head, fast = head;
    // while (fast != null && fast.next != null) {
    //     slow = slow.next;
    //     fast = fast.next.next;
    // }

    // // Step 2: Reverse the second half of the list
    // ListNode prev = null, current = slow, temp = null;
    // while (current != null) {
    //     temp = current.next;
    //     current.next = prev;
    //     prev = current;
    //     current = temp;
    // }

    // // Step 3: Merge the two halves
    // ListNode first = head, second = prev;
    // while (second.next != null) {
    //     temp = first.next;
    //     first.next = second;
    //     first = temp;

    //     temp = second.next;
    //     second.next = first;
    //     second = temp;
    // }
    // }

    // create two pointers to store the slow and fast nodes
    // iterate through the list to find the middle node
    // create three pointers to store the previous, current, and next nodes
    // iterate through the second half of the list to reverse it
    // create two pointers to store the first and second halves of the list
    // iterate through the list to merge the two halves
    // Time complexity: O(n)
    // Space complexity: O(1)

    // public TreeNode invertTree(TreeNode root) {

    //     if(root == null){
    //         return root;
    //     }

    // TreeNode temp = root.left;
    // root.left = root.right;
    // root.right = temp;
    // invertTree(root.left);
    // invertTree(root.right);

    // return root; 
    // }

    // check if the root is null
    // create a temporary node to store the left node
    // swap the left and right nodes
    // recursively call the function on the left and right nodes
    // return the root
    // Time complexity: O(n)
    // Space complexity: O(n)







}
