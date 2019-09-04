import java.util.Scanner;
class arraysort
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,n,temp=0,j;
System.out.println("Enter size of array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter values in array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("sorted array is");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}