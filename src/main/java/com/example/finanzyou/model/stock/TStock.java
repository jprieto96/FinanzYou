package com.example.finanzyou.model.stock;

import lombok.Data;

@Data
public class TStock {

    private String id;
    private String name;

    public TStock(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
