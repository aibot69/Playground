import java.util.Scanner;
class Main
{
  public static int fac_no(int num){
  	if(num==0)
      return 1;
    else 
      return num*fac_no(num-1);
  }
  public static void main(String args[])
  {Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int result=fac_no(n);
   System.out.print(result);
  }
}