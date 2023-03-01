package com.eCommerce.shop.controller;

import com.eCommerce.shop.dto.ShopDto;
import com.eCommerce.shop.entity.Shop;
import com.eCommerce.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
        @Autowired
        private ShopService shopService;

        public ShopController(ShopService shopService){
            this.shopService=shopService;
        }


        @PostMapping("/create/")
        public String addShop(@RequestBody() Shop shop){
            String res=shopService.create(shop);
            return res;
        }

        @PostMapping("/getAll")
    public List<ShopDto>showShop(){
            return shopService.getShop();
        }
//
//        @GetMapping("/getById")
//        public ShopDto getById(@RequestParam(name = "id") Integer id){
//            return shopService.getShop(id);
//        }



}
