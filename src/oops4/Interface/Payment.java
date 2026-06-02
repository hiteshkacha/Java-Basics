package oops4.Interface;

import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        Scanner readline = new Scanner(System.in);
        System.out.print("Enter Payment Amount : ");
        double paymentAmount = readline.nextDouble();

        System.out.println("Select Payment Method : ");
        System.out.println("1. UPI Payment \n2. Card Payment");
        int paymentType = readline.nextInt();
        switch (paymentType){
            case 1:
                UpiPayment upipay = new UpiPayment();
                upipay.pay(paymentAmount);
                break;
            case 2:
                CardPayment cardpay = new CardPayment();
                cardpay.pay(paymentAmount);
                break;
            default:
                System.out.println("Invalid Payment Method... \nTranzaction Failed!");
        }
    }
}

interface paymentInitialization{
    void pay(double amount);
}

class UpiPayment implements paymentInitialization{
    @Override
    public void pay(double amount) {
        System.out.println("Proceeding UPI Payment Amount of : "+amount);

    }
}

class CardPayment implements paymentInitialization{
    @Override
    public void pay(double amount) {
        System.out.println("Proceeding Card Payment Amount of " +
                ": "+amount);
    }
}