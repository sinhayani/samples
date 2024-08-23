/*
 convert string to integer

 input: "$180,240/y"
 output : 180240
 */

class Sixth {
    public static void main(String[] args) {
        String input = "$180,240/y";

        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) < '0' || input.charAt(i) > '9' ) 
            { 
                input = input.substring(0, i) + input.substring(i + 1);
                i--;
            }
        }
        
        System.out.println(Integer.parseInt(input));

    }
}
