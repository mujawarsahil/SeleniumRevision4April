package Logical.askedInInterview;

public class Example06_StringBuffer_to_removeFirstFewChar_In_String {
	
	public static void main(String[] args) {
		
		String str="0000123";
		StringBuffer sb=new StringBuffer(str);
		sb.replace(0, 4, "");
		System.out.println(sb);
	}

}
