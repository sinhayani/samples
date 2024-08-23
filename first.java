import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* There is an array A consisting of N integers. What is the maximum sum of two integers from A that share
their first and last digits? For example, 1007 and 167 share their first (1) and last (7) digits, whereas 2002
and 55 do not.
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns the maximum sum of two integers that share their
first and last digits. If there are no two integers that share their first and last digits, the function should
return −1.
Examples:
1. Given A = [130, 191, 200, 10], the function should return 140. The only integers in A that share first and
last digits are 130 and 10.
2. Given A = [405, 45, 300, 300], the function should return 600. There are two pairs of integers that share
first and last digits: (405, 45) and (300, 300). The sum of the two 300s is bigger than the sum of 405 and
45.
3. Given A = [50, 222, 49, 52, 25], the function should return −1. There are no two integers that share
their first and last digits.
4. Given A = [30, 909, 3190, 99, 3990, 9009], the function should return 9918.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [10..1,000,000,000]. */


class First {
    public static void main(String[] args) {
        System.out.println();
        int A[] = {1007, 167, 2002, 55};
        int sum = solution(A);
        System.out.println("Array: {1007, 167, 2002, 55}" +" sum " + sum);

        int B[] = {405, 45, 300, 300};
        sum = solution(B);
        System.out.println("Array: {405, 45, 300, 300}}" +" sum " + sum);

        int C[] = {50, 222, 49, 52, 25};
        sum = solution(C);
        System.out.println("Array: {150, 222, 49, 52, 25}" +" sum " + sum);

        int D[] = {30, 909, 3190, 99, 3990, 9009};
        sum = solution(D);
        System.out.println("Array: {30, 909, 3190, 99, 3990, 9009}" +" sum " + sum);
    }


    public static int findFirstNumber(int num){

        while(num >= 10) {
            num = num / 10;
        }

        return num;
    }

    public static int findLastNumber(int num){

        return num % 10;
    }

    
    public static int solution(int[] A) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int maximunSum = -1;
    
       // Group the numbers by their first and last digits

       for (int num : A) {

           int firstNum= findFirstNumber(num);

           int lastNum = findLastNumber(num);

           int key = firstNum * 10 + lastNum;

           map.putIfAbsent(key, new ArrayList<>());

           map.get(key).add(num);

       }

       for (List<Integer> nums : map.values()) {

        int size = nums.size();

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                int sum = nums.get(i) + nums.get(j);

                if (sum > maximunSum) {

                    maximunSum = sum;

                }

            }

        }

    }

    

    return maximunSum;
      
    
}
}

