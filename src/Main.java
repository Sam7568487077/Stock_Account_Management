import java.util.ArrayList;

class Database{

    String stockNames;
    float numberOfShare;
    float sharePrice;
    float stockCurrentValue;
    float totalValue = 0;

    @Override
    public String toString() {
        return "Database{" +
                "stockNames='" + stockNames + '\'' +
                ", numberOfShare=" + numberOfShare +
                ", sharePrice=" + sharePrice +
                ", stockCurrentValue=" + stockCurrentValue +
                ", totalValue=" + totalValue +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {


        System.out.println(" ======= WELCOME TO THE STOCK ACCOUNT MANAGEMENT =====");
        Account acc1 = new Account();
        acc1.storeDetails();
        acc1.displayDetails();
        acc1.currentValueCalculator();
        acc1.totalValueCalculator();
        acc1.displayDetails();

    }
}