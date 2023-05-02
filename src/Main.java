import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount, vatRate = 0.18, withVat, vat; //define the variables
        Scanner input = new Scanner(System.in);  //create Scanner object

        //get the amount from the user
        System.out.println("Enter the amount: ");
        amount = input.nextDouble();

        //do the calculations
        vat = amount * vatRate;
        withVat = amount + vat;

        //print outs
        System.out.println("VAT rate: " + vatRate);
        System.out.println("Price without VAT: " + amount);
        System.out.println("Price with VAT: " + withVat);
        System.out.println("Amount of VAT: " + vat);
    }
}