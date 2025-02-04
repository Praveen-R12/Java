import java.util.Scanner;
class DoSum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter n : ");
int n = sc.nextInt();
int d = 0;
do{
d += n%10;
n=n/10;
}while(n>0);
System.out.println("The Sum of the Digits is "+d);
}
}