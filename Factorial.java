/*Program to find factorial of given number*/

public class Factorial{
	public int findFactorial(int n){
		
		for(int i=1;i<=n;i++){
			n=n*i;
		}
		return n;
	}
	

    public static void main(String[] args){
		Factorial obj=new Factorial();
		System.out.print(obj.findFactorial(6));
	}
}	