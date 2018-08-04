/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springreactormongodb.model;

import java.math.BigDecimal;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author TOSHIBA
 */
@Data
@Document(collection="detail")
public class DetailDocument {
    @Id
    private long id;
    private Product product;
    private int count;
    private BigDecimal subtotal;
}
