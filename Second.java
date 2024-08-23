/*
 
We are given a string S of length N consisting only of letters 'A'; and/or 'B';. Our goal is to obtain a string in
the format "A...AB...B"; (all letters 'A'; occur before all letters 'B';) by deleting some letters from S. In
particular, strings consisting only of letters 'A'; or only of letters 'B'; fit this format.
Write a function:
class Solution { public int solution(String S); }
that, given a string S, returns the minimum number of letters that need to be deleted from S in order to
obtain a string in the above format.
Examples:
1. Given S = ";BAAABAB";, the function should return 2. We can obtain ";AAABB"; by deleting the first
occurrence of 'B'; and the last occurrence of 'A';.
2. Given S = ";BBABAA";, the function should return 3. We can delete all occurrences of 'A'; or all
occurrences of 'B';.

3. Given S = ";AABBBB";, the function should return 0. We do not have to delete any letters, because the
given string is already in the expected format.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
string S is made only of the characters 'A'; and/or 'B';.
 
 */

public class Second {
    
    public static void main(String[] args) {
        int result;

        result=solution("BBABAA");
        System.out.println("String: BBABAA delete char count = " + result);
    }

    public static int solution(String S) {

            int deleteCharCount = 0;
            boolean isFirstChar = false;
            char str[] = S.toCharArray();
            int i = 0;
            for( i =0 ; i < str.length; i++){
                if(str[i] == 'B' && !isFirstChar){
                    deleteCharCount++;
                    continue;
                }
                else{
                    isFirstChar = true;
                    break;
                } 
            }

            for(int j =i ; j < str.length; j++){
                
                if(j < str.length - 1) {
                    if(str[j] == 'B' && str[j+1] == 'A') {
                        deleteCharCount++;
                        continue;
                    }
                }
                
                
            }
        
        return deleteCharCount;
    }
    
}
