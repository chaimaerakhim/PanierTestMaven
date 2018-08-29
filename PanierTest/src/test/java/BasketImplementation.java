import Models.Basket;
import com.thoughtworks.gauge.Step;
import org.assertj.core.api.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class BasketImplementation {

    @Step("the totale_price of an empty basket is <0> $")
    public void EmptyBasketPrice(double arg0) {
        Basket basket = new Basket();
        assertThat(arg0).isEqualTo(basket.getTotaleprice());

    }
}
