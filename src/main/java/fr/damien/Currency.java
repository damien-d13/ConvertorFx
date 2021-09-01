package fr.damien;

public enum Currency {
    
    Euro("euro", 1, "\u20AC" ),
    Dollar("dollar", 0.85, "\u0024"),
    Livre("livre", 1.16, "\u00A3"),
    Yen("yen", 0.0077, "\uFFE5"),
    Zloty("zloty", 0.22, "zł");

    private String name;
    private double euroConversionRate;
    private String symbol;

    Currency(String name, double euroConversionRate, String symbol) {
        this.name = name;
        this.euroConversionRate = euroConversionRate;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public double getEuroConversionRate() {
        return euroConversionRate;
    }


    public String getSymbol() {
        return symbol;
    }
}
