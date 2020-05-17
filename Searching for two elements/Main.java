import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      	int arr_size=sc.nextInt();
      	int arr[]= new int[arr_size];
      	for(int i=0;i<arr_size;i++){
        	arr[i]=sc.nextInt();
        }
      	int elem1=sc.nextInt();
      	int elem2=sc.nextInt();
      	int flag1=0,flag2=0;
      	for(int j=0;j<arr_size;j++){
        	if(arr[j]==elem1){
              	System.out.println(j);
          		flag1=1;
            }
        }
      	if(flag1==0)
          	System.out.println(-1);
      	for(int j=0;j<arr_size;j++){
            if(arr[j]==elem2){
            	System.out.println(j);
              	flag2=1;
            }
        }
      	if(flag2==0)
          	System.out.println(-1);
    }
}