class NumberFun{
	//Method to print fibonacci Series.
	
	public void printFibonacci(int n){
		int prev=1;
		int next=1;
		System.out.print("Fabonacci Series is  upto "+n+ " is ");
		for(int i=0;i<n;i++){
			prev=(next-prev);
			next=prev+next;
			System.out.print(prev+",");
		}
		System.out.println("");
	}
	
	//Method to print factorial of given number.
	
	public int findFactorial(int n){
			int fact=1;
			System.out.print("Factorial of "+n+ " is ");
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		//System.out.println(fact);
		return fact;
	}
	
	//Method to extract given number.
	
	public void extractDigit(int n){
		System.out.print("Digits of given number "+n+ " is ");
		for(int i=n;0<n;i--){
			int r=n%10;
			n=n/10;
			System.out.print(r+",");
		}
			System.out.println("");
	}
	
	//Method to find sum of extracted given number.
	
	public int sumOfDigit(int n){
		int sum=0,r=0;
		while(n>0){
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		return sum;
	}
	
	//Method to check given number is an Armstrong number  or not.
	
	public void isArmstrong(int n){
		int sum=0, r=0, num=n;
		while(n>0){
		    r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		System.out.print("The number "+num+"is ");
		if(sum!=num)
			System.out.println("not an armstrong number ");
		
		else
			System.out.println("an armstrong number ");	
		
	}
	
	//Method to reverse a number.
	
	public void reverseNumber(int n){
		int reverse=0;
		while(n!=0){
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println("Reverse of number is "+reverse);
	}
	
	//Method to convert decimal number into binary
	
	public void decimalToBinary(int n){
	    int r=0;
		System.out.print("Decimal to binary is ");
		String binary="";
		while(n>0){
			r=n%2;
			n=n/2;
			binary=binary+r;
	    }
		System.out.print(binary);
		
		
		//System.out.print("Decimal to binary is "+n);
		//System.out.print(n);
	}
	
	public static void main(String[] args){
		NumberFun obj=new NumberFun();
			obj.printFibonacci(9);
			System.out.println(obj.findFactorial(5));
			obj.extractDigit(123);
			System.out.println("Sum of extracted digit of 123 is " +obj.sumOfDigit(123));
			obj.isArmstrong(371);
			obj.reverseNumber(1245);
			obj.decimalToBinary(10);
			
	}
}

