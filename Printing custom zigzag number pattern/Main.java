import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.close();
      for(int i=1;i<=n;i++){
      	if(i%2==0){
        	for(int j=0;j<n;j++){
            	if(j==0){
                	System.out.print(i+1);
                } else {
                	System.out.print(i);
                }
            }
        } else {
        	for(int j=0;j<n;j++){
            	if(j==(n-1)){
                	System.out.print(i+1);
                } else {
                	System.out.print(i);
                }
            }
        }
		System.out.println();
      }
	}
}