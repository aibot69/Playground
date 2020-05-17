import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	int n,rot,temp1,temp2;
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
    	int arr[]=new int[n];
    	for(int i=0; i<n; i++)
        {
          arr[i]=sc.nextInt();
        }
    	rot=sc.nextInt();
    	for(int r=1; r<=rot; r++)
        {
          temp1=arr[1];
          for(int a=3; a<n; a+=2)
          {
          	arr[a-2]=arr[a];
          }
          if(n%2==0){
          	arr[n-1]=temp1;
          	temp2=arr[n-2];
		for(int b=n-2; b>0; b-=2)
          	arr[b]=arr[b-2];
          	arr[0]=temp2;}
          else{
            	arr[n-2]=temp1;
          	temp2=arr[n-1];
		for(int b=n-1; b>0; b-=2)
          	arr[b]=arr[b-2];
          	arr[0]=temp2;}
          
        }
    	for(int c=0; c<n; c++)
          System.out.print(arr[c]+" ");
          
  	}
}