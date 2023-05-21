package HME_Checkboxs;

public class Snippet {
	
	static int x=100;
	static int y=200;
	static{
		x+=1;
		y+=1;
}
public static void main(String[] args) {
	
	x+=5;
	y+=10;
	System.out.println(x+y);
	}
static {
	x+=100;
	y+=200;
}
	
}

