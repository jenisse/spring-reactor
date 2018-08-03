/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springreactormongo.model;

import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author TOSHIBA
 */
@Data
@Document(collection="client")
public class Client {
    @Id
    private long id;
    private String name;
    private String lastName;
    private String address;
    private Date birthday;
    
}
