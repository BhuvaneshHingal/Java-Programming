class Stock {

    private String symbol;
    private String name;

    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent() {
        return (((currentPrice - previousClosingPrice) / previousClosingPrice)*100);
    }
}

public class stock_Q6 {

    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Stock Name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
        System.out.println("Previous Price: " + stock1.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock1.getCurrentPrice());
        System.out.println("Percentage Changed: " + stock1.getChangePercent()); //Increase or Decrease in percentage as per the previous price and current price

    }
}
