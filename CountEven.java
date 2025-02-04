import java.util.Scanner;
class CountEven{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number :");
int n = sc.nextInt();
int b=0;
while(n>0){
    if(n%2==0){
        b+=1;
    }
    n--;
}
System.out.println("The Count of the Even Number is "+b);

}}