package lab1;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String _symbol, String _name) {
        symbol = _symbol;
        name = _name;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}