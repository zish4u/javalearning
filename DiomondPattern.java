//This code can print diamond shape for any size by.Just change the value for rows.
public class DiomondPattern{
  public void printDiomond(){
    int row=6,half_row=0;
    if(row<3)
      System.out.println("Please enter atleast 3 rows");
    else{
      if(row%2==0){
        row=row+1;
        half_row=row/2+1;
      }
      else
        half_row=row/2+1;
      for(int i=1;i<=row;i++){
        for(int j=1;j<=row;j++){
          if((i<=half_row)&&((j==(half_row-i)+1)||(j==(half_row+i)-1))||(i>=half_row)&&((j==(i-half_row)+1)||(j==(row-i)+half_row)))
            System.out.print("*");
          else
            System.out.print(" ");
        }
            System.out.println();
      }
    }
  }
  public static void main(String[] args){
    DiomondPattern obj=new DiomondPattern();
    obj.printDiomond();
  }
}
