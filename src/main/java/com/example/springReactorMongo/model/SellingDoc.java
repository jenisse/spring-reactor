/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springreactormongo.model;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author TOSHIBA
 */
@Data
@Document(collection="document")
public class SellingDoc {
    @Id
    private long id;
    private Client client;
    private Date date;
    private List<DetailDocument> details;
    private BigDecimal total;
}
