public class PrintPatterns{
  //Code to print square box pattern.

	public void printSquare(){
		int row=4;
		System.out.println("");
    if(row<2)
      System.out.println("Please enter atleast 2 rows.");
    else{
			System.out.println("Square Box:-");
      for(int i=1;i<=row;i++){
        for(int j=1;j<=row;j++){
          System.out.print("*");
          System.out.print(" ");
        }
        System.out.println();
      }
    }
	}


	//Code to print number's triangular pattern.Number will increase in series.

	public void numbertriangularPattern1(){
		int row=7;
    if(row<2){
      System.out.print("Please enter atleast 2 rows.");
    }
    else{
			  System.out.println("Number Triangle Pattern1:-");
        for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
          System.out.print(j);
        }
        System.out.println();
      }
    }
	}


	//Code to print number's triangular pattern.Number will be same in series.

	public void numbertriangularPattern2(){
		int row=6;int i=1;
		if(row<2){
			System.out.print("Please enter atleast 2 rows.");
		}
		else{
			System.out.println("Number Triangle Pattern2:-");
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
  }


	/*Code to print pattern of hash(#) in rows,
	 2nd row will start after one blank space but 3rd row will be same as 1st row and vice-versa.*/

	public void printHash(){
		int row=8;
		System.out.println("Hash Pattern:-");
		for(int i=1;i<=row;i++){
			if(i%2==0)
					System.out.print(" ");
			for(int j=1;j<=row;j++){
				System.out.print("#");

			}
			System.out.println();

		}
	}


	//code to print empty square box pattern.

	public void printemptySquare(){
		int row=6;
    if(row<2){
      System.out.print("Please enter atleast 2 rows.");
    }
    else{
			  System.out.println("Empty Square Box:-");
        for(int i=1;i<=row;i++){
        for(int j=1;j<=row;j++){
          if((i==1||i==row)||(j==1||j==row)){
          System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println("");
      }
    }
	}


	//Code to print z in reverse pattern.

	public void printreverseZed(){
		int row=4;
    if(row<3){
      System.out.println("Please enter atleast 3 rows.");
    }
    else{
			  System.out.println("Reverse Z Shpe:-");
        for(int i=1;i<=row;i++){
        for(int j=1;j<=row;j++){
          if(i==1||i==row||i==j){
          System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
	}


	//Code to print z-shape pattern.

	public void printZed(){
		int row=4;
    if(row<3){
      System.out.println("Please enter atleast 3 rows.");
    }
    else{
			  System.out.println("Z-Shape:-");
        for(int i=1;i<=row;i++){
        for(int j=1;j<=row;j++){
          if((i==1||i==row)||((i>=1&&i<=row)&&(j==row-i+1))){
          System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
	}


	//code to print isosceles triangle pattern.

	public void printIsosceles(){
		int row=18;
    int col=row*2-1;
    if(row<2){
      System.out.println("Please enter atleast 3 rows.");
    }
    else{
			  System.out.println("Isosceles Triangle:-");
        for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
          if((i==row&&j%2!=0)||(j==row-i+1)||(j==(row+i)-1)){
          System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println("");
      }
    }
	}


	//Code to print reverse isosceles triangle pattern.

	public void printreverseIsosceles(){
		int row=10;
    int col=row*2-1;
    if(row<2){
      System.out.println("Please enter atleast 3 rows.");
    }
    else{
			  System.out.println("Reverse Isosceles Triangle:- ");
        for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
          if((i==1&&j%2!=0)||i==j||(i%2==0&&j==col-i+1)||(i%2!=0&&j==col-i+1)){
          System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println("");
      }
    }
	}



	//Code to print diamond shape.


	public void printDiomond(){
		int row=5,half_row=0;
    if(row<3)
      System.out.println("Please enter atleast 3 rows");
    else{
			    System.out.println("Diomond Pattern:-");
          if(row%2==0){
            row=row+1;
            half_row=row/2+1;
          }
          else
            half_row=row/2+1;
          for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
              if((i<=half_row)&&((j==(half_row-i)+1)||(j==(half_row+i)-1))||(i>=half_row)&&((j==(i-half_row)+1)||(j==(row-i)+half_row))){
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
          }
    }
	}



//Code to print dumroo shape.


	public void printDumroo(){
    int row=5;
    if(row<3){
      System.out.println("Please enter atleast 3 rows.");
    }
    else{
			  System.out.println("Dumroo Pattern:-");
        for(int i=1;i<=row;i++){
        for(int j=1;j<=row;j++){
          if((i==1||i==row||i==j)||((i>=1&&i<=row)&&(j==row-i+1))){
          System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }

	/*Code to print table pattern*/
	public void printTable(){
		int row=11;
		if(row<1){
      System.out.println("Please enter atleast 1 rows.");
    }
		else{
			System.out.println("Table Of Any Number:-");
			for(int i=1;i<=row;i++){
	       for(int j=1;j<=11;j++){
	        	if(j==1||j==2){
	           	System.out.print(i);
	            System.out.print(" ");
	          }
	          else{
	            int k=j-1;
	            System.out.print(k*i);
	            System.out.print(" ");
	          }
				 }
					System.out.println();
	    }
	  }
	}


	//Code to print zig-zag Box.*/
	public void printZigZagBox(){
		int row=3;
    if(row<3){
      System.out.println("Please enter atleast 3 rows.");
    }
    else{
        System.out.println("Zig-Zag Box:-");
        for(int i=1;i<=row;i++){
        for(int j=1;j<=row;j++){
          if((i==1||i==row)&&(j==1||j==row)){
           	System.out.print("+");
          }
          else if((i==1||i==row)&&(j>1&&j<row)){
           	if(j%2==0){
              System.out.print("/");
            }
            else{
            	System.out.print("\\");
            }
          }
          else if((i>1&&i<row)&&(j==1||j==row)){
           	System.out.print("!");
          }
          else{
          System.out.print(" ");
        }

       }
        System.out.println();
     }
   }

	}

	//Code to print diogonal pattern.
	public void printDiogonal(){
		int row=2;
		if(row>0){
      System.out.println("Please enter atleast 1 rows.");
    }
    else{
			for(int i=1;i<=row;i++){
				for(int j=1;j<=row;j++){
					if(i==j)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
	  }
	}

	// Code to print chess board.
	public void printChess(){
		int row=3;
		for(int i=1;i<=row ;i++){
			for(int j=1;j<=row;j++){
				if((i%2!=0&&j%2!=0)||(i%2==0&&j%2==0))
					System.out.print("white");
				else
					System.out.print("black");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		PrintPatterns obj=new PrintPatterns();
		obj.printSquare();
		obj.numbertriangularPattern1();
		obj.numbertriangularPattern2();
		obj.printHash();
		obj.printemptySquare();
		obj.printreverseZed();
		obj.printZed();
		obj.printIsosceles();
		obj.printreverseIsosceles();
		obj.printDiomond();
		obj.printDumroo();
		obj.printTable();
		obj.printZigZagBox();
		obj.printDiogonal();
		obj.printChess();
	}
}
