import java.util.Scanner;
class Divide{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a :");
int a = sc.nextInt();
System.out.print("Enter b :");
int b = sc.nextInt();

int sum = a+b;

if(sum%2==0){
System.out.println(" The Number is Even");
}
else{
System.out.println("The Number is Odd");
}

}}