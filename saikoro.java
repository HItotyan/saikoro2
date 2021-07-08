import java.util.Random;
import java.util.Scanner;
public class saikoro {
public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner=new Scanner(System.in);
    System.out.println("What is your name?");
    System.out.print(">");
    String input_text=scanner.nextLine();
    System.out.println("Hello,"+input_text+"!");
System.out.println("Rolling the dice");
int val1=rand.nextInt(6)+1;
System.out.println("Die1:" + val1);
int val2=rand.nextInt(6)+1;
System.out.println("Die2:" + val2);
int goukei=val1+val2;
System.out.println("Total value:" + goukei);
if(goukei>7){
System.out.println(input_text+" won");
};
if(goukei<=7){
    System.out.println(input_text+" lost");
};
}
}

