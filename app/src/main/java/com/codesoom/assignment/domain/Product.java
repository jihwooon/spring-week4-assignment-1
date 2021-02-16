package com.codesoom.assignment.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private Long id;

    private String name;

    private String maker;

    private int price;

    private String imageUrl;

    public Product update(Product newProduct) {
        this.name = newProduct.getName();
        this.maker = newProduct.getMaker();
        this.price = newProduct.getPrice();
        this.imageUrl = newProduct.getImageUrl();

        return this;
    }

}

