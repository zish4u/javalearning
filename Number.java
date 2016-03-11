/*Program for n number*/
public class Number{
	public void printNumbers(int n){
		System.out.println("Series of number upto " +n +"is...");
		for(int i=1;i<=n;i++)
		System.out.print(i+" ");
	}
	
	public int sumOfNumber(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
		sum=sum+i;	
		}	
	    return sum;
	}
	public int avarageOfNumber(int n){
		int sum=0;int avg=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		avg= sum/n;
		return avg;
	}
	public void printSeries(int n){
		double sum=0.0;
		double div=0.0;
		System.out.println("Series is ");
		for(int i=1;i<=n;i++){
			System.out.print("1/"+i);
			if(i<n)
			System.out.print("+");
		    sum=sum+(double) 1/i;
		}
		System.out.print("="+sum);
		
	}
	public void oddEve(int n){
		int odd=0;
		int eve=0;
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				odd=odd+i;
			}
			else{
				eve=eve+i;
			}	
		}
		System.out.println("");
		System.out.println("Sum of odd numbers is "+odd);
		System.out.println("Sum of even numbers is "+eve);
	}
	public int sumOfSquare(int n){
		int sum=0;
		System.out.print("Sum of square of number ");
		for(int i=1;i<=n;i++){
			System.out.print(i+"*"+i+"+");
			sum=sum+i*i;
		}
		return sum;
	 
	}
	public int productOfNumber(int n){
		int product=1;
		for(int i=1;i<=n;i++){
			product=product*i;
		}
		return product;
	}
	
public static void main(String[] args){
	Number obj=new Number();
	obj.printNumbers(9);
	System.out.println("");
	System.out.println("Sum of numbers 1 to 9 is " +obj.sumOfNumber(9));
	System.out.println("Average of numbers is " +obj.avarageOfNumber(9));
	obj.printSeries(9);
	obj.oddEve(9);
	System.out.println("= " +obj.sumOfSquare(5));
	System.out.println("Product of number is = " +obj.productOfNumber(5));
	
    } 
	
}