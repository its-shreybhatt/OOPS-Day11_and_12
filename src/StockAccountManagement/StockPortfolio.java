package StockAccountManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    static Scanner input = new Scanner(System.in);
    static Stock stockClass = new Stock();
    static ArrayList<Stock> array = new ArrayList<>();

    public static void toAdd() {
        for (int i = 0; i < stockClass.getNumOfShare(); i++) {
            Stock object = new Stock();
            System.out.print("Enter the price of share - ");
            object.setSharePrice(input.nextInt());
            array.add(object);
            stockClass.setTotalPrice(stockClass.getTotalPrice() + object.getSharePrice());

        }
    }

    public static void toPrint() {
        System.out.print("Each share price = \n");
        for (int i = 0; i < stockClass.getNumOfShare(); i++) {
            System.out.print(array.get(i).getSharePrice() + " ");
        }
        System.out.println("\nTotal share price = " + stockClass.getTotalPrice());
    }

    public static void main(String[] args) {

        System.out.print("Enter the name of Stock -");
        stockClass.setStockName(input.next());
        System.out.print("Enter Num of Shares - ");
        stockClass.setNumOfShare(input.nextInt());

        toAdd();
        toPrint();

    }
}