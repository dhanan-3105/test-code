package com.example.demorestapi;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Data

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    
    /*  
    
    Product () { }
    
       Product (int i,String S, int q, double p){
    	   this.id=i;
    	   this.name=S;
    	   this.quantity=q;
    	   this.price=p;
       }
    
        void setId(int x)
        {
        	this.id =x;
        }
        void setName(String y) {
        	this.name=y;
        }
        
        void setQuantity (int qty) {
        	this.quantity=qty;
        }
        void setPrice (double prc) {
        	this.price=prc;
        }
        
        int getId () {
        	return this.id;
        }
        
        String getName () {
        	return this.name;
        }
        
        int getQty () {
        	return this.quantity;
        }
        
        double getPrice () {
        	return this.price;
        }
        @Override
		public  String toString() {
        	return this.id+"--"+ this.name+ this.price+ this.price;
        }
        
        */
 
}
