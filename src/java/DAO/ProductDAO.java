/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBContext;
import Model.Bill;
import Model.Category;
//import Model.DetailProduct;
import Model.Product;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class ProductDAO {

    Connection con = null;
    public String status = "";
    public ArrayList<Bill> listBill;
    public ArrayList<Product> listDetailProduct;
    public ArrayList<Product> listProduct;
    public ArrayList<Product> listNewProduct;

    public ArrayList<Product> getListNewProduct() {
        return listNewProduct;
    }

    public void setListNewProduct(ArrayList<Product> listNewProduct) {
        this.listNewProduct = listNewProduct;
    }

//    public DetailProduct product;
    public ArrayList<Category> listCategory;

    public ArrayList<Bill> getListBill() {
        return listBill;
    }

    public void setListBill(ArrayList<Bill> listBill) {
        this.listBill = listBill;
    }

    public ArrayList<Product> getListDetailProduct() {
        return listDetailProduct;
    }

    public void setListDetailProduct(ArrayList<Product> listDetailProduct) {
        this.listDetailProduct = listDetailProduct;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public ArrayList<Category> getListCategory() {
        return listCategory;
    }

    public void setListCategory(ArrayList<Category> listCategory) {
        this.listCategory = listCategory;
    }

    public ProductDAO() {
        try {
            con = new DBContext().getConnection();
            status = "Ket noi thanh cong";
        } catch (Exception e) {
            status = "Ket noi that bai" + e.getMessage();
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public void LoatProduct() {
//        listProduct = new ArrayList<>();
//        String sql = "select * from Product_HE153639_SE1606";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int productId = rs.getInt(1);
//               String productName=rs.getString(2);
//               int importPrice=rs.getInt(3);
//               int sellPrice=rs.getInt(4);
//               int number=rs.getInt(5);
//               Date dateAdd=rs.getDate(6);
//               boolean status=rs.getBoolean(7);
//               String image=rs.getString(8);
//               Product s=new Product(productName, productName, importPrice, sellPrice, number, dateAdd, status, image);
//                listProduct.add(s);
//            }
//
//        } catch (Exception e) {
//            status = e.getMessage();
//        }
//
//    }
    public void LoatNewProductDateAdd() {
        listNewProduct = new ArrayList<>();
        String sql = "select top(8) p.* from Product_HE153639_SE1606 as p order by p.[Date add] desc\n";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int productId = rs.getInt(1);
                String name = rs.getString(2);
                int importPrice = rs.getInt(3);
                int sellPrice = rs.getInt(4);

                int number = rs.getInt(5);
                Date dateAdd = rs.getDate(6);
                boolean status = rs.getBoolean(7);
                String image = rs.getString(8);
                Product s = new Product(productId, name, importPrice, sellPrice, number, dateAdd, status, image);
                listNewProduct.add(s);
            }

        } catch (Exception e) {
            status = e.getMessage();
        }
    }
//    public void LoatProductBySearch(String stringSearch) {
//        listProduct = new ArrayList<>();
//        String sql = "select  p.ProductID,p.ProductName,p.Image,p.SellPrice from Product_HE153639_SE1606 as p where ProductName like ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, "%" + stringSearch + "%");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int productId = rs.getInt(1);
//                String name = rs.getString(2);
//                String image = rs.getString(3);
//                int sellPrice = rs.getInt(4);
//                Product s = new Product(productId, name, image, sellPrice);
//                listProduct.add(s);
//            }
//
//        } catch (Exception e) {
//            status = e.getMessage();
//
//        }
//
//    }
//    public DetailProduct LoatDetailProduct(String productID) {
//
//        String sql = "select p.ProductName,p.SellPrice,pr.Description,p.Image,p.[Number of Inventory] from [dbo].[Product_HE153639_SE1606] as p\n"
//                + "right outer join [dbo].[Product Detail_HE153639_SE1606] as pr\n"
//                + "on pr.ProductID=p.ProductID where p.ProductID like ? ";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, productID);
//            int id = Integer.parseInt(productID);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String name = rs.getString(1);
//                int sellPrice = rs.getInt(2);
//                String description = rs.getString(3);
//                String image = rs.getString(4);
//                int numberOfInventory = rs.getInt(5);
//
//                product = new DetailProduct(name, sellPrice, description, image, numberOfInventory, id);
//            }
//
//        } catch (Exception e) {
//            status = e.getMessage();
//
//        }
//        return product;
//    }

    public void LoatCategory() {
        listCategory = new ArrayList<>();
        String sql = " select * from [dbo].[Category_HE153639_SE1606] as p  order by p.TypeID ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int typeId = rs.getInt(1);
                String typeName = rs.getString(2);
                int parentId = rs.getInt(3);

                Category category = new Category(typeId, typeName, parentId);
                listCategory.add(category);
            }

        } catch (Exception e) {
            status = e.getMessage();

        }
    }

//    public void LoatProductCategory(int typeID) {
//        listProduct = new ArrayList<>();
//        String sql = "select  p.ProductID,p.ProductName,p.Image,p.SellPrice from Product_HE153639_SE1606 as p\n"
//                + "  right outer join [dbo].[Product Detail_HE153639_SE1606] as pd on p.ProductID=pd.ProductID\n"
//                + "  right outer join [dbo].[Category_HE153639_SE1606] as c on c.TypeName=pd.TypeName\n"
//                + " where c.[TypeID]= ? ";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, typeID);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int productId = rs.getInt(1);
//                String name = rs.getString(2);
//                String image = rs.getString(3);
//                int sellPrice = rs.getInt(4);
//                Product s = new Product(productId, name, image, sellPrice);
//                listProduct.add(s);
//            }
//
//        } catch (Exception e) {
//            status = e.getMessage();
//
//        }
//    }
//    public Product LoatProduct(int productId) {
//        String sql = "select ProductName,SellPrice,Status,[Number of Inventory] from [dbo].[Product_HE153639_SE1606]\n"
//                + "where ProductID= ? ";
//        Product s = new Product();
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, productId);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String name = rs.getString(1);
//                int sellPrice = rs.getInt(2);
//                boolean status = rs.getBoolean(3);
//                int numberOfInventory = rs.getInt(4);
//
//                s = new Product(productId, name, sellPrice, status, numberOfInventory);
//            }
//
//        } catch (Exception e) {
//            status = e.getMessage();
//
//        }
//        return s;
//    }
    public void AddProductToBill(Bill newBill) {
        String sql = "INSERT INTO [dbo].[Bill_HE153639_SE1606]\n"
                + "           ([CustomerID]\n"
                + "           ,[ProductName]\n"
                + "           ,[ProductID]\n"
                + "           ,[Price]\n"
                + "           ,[Number]\n"
                + "           ,[Date Trading],[Status]  )\n"
                + "     VALUES(?,?,?,?,?,?,?)";
        SimpleDateFormat f1 = new SimpleDateFormat("YYYY-MM-dd");
        String day = f1.format(newBill.getDateTrading());
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, newBill.getCustomerID());
            ps.setString(2, newBill.getProductName());
            ps.setInt(3, newBill.getProductID());
            ps.setInt(4, newBill.getPrice());
            ps.setInt(5, newBill.getQuantity());
            ps.setDate(6, java.sql.Date.valueOf(day));
            ps.setBoolean(7, newBill.getStatus());
            ps.execute();

        } catch (Exception e) {
        }
    }

