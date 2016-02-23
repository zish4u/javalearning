/*Program to find greatest of two number*/
public class GreatestOfTwo{
	public int findGreatest(int a, int b){
		if(a>b)
		return a;
		else
		return b;
	}
	public static void main(String[] args){
		GreatestOfTwo obj=new GreatestOfTwo();
		System.out.println("The greatest number is " + obj.findGreatest(4,9));
	}
}