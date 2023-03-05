package com.anonymous63.electronic_mall.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Brand {

    @Id
    private int brandId;
    private String brandName;
    private String brandDesc;

    public Brand(int brandId, String brandName, String brandDesc) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandDesc = brandDesc;
    }

    public Brand() {
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", brandDesc='" + brandDesc + '\'' +
                '}';
    }
}
