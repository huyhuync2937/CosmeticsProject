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
public class DetailCustomer {
    public int customerId;
    public String name;
    public String address;
    public Date birthday;
    public String phone;
    public String email;

    public DetailCustomer() {
    }

    public DetailCustomer(int customerId, String name, String address, Date birthday, String phone, String email) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
        return "DetailCustomer{" + "customerId=" + customerId + ", name=" + name + ", address=" + address + ", birthday=" + birthday + ", phone=" + phone + ", email=" + email + '}';
    }
    
    
    
    
    
}
