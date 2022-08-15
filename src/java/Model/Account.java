/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Account {

    public int customerId;
    public String nameAccount;
    public String passAccount;
    public int isAdmin;
    public String name;

    public String address;
    public Date birthday;
    public String phone;
    public String email;

    public Account(String name, String address, Date birthday,int customerId) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.customerId=customerId;
    }

    
    
    
    
    public Account(int customerId, String nameAccount, String passAccount, int isAdmin, String name, String address, Date birthday, String phone, String email) {
        this.customerId = customerId;
        this.nameAccount = nameAccount;
        this.passAccount = passAccount;
        this.isAdmin = isAdmin;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }
    
    

    public Account() {
    }

    public Account(int customerId, String nameAccount, String passAccount, int isAdmin) {
        this.customerId = customerId;
        this.nameAccount = nameAccount;
        this.passAccount = passAccount;
        this.isAdmin = isAdmin;
    }



    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getPassAccount() {
        return passAccount;
    }

    public void setPassAccount(String passAccount) {
        this.passAccount = passAccount;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" + "customerId=" + customerId + ", nameAccount=" + nameAccount + ", passAccount=" + passAccount + ", isAdmin=" + isAdmin + ", name=" + name + ", address=" + address + ", birthday=" + birthday + ", phone=" + phone + ", email=" + email + '}';
    }

}
