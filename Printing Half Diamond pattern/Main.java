import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1, x=1;i<=n;i++, x+=2){
      	for(int j=1;j<(n-i+1);j++){
        	System.out.print(" ");
        }
        for(int k=1;k<=x;k++){
        	System.out.print("*");
        }
        for(int j=1;j<(n-i);j++){
        	System.out.print(" ");
        }
        System.out.println();
      }
	}
}