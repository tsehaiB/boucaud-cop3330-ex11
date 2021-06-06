/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        int euros = myApp.readEuro();
        double rate = myApp.readRate();
        System.out.printf("%d euros at an exchange rate of %.4f is\n%.2f U.S. dollars.\n", euros, rate, myApp.calcUSD(euros, rate));
    }
    private int readEuro(){
        System.out.print("How many euros are you exchanging? ");
        return inp.nextInt();
    }
    private double readRate(){
        System.out.print("What is the exchange rate? ");
        return inp.nextDouble();
    }
    private double calcUSD(int euros, double rate){
        double usd = euros * rate;
        //To round up to the next penny, so that 111.383 becomes 111.39 as stated in the constraints
        if(((usd * 100) % 1) > .5)
            return usd + 0.01;
        else
            return usd;
    }
}
