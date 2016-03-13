public class PrintPatterns{
	
	public void pattern1(){
		int row=4,col=4;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public void pattern2(){
		int row=4,i=1;
		while(i<=row){
			int j=1;
			while(j<=i){
				System.out.print(j);
				j++;
			}
			System.out.println("");
			i++;
		}
	}
	
	public void pattern3(){
		int row=4;int i=1; 
		while(i<=row){
			int j=1;
			while(j<=i){
			    System.out.print(i);
			    j++;
			}
			System.out.println();
				i++;
	    }
		
	}
	
	public void pattern4(){
		int row=4,col=4;
		for(int i=1;i<=row;i++){
			if(i%2==0)
					System.out.print(" ");
			for(int j=1;j<=col;j++){
				System.out.print("#");
				
			}
			System.out.println();	
			
		}
	}
	
	public void pattern5(){
		int row=5,col=5;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if((i==1||i==5)||(j==1||j==5)){
				    System.out.print("#");
					//System.out.println("");
			    }
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public void pattern6(){
		int row=5,col=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if((i==1||i==5)||(i==j))
					System.out.print("#");
				else
					System.out.print(" ");
			}
				System.out.println("");
				
		}
	}
	
	public void pattern7(){
		int row=5,col=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if((i==1||i==5)||(j%2==0||i==j))
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		PrintPatterns obj=new PrintPatterns();
		obj.pattern1();
		obj.pattern2();
		obj.pattern3();
		obj.pattern4();
		obj.pattern5();
		obj.pattern6();
		obj.pattern7();
	}
}