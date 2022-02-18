package com.example.finanzyou.model.client;

import lombok.Data;

@Data
public class DetailsPortfolio {

    private int quantity;
    private double buyPrice;

    public DetailsPortfolio() {}

    public DetailsPortfolio(int quantity, double buyPrice) {
        this.quantity = quantity;
        this.buyPrice = buyPrice;
    }
}
