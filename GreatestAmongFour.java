import java.util.Scanner;
class GreatestAmongFour{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a,b,c,d;
System.out.println("Enter a :");
a =sc.nextInt();
System.out.println("Enter b :");
b =sc.nextInt();
System.out.println("Enter c :");
c =sc.nextInt();
System.out.println("Enter d :");
d =sc.nextInt();

int max = a;
int min = a;

if (b> max){
max = b;}
if (b<min){
min = b;}

if (c> max){
max = c;}
if (c<min){
min = c;}

if (d> max){
max = d;}
if (d<min){
min = d;}

System.out.println("The Greatest Among Four is :"+max);
System.out.println("The Lowest Among Four is :"+min);
}
}
