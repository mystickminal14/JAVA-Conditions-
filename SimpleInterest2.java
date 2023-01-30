import java.util.Scanner;
public class SimpleInterest2{
public static void amount(){

Scanner s= new Scanner(System.in);

System.out.println(" enter principal:");
int pri= s.nextInt();
 
System.out.println("enter rate");
int rat= s.nextInt();

System.out.println("enter time:");
int tim=s.nextInt();

double si= (pri * rat *tim)/100;

double amo=pri*(1+(tim*rat)/100);

System.out.println("the simple interest:"+si);
System.out.println("total amount :"+amo);
}
public static void main(String[]args){
amount();
}}
