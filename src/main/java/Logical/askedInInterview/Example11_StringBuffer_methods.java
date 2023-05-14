package Logical.askedInInterview;

public class Example11_StringBuffer_methods 
{
	public static void main(String[] args) 
	{

		StringBuffer sb = new StringBuffer("hello ");
		System.out.println(sb);

		// append()
		sb.append(" Java");
		System.out.println(sb);

		// insert()
		sb.insert(6, "all");
		System.out.println(sb);

		// replace(start,end,"Replacing String")
		sb.replace(6, 9, "Python");
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.delete(2, 4);
		System.out.println(sb2);

		int num = 123456;
		String str = Integer.toString(num);
		// String str="sahil";
		StringBuffer sb3 = new StringBuffer(str);
		sb3.reverse();
		System.out.println(sb3);
	}
}
