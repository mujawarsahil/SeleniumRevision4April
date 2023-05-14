package Logical.askedInInterview;

import java.util.HashMap;
import java.util.Set;

public class Example04_Count_Repeating_Char_in_String {

	public static void main(String[] args) {
		
		String str="abcdacef";
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char s1= str.charAt(i);
			if(hm.containsKey(s1))
			{
				hm.put(s1,hm.get(s1)+1);
			}
			else
			{
				hm.put(s1,1);
			}
		}
		
		Set<Character> keys=hm.keySet();
		
		for(char key :keys)
		{
			System.out.println(key+" "+hm.get(key));
		}
	}
}
