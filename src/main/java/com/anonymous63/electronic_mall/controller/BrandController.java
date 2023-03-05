package com.anonymous63.electronic_mall.controller;

import com.anonymous63.electronic_mall.dao.BrandRepository;
import com.anonymous63.electronic_mall.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BrandController{

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping("/brands")
    public List<Brand> getAllBrands(){
        return this.brandRepository.findAll();
    }

    @GetMapping("/brands/{brandId}")
    public Optional<Brand> getBrand(@PathVariable String brandId){
        return this.brandRepository.findById(Integer.valueOf(brandId));
    }

    @PostMapping("/brands")
    public Brand addBrand (@RequestBody Brand brand){
        return this.brandRepository.save(brand);
    }

    @PutMapping("/brands")
    public Brand updateBrand(@RequestBody Brand brand){
        List<Brand> brandList = this.brandRepository.findAll();
        for (Brand b: brandList
             ) {
            if (b.getBrandId() == brand.getBrandId()){
                return this.brandRepository.save(brand);
            }
        }
        return null;
    }


}
