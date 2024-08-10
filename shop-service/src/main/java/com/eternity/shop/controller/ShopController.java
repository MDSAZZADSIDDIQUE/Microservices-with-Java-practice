package com.eternity.shop.controller;

import com.eternity.shop.dto.ShopRequest;
import com.eternity.shop.dto.ShopResponse;
import com.eternity.shop.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ShopResponse createProduct(@RequestBody ShopRequest shopRequest) {
        return shopService.createProduct(shopRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ShopResponse> getAllProducts() {
        return shopService.getAllProducts();
    }
}
