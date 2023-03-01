package com.eCommerce.shop.service;

import com.eCommerce.shop.dto.ShopDto;
import com.eCommerce.shop.entity.Shop;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ShopService {

    public String create(Shop shop);

    public List<ShopDto> getShop();

    public ShopDto getShop(Integer id);

    public List<ShopDto>updateShop(Shop shop);

}
