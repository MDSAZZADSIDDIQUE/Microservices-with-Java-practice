package com.eternity.shop.service;

import com.eternity.shop.dto.ShopRequest;
import com.eternity.shop.dto.ShopResponse;
import com.eternity.shop.model.Product;
import com.eternity.shop.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ShopService {
    private final ShopRepository shopRepository;

    public ShopResponse createProduct(ShopRequest shopRequest) {
        Product product = Product.builder().name(shopRequest.name()).description(shopRequest.description()).price(shopRequest.price()).build();
        shopRepository.save(product);
        log.info("Product created successfully");
        return new ShopResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }

    public List<ShopResponse> getAllProducts() {
        return shopRepository.findAll().stream().map(product -> new ShopResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice())).toList();
    }
}
