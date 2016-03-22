/*Program to extract digit of number*/
 
public class ExtractNumber{
	public void extract(int n){
		int r;
		while(n>0){
			r=n%10;
			System.out.println(r);
			n=n/10;
		}
	} 
    public static void main(String[] args){
		ExtractNumber obj=new ExtractNumber();
		obj.extract(12387987);
	}		
	
}