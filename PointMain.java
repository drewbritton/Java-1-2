// This program tracks the user's purchases of two stocks,
// computing and reporting which stock was more profitable.

import java.util.*;

public class PointMain {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // first stock
        System.out.print("First stock's symbol: ");
        String symbol1 = console.next();
        Stock stock1 = new Stock(symbol1);
        double profit1 = makePurchases(stock1, console);
        
        // second stock
        System.out.print("Second stock's symbol: ");
        String symbol2 = console.next();
        Stock stock2 = new Stock(symbol2);
        