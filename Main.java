import java.util.*;

public class Main{
   public static void fun(int [] arr){
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
}



  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a+b);

    String s = sc.next();
    System.out.println(s);
    s = sc.next();
    System.out.println(s);

    // for ,while, do while , break , continue
    //if else, switch case

   int [] arr = new int[5];
   arr[0] =10;
    arr[1] =20;
    arr[2] =30;
    arr[3] =40;
    fun(arr);
    for(int val : arr){
      System.out.println(val);
    }


  }

}