import java.util.Scanner;
class CalculatePower{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Base : ");
int a = sc.nextInt();
System.out.print("Enter Power : ");
int b = sc.nextInt();
int c =1;
do{
c = c * a;
b--;
}while(b>0);
System.out.println("The Value of the Given Number is " +c );
}}