import java.util.Scanner;
class Purchases{
    public static void main(String args []){
        double item1,item2,item3,item4,item5;
        double subtotal;
        double amountofsales;
        double total;
        double salestax = 0.06;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter amount of the price of item1:");
        item1 = keyboard.nextDouble();

        System.out.println("enter amount of the price of item2:");
        item2 = keyboard.nextDouble();

        System.out.println("enter amount of the price of item3: ");
        item3 = keyboard.nextDouble();

        System.out.println("enter amount of the price of item4:");
        item4 = keyboard.nextDouble();

        System.out.println("enter amount of the price of item5:");
        item5 = keyboard.nextDouble();

        subtotal = item1 + item2 + item3 + item4 + item5;
        System.out.println("subtotal of five items is:"+subtotal);

        amountofsales = subtotal / salestax;
        System.out.println("the amount of sale is:"+amountofsales);

        total = amountofsales + subtotal;
        System.out.println("total amount of sale tax is:"+total);


        
    }
}
