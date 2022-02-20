package com.example.finanzyou.model.client;

import lombok.Data;

@Data
public class DetailsPortfolio {

    private String sector;
    private int quantity;
    private double buyPrice;

    public DetailsPortfolio() {}

    public DetailsPortfolio(int quantity, double buyPrice, String sector) {
        this.quantity = quantity;
        this.buyPrice = buyPrice;
        this.sector = sector;
    }
}
