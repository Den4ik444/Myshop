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
public class Buyer {
    private String firstName;
    private String lastName;
    private String phone;
    private double Money;

    public double getMoney() {
        return Money;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Buyer{" + "firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", Money=" + Money + '}';
    }


    
}
