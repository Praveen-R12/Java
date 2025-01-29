import java.util.Scanner;
class EvenOfNum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number :");
int a = sc.nextInt();

if (a % 27 == 0){
System.out.println("Its Evenly divided by 27");
}
else{
System.out.println("Oops! Its Not Evenly Divided by 27");
}
}}