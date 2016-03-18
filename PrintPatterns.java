public class PrintPatterns{
	//code to print square box pattern.
	public void pattern1(){
		int row=4,col=4;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
	//code to print number pattern.
	public void pattern2(){
		int row=4,i=1;
		while(i<=row){
			int j=1;
			while(j<=i){
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	//code to print number pattern.
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
	////code to print pattern.
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
	//code to print empty square box pattern.
	public void pattern5(){
		int row=5,col=5;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if((i==1||i==5)||(j==1||j==5)){
				    System.out.print("#");
			    }
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	//code to print reverse z-shape pattern.
	public void pattern6(){
		//int row=5,col=5;
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
	//code to print z-shape pattern.
	public void pattern7(){
		int row=5,col=5;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if((i==1||i==5||(i==3&&j==3))||(j==2*i)||(i!=2&&i==2*j))
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	//code to print reverse isosceles triangle pattern.
	public void pattern8(){
		int row=5,col=9;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
			if((i==j)||(i==1&&j%2!=0)||(i==2&&j==4*i)||(i==3&&j==i+4)||(i==4&&j==i+2)){
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	//code to print isosceles triangle pattern.
	public void pattern9(){
		int row=5,col=9;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if((i==5&&j%2!=0)||j==i+4||(i==3&&j==3)||(i==2&&j==2*i)||(i==4&&j==i/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	//code to print diamond shape.
	public void pattern10(){
		int row=7,col=7;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				//if((j%2==0&&i%2==0)||j==i+2||(i==1&&j==3)||(i==5&&j==3)||(i==3&&j==1))
					if((i<=4&&i+j==5)||(i>=4&&i+j==11)||((i==2||i==5)&&i+j==7)||((i==3||i==6)&&i+j==9))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(); 
		}
	}
	
	/*Code to print pattern like 1 1 2 3 4  5  6  7  8  9 
	                             2 2 4 6 8 10 12 14 16 18*/
	public void pattern11(){
		int row=2;
		for(int i=1;i<=row;i++){
			System.out.print(i);
			System.out.print(" ");
			for(int j=1;j<=9;j++){
				if(i==1){
					System.out.print(j);
					System.out.print(" ");
					if(j>4)
						System.out.print("  ");
					if(j==9)
						System.out.println();
				}
				else{
					
					System.out.print(2*j);
					if(j>4)
						System.out.print("  ");
					
					else
						System.out.print(" ");
				}	
			}
			System.out.println();
				
		}
	}
	
	
	//Code to print pattern
	public void pattern12(){
		int row=3,col=10;
		for(int i=1;i<=row;i++){
			if(i==1||i==3)
				System.out.print("+");
            for(int j=1;j<=col;j++){
						if(i==2&&(j==1||j==10))
				    System.out.print("!");
				if(j==10&&i!=2)
					System.out.print("+");
					if(j<9){
					    if((i==1||i==3)&&(i+j)%2==0)
						    System.out.print("/");
						else
							if(i==2)
								System.out.print(" ");
							else
						    System.out.print("\\");
					}
			}
				
				System.out.println();
		}
	}
    //Code to print pattern
	public void pattern13(){
	int row=5,col=10;
		for(int i=1;i<=row;i++){
			if(i==1||i==5)
				System.out.print("+");
            for(int j=1;j<=col;j++){
                //if((i==2&&j==1)||(i==2&&j==10))
					if((i==2||i==3||i==4)&&(j==1||j==10))
				    System.out.print("!");
				if(j==10&&(i==1||i==5))
					System.out.print("+");
					if(j<9){
					    if((i==1||i==5)&&(i+j)%2==0)
						    System.out.print("/");
						else
							if(i==2||i==3||i==4)
								System.out.print(" ");
							else
						    System.out.print("\\");
					}
			}
				
				System.out.println();
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
		obj.pattern8();
		obj.pattern9();
		obj.pattern10();
		obj.pattern11();
		obj.pattern12();
		obj.pattern13();
	}
}