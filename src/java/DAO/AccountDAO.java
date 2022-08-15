/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBContext;
import ControllerAccount.AddDetailCustomer;
import Model.Account;
import Model.DetailCustomer;
import Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Model.*;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class AccountDAO {

    public ArrayList<Account> listAccount;

    public ArrayList<Account> getListAccount() {
        return listAccount;
    }

    public void setListAccount(ArrayList<Account> listAccount) {
        this.listAccount = listAccount;
    }

    Connection con = null;
    public String status = "";
    public Account account = null;

    public AccountDAO() {
        try {
            con = new DBContext().getConnection();
            account = new Account();
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account CheckAccountExist(String nameAccount) {
        String sql = "select * from [dbo].[User_HE153639_SE1606]\n"
                + "where UserName=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nameAccount);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int customerId = rs.getInt(1);
                String passAccount = rs.getString(3);
                int isAdmin = rs.getInt(4);
                return account = new Account(customerId, nameAccount, passAccount, isAdmin);

            }

        } catch (Exception e) {
            status = e.getMessage();
        }
        return null;
    }

    public void AddAccountSignup(String userName, String passWord, int admin) {
        String sql = "INSERT INTO [dbo].[User_HE153639_SE1606]\n"
                + "           ([UserName]\n"
                + "           ,[Password]\n"
                + "           ,[isAdmin])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, passWord);
            ps.setInt(3, admin);

            ps.execute();
        } catch (Exception e) {
            status = e.getMessage();
        }
    }

    public void AddDetailCustomer(DetailCustomer detailCustomer) {
        String sql = "INSERT INTO [dbo].[Customer Detail_HE153639_SE1606]\n"
                + "           ([CustomerID]\n"
                + "           ,[Name]\n"
                + "           ,[Address]\n"
                + "           ,[Birthday]\n"
                + "           ,[Phone]\n"
                + "           ,[Email])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        try {
            System.out.println(detailCustomer.toString());
            SimpleDateFormat f1 = new SimpleDateFormat("YYYY-MM-dd");
            String day = f1.format(detailCustomer.getBirthday());

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detailCustomer.getCustomerId());
            ps.setString(2, detailCustomer.getName());
            ps.setString(3, detailCustomer.getAddress());
            ps.setDate(4, java.sql.Date.valueOf(day));
            ps.setString(5, detailCustomer.getPhone());

            ps.setString(6, detailCustomer.getEmail());

            ps.execute();
        } catch (Exception e) {
            status = e.getMessage();
        }
    }

    public void LoatCustomer() {
        listAccount = new ArrayList<>();
        String sql = "select u.CustomerID,u.UserName,u.Password,u.isAdmin,cd.Name,cd.Address,cd.Birthday,cd.Phone,cd.Email\n"
                + "               from [dbo].[User_HE153639_SE1606] as u\n"
                + "                right outer join  [dbo].[Customer Detail_HE153639_SE1606] as  cd\n"
                + "                on u.[CustomerID]=cd.CustomerID";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int custormerId = rs.getInt(1);
                String userName = rs.getString(2);
                String passWord = rs.getString(3);
                int isAdmin = rs.getInt(4);
                String name = rs.getString(5);
                String address = rs.getString(6);
                Date birthday = rs.getDate(7);
                String phone = rs.getString(8);
                String email = rs.getString(9);
                Account account = new Account(custormerId, userName, passWord, isAdmin, name, address, birthday, phone, email);
                listAccount.add(account);
            }

        } catch (Exception e) {
        }
    }

    public void ChangeAccountIsAdmin(int accountID) {
        String sql = "UPDATE [dbo].[User_HE153639_SE1606]\n"
                + "   SET \n"
                + "      [isAdmin] = ?\n"
                + " WHERE [CustomerID]=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setInt(2, accountID);

            ps.execute();

        } catch (Exception e) {
        }
    }

    public void ChangeAccountNotAdmin(int accountID) {
        String sql = "UPDATE [dbo].[User_HE153639_SE1606]\n"
                + "   SET \n"
                + "      [isAdmin] = ?\n"
                + " WHERE [CustomerID]=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, accountID);

            ps.execute();

        } catch (Exception e) {
        }
    }

    public void DeleteAccount(int accountID) {

        String sql = "delete from User_HE153639_SE1606 where [CustomerID]=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, accountID);

            ps.execute();

        } catch (Exception e) {
        }
    }

    public void DeleteDetailAccount(int accountID) {
        String sql = "delete from [dbo].[Customer Detail_HE153639_SE1606] where [CustomerID]=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, accountID);

            ps.execute();

        } catch (Exception e) {
        }
    }

    public void UpdateInformationCustomer(Account updateAccount, String date) {
        String sql = "UPDATE [dbo].[Customer Detail_HE153639_SE1606] SET [Name] = ?  ,[Address] = ?  ,[Birthday] = ?  WHERE [CustomerID]=?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, updateAccount.getName());

            ps.setString(2, updateAccount.getAddress());
            ps.setDate(3, java.sql.Date.valueOf(date));
            ps.setInt(4, updateAccount.getCustomerId());

            ps.execute();
        } catch (Exception e) {
        }
    }

    public void updateEmail(String email, int customerId) {
        String sql = "UPDATE [dbo].[Customer Detail_HE153639_SE1606] SET [Email] = ?   WHERE [CustomerID]=?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setInt(2, customerId);

            ps.execute();
        } catch (Exception e) {
        }
    }

    public void updatePhone(String phone, int customerId) {
        String sql = "UPDATE [dbo].[Customer Detail_HE153639_SE1606] SET [Phone] = ?   WHERE [CustomerID]=?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, phone);
            ps.setInt(2, customerId);

            ps.execute();
        } catch (Exception e) {
        }
    }

    public void UpdatePassword(String newPass, int customerId) {
         String sql = "UPDATE [dbo].[User_HE153639_SE1606] SET [Password] = ?   WHERE [CustomerID]=?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, newPass);
            ps.setInt(2, customerId);

            ps.execute();
        } catch (Exception e) {
        }
    }

}
