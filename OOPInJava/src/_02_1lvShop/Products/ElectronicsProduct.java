package _02_1lvShop.Products;

import _02_1lvShop.AgeRestriction;
import _02_1lvShop.GuaranteePeriod;

import java.math.BigDecimal;

public abstract class ElectronicsProduct extends Product {
    private GuaranteePeriod guaranteePeriod;

    protected ElectronicsProduct(
            String name,
            BigDecimal price,
            double quantity,
            AgeRestriction ageRestriction,
            GuaranteePeriod guaranteePeriod) {
        super(name, price, quantity, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    public GuaranteePeriod getGuaranteePeriod() {
        return guaranteePeriod;
    }
}
