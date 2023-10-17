class Divide_two_integers_without_using_multiplication_division_and_mod_operator{

    public static int solve(int a, int b){
        // Using subtraction
        // Time complexity O(a/b) || Space complexity O(1)
        int quotient = 0;

        while(a >= b){
            a -= b;
            quotient++;
        }

        return quotient;
    }

    public static void main(String args[]){
        System.out.println(solve(45, 8));
        System.out.println(solve(8, 8));
        System.out.println(solve(5, 8));
    }
}