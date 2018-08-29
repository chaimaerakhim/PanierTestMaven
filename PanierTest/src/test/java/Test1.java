import Models.Basket;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.assertj.core.api.Assert;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test1 {
    Basket basket;//sinon on doit definir cette basket dans un context but how

    @Step("Say <hello> to <name>")
    public void SayHello(String arg0, String arg1) {
        System.out.println(arg0 + ":" + arg1);

    }

    @Step("Adding a product that cost <product_price> $")
    public void TotalebascketPrice(double arg0) {

        Basket basket = new Basket();
        basket.setTotaleprice(arg0++);
        assertThat(basket.getTotaleprice()).isEqualTo(145);

    }

    @Step("creationg a new basket")
    public void CreationANewBasket() {
        basket = new Basket();

    }

    @Step("Adding to basket a product that cost <product_price> $")
    public void AddingANewProductToBasket(double arg0) {
        basket.setTotaleprice(basket.getTotaleprice() + arg0);
    }

    @Step("the totale price of basket should be <145>")
    public void VerificationOfNewPrice(double arg0) {
        assertThat(basket.getTotaleprice()).isEqualTo(arg0);


    }

    @Step("Adding to basket a product that cost <table>")
    public void AddingNewProductAndtestThetotalePrice(Table arg0) {
        List<String> value = arg0.getColumnValues(0);


        for (int i = 0; i < value.size(); i++) {
            basket.setTotaleprice(basket.getTotaleprice() + Double.valueOf(value.get(i)));
        }

    }

    @Step("verifier the price of basket")
    public void implementation1() {

    }

    @Step("delete a list of product <table>")
    public void DeleteAListOfProductBy(Table arg0) {
        List<String> prices=arg0.getColumnValues(1);
        basket.

    }
}
