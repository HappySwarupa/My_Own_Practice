/*example of Binary search */
package corejava;
import java.util.Arrays;
public class BinarySearchDemo {
	
	public static void BinarySearch(int arr[],int Last,int First,int key)
	{
		int mid= (First+Last)/2;
		while(First<=Last) {
			if(arr[mid]<key)
			{
				First= mid+1;
			}
			else if(arr[mid]==1)
			{
				System.out.println("Element found at index"+mid);
			}
             
			else 
			{
				Last= mid-1;
				
			}
			mid= (First+Last)/2;
			
		}
			
		if(First>Last)
		{
			System.out.println("Element not found");
		}
		
	}

public static void main(String args[])
    {
	int arr[]= {10,20,30,40,50};
	int key= 40;
	int Last= arr.length-1;
	BinarySearch(arr,0,Last,key);
	
    }

	
}

