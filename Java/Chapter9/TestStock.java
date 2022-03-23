
public class TestStock {

	public static void main(String[] args) {
		
		Stock orcl = new Stock("ORCL", "Oracle Corporation");
		
		orcl.setPreviousClosingPrice(34.5);
		orcl.setCurrentPrice(34.35);
		
		System.out.println("The price-change percentage of "+orcl.name
				+", whose symbol is "+orcl.symbol+", "
				+"is "+orcl.getChangePercent()*100+"%.");
	}

}

class Stock {
	
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}
	
	void setPreviousClosingPrice(double newPrice) {
		previousClosingPrice = newPrice;
	}
	
	void setCurrentPrice(double newPrice) {
		currentPrice = newPrice;
	}
	
	double getChangePercent() {
		return (currentPrice-previousClosingPrice)/previousClosingPrice;
	}
}