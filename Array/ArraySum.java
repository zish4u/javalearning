public class ArraySum{
  double avg=0.0; int sum=0;
  public int sumOfArray(int[] A){
    for(int i=0;i<A.length;i++){
      sum=sum+A[i];
    }
    return sum;
  }
  public double avarageOfArray(int[] A){
    for(int i=0;i<A.length;i++){
      sum=sum+A[i];
    }
      avg=sum/A.length;
    return avg;
  }
  public static void main(String[] args){
    ArraySum sum=new ArraySum();
    int[] a={2,1,9,7,6,5,4};
     int result=sum.sumOfArray(a);
     System.out.println(result);
     ArraySum avg=new ArraySum();
      double results=avg.avarageOfArray(a);
     System.out.println(results);
  }
}
