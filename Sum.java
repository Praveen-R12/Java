import java.util.Scanner;
class Sum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter n : ");
int n = sc.nextInt();

int a = (n*(n+1))/2;
System.out.println("The Sum of the given Number is "+a);
}
}