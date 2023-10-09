class Calculate_square_of_a_number_without_using_multiplication_division_and_pow{

    public static int calculate_square(int n){
        // Using addition
        // Time complexity O(n) || Space complexity O(1)
        int square = 0;

        for(int i=0; i<n; i++){
            square += n;
        }

        return square;
    }

    public static void main(String args[]){
        System.out.println(calculate_square(5));
        System.out.println(calculate_square(2));
    }
}