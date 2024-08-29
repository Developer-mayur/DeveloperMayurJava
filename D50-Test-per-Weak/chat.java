import java.util.Scanner;
import java.util.*;

class Quest {
    Scanner sc = new Scanner(System.in);

    // Q1: Reverse an Array
    void reverseArray() {
        int[] arr = new int[6];
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array in reverse order:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Q2: Check if a Name Exists in an Array
    void checkName() {
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("Enter the name to search:");
        String nameToSearch = sc.nextLine();
        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase(nameToSearch)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(nameToSearch + " is found in the array.");
        } else {
            System.out.println(nameToSearch + " is not found in the array.");
        }
    }

    // Q3: Sum of Array Elements
    void sumOfArray() {
        int[] arr = {2, 3, 4, 5, 6};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of all values in the array: " + sum);
    }

    // Q4: Maximum and Minimum Value in an Array
    void maxMinArray() {
        int[] arr = {2, 3, 4, 5, 6};
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    // Q5: Find and Print Even Numbers in an Array
    void findEvenNumbers() {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println("Even numbers in the array:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Q6: Find and Print Prime Numbers in an Array
    void findPrimeNumbers() {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println("Prime numbers in the array:");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Q7: Search a Number in an Array and Print Its Position
    void searchNumber() {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println("Enter the number to search:");
        int numberToSearch = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                System.out.println(numberToSearch + " found at position " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(numberToSearch + " not found in the array.");
        }
    }

    // Q8: Find the Sum and Product of All Elements in an Array
    void sumAndProductOfArray() {
        int[] arr = {2, 3, 4, 5, 6};
        int sum = 0;
        int product = 1;
        for (int num : arr) {
            sum += num;
            product *= num;
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }

    // Q9: Initialize and Print All Elements of a 2D Array
    void print2DArray() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Q10: Count Positive, Negative, Odd, Even, and Zero Numbers in an Array
    void countNumbers() {
        int[] arr = new int[20];
        System.out.println("Enter 20 integers:");
        int positives = 0, negatives = 0, evens = 0, odds = 0, zeros = 0;
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) positives++;
            else if (arr[i] < 0) negatives++;
            else zeros++;

            if (arr[i] % 2 == 0) evens++;
            else odds++;
        }
        System.out.println("Positive numbers: " + positives);
        System.out.println("Negative numbers: " + negatives);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
        System.out.println("Zero numbers: " + zeros);
    }

    // Q11: Can we assign one array to another array?
    void arrayAssignment() {
        int[] array1 = new int[100];
        int[] array2 = new int[50];
        // You can assign array1 to array2 if array1 has fewer or equal elements compared to array2
        // and both arrays are of the same type.
        System.out.println("Assignment is not possible directly since the sizes differ.");
    }

    
    // Q12: String Array Initialization and Display
    void displayDaysOfWeek() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Days of the week:");
        for (String day : days) {
            System.out.println(day);
        }
    }

    // Q13: Sum of Cubic Values
    void sumOfCubicValues(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.pow(num, 3);
        }
        System.out.println("Sum of cubic values: " + sum);
    }

    // Q14: Array Size Input by User
    void createArrayWithUserSize() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Array of size " + size + " created.");
    }

    // Q15: Print Grid
    void printGrid(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    // Q16: Calculate Average Value of Array Elements
    void calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / (double) arr.length;
        System.out.println("Average value of array elements: " + average);
    }

