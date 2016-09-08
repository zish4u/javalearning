public class CopyArray{
  public int[] copyArray(int[] A){
    int[] b=new int[A.length];
    for(int i=0;i<A.length;i++){
    b[i]=A[i];
    }
    return A;
  }
  public static void main(String[] args){
    CopyArray copy=new CopyArray();
    int[] a={5,4,1,9,7};
    int[] result=copy.copyArray(a);
    for(int i=0;i<a.length;i++){
      System.out.print(result[i]);
    }
    System.out.println();
  }
}
