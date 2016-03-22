/*Program for n number*/
public class Number{
	
	//Code to print series 1 2 3 4 5 ......n
	
	public void printNumbers(int n){
		System.out.println("Series of number upto " +n +"is...");
		for(int i=1;i<=n;i++)
		System.out.print(i+" ");
	}
	
	//Finding sum of number series upto n.
	
	public int sumOfNumber(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
		sum=sum+i;	
		}	
	    return sum;
	}
	
	//Finding avarage of number series upto n.
	
	public int avarageOfNumber(int n){
		int sum=0;int avg=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		avg= sum/n;
		return avg;
	}
	
	//Printing series 1/1+1/2+1/3+......1/n.
	
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
	
	//Finding sum of odd/eve number upto n.
	
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
	
	//Finding sum of square of number upto n.
	
	public int sumOfSquare(int n){
		int sum=0;
		System.out.print("Sum of square of number ");
		for(int i=1;i<=n;i++){
			System.out.print(i+"*"+i+"+");
			sum=sum+i*i;
		}
		return sum;
	 
	}
	
	//Finding product of number upto n.
	
	public int productOfNumber(int n){
		int product=1;
		for(int i=1;i<=n;i++){
			product=product*i;
		}
		return product;
	}
	
	// Code to check prime number
	public boolean checkPrime(int n){
			boolean prime=true;
			int counter=0;
			for(int i=1;i<=n;i++){
				if(n%i==0)
					counter=counter+1;
					if(counter==2)
						prime=true;
					else
						prime=false;
			}
	    return prime;
	}
	
	//Code to find factors of a numbet
	public void findFactor(int n){
			int factor=1;
			System.out.print("Factors of number" +n+ "is " );
			while(factor<=n){
				if(n%factor==0){
				System.out.print(factor);
				System.out.print(" ");
				}
			    factor++;
				
			}
			
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
	System.out.println("Number is prime? " +obj.checkPrime(0));
	obj.findFactor(15);
    } 
	
}