import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner scn = new Scanner(System.in);
      int num1 = scn.nextInt();
      int num2 = scn.nextInt();
  int a = num1,b=num2;
      while(a%b != 0)
      {
        int temp = a%b;
        a = b;
        b = temp;
      }
      int hcf = b;
      System.out.println(hcf);
      int lcm = (num1*num2)/hcf;
      System.out.println(lcm);
     }

    }
