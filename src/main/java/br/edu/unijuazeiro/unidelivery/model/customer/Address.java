package br.edu.unijuazeiro.unidelivery.model.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_address")
    @SequenceGenerator(sequenceName = "seq_address", allocationSize = 1, initialValue = 1, name = "gen_address")
    private Integer code;

    private String street;

    private String number;



    public Address() {
        
    }

    public Address(String street, String number) {
        this.street = street;
        this.number = number;
    }


    public Address(Integer code, String street, String number) {
        this.code = code;
        this.street = street;
        this.number = number;
    }





    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    

    
}