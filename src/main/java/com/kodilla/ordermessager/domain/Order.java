package com.kodilla.ordermessager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Getter
public class Order {

    private String user;
    private BigDecimal price;
    private String description;
}
