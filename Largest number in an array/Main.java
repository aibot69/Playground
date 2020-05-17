import java.util.Scanner;
class Main{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      	int arr_size=sc.nextInt();
      	int arr[]= new int[arr_size];
      	for(int i=0;i<arr_size;i++){
        	arr[i]=sc.nextInt();
        }
      	int greatest=arr[0];
      	for (int j=1;j<arr_size;j++){
      	for (int i=1;i<arr_size;i++){
        	if(greatest<arr[i])
              	greatest=arr[i];
       		}
    	}
      	System.out.print(greatest);
	}
}