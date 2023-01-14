import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;

public class Account {


  ArrayList <Database> stock = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    Random rn = new Random();



    void storeDetails() {
        char option = 'Y';


        while (option == 'Y') {
            Database d1 = new Database();


            System.out.println("Enter the details of the stock u wnt to add:");

            System.out.print("Enter the name of stock u want to purchase : ");
            String stname = sc.next();
            d1.stockNames = stname;
            System.out.print("Enter the number of shares u want to purchase : ");
            float snumber = sc.nextFloat();
            d1.numberOfShare = snumber;
            float sprice = rn.nextFloat(400,1200);
            d1.sharePrice = sprice;
            System.out.print("The current price of the " + stname  +" share : " + sprice);
            System.out.println("Press Y if you wish to enter more stocks :");
            option = sc.next().charAt(0);
            stock.add(d1);

        }
        System.out.println("The Total value of" + d1.stockNames + "is : "+ d1.stockCurrentValue);
        System.out.println("The Total value of all the stocks is : "+ d1.totalValue);

    }


    void currentValueCalculator(){
        Database d1 = new Database();
        d1.stockCurrentValue = d1.numberOfShare * d1.sharePrice;
     //   stock.add(d1);


    }

    void totalValueCalculator()
    {
        Database d1 = new Database();
       d1.totalValue = d1.totalValue + d1.stockCurrentValue;
     //  stock.add(d1);

    }
    void displayDetails()
    {

        Iterator itr = stock.iterator();
        while(itr.hasNext())
        {

            System.out.println(itr.next());


        }


    }



}
