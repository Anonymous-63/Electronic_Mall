package com.anonymous63.electronic_mall;

import com.anonymous63.electronic_mall.controller.ProductController;
import com.anonymous63.electronic_mall.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.anonymous63.electronic_mall")
public class ElectronicMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicMallApplication.class, args);


    }

}
