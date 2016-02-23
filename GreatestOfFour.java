/*Program to find greatest of four number*/

public class GreatestOfFour{
	public int findGreatest(int a, int b, int c, int d){
		int temp1,temp2;
		if(a>b)
		temp1=a;
		else
		temp1=b;
		if(c>d)
		temp2=c;
		else
		temp2=d;
		if(temp1>temp2)
		return temp1;
		else 
		return temp2;
	}
	public static void main(String[] args){
		GreatestOfFour obj=new GreatestOfFour();
		System.out.println("Greatest Number Is " +obj.findGreatest(6,12,21,9));
	}
}