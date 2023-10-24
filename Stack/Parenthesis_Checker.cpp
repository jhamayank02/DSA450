#include <iostream>

using namespace std;

// Using a single loop
// Time complexity O(n) || Space complexity O(1)
class Solution
{
    public:
    //Function to check if brackets are balanced or not.
    bool ispar(string x)
    {
        int len = x.length();
        int i = -1;
        
        for(int j=0; j<len; j++){
            char ch = x[j];
            
            if(ch == '(' || ch == '{' || ch == '['){
                i++;
                x[i] = ch;
            }
            else{
                if(i>=0 && ((x[i]=='(' && ch==')') || (x[i]=='{' && ch=='}') || (x[i]=='[' && ch==']'))){
                    i--;
                }
                else{
                    return false;
                }
            }
        }
        
        if(i == -1){
            return true;
        }
        return false;
    }

};