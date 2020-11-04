package br.edu.unijuazeiro.unidelivery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
    

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_product")
    @SequenceGenerator(sequenceName = "seq_product", allocationSize = 1, initialValue = 1, name = "gen_product")
    private Integer code;
    
    private String name;
    
    private Double price;



public Product(){

}

public Product(Integer code, String name, Double price){
    
}

public Product(String name, Double price){
    
}


public Integer getCode() {
    return code;
}

public void setCode(Integer code) {
    this.code = code;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Double getPrice() {
    return price;
}

public void setPrice(Double price) {
    this.price = price;
}


}