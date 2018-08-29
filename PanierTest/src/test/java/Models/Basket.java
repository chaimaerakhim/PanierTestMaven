package Models;

import java.util.List;

public class Basket {
    private double totaleprice;
    List<Product> products;

    public Basket() {
        this.setTotaleprice(0);
    }

    public Basket(double totaleprice) {
        this.totaleprice = totaleprice;
    }

    public Basket(double totaleprice, List<Product> products) {
        this.totaleprice = totaleprice;
        this.products = products;
    }

    public double getTotaleprice() {
        return totaleprice;
    }

    public void setTotaleprice(double totaleprice) {
        this.totaleprice = totaleprice;
    }
}
