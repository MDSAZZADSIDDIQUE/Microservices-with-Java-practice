package com.eternity.shop.dto;

import java.math.BigDecimal;

public record ShopResponse(String id, String name, String description, BigDecimal price) {
}
