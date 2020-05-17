import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int brake=0, space=n-2;
      for(int i=0;i<n;i++){
        for(int j=1;j<=brake;j++){
          System.out.print(" ");
        }
        System.out.print("*");
        for(int k=1;k<=space;k++){
        	System.out.print(" ");
        }
        if(i!=n/2)
        	System.out.print("*");
        System.out.println(); 
        if(i>=n/2){
           space+=2;
           brake--;}
        else{
          space-=2;
          brake++;}
      }
	}
}