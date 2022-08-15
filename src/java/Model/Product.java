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
public class Product {

    private int productID;
    private String productName;
    private int importPrice;
    private int sellPrice;
    private int numberOfInventory;
    private Date dateAdd;
    private boolean status;
    private String image;
    
    
    
    String brand;
    String origin;
    String description;
    String type;
    
    int typeID;
    
    int totalSell;

    public int getTotalSell() {
        return totalSell;
    }

    public void setTotalSell(int totalSell) {
        this.totalSell = totalSell;
    }
    
    

    public Product(int productID, String productName, int importPrice, int sellPrice, int numberOfInventory, Date dateAdd, String brand, String origin, String description, String type) {
        this.productID = productID;
        this.productName = productName;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.numberOfInventory = numberOfInventory;
        this.dateAdd = dateAdd;
        this.brand = brand;
        this.origin = origin;
        this.description = description;
        this.type = type;
    }

   

    
    
    
    public Product(int productID, String productName, int importPrice, int sellPrice, int numberOfInventory, Date dateAdd, boolean status, String image, String brand, String origin, String description, String type, int typeID) {
        this.productID = productID;
        this.productName = productName;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.numberOfInventory = numberOfInventory;
        this.dateAdd = dateAdd;
        this.status = status;
        this.image = image;
        this.brand = brand;
        this.origin = origin;
        this.description = description;
        this.type = type;
        this.typeID = typeID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product(int productID, String productName, int importPrice, int sellPrice, int numberOfInventory, Date dateAdd, boolean status, String image) {
        this.productID = productID;
        this.productName = productName;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.numberOfInventory = numberOfInventory;
        this.dateAdd = dateAdd;
        this.status = status;
        this.image = image;
    }



    
    
    

    public Product(String productName, int importPrice, int sellPrice, Date dateAdd, int numberOfInventory) {
        this.productName = productName;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.dateAdd = dateAdd;
        this.numberOfInventory = numberOfInventory;
    }

    public Product(int productID, String productName, int importPrice, int sellPrice, int numberOfInventory, Date dateAdd, boolean status, String image, String brand, String origin, String description, String type) {
        this.productID = productID;
        this.productName = productName;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.numberOfInventory = numberOfInventory;
        this.dateAdd = dateAdd;
        this.status = status;
        this.image = image;
        this.brand = brand;
        this.origin = origin;
        this.description = description;
        this.type = type;
    }

  

   

   
    
    

    public Product(int productID, String productName, String image, int sellPrice) {
        this.productID = productID;
        this.productName = productName;
        this.sellPrice = sellPrice;
        this.image = image;
    }

    public Product(int productID, String productName, int sellPrice, boolean status, int numberOfInventory) {
        this.productID = productID;
        this.productName = productName;
        this.sellPrice = sellPrice;
        this.status = status;
        this.numberOfInventory = numberOfInventory;
    }

   

    public int getNumberOfInventory() {
        return numberOfInventory;
    }

    public void setNumberOfInventory(int numberOfInventory) {
        this.numberOfInventory = numberOfInventory;
    }
    

   

   public Product() {
    }

    public Product(int productID, String productName, int importPrice, int sellPrice, Date dateAdd, boolean status, String image) {
        this.productID = productID;
        this.productName = productName;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.dateAdd = dateAdd;
        this.status = status;
        this.image = image;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public boolean getStatus() {
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

}
