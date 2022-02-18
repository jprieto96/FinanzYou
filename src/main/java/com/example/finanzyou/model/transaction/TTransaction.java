package com.example.finanzyou.model.transaction;

import lombok.Data;

import java.util.Date;

@Data
public class TTransaction {

    private int id;
    private int idClient;
    private String idStock;
    private String stockName;
    private double buyPrice;
    private int quantity;
    private Date date;
    private double commision;

    public TTransaction(int id, int idClient, String idStock, String stockName, double buyPrice, int quantity, Date date, double commision) {
        this.id = id;
        this.idClient = idClient;
        this.idStock = idStock;
        this.stockName = stockName;
        this.buyPrice = buyPrice;
        this.quantity = quantity;
        this.date = date;
        this.commision = commision;
    }

    public TTransaction() {
    }

    public Transaction toEntity() {
        return new Transaction(id, idClient, idStock, buyPrice, quantity, date, commision);
    }
}