//    public ArrayList<Bill> LoatBill(int customerId) {
//        String sql = "select  b.BillID, b.ProductName,b.ProductID,b.Price,b.Number,b.[Date Trading],b.Status,p.Image from [dbo].[Bill_HE153639_SE1606] as b\n"
//                + "                left outer join [dbo].[Product_HE153639_SE1606] as p\n"
//                + "                on p.ProductID = b.ProductID  where b.CustomerID = ?";
//
//        ArrayList<Bill> s = new ArrayList<>();
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, customerId);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int billId = rs.getInt(1);
//                String productName = rs.getString(2);
//                int productId = rs.getInt(3);
//                int price = rs.getInt(4);
//                int quantity = rs.getInt(5);
//                Date dateTrading = rs.getDate(6);
//                boolean status = rs.getBoolean(7);
//                String image = rs.getString(8);
//                Bill newBill = new Bill(billId, productName, productId, price, quantity, dateTrading, status, image);
//                s.add(newBill);
//            }
//
//        } catch (Exception e) {
//            status = e.getMessage();
//
//        }
//        return s;
//    }
    public void DeleteProductCart(int billID) {
        String sql = "delete from  [dbo].[Bill_HE153639_SE1606] where BillID=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, billID);
            ps.execute();
        } catch (Exception e) {

        }
    }

    public void AddNewProduct(Product newProduct) {
        String sql = "INSERT INTO [dbo].[Product_HE153639_SE1606]\n"
                + "           ([ProductName]\n"
                + "           ,[ImportPrice]\n"
                + "           ,[SellPrice]\n"
                + "           ,[Number of Inventory]\n"
                + "           ,[Date add])\n"
                + "         \n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        SimpleDateFormat f1 = new SimpleDateFormat("YYYY-MM-dd");
        String day = f1.format(newProduct.getDateAdd());
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, newProduct.getProductName());
            ps.setInt(2, newProduct.getImportPrice());
            ps.setInt(3, newProduct.getSellPrice());
            ps.setInt(4, newProduct.getNumberOfInventory());
            ps.setDate(5, java.sql.Date.valueOf(day));
            ps.execute();
        } catch (Exception e) {
            status = "ko inset dc" + e.getMessage();
        }
    }

