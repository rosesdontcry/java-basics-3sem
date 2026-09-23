package lab1;

public class Main {
    public static void main(String[] args) {

        Stock sber = new Stock("SBER", "ПАО Сбербанк");
        sber.previousClosingPrice = 281.50;
        sber.currentPrice = 282.87;

        System.out.printf("""
                %s (%s)
                Изменение: %.2f%%%n
                """, sber.name, sber.symbol, sber.getChangePercent());

        Stock[] stocks = new Stock[3];
        stocks[0] = new Stock("GAZ", "Газпром");
        stocks[1] = new Stock("FLOT", "Aэрофлот");
        stocks[2] = new Stock("VTB", "ВТБ ао");

        stocks[0].previousClosingPrice = 102.04;
        stocks[0].currentPrice = 98.8;

        stocks[1].previousClosingPrice = 33.31;
        stocks[1].currentPrice = 32.52;

        stocks[2].previousClosingPrice = 51.455;
        stocks[2].currentPrice = 50.645;


        for (Stock stock : stocks) {
            System.out.printf("""
                %s (%s)
                Изменение: %.2f%%%n
                """, stock.name, stock.symbol, stock.getChangePercent());
        }
    }
}