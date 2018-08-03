/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springreactormongo.service;

import com.example.springreactormongo.model.SellingDoc;
import com.example.springreactormongo.repository.SellingDocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author TOSHIBA
 */

@Service
public class SellingDocService {
    @Autowired
    private SellingDocRepository sellingDocRepository;
    
    public Mono<SellingDoc> createDoc(SellingDoc document){
        return sellingDocRepository.save(document);
    }
    
    public Flux<SellingDoc> getDocs(){
        return sellingDocRepository.findAll();
    }
    
    
    public Mono<SellingDoc> getById(long id){
        return sellingDocRepository.findById(id);    }
}
