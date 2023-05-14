package Logical.askedInInterview;

public class Example09_find_Vowels_in_String 
{

	public static void main(String[] args) 
	{

		String str = "HI well come to my world";
		str = str.toLowerCase();
		int count=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
				System.out.print(ch + " ");
				count++;
			}
		}
		System.out.println("\nNo of Vowels in the "+str+" is "+count);
	}

}
