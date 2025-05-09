package com.ut.ecommerce.paymentservice.controller;

import com.stripe.Stripe;
import com.stripe.model.Charge;
import com.stripe.param.ChargeCreateParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
public class SearchController {

    private final SearchSuggestionService searchSuggestionService;

    public SearchSuggestionController(SearchSuggestionService searchSuggestionService) {
        this.searchSuggestionService = searchSuggestionService;
    }
    
    @Autowired
    private Environment env;

    @GetMapping("/search-suggestion")
    public ResponseEntity<String> getSuggestions(@RequestParam() String prefix) {
        return ResponseEntity.ok('');
    }
    
}
