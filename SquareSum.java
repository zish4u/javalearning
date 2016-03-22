/*Program to find sum of square of 1 to n numbers*/

public class SquareSum{
	public int findSum(int n){
		int i=1,sum=0;
		while(i<=n){
		sum=sum+i*i;
		i++;
		}
		return sum;
	}
	public static void main(String[] args){
		SquareSum obj= new SquareSum();
		System.out.println(obj.findSum(10));
	}
}
 