package com.smart.donuts;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class DonutEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private DonutToppings toppings;

    public String name;
    public Double costDollars;
    public Integer numberAvailable;

    DonutEntity(String name, DonutToppings toppings, Double costDollars, Integer numberAvailable) {
        this.name = name;
        this.toppings = toppings;
        this.costDollars = costDollars;
        this.numberAvailable = numberAvailable;
    }
}