    // Q17: Find Duplicate Values in String Array
    void findDuplicateValues(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate value found: " + arr[i]);
                }
            }
        }
    }

    // Q18: Find Majority Element in Array
    void findMajorityElement(int[] arr) {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element found.");
        }
    }

    // Q19: Find Two Elements Whose Sum is Closest to Zero
    void findTwoElementsClosestToZero(int[] arr) {
        int closestSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(closestSum)) {
                    closestSum = sum;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println("Two elements whose sum is closest to zero: " + num1 + " and " + num2);
    }

    // Q20: Check if Number is Fascinating
    void checkFascinatingNumber(int num) {
        String concat = num + "" + (num * 2) + "" + (num * 3);
        boolean isFascinating = true;
        for (char c = '1'; c <= '9'; c++) {
            if (concat.indexOf(c) == -1 || concat.length() != 9) {
                isFascinating = false;
                break;
            }
        }
        if (isFascinating) {
            System.out.println(num + " is a Fascinating number.");
        } else {
            System.out.println(num + " is not a Fascinating number.");
        }
    }
    
 

    
    // Q21: Permutation of a String
    void permutation(String str) {
        permute(str, 0, str.length() - 1);
    }

    private void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    private String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    // Q22: Convert a String to an Integer
    void stringToInteger(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Converted Integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + str);
        }
    }

    // Q23: Print a Specific Pattern
    void printPattern() {
        int n = 5;
        int value = n;
        for (int i = 0; i < n; i++) {
            int temp = value;
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(temp + " ");
                    temp--;
                } else {
                    System.out.print(temp + " ");
                }
            }
            System.out.println();
            value--;
        }
    }

    // Q24: Find Common Elements Between Two Arrays
    void findCommonElements(String[] arr1, String[] arr2) {
        System.out.println("Common elements:");
        for (String s1 : arr1) {
            for (String s2 : arr2) {
                if (s1.equals(s2)) {
                    System.out.println(s1);
                }
            }
        }
    }

    // Q25: Sorting Strings Using Bubble Sort
    void bubbleSortStrings(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    // Q26: Find All Pairs of Elements Whose Sum is Equal to a Specified Number
    void findPairsWithSum(int[] arr, int targetSum) {
        System.out.println("Pairs with sum " + targetSum + ":");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + targetSum);
                }
            }
        }
    }

    // Q27: Find a Missing Number in an Array
    void findMissingNumber(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        int missingNumber = sum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }

    // Q28: Check if Array is Without 0 and -1
    void checkArrayForZeroAndMinusOne(int[] arr) {
        boolean isValid = true;
        for (int num : arr) {
            if (num == 0 || num == -1) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            System.out.println("Array does not contain 0 or -1.");
        } else {
            System.out.println("Array contains 0 or -1.");
        }
    }

    // Q29: Replace a Specified Character with Another Character
    void replaceCharacter(String str, char oldChar, char newChar) {
        String newStr = str.replace(oldChar, newChar);
        System.out.println("Original string: " + str);
        System.out.println("Modified string: " + newStr);
    }

    // Q30: Print a Specific Pattern
    void printPattern30() {
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Q31: Print a Specific Pattern
    void printPattern31() {
        int num = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j < i) {
                    System.out.print("*");
                }
                num += 2;
            }
            System.out.println();
            num = 1;
        }
    }

    // Q32: Check if Two Strings Are Anagrams
    void checkAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        if (java.util.Arrays.equals(arr1, arr2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    // Q33: Find the Longest Substring Without Repeating Characters
    void longestSubstringWithoutRepeatingChars(String str) {
        String longest = "";
        String current = "";
        for (char c : str.toCharArray()) {
            if (current.contains(String.valueOf(c))) {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = current.substring(current.indexOf(c) + 1) + c;
            } else {
                current += c;
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring without repeating characters: " + longest);
    }

    // Q34: Rotate an Array by k Positions
    void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Q35: Merge Two Sorted Arrays Without Extra Space
    void mergeSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        for (int i = n - 1; i >= 0; i--) {
            int last = arr1[m - 1];
            int j;
            for (j = m - 2; j >= 0 && arr1[j] > arr2[i]; j--) {
                arr1[j + 1] = arr1[j];
            }
            if (j != m - 2 || last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
        System.out.println("Merged arrays:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Q36: Check if a String Contains Only Numeric Digits
    void checkNumericString(String str) {
        if (str.matches("[0-9]+")) {
            System.out.println(str + " contains only numeric digits.");
        } else {
            System.out.println(str + " does not contain only numeric digits.");
        }
    }

    // Q37: Find and Print Prime Numbers in an Array
    void findPrimesInArray(int[] arr) {
        System.out.println("Prime numbers in the array:");
        for (int num : arr) {
            if (isPrimee(num)) {
                System.out.println(num);
            }
        }
    }

    private boolean isPrimee(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i != 0) {
                return true;
            }
        }
        return true;
    }

    // Q38: Can we assign one array to another?
    boolean canAssignArrays(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            arr1 = arr2; // This assignment is possible
            return true;
        } else {
            return false;
        }
    }

    // Q39 & Q40: What is a String in Java?
    String explainString() {
        return "In Java, a String is a sequence of characters. It is an object that represents a sequence of characters and is used to store and manipulate text.";
    }
 

    // 41. Declare a string
    public String declareString(String str) {
        return str;
    }

    // 42. Explain String pool
    public String stringPoolExplanation() {
        return "The String pool is a memory area in the Java heap where String objects are stored. " +
               "When you create a new String literal, the JVM checks the pool first. If an identical " +
               "String already exists, it returns the reference to that String instead of creating a new one.";
    }

    // 43. Check if String is immutable
    public String stringImmutability() {
        return "Strings in Java are immutable, meaning that once a String object is created, it cannot be changed. " +
               "The benefits include: thread safety, performance improvement (reuse of String literals), " +
               "and easier debugging and maintenance.";
    }

    // 45. Difference between String and StringBuffer
    public String stringVsStringBuffer() {
        return "String is immutable, while StringBuffer is mutable. StringBuffer allows modification of its content, " +
               "whereas a new String object is created when changes are made to a String.";
    }

    // 46. Compare two strings
    public boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    // 47. Difference between '==' and '.equals()'
    public String compareUsingEqualityOperators(String str1, String str2) {
        return "Using '==' compares the references (addresses) of the two objects, while '.equals()' compares their content. " +
               "It is possible to compare Strings using '==' but it is risky as it checks for reference equality rather than value equality.";
    }

    // 48. Count vowels in a string
    public int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // 49. Replace 'e' with '*' in a string
    public String replaceEWithAsterisk(String str) {
        return str.replace('e', '*');
    }

    // 50. Remove vowels from a string
    public String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // 51. Count various character types
    public String countCharacterTypes(String str) {
        int lowerCase = 0, upperCase = 0, special = 0, digits = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) lowerCase++;
            else if (Character.isUpperCase(ch)) upperCase++;
            else if (Character.isDigit(ch)) digits++;
            else special++;
        }
        return "The number of lower case characters = " + lowerCase + " The number of upper case characters = " + upperCase +
               " The number of special characters = " + special + " The number of digits = " + digits;
    }

    // 52. Change case of each letter
    public String changeCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) result.append(Character.toUpperCase(ch));
            else result.append(ch);
        }
        return result.toString();
    }

    // 53. Display initials from a full name
    public String displayInitials(String fullName) {
        String[] words = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) initials.append(word.charAt(0)).append(" ");
        }
        return initials.toString().trim();
    }

    // 53. Check if a word is a palindrome
    public boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    // 54. Sum of cubic values of array elements
    public int sumOfCubicValuess(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.pow(num, 3);
        }
        return sum;
    }

    // 55. Convert array to ArrayList
    public java.util.ArrayList<Integer> arrayToArrayList(int[] arr) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    // 56. Test two arrays for equality
    public boolean arraysEqual(int[] arr1, int[] arr2) {
        return java.util.Arrays.equals(arr1, arr2);
    }

    // 57. Find common elements in three sorted arrays
    public java.util.List<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
        java.util.Set<Integer> set1 = new java.util.HashSet<>();
        java.util.Set<Integer> common = new java.util.HashSet<>();
        for (int num : arr1) set1.add(num);
        for (int num : arr2) if (set1.contains(num)) common.add(num);
        set1.clear();
        for (int num : arr3) if (common.contains(num)) set1.add(num);
        return new java.util.ArrayList<>(set1);
    }

    // 58. Count even and odd integers in an array
    public String countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        return "Even: " + even + ", Odd: " + odd;
    }

    // 59. Check if the sum of all 10's is exactly 30
    public boolean checkSumOfTens(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num == 10) sum += num;
        }
        return sum == 30;
    }

    // 60. Convert String to byte array
    public byte[] stringToByteArray(String str) {
        return str.getBytes();
    }

    // 61. Split a String into substrings
    public String[] splitString(String str, String delimiter) {
        return str.split(delimiter);
    }

    // 62. Remove all occurrences of a key from an array
    public int[] removeKey(int[] arr, int key) {
        java.util.ArrayList<Integer> resultList = new java.util.ArrayList<>();
        for (int num : arr) {
            if (num != key) resultList.add(num);
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }

    // 63. Minimum distance between two words
    public int minDistance(String[] arr, String word1, String word2) {
        int lastWord1 = -1, lastWord2 = -1, minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word1)) lastWord1 = i;
            if (arr[i].equals(word2)) lastWord2 = i;
            if (lastWord1 != -1 && lastWord2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(lastWord1 - lastWord2));
            }
        }
        return minDistance;
    }

    // 64. Check if a string is palindrome
    public boolean isStringPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // 65. Check if a String is a valid shuffle of two Strings
    public boolean isValidShuffle(String s1, String s2, String shuffle) {
        return shuffle.length() == s1.length() + s2.length() && 
               (s1 + s2).equals(shuffle) || (s2 + s1).equals(shuffle);
    }


    
     
    









  

}
public class  chat {
    public static void main(String[] args) {
        Quest q = new Quest();
        // q.reverseArray();         // Q1
        // q.checkName();            // Q2
        // q.sumOfArray();           // Q3
        // q.maxMinArray();          // Q4
        // q.findEvenNumbers();      // Q5
        // q.findPrimeNumbers();     // Q6
        // q.searchNumber();         // Q7
        // q.sumAndProductOfArray(); // Q8
        // q.print2DArray();         // Q9
        // q.countNumbers();         // Q10
        // q.arrayAssignment();      // Q11
        // Q12
        // q.displayDaysOfWeek();

        // Q13
        // int[] arr = {1, 2, 3};
        // q.sumOfCubicValues(arr);

        // Q14
        // q.createArrayWithUserSize();

        // Q15
        // q.printGrid(6, 10);

        // Q16
        // int[] array = {1, 2, 3, 4, 5};
        // q.calculateAverage(array);

        // Q17
        // String[] strArr = {"apple", "banana", "apple", "orange"};
        // q.findDuplicateValues(strArr);
// 
        // Q18
        // int[] majorityArr = {2, 2, 1, 1, 2, 2, 2};
        // q.findMajorityElement(majorityArr);
// 
        // Q19
        // int[] closeToZeroArr = {-2, -1, 3, 6, 5};
        // q.findTwoElementsClosestToZero(closeToZeroArr);
// 
        // Q20
        // q.checkFascinatingNumber(192);
        //  Q21
        // q.permutation("ABC");
// 
        // Q22
        // q.stringToInteger("12345");
// 
        // Q23
        // q.printPattern();
// 
        // Q24
        // String[] arr1 = {"apple", "banana", "cherry"};
        // String[] arr2 = {"banana", "cherry", "date"};
        // q.findCommonElements(arr1, arr2);
// 
        // Q25
        // String[] strings = {"peach", "apple", "banana", "cherry"};
        // q.bubbleSortStrings(strings);
// 
        // Q26
        // int[] pairArr = {1, 4, 5, 3, 2, 6, 7, 8, 9};
        // q.findPairsWithSum(pairArr, 10);
// 
        // Q27
        // int[] missingArr = {1, 2, 3, 5, 6};
        // q.findMissingNumber(missingArr, 6);
// 
        // Q28
        // int[] checkArr = {1, 2, 3, 4, 5};
        // q.checkArrayForZeroAndMinusOne(checkArr);
// 
        // Q29
        // q.replaceCharacter("hello world", 'l', 'p');
// 
        // Q30
        // q.printPattern30();
// 
        // Q31
        // q.printPattern31();
// 
        // Q32
        // q.checkAnagram("listen", "silent");
// 
        // Q33
        // q.longestSubstringWithoutRepeatingChars("abcabcbb");
// 
        // Q34
        // int[] rotateArr = {1, 2, 3, 4, 5};
        // q.rotateArray(rotateArr, 2);
// 
        // Q35
        // int[] arr1Merge = {1, 5, 9};
        // int[] arr2Merge = {2, 3, 8};
        // q.mergeSortedArrays(arr1Merge, arr2Merge);
// 
        // Q36
        // q.checkNumericString("123456");
// 
        // Q37
        // int[] primeArr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        // q.findPrimesInArray(primeArr);
// 
        // Q38
        // int[] freqArr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        // q.findFrequencyOfElements(freqArr);


            
        //  String testString = "Computer World";
        // System.out.println("The Number of vowels: " + q.countVowels(testString)); // 48
// 
        // String testReplace = "computer science";
        // System.out.println("Replaced String: " + q.replaceEWithAsterisk(testReplace)); // 49
        // 
        // String testRemoveVowels = "COMPUTER APPLICATIONS";
        // System.out.println("String without vowels: " + q.removeVowels(testRemoveVowels)); // 50
        // 
        // String testCharacterCount = "S.T.D code of New Delhi – 011";
        // System.out.println(q.countCharacterTypes(testCharacterCount)); // 51
        // 
        // String testChangeCase = "WelComE TO School";
        // System.out.println("Changed Case String: " + q.changeCase(testChangeCase)); // 52
        // 
        // String testName = "LAL KRISHNA ADVANI";
        // System.out.println("Initials: " + q.displayInitials(testName)); // 53
        // 
        // String testPalindrome = "madam";
        // System.out.println("Is Palindrome: " + q.isPalindrome(testPalindrome)); // 53
        // 
        // int[] testArray = {3, 9, 2, 3, 1, 7, 2, 3, 5};
        // System.out.println("Sum of Cubic Values: " + q.sumOfCubicValuess(testArray)); // 54
        // 
        // java.util.ArrayList<Integer> arrayList = q.arrayToArrayList(testArray);
        // System.out.println("ArrayList: " + arrayList); // 55
        // 
        // int[] array1 = {1, 2, 3};
        // int[] array2 = {1, 2, 3};
        // System.out.println("Arrays Equal: " + q.arraysEqual(array1, array2)); // 56
        // 
        // int[] array3 = {1, 2, 3, 4, 5};
        // int[] array4 = {2, 3, 5};
        // System.out.println("Common Elements: " + q.commonElements(array1, array3, array4)); // 57
        // 
        // int[] evenOddArray = {1, 2, 3, 4, 5, 6};
        // System.out.println(q.countEvenOdd(evenOddArray)); // 58
        // 
        // int[] sumArray = {10, 10, 10, 5};
        // System.out.println("Check sum of 10's is 30: " + q.checkSumOfTens(sumArray)); // 59
        // 
        // String byteArrayString = "Hello";
        // byte[] byteArray = q.stringToByteArray(byteArrayString);
        // System.out.println("Byte Array: " + java.util.Arrays.toString(byteArray)); // 60
        // 
        // String splitString = "Java,Python,C++,JavaScript";
        // String[] substrings = q.splitString(splitString, ",");
        // System.out.println("Substrings: " + java.util.Arrays.toString(substrings)); // 61
        // 
        // int[] keyRemoveArray = {3, 9, 2, 3, 1, 7, 2, 3, 5};
        // int[] resultArray = q.removeKey(keyRemoveArray, 3);
        // System.out.println("Array after removing key: " + java.util.Arrays.toString(resultArray)); // 62
        // 
        // String[] words = {"the", "quick", "brown", "fox", "quick"};
        // System.out.println("Minimum Distance: " + q.minDistance(words, "the", "fox")); // 63
        // 
        // String palindromeString = "racecar";
        // System.out.println("Is Palindrome: " + q.isStringPalindrome(palindromeString)); // 64
        // 
        // String s1 = "abc";
        // String s2 = "def";
        // String shuffle = "adbcef";
        System.out.println("Is valid shuffle: " + q.isValidShuffle(s1, s2, shuffle)); // 65
    }
}

 



 
     

