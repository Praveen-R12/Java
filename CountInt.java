import java.util.Scanner;
class CountInt{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);

System.out.println("Enter a number :");
int a = sc.nextInt();
int count = 0;

while (a>0){
a /= 10;
count ++;
}

System.out.println("The Number of Digits in the Given Number is "+count);

}}
