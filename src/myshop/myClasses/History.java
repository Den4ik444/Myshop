/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshop.myClasses;

import java.util.Date;

/**
 *
 * @author pupil
 */
public class History {
private Buyer buyer;
private Product product;
private Date SellDate;

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getSellDate() {
        return SellDate;
    }

    public void setSellDate(Date SellDate) {
        this.SellDate = SellDate;
    }

    @Override
    public String toString() {
        return "History{" + "buyer=" + buyer + ", product=" + product + ", SellDate=" + SellDate + '}';
    }
    
}
