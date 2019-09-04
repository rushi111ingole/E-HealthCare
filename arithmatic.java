import java.util.Scanner;
class arithmatic
{
public static void main(String[] args)
{
int n1,n2,add=0,sub=0,mul=0,div=0,choice;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 2 values");
n1=sc.nextInt();
n2=sc.nextInt();
System.out.println("Enter your choice: 1for add,2,3,4:");
choice=sc.nextInt();
switch(choice)
{
case 1: add=n1+n2;
System.out.println("The addition is"+add);
break;
case 2: sub=n1+n2;
System.out.println("The substraction is"+sub);
break;
case 3: mul=n1*n2;
System.out.println("The mul is"+mul);
break;
case 4: div=n1/n2;
System.out.println("The div is"+div);
break;
default:System.out.println("You entered wrong info");
}
}
}