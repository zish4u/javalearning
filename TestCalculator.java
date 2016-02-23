/*Code for TestCalculator*/

public class TestCalculator{
	public static void main(String[] args){
		Calculator obj=new Calculator();
		int c=obj.add(2,4);
		int d=obj.sub(6,9);
		int e=obj.mult(3,6);
		double f=obj.div(4,2);
		System.out.println("Addition of two number is " +c);
		System.out.println("subtraction of two number is " +d);
		System.out.println("Multiplication of two number is " +e);
		System.out.println("Division of two number is " +f);
	}
}