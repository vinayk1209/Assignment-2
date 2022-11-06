import java.util.Scanner;

public class Q_4 {
	
	//WAP to sort an array using Merge Sort Algorithm.
			
		void merge(int arr[], int low, int middle, int high)
	    {
	        int n1 = middle - low + 1;
	        int n2 = high - middle;
	 
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	 
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[low + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[middle + 1 + j];
	 
	 
	        int i = 0, j = 0;
	 
	        int k = low;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	 
	    void mergeSort(int arr[], int low, int high)
	    {
	        if (low < high) {
	            int m = low + (high - low) / 2;
	 
	            mergeSort(arr, low, m);
	            mergeSort(arr, m + 1, high);
	 
	            merge(arr, low, m, high);
	        }
	    }
	 
	 
	    public static void main(String args[])
	    {
	    	int n=0;
	    	Scanner sc = new Scanner(System.in);
	    	
	    	//collecting the size and declaring an array
	    	System.out.print("Enter the number of elements to store: ");
	    	n = sc.nextInt();
	    	int[] arr = new int[n];
	    	
	    	//collecting and initializing elements of an array from the user
	    	for(int i=0; i<n; i++) {
	    		System.out.print("Element " + (i+1) + ": ");
	    		arr[i] = sc.nextInt();
	    	}
	    	
	    	//before applying Merge Sort
	        System.out.println("Before applying Merge Sort");  
	        for(int i:arr){  
	            System.out.print(i+" ");  
	        }   
	        System.out.println();
	 
	      //creating an object to call mergeSort() method to apply on array.
	        Q_4 ob = new Q_4();
	        ob.mergeSort(arr, 0, arr.length-1);
	         
	       //after applying Merge Sort 
	        System.out.println("After applying Merge Sort");  
	        for(int i:arr) 
	            System.out.print(i+" ");  
	        
	}

}
