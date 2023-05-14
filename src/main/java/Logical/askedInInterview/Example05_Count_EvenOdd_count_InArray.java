package Logical.askedInInterview;

public class Example05_Count_EvenOdd_count_InArray {

	public static void main(String[] args) {
	
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11};
		
		int evenCount=0,oddCount=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		
		System.out.println("Even count of given array is "+evenCount);
		System.out.println("Odd Count of given array is "+oddCount);
	}
}
