class Reverse_a_String{
    // Time complexity O(n) || Space complexity O(n)
    public static String reverseWord(String str)
    {
        int len = str.length();
        StringBuilder ans_str = new StringBuilder("");
        
        for(int i=len-1; i>=0; i--){
            char ch = str.charAt(i);
            ans_str.append(ch);
        }
        
        return ans_str.toString();
    }

    public static void main(String[] args) {
        
    }
}