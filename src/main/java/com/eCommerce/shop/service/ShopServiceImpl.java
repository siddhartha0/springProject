package com.eCommerce.shop.service;

import com.eCommerce.shop.ShopApplication;
import com.eCommerce.shop.dto.ShopDto;
import com.eCommerce.shop.entity.Shop;
import com.eCommerce.shop.repo.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService{

@Autowired
    private ShopRepo shopRepo;

    @Override
    public String create(Shop shop) {
        String res="eror";
        if(shop.getName()!=null){
            shopRepo.save(shop);
            res="Success";
        }
        return res;
    }

    @Override
    public List<ShopDto> getShop() {
        List<Shop>shop=shopRepo.findAll();
        List<ShopDto>dto=new ArrayList<>();
        shop.forEach(e->{
            dto.add(new ShopDto().toDto(e));
        });
        return dto;
    }

    public ShopDto getShop(Integer id){
//        Shop shop=new Shop();
//        shop=shopRepo.getById(id);

        return null;
    }

    public List<ShopDto> updateShop(Shop shop){
        shopRepo.save(shopRepo.editShop(shop.getId(),shop.getName()));
        List<Shop> shopList=shopRepo.findAll();
        List<ShopDto>dto=new ArrayList<>();
        shopList.forEach(e->{
            dto.add(new ShopDto().toDto(e));
        });
        return dto;
    }
}
