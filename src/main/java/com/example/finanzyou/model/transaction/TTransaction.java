package com.example.finanzyou.model.transaction;

import com.example.finanzyou.model.stock.TStock;
import lombok.Data;

import java.util.Date;

@Data
public class TTransaction {

    private int id;
    private int idClient;
    private TStock stock;
    private double buyPrice;
    private int quantity;
    private Date date;
    private double commision;

    public TTransaction(int id, int idClient, TStock tStock, double buyPrice, int quantity, Date date, double commision) {
        this.id = id;
        this.idClient = idClient;
        this.stock = tStock;
        this.buyPrice = buyPrice;
        this.quantity = quantity;
        this.date = date;
        this.commision = commision;
    }

    public TTransaction() {
    }

    public Transaction toEntity() {
        return new Transaction(id, idClient, stock.getId(), buyPrice, quantity, date, commision);
    }
}
