/*Program to find sum of digits of a number*/

public class DigitSum{
	public int findSum(int n){
		int r,sum=0;
		while(n>0){
			r=n%10;
			sum=r+sum;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args){
		DigitSum obj=new DigitSum();
		System.out.print(obj.findSum(12389));
	}
}