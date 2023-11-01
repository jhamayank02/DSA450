class Circular_tour{

    int tour(int petrol[], int distance[])
    {
        // Bruteforce approach
        // Time complexity O(n^2) || Space complexity O(1)
	   // int n = petrol.length;
	    
	   // for(int s=0; s<n; s++){
	   //     int balance = 0;
	        
	   //     for(int i=s; i<n; i++){
	   //         balance += petrol[i] - distance[i];
	   //         if(balance >= 0){
	   //             continue;
	   //         }
	   //         else{
	   //             break;
	   //         }
	   //     }
	        
	   //     if(balance < 0){
	   //         continue;
	   //     }
	        
	   //     for(int i=0; i<s; i++){
	   //         balance += petrol[i] - distance[i];
	   //         if(balance >= 0){
	   //             continue;
	   //         }
	   //         else{
	   //             break;
	   //         }
	   //     }
	        
	   //     if(balance >= 0){
	   //         return s;
	   //     }
	   // }
	    
	   // return -1;
	   
	   
	   
	   
	   // Using Queue
	   // Time complexity O(n) || Space complexity O(1)
	   int n = petrol.length;
	   int balance = 0;
	   int deficit = 0;
	   int start = 0;
	   
	   for(int i=0; i<n; i++){
	       balance += petrol[i] - distance[i];
	       
	       if(balance < 0){
	           deficit += balance;
	           start = i+1;
	           balance = 0;
	       }
	   }
	   
	   if(balance + deficit >= 0){
	       return start;
	   }
	   return -1;
    }

    public static void main(String args[]){

    }
}