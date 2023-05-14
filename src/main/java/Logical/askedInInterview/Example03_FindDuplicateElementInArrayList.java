package Logical.askedInInterview;

import java.util.ArrayList;
import java.util.HashSet;

public class Example03_FindDuplicateElementInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("sahil");
		al.add("Raj");
		al.add("Munna");
		al.add("sahil");
		al.add("Raj");
		al.add("Aadi");
		al.add("Ibrahim");
		
		HashSet<String> hs=new HashSet<String>();
		
		for(String s:al)
		{
			if(hs.add(s)==false)
			{
				System.out.println(s+" is duplicate");
			}
		}
	}
}
