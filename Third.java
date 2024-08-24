/*
 *You are given a string letters made of N English letters. Count the number of different letters that appear
in both uppercase and lowercase where all lowercase occurrences of the given letter appear before any
uppercase occurrence.
For example, for letters = "aaAbcCABBc" the answer is 2. The condition is met for letters ‘a’ and ‘b’, but
not for ‘c’.
Write a function:
class Solution { public int solution(String letters); }
that, given a string letters, returns the number of different letters fulfilling the conditions above.
Examples:
1. Given letters = "aaAbcCABBc", the function should return 2, as explained above.
2. Given letters = "xyzXYZabcABC", the function should return 6.
3. Given letters = "ABCabcAefG", the function should return 0.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
string letters is made only of letters (a−z and/or A−Z).
 */

 public class Third {
    public static void main(String[] args) {
        String str = "xxXx";

        char charArray[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {

            String strChar = String.valueOf(charArray[i]);

            boolean isUppercaseChar = Character.isUpperCase(charArray[i]);


            if(isUppercaseChar) {
                System.out.println("in if");

                char smallercaseChar = Character.toLowerCase(charArray[i]);
                String subString = str.substring(i, str.length());
                System.out.println("substring " + subString);
                if(!subString.contains(Character.toString(smallercaseChar))){
                    count++;
                }
            }
        }

        System.out.println("Answer :" + count);
    }

}

