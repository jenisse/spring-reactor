/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springreactormongodb.controller;

import com.example.springreactormongodb.model.SellingDoc;
import com.example.springreactormongodb.service.SellingDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;

/**
 *
 * @author TOSHIBA
 */
@RestController
public class SellingDocController {
    
    @Autowired
    private SellingDocService sellingDocService;
    
    @PostMapping("/new-sell")
    public Mono<SellingDoc> createSell(@RequestBody SellingDoc sellingDoc){
        return sellingDocService.createDoc(sellingDoc);
                
    }
    @GetMapping("/sells")
    public Flux<SellingDoc> getAllSells(){
        return sellingDocService.getDocs();
                
    }
    
    @GetMapping("/sells/{id}")
    public Mono<SellingDoc> getTweetById(@PathVariable(value = "id") long id) {
        return sellingDocService.getById(id);
    }
}
