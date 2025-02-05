import java.util.Scanner;
class Pattern{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Size of Pattern : ");
int n = sc.nextInt();

//upper triangle
for(int i=0;i<n;i++){
    for(int s=0;s<n-i-1;s++){
        System.out.print("  ");
}
for(int j=0;j<i*2+1;j++){
System.out.print("* ");
}
System.out.println();
}
//lower Triangle
for(int i=0;i<n;i++){
    for(int s=0;s<i;s++){
System.out.print("  ");
}
for(int j=0;j<2*(n-i)-1;j++){
System.out.print("* ");
}
System.out.println();
}

}}