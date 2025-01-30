import java.util.Scanner;
class AddSub{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the First Number :");
int a = sc.nextInt();

System.out.print("Enter the Second Number :");
int b = sc.nextInt();

int c = a+b;
int d = a-b;

System.out.println(c+ " is the Addition of the Given Number.");

if(d<0){
d *= -1;
System.out.println(d+ " is the Subraction of the Given Number in Positive Value.");
}
else{
System.out.println(d+ " is the Subraction of the Given Number.");
}

}}