import java.util.Random;
public class saikoro {
public static void main(String[] args) {
    Random rand = new Random();
System.out.println("Rolling the dice");
int val1=rand.nextInt(6)+1;
System.out.println("Die1:" + val1);
int val2=rand.nextInt(6)+1;
System.out.println("Die2:" + val2);
int goukei=val1+val2;
System.out.println("Total value:" + goukei);
}
}
