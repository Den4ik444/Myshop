/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshop.myClasses;

/**
 *
 * @author pupil
 */
public class Product {
    private String Model;
    private String Category;
    private double Price;
    private double size;
    private String Firm;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public String getFirm() {
        return Firm;
    }

    public void setFirm(String Firm) {
        this.Firm = Firm;
    }

    @Override
    public String toString() {
        return "Product{" + "Model=" + Model + ", Category=" + Category + ", Price=" + Price + ", size=" + size + '}';
    }

}
