package com.capgemini.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Trader {
	private String name;
	private String city;

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
}

class Transaction {
	private Trader trader;
	private int year;
	private int value;

	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public int getValue() {
		return value;
	}
}

public class Assignment5Q4 {
	public static List<Transaction> sortTransactions(List<Transaction> transactions) {
		return transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
	}

	public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
		return transactions.stream().filter(t -> t.getTrader().getCity().equals("Delhi")).map(Transaction::getValue)
				.collect(Collectors.toList());
	}

	public static int highestTransaction(List<Transaction> transactions) {
		return transactions.stream().map(Transaction::getValue).reduce(0, Integer::max);
	}

	public static int smallestTransaction(List<Transaction> transactions) {
		return transactions.stream().map(Transaction::getValue).reduce(0, Integer::min);
	}

	public static void main(String[] args) {
		Trader t1 = new Trader("John", "Mumbai");
		Trader t2 = new Trader("Dave", "Delhi");
		Trader t3 = new Trader("Steve", "Mumbai");
		Trader t4 = new Trader("Ravi", "Pune");

		List<Transaction> transactions = new ArrayList<>();
		transactions.add(new Transaction(t1, 2012, 1000));
		transactions.add(new Transaction(t2, 2011, 500));
		transactions.add(new Transaction(t3, 2011, 1500));
		transactions.add(new Transaction(t4, 2011, 800));
		transactions.add(new Transaction(t1, 2013, 1200));
		transactions.add(new Transaction(t2, 2012, 900));

		// Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> sortedTransactions = sortTransactions(transactions);
		System.out.println("Sorted transactions in 2011: " + sortedTransactions);

		// Print all transactions’ values from the traders living in Delhi.
		List<Integer> delhiTransactionValues = transactionsValuesDelhi(transactions);
		System.out.println("Transaction values from traders in Delhi: " + delhiTransactionValues);

		// What’s the highest value of all the transactions?
		int highestValue = highestTransaction(transactions);
		System.out.println("Highest transaction value: " + highestValue);

		// Find the transaction with the smallest value.
		int smallestValue = smallestTransaction(transactions);
		System.out.println("Smallest transaction value: " + smallestValue);
	}
}