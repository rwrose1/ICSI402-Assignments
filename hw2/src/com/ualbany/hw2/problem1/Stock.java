package com.ualbany.hw2.problem1;


public class Stock {
	
	public enum Symbol {
		MSFT,
		APPL,
		GOGL,
		AMZN,
		ATNT 
	}
	
	public Symbol symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(Symbol symb) {
		switch(symb) {
			case MSFT: this.name = "Microsoft";
				break;
			case APPL: this.name = "Apple";
				break;
			case GOGL: this.name = "Google";
				break;
			case AMZN: this.name = "Amazon";
				break;
			case ATNT: this.name = "AT&T";
				break;
			default: this.name = "No proper symbol given";
				break;
		}
	}
	
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
	}
	
	public static void main(String[] args) {
		
		
		Stock stockTest = new Stock(Symbol.MSFT);
		
		stockTest.setPreviousClosingPrice(7.00);
		stockTest.setCurrentPrice(13.00);
		System.out.println("Percent change is: " + stockTest.getChangePercent());
		
	}
	
}
