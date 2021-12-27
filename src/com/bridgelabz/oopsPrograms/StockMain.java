package com.bridgelabz.oopsPrograms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class StockMain {
	static ArrayList<Stock> listStock = new ArrayList<Stock>();
	Scanner sc = new Scanner(System.in);

	public void portfolioOfStock() {
		System.out.println("First enter number of stocks");
		int numberOfStocks = sc.nextInt();
		for (int i = 0; i < numberOfStocks; i++) {
			System.out.println("Enter the name of share");
			String shareName = sc.next();
			System.out.println("Enter number of shares");
			int numberOfShares = sc.nextInt();
			System.out.println("Enter share price");
			int sharePrice = sc.nextInt();
			listStock.add(new Stock(shareName, numberOfShares, sharePrice));
			// totalStockValue(numberOfShares * sharePrice);
			totalValueOfEachStock(numberOfShares, sharePrice);

		}
	}

	public int totalValueOfEachStock(int numberOfShares, int sharePrice) {
		int stockvalue = 0;
		Iterator<Stock> itr = listStock.iterator();
		while (itr.hasNext()) {
			Stock s = (Stock) itr.next();
			int stock = s.getNumberOfShares() * s.getSharePrice();
			System.out.println("Name of the stock: " + s.getStockName() + "total stock price: " + stock);
			stockvalue = stockvalue + stock;
		}
		System.out.println("total Value of each stock: " + stockvalue);
		return numberOfShares * sharePrice;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to object oriented programs");
		StockMain stock = new StockMain();
		stock.portfolioOfStock();
		stock.totalValueOfEachStock(2, 20);

	}
}
