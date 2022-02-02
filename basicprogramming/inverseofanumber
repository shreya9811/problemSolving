import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int num,sum=0,exp,fv,count=1;
  num =n;
  int index=1;
  while (num!= 0)
  {
    fv = num%10; 
    exp = (int)Math.pow(10,fv-1);
    sum = exp*count+sum;//place value added and calculated
    num=num/10; 
    count++;
  }
  System.out.println(sum);
 }
}
