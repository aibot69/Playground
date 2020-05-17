import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=1, n1=1;
      for(int i=0;i<n;i++, n1++){
        for(int k=1;k<=(n-(i+1));k++){
        	System.out.print(" ");
        }
      	for(int j=1;j<=n1;j++){
          System.out.print(x++); System.out.print(" ");
        }
        System.out.println();
      }
    }    
}