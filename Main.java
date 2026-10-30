/****************************************************************************
 *                              DSA(Data Structure And Alogorithms)
*******************************************************************************/
//Array: Arrays are the collection of same type of data with stored in Contiguious Memory Locations.
//      `   indexing in array start with Zero.
// * arrays will always passed by referance (value will changed defined at main function  
//   when any small fuction change those values.)

// import java.util.*;
// public class Main{
//     public static void  dispaly_array(int a[]){
//         for (int i=0;i<4;i++){
//           System.out.print(a[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int a[] = new int[50];
//         Scanner sc = new Scanner(System.in);
//         for (int i=0;i<4;i++){
//         System.out.print("Enter the value for index "+i+": ");
//             a[i] = sc.nextInt();
//         }
//       System.out.println("Element of Arrays are:");
//       dispaly_array(a);
//     }
// }
// ////////////////////////////////////////////////////////////////////////////////////
// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         int a[]= new int[20];
//         Scanner sc= new Scanner(System.in);
//         a[0]=sc.nextInt();
//         a[1]=sc.nextInt();
//         a[2]=sc.nextInt();
        
        
//     System.out.println("PHYS: "+a[0]);
//     System.out.println("CHEM: "+a[1]);
//     System.out.println("MATH: "+a[2]);
//     }
    
// }
////////////////////////////SEARCHING//////////////////////////////////////////////////////
// Searching refer to find the desired element or thing from more than one amount of data .


//*linear Search :in that type of searching , we search the desired key by one by one from start to 
//// end index;  Time compexity : Big O(n)
// import java.util.*;
// public class Main{
//     public static int linear_search(int a[],int key){
//         for(int i=0;i<a.length;i++){
//             if(key == a[i]){
//                 return i;
//             }
           
//         } return -1;
//     }
//     public static int find_largest(int a[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<a.length;i++){
//             if (largest<a[i]){
//                 largest = a[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]){
         
//          int a[]={5,9,10,12,55,16,18,25};
//         // Scanner sc = new Scanner(System.in);
//     //  System.out.println("enter that no you want to search");
//     //   int key = sc.nextInt();
//     //   int index = linear_search(a, key);
//     //   if(index==-1){
//     //           System.out.println("key not found");
//     //   }
//     //   else 
//     //   {
//     //             System.out.println("key found at "+index +" index");
//     //   }
//     //     }
//     System.out.print("largest no in given array is :"+ find_largest(a));
//     }
// }
////////////////////////////////Binary Search //////////////////////
// Its a Searching technic which used for shorted array to find the desired key by dividing the
// arrays in two part and find the element .
// import java.util.*;
// class Main{
//     public static int binary_search(int a[], int key ){
//         int start = 0 ;
//          int end = a.length-1;
//      while (start<=end){
//          int mid =(start+end)/2;
//          if(key==a[mid]){
//              return mid;
           
//          }
//          else if (key < a[mid]) {
             
//              end = mid-1;
             
//          }
//          else {
             
//              start = mid + 1;
//          }
         
//      }
//      return -1 ;
//     }
// public static void main(String args[]){
    
// Scanner sc= new Scanner(System.in);

// System.out.println("Enter the size of array");
// int n = sc.nextInt();
// int a[]= new int[n];

// for(int i=0;i<n;i++){
//     System.out.print("enter the Sorted value of index "+ i +":");
//     a[i]= sc.nextInt();
// }
// System.out.println("Enter the  value find in array:");
// int key= sc.nextInt();
// int result= binary_search(a,key);
// if (result == -1) {
//             System.out.println("Value not found in array.");
//         } else {
//             System.out.println("Given value found in array at index: " + result); 
//         }
        
//         sc.close();
//     } 
// }

///////////////////////////////Reverse an Array//////////////////////
// import java.util.*;
// class Main{
//     // public static void reverse(int a[]){
//     //     int f= 0;
//     //     int l= a.length-1;
//     //   while (f<l){
//     //       int temp = a[f] ;
//     //       a[f] = a[l];
//     //       a[l] =temp;
//     //       f++;
//     //       l--;
            
