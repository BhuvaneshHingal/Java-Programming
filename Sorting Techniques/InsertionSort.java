import java.util.*;
public class InsertionSort{  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){
        int size, i;
        Scanner scan = new Scanner(System.in);  
        System.out.print("Enter Array Size : ");  
        size = scan.nextInt();  
        int arr1[] = new int[size]; 
        System.out.print("Enter Array Elements : ");  
        for(i=0; i<size; i++)  
       {  
           arr1[i] = scan.nextInt();  
       }     
        System.out.println("Before Insertion Sort");    
        System.out.println(Arrays.toString(arr1));
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        System.out.println(Arrays.toString(arr1));
    }    
}   