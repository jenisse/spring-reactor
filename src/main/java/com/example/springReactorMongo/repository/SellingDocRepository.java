/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springreactormongo.repository;

import com.example.springreactormongo.model.SellingDoc;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TOSHIBA
 */
@Repository
public interface SellingDocRepository extends ReactiveMongoRepository<SellingDoc, Object>{
    
}
