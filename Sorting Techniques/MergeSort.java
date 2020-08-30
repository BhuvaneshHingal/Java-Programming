import java.util.*;
class MergeSort {

  void merge(int arr[], int left, int mid, int right) {

    int len1 = mid - left + 1;
    int len2 = right - mid;

    int leftArr[] = new int[len1];
    int rightArr[] = new int[len2];

    for (int i = 0; i < len1; i++)
      leftArr[i] = arr[left + i];
    for (int j = 0; j < len2; j++)
      rightArr[j] = arr[mid + 1 + j];

    int i, j, k;
    i = 0;
    j = 0;
    k = left;

    while (i < len1 && j < len2) {
      if (leftArr[i] <= rightArr[j]) {
        arr[k] = leftArr[i];
        i++;
      } else {
        arr[k] = rightArr[j];
        j++;
      }
      k++;
    }

    while (i < len1) {
      arr[k] = leftArr[i];
      i++;
      k++;
    }

    while (j < len2) {
      arr[k] = rightArr[j];
      j++;
      k++;
    }
  }

  void mergeSort(int arr[], int start, int right) {
    if (start < right) {

      int mid = (start + right) / 2;

      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, right);

      merge(arr, start, mid, right);
    }
  }


  public static void main(String args[]) {
     Scanner scan = new Scanner( System.in );        
        System.out.println("Merge Sort Test\n");
        int n, i;
        /** Accept number of elements **/
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        /** Create integer array on n elements **/
        int arr[] = new int[ n ];
        /** Accept elements **/
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
                      
    MergeSort ob = new MergeSort();
    ob.mergeSort(arr, 0, arr.length - 1);
       /** Print sorted Array **/
        System.out.println("\nElements after sorting ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();   
  }
}

