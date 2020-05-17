import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++){
      	arr[i]=sc.nextInt();
      }
      int value=sc.nextInt();
      for(int i=0;i<(size/2)+1;i++){
      	for(int j=0;j<size;j++){
        	int sum=arr[i]+arr[j];
        	if(sum==value){
            	System.out.println(arr[i] + "," + " " + arr[j]);
            }
        }
      }
    }
}