//    public int LoatNewProductID() {
//        String sql = "select TOP(1) ProductID from Product_HE153639_SE1606 order by ProductID  desc";
//        int id = 0;
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                id = rs.getInt(1);
//            }
//        } catch (Exception e) {
//            status = "ko inset dc" + e.getMessage();
//        }
//        return id;
//    }
    public void AddDetailNewProduct(int newProductID, String brand, String origin, String description, String TypeName) {
        String sql = "INSERT INTO [dbo].[Product Detail_HE153639_SE1606]\n"
                + "           ([ProductID]\n"
                + "           ,[Brand]\n"
                + "           ,[Origin]\n"
                + "           ,[Description]\n"
                + "           ,[TypeName])\n"
                + "     VALUES(?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, newProductID);
            ps.setString(2, brand);
            ps.setString(3, origin);
            ps.setString(4, description);
            ps.setString(5, TypeName);

            ps.execute();
        } catch (Exception e) {
            status = "ko inset dc" + e.getMessage();
        }
    }

    public void LoatProduct() {
        listProduct = new ArrayList<>();
        String sql = "select * from Product_HE153639_SE1606";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int productId = rs.getInt(1);
                String productName = rs.getString(2);
                int importPrice = rs.getInt(3);
                int sellPrice = rs.getInt(4);
                int number = rs.getInt(5);
                Date dateAdd = rs.getDate(6);
                boolean status = rs.getBoolean(7);
                String image = rs.getString(8);
                Product s = new Product(productId, productName, importPrice, sellPrice, number, dateAdd, status, image);
                listProduct.add(s);
            }

        } catch (Exception e) {
            status = e.getMessage();
        }

    }

    public void LoatBill() {
        listBill = new ArrayList<>();
        String sql = " select * from Bill_HE153639_SE1606";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int customerID = rs.getInt(1);
                String productName = rs.getString(2);
                int productID = rs.getInt(3);
                int price = rs.getInt(4);
                int number = rs.getInt(5);
                Date dateTrading = rs.getDate(6);
                boolean status = rs.getBoolean(7);
                int billID = rs.getInt(8);
                Bill bill = new Bill(customerID, productName, productID, price, number, dateTrading, status, billID);

                listBill.add(bill);
            }

        } catch (Exception e) {
            status = e.getMessage();
        }
    }

    public void LoatProductHaveDetail() {
        listDetailProduct = new ArrayList<>();
        String sql = "select p.*,pd.Brand,pd.Origin,pd.Description,pd.TypeName,c.TypeID from Product_HE153639_SE1606 as p\n"
                + "                left outer join  [Product Detail_HE153639_SE1606] as pd on p.ProductID=pd.ProductID\n"
                + "				left outer join Category_HE153639_SE1606 as c on c.TypeName=pd.TypeName\n"
                + "\n"
                + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int productId = rs.getInt(1);
                String productName = rs.getString(2);
                int importPrice = rs.getInt(3);
                int sellPrice = rs.getInt(4);
                int number = rs.getInt(5);
                Date dateAdd = rs.getDate(6);
                boolean status = rs.getBoolean(7);
                String image = rs.getString(8);
                String band = rs.getString(9);
                String origin = rs.getString(10);
                String Description = rs.getString(11);
                String TypeName = rs.getString(12);
                int TypeID = rs.getInt(13);
                Product s = new Product(productId, productName, importPrice, sellPrice, number, dateAdd, status, image, band, origin, Description, TypeName, TypeID);
                listDetailProduct.add(s);
            }

        } catch (Exception e) {
            status = e.getMessage();
        }

    }

    public void deleteProduct(int productID) {
        String sql = "delete from Product_HE153639_SE1606 where ProductID=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, productID);

            ps.execute();
        } catch (Exception e) {

        }
    }

    public void deleteDetailProduct(int productID) {
        String sql = "delete from [Product Detail_HE153639_SE1606]  where ProductID=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, productID);

            ps.execute();
        } catch (Exception e) {

        }
    }

    public void updateProduct(Product product, String date) {
        String sql = "UPDATE [dbo].[Product_HE153639_SE1606]\n"
                + "   SET [ProductName] = ?\n"
                + "      ,[ImportPrice] = ?\n"
                + "      ,[SellPrice] = ?\n"
                + "      ,[Number of Inventory] = ?\n"
                + "      ,[Date add] =?\n"
                + " WHERE [ProductID]=?";
        try {
//            SimpleDateFormat f1 = new SimpleDateFormat("YYYY-MM-dd");
//            String day = f1.format(product.getDateAdd());

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, product.getProductName());
            ps.setInt(2, product.getImportPrice());
            ps.setInt(3, product.getSellPrice());
            ps.setInt(4, product.getNumberOfInventory());
            ps.setDate(5, java.sql.Date.valueOf(date));

            ps.setInt(6, product.getProductID());
            ps.execute();
        } catch (Exception e) {
        }
    }

    public void updateProductDetail(Product product) {
        String sql = "UPDATE [dbo].[Product Detail_HE153639_SE1606]\n"
                + "   SET \n"
                + "      [Brand] = ?\n"
                + "      ,[Origin] = ?\n"
                + "    \n"
                + "      ,[Description] = ?\n"
                + "      ,[TypeName] = ?\n"
                + " WHERE [ProductID]=?\n";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, product.getBrand());
            ps.setString(2, product.getOrigin());
            ps.setString(3, product.getDescription());
            ps.setString(4, product.getType());
            ps.setInt(5, product.getProductID());
            ps.execute();
        } catch (Exception e) {
        }
    }

    public void deleteCategory(int typeID) {
        String sql = "delete from [dbo].[Category_HE153639_SE1606] where [TypeID]=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, typeID);

            ps.execute();
        } catch (Exception e) {

        }
    }

    public void UpdateTypeProduct(String typeName) {
        String sql = "UPDATE [dbo].[Product Detail_HE153639_SE1606]\n"
                + "   SET \n"
                + "      [TypeName] = NULL\n"
                + " WHERE [TypeName] = ?\n";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, typeName);

            ps.execute();
        } catch (Exception e) {
        }
    }

    public void AddNewCategory(String categoryName) {
        String sql = "INSERT INTO [dbo].[Category_HE153639_SE1606]\n"
                + "           ([TypeName]\n"
                + "           ,[ParentID])\n"
                + "     VALUES\n"
                + "           (?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, categoryName);
            ps.setInt(2, 0);

            ps.execute();
        } catch (Exception e) {
            status = "ko inset dc" + e.getMessage();
        }
    }

    public void deleteTypeChild(int typeID) {
        String sql = "delete from [dbo].[Category_HE153639_SE1606] where [ParentID]=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, typeID);

            ps.execute();
        } catch (Exception e) {

        }
    }

    public void AddNewType(Category newType) {
        String sql = "INSERT INTO [dbo].[Category_HE153639_SE1606]\n"
                + "           ([TypeName]\n"
                + "           ,[ParentID])\n"
                + "     VALUES\n"
                + "           (?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, newType.getTypeName());
            ps.setInt(2, newType.getParentId());

            ps.execute();
        } catch (Exception e) {
            status = "ko inset dc" + e.getMessage();
        }

    }

    public void UpdateQuantity(int billID, int qunatity) {
        String sql = "UPDATE [dbo].[Bill_HE153639_SE1606]\n"
                + "   SET \n"
                + "      [Number] = ? \n"
                + "     \n"
                + " WHERE [BillID]= ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, qunatity);
            ps.setInt(2, billID);

            ps.execute();
        } catch (Exception e) {
        }
    }

}
