import java.util.Scanner;

public class Q_2 {
	
	//WAP to sort an array using Quick Sort Algorithm..	
	
	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j = low; j < high; j++){
        	
            if (arr[j] <= pivot){
            	
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return (i+1);
    }
 
 
    void quickSort(int arr[], int low, int high)
    {
        if (low < high){
        	
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
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
    	
    	//before applying Quick Sort
        System.out.println("Before applying Quick Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }   
        System.out.println();
        
        //creating an object to call quickSort() method to apply on array.
        Q_2 ob = new Q_2();
        ob.quickSort(arr, 0, arr.length-1);
         
        //after applying Quick Sort 
        System.out.println("After applying Quick sort");  
        for(int i:arr)  
            System.out.print(i+" ");  
    }
}
