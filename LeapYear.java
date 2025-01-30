import java.util.Scanner;
class LeapYear{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);

System.out.print("Enter a Year:");
int a = sc.nextInt();

if (a % 4 == 0){
System.out.println("Yes !! Its a Leap Year");
}
else{
System.out.println("Oops! Its not a Leap Year");
}
}}