import java.util.Scanner;
class Tax{
    public static void main(String args [])
    {
        double AmountOfPurchase;
        double StateTax = 0.04;
        double CountryTax = 0.02;
        double TotalSaleTax;
        double TotalSale;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter the amount of a purchase:");
        AmountOfPurchase = keyboard.nextDouble();
        System.out.println("amount of purchase that entered by user is:"+AmountOfPurchase);

        TotalSaleTax = StateTax + CountryTax;
        System.out.println("total sales tax is: "+TotalSaleTax);

        TotalSale = TotalSaleTax + AmountOfPurchase;
        System.out.println("total sale is equal to:"+TotalSale);

                        
    }
}