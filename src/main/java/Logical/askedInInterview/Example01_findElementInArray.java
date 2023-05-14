package Logical.askedInInterview;

public class Example01_findElementInArray {

	public static void main(String[] args) {
		
		
		int ar[]={10,20,30,40,50,60};
		
		int expElement=10;
		Boolean foundElement=false;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==expElement)
			{
				foundElement=true;
				break;
			}
		}
		
		if(foundElement==true)
		{
			System.out.println("Element found!!!");
		}
		else
		{
			System.out.println("Element not found!!!");
		}
	}
}
