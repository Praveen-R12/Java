import java.util.Scanner;
class Evenly{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number :");
int a = sc.nextInt();

if (a % 100 == 0){
System.out.println("Its Evenly divided by 100");
}
else{
System.out.println("Oops! Its Not Evenly Divided by 100");
}
}}