import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int nod=0;
     int temp = n;
     while(temp>0)
     {
       temp=temp/10;
       nod++;
     }
     k = k%nod;
     if(k<0)
     {
       k= k + nod;
     }
     int div=1,mul=1;
     //creating multiplier and divisor
     for(int i =1;i<= nod;i++)
     {
       if(i <= k)
       {
         div = div*10;
       }
       else
       {
         mul = mul*10;
       }
     }
     int q = n / div;
     int r = n%div;
     int num = r*mul +q;
     System.out.println(num);
    }
   }
