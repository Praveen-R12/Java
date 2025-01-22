import java.util.Scanner;
class Day{
public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Day between 1 to 7:");
    int d = sc.nextInt();
    System.out.println(Getday(d));
}
public static String Getday(int d){
    String day;
    switch(d){
        case 1:day = "Monday";break;
        case 2:day = "Tuesday";break;
        case 3:day = "Wednesday";break;
        case 4:day = "Thrusday";break;
        case 5:day = "Friday";break;
        case 6:day = "Saturaday";break;
        case 7:day = "Sunday";break;
        default:day="Invalid give btween 0 to 1";break;
    }
    return day;
}}