//     //     }
//     // }
// public static void pair(int a[]){
//     int count =0;
//     for(int i = 0 ; i< a.length ; i++){
//         int curr = a[i] ;
//         for (int j = i+1 ; j < a.length ; j++){
//             System.out.print("("+curr+","+a[j]+")");
//             count++;
//         }
//         System.out.println();
//     }
//      System.out.println("Total Pairs are:"+count);
// }
//     public static void main(String args[]){
         
//          int a[]={5,9,10,12,55,16,18,25};
//          pair(a);
// // reverse(a);
// //  System.out.print("Reverse array is :");
// // for(int i=0;i<a.length;i++){
// //     System.out.print( a[i]+" ,");
// // }
// //  System.out.println(" ");
// }}
////////////////////////////////////////Subarray////////////////////////////////////
//* subarray is refers the continious arrays of existing element on an existing array called as subarray.
// import java.util.*;
// public class Main{
//     public static void find_subarray(int a[]){
//         int count = 0;
//         for (int i=0;i<a.length;i++){
//             for(int j = i+1;j<=a.length;j++){
//             for(int k =i;k<j;k++){
//                 System.out.print(a[k]+"");
                 
//             }
//             count++;
//              System.out.println();
//             }
//              System.out.println();
            
//         }
//         System.out.println("No of subarray are:"+count);
//     }
//     public static void main(String args[]){
         
//          int a[]={5,9,10,12,55,16,18,25};
//          find_subarray(a);
//     }
// }
//* Find the max subarray:///////////////////////////////////////////////////////////////////////////////////
// import java.util.*;
// public class Main{
    // public static void max_subarray_sum(int a[]){
    //     int max_sum=Integer.MIN_VALUE;
    //     int curr_sum=0;
    // for(int i=0;i<a.length;i++){
    //     for (int j=i;j<a.length;j++){
    //         curr_sum=0;                                           //bruteforce method
    //         for (int k=i;k<=j;k++){
    //             curr_sum += a[k];
    //         }
    //          System.out.println(curr_sum);
    //         if (max_sum<curr_sum){
    //             max_sum=curr_sum;
    //         }
            
    //     }
       
    // }
    
//     public static void max_subarray_sum(int a[]){
//         int max_sum=Integer.MIN_VALUE;
//         int curr_sum=0;                                                      //prefix_sum method
      
//         int prefix[]= new int[a.length];
         
         
//           prefix[0] = a[0]; 
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + a[i];
//         }

//     for(int i=0;i<a.length;i++){
//         for (int j=i;j<a.length;j++){
//             curr_sum = (i == 0) ? prefix[j] : prefix[j]-prefix[i-1];
            
//              System.out.println(curr_sum);
//             if (max_sum<curr_sum){
//                 max_sum=curr_sum;
//             }
            
//         }
       
//     }
//      System.out.println("Max subarray Sum :"+max_sum);
//     }
//     public static void kadanes(int a[]){
//         int cs=0;
//         int ms=Integer.MIN_VALUE;
//         for (int i=0;i<a.length;i++){
//             cs= cs+a[i];             //*kadanes algorithm:if total sum of element 
//                             // is negative than it take as zero value
//             if (cs<0){
//                 cs = 0;
//             }
//             ms=Math.max(cs,ms);
//         }
//      System.out.println("Max subarray Sum :"+ms);
//     }
   
//     public static void main(String args[]){
         
//          int a[]={1,-2,6,-1,3};
//         max_subarray_sum(a);
//         kadanes(a);
//     }
// }
/////////////////////////////////////////////trapping Rainwater///////////////////////////////////
// import java.util.*;
// public class Main{
//     public static int trw(int a[]){
//         int left_max[] = new int[a.length];
//         left_max[0]=a[0];
//         for (int i=1;i<a.length;i++){
//             left_max[i]= Math.max(a[i], left_max[i - 1]);
//         }
//         int right_max[] = new int[a.length];
//         right_max[a.length-1]=a[a.length-1];
//         for (int i=a.length-2;i>=0;i--){
//             right_max[i]= Math.max(a[i],right_max[i+1]);
//         }
//         int tw = 0;
//         for (int i=0;i<a.length;i++){
//             int water_level =Math.min(left_max[i], right_max[i]);
//              tw += (water_level - a[i]);
//         }
//         return tw;
//     }
//     public static void main(String args[]){
         
