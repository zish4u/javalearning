/*Code for sine and cosine*/
public class PrintSeries{
	// Code to calculate value of PI.
	
	public double findPI(int n){
		double pi=0;
		double sum=0.0,val=0.0;
			for(int j=1;j<=n;j++){
				val=(1.0/((j*2)-1));
				if(j%2==0){
				    val=-1*val;
				}	
				sum=sum+val;
                			
			}
			pi=4*sum;
		return pi;
			
	} 
	//Wrong output 
	public double sineSeries(int n){
		int angle=30;//Where x is angle of sine in degree.
		double val=0.0,sum=0.0;
		for(int i=1;i<n;i++){
			int j=((i*2)-1);
			int k=1,fact=1, pow=1;
			while(k<=j){
				fact=fact*k;
				k++;
				pow=pow*angle;
			}
			    val=(double)(pow/fact);
				if(i%2==0)
					val=-1*val;
				sum=sum+val;
				
		}		
		return sum;
	}
	//Wrong output...
	public double cosineSeries(int n){
		int angle=30; //Where x is angle of sine in degree.
		double val=0.0,sum=0.0,cosine=0.0;
		for(int i=2;i<n;i++){
			int j=((i*2)-2);
			int k=1,fact=1, pow=1;
			while(k<=j){
				fact=fact*k;
				k++;
				pow=pow*angle;
			}
				val=(double)(pow/fact);
				if(i%2==0)
					val=-1*val;
				sum=sum+val;
				cosine=1+sum;
		}
		return cosine;
	}
	
	public static void main(String[] args){
		PrintSeries obj= new PrintSeries();
		System.out.println(obj.findPI(1000));
		System.out.println(obj.sineSeries(8));
		System.out.print(obj.cosineSeries(8));
	}
}