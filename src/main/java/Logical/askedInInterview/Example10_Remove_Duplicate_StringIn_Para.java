package Logical.askedInInterview;
import java.util.*;
public class Example10_Remove_Duplicate_StringIn_Para {
	
	public static void main(String[] args) {
		
		String str="my name is sahil my name is ";
		String[] arr = str.split(" ");
		LinkedHashSet<String> ls= new LinkedHashSet<String>();
		
		for(String s : arr)
		{
			ls.add(s);
		}
		for(String s1:ls)
		{
			System.out.print(s1+" ");
		}
	}

}
