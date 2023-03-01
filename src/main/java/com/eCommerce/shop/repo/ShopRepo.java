package com.eCommerce.shop.repo;

import com.eCommerce.shop.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;


public interface ShopRepo extends JpaRepository<Shop,Integer> {
//        public Shop getBYId();
    @Modifying
    @Query("Update Shops set name= :n where id=:i")
    public Shop editShop(@Param("i") Integer id,@Param("n")String name);
}
