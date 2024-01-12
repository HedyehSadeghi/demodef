package org.learning.demo.model;

import java.math.BigDecimal;

public class Feet {
    public static class Cap {
        private String id;
        private String beauty;
        private BigDecimal price;

        public  Cap (String id, String beauty, BigDecimal price) {
            this.id = id;
            this.beauty = beauty;
            this.price = price;
        }
    }
}

