package com.eCommerce.shop.dto;

import com.eCommerce.shop.entity.Shop;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ShopDto {

    private Integer id;
    private String name;
    private String place;

    public Shop toEntity(ShopDto dto){
        Shop shop=new Shop();
        shop.setId(dto.getId());
        shop.setName(dto.getName());
        shop.setPlace(dto.getPlace());
        return shop;
    }

    public ShopDto toDto(Shop shop){
        return new ShopDto().builder().
                id(shop.getId())
                        .name(shop.getName())
                .place(shop.getPlace())
        .build();
    }
}
