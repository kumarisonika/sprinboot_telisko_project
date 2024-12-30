package com.telisko.telisko.service;

import com.telisko.telisko.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> productsData = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 500),
            new Product(102, "MacBook", 13000),
            new Product(103, "Beats", 300)));


    public ProductService(){

    }


    public List<Product> getProducts(){
        return productsData;
    }

    public Product getProductById(int prodId){
        Product res= null;
        for(int i=0; i<productsData.size(); i++){
            if(productsData.get(i).getProdId()==(prodId)){
                res= productsData.get(i);
                break;
            }
        }
        return res!=null?res: new Product(100,"Product not found",0);
    }

    public void addProduct(Product prod) {
        if (prod.getProdId() <= 0 || prod.getProdName() == null || prod.getProdName().isEmpty() || prod.getPrice() <= 0) {
            System.out.println("duplicate data");
            return;
        }
        productsData.add(prod);
        return;
    }

    public void updateProduct(Product prod){
        int index=0;
        for (int i=0; i<productsData.size(); i++){
            if(productsData.get(i).getProdId()==prod.getProdId()){
                index=i;
            }
        }
        productsData.set(index,prod);
    }

    public void deleteProduct(int prodId){
        int index=0;
        for (int i=0; i<productsData.size(); i++){
            if(productsData.get(i).getProdId()==prodId){
                index=i;
            }
        }
        productsData.remove(index);
    }

}
