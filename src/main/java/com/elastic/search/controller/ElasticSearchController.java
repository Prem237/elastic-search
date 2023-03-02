package com.elastic.search.controller;


import com.elastic.search.model.Product;
import com.elastic.search.repository.ElasticSearchQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ElasticSearchController {

    @Autowired
    private ElasticSearchQuery elasticSearchQuery;


    @GetMapping("/searchQuery")
    public ResponseEntity<Object> getQueryResults(@RequestParam String query) throws IOException {
        SearchHits<Product> products = elasticSearchQuery.getQueryResults(query);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