//          int a[]={4,2,0,6,3,2,5};
//           int result= trw(a);
//           System.out.println("trapping water according to given value :"+result);
//     }
// }
/////////////////////////////////////////////Stock buy & sell////////////////////////////////////////////////////
// import java.util.*;
// class Main{
//     public static int max_profit(int price[]){
//         int max_profit=0;
//         int bp=Integer.MAX_VALUE;
//         for (int i=0;i<price.length;i++){
//             if (bp<price[i]){
//             int profit = price[i]-bp;
//             max_profit= Math.max(max_profit,profit);
//             }
//             else {
//                 bp=price[i];
//             }
//         }
//         return max_profit;
//     }
//     public static void main(String args[]){
//         int price[] ={7,1,5,3,6,4};
//       System.out.println(" maximum profit gain :"+max_profit(price));
//     }
// }
/////////////////////////////////////////////Q&A////////////////////////////////////////////////////
// import java.util.*;
// class Main{
//     public static boolean check_duplicate(int a[]){
//         for (int i=0;i<a.length;i++){
//             for(int j=i+1;j<a.length;j++){
//                 if(a[i]==a[j]){
//                     return true;
//                 }
//             }
//         }return false;
//     }
//     public static void main(String args[]){
//         int a[] ={7,1,5,3,6,4,1,1};
//       System.out.println(check_duplicate(a));
//     }
// }
/////////////////////////////////////////////Shorting///////////////////////////////////////////////////

 import java.util.*;
class Main{
    public static void bubble_sort(int a[]){
        int swap=0;
        for (int turn=0;turn<a.length-1;turn++){        //bubble sort
            for(int j=0;j<a.length-1-turn;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap++;
                }
            }
        }  System.out.println(swap); 
    }
    
    public static void selection_sort(int a[]){
        for (int i=0;i<a.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<a.length;j++){
                if(a[smallest]>a[j]){
                    smallest=j;
                }
            }
            int temp = a[smallest];
            a[smallest]= a[i];
            a[i]=temp;
        }
    }
    public static void insertion_sort(int a[]){
        for (int i=1;i<a.length;i++){
            int curr =a[i];
            int prev= i-1;
            while (prev>=0 && a[prev]>=curr){
                a[prev+1]=a[prev];
                prev--;
                }
                a[prev+1]=curr;
                        }
    }
    public static void counting_sorty(int b[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++){                    //find lagest value in array
            largest=Math.max(largest,b[i]);
            }
        int count[]=new int [largest+1];       
            for(int i=0;i<b.length;i++){                //counting the value of each element in array
                count[b[i]]++;
            }
            //sorting 
            int j=0;
            for(int i=0;i<count.length;i++){
                while (count[i]>0){                     //putting the value in array according to counting value
                    b[j]=i;
                    j++;
                    count[i]--;
                }
            }
        
    }
     public static void printnew(int b[]){
        for (int i=0;i<b.length;i++){
            System.out.print(""+b[i]+"");
        }
        System.out.println("");
    }
    public static void printArr(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(""+a[i]+"");
        }
        System.out.println("");
    }
    
    public static void main(String args[]){
        int a[] ={7,1,5,3,6};
        // bubble_sort(a);
        // selection_sort(a);
    //     insertion_sort(a);
      //   Arrays.sort(a);       //inbuilt sorting function
    //   Arrays.sort(a, 2, 4);  //inbuilt sorting function with reverse order
    // printArr(a );
    int b[] ={1,2,1,3,1,4,2,5};
    counting_sorty(b);
    printnew(b);
    }
}



















