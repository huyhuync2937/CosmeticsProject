/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Bill {
    
    int customerID;
    String productName;
    int productID;
    int price;
    int quantity;
    Date dateTrading;
    boolean status;
    int billId;
    int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    

    public Bill(int customerID, String productName, int productID, int price, int quantity, Date dateTrading, boolean status, int billId) {
        this.customerID = customerID;
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
        this.dateTrading = dateTrading;
        this.status = status;
        this.billId = billId;
    }
    
    
    
    String image;

    public Bill(int customerID, String productName, int productID, int price, int quantity, Date dateTrading, boolean status) {
        this.customerID = customerID;
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
        this.dateTrading = dateTrading;
        this.status = status;
    }

    public Bill(int billId, String productName, int productID, int price, int quantity, Date dateTrading, boolean status, String image) {
        this.billId = billId;
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
        this.dateTrading = dateTrading;
        this.status = status;
        this.image = image;
    }

  

   

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
   
//    public Bill(int customerID, String productName, int productID, int price, int quantity, Date dateTrading, boolean status, String image) {
//        this.customerID = customerID;
//        this.productName = productName;
//        this.productID = productID;
//        this.price = price;
//        this.quantity = quantity;
//        this.dateTrading = dateTrading;
//        this.status = status;
//        this.image= image; 
//    }
//
//    public Bill(int billId, int customerID, String productName, int productID, int price, int quantity, Date dateTrading, boolean status) {
//        this.billId=billId;
//        this.customerID = customerID;
//        this.productName = productName;
//        this.productID = productID;
//        this.price = price;
//        this.quantity = quantity;
//        this.dateTrading = dateTrading;
//        this.status = status;
//    }
    
    
    

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateTrading() {
        return dateTrading;
    }

    public void setDateTrading(Date dateTrading) {
        this.dateTrading = dateTrading;
    }

    public boolean getStatus() {
        return status;
    }


    
    
}
