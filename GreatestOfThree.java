/*Program to find Greatest of Three Number*/

public class GreatestOfThree{
	public int findGreatest(int a, int b, int c){
		if(a>b&&a>c)
		return a;
		if(b>a&&b>c)
		return b;
		else 
		return c;
	} 
	public static void main(String[] args){
		GreatestOfThree obj=new GreatestOfThree();
		System.out.println("Greatest Number Is " +obj.findGreatest(3,5,7));
	}
}