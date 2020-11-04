package br.edu.unijuazeiro.unidelivery;

import java.util.Properties;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.SequenceGenerators;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_customer")
    @SequenceGenerator(sequenceName = "seq_customer", allocationSize = 1, initialValue = 1, name = "gen_customer")
    private Integer code;
    
    private String name;
     
    @Column(unique = true)
    private String email; 


   
     public Customer(){

    }

    public Customer(String name){

    }


    public Customer (Integer code , String name , String email ){

    }   
    
    public Customer (String name , String email ){

    } 

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    @OneToOne (cascade = CascadeType.ALL, fetch =FetchType.EAGER)//cardinalidade  um para um
    @JoinColumn
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}