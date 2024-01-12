package org.learning.demo.model;

import java.math.BigDecimal;

public class Dress {
    private String ciao;
    private String id;
    private String color;
    private BigDecimal price;

    public Dress(String id, String color, BigDecimal price) {
        this.id = id;
        this.color = color;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
