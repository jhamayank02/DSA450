public class Move_All_Negative_Numbers_To_Beginning_And_Positive_To_End {
    public static int[] separateNegativeAndPositive(int a[]) {
        // Using 2 pointers
        // Time complexity O(n) || Space complexity O(1)
        int l = 0;
        int r = a.length - 1;

        // Find first +ve no.
        while(l < a.length && a[l] < 0){
            l++;
        }
        // Find first -ve no.
        while(r >= 0 && a[r] >= 0){
            r--;
        }

        while(l < a.length && r >= 0 && l <= r){
            swap(a, l, r);
            while(l < a.length && a[l] < 0){
                l++;
            }
            while(r >= 0 && a[r] >= 0){
                r--;
            }
        }

        return a;
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        
    }
}
