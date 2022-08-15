/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAccount;

import DAO.AccountDAO;
import Model.Account;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

/**
 *
 * @author DELL
 */
public class Check {

    boolean checkEmailExist(String email, int customerId, ArrayList<Account> listAccount) {
        for (Account account : listAccount) {
            if (account.getCustomerId() != customerId) {
                if (account.getEmail().equals(email)) {
                    return false;
                }
            }

        }
        return true;
    }

    boolean checkPhoneExist(String phone, int customerId, ArrayList<Account> listAccount) {
        for (Account account : listAccount) {
            if (account.getCustomerId() != customerId) {
                if (account.getPhone().equals(phone)) {
                    return false;
                }
            }

        }
        return true;
    }

    boolean checkPassword(String oldPass, int customerId, ArrayList<Account> listAccount) {
        for (Account account : listAccount) {
            if (account.getCustomerId() == customerId) {
                if (account.getPassAccount().equals(oldPass)) {
                    return true;
                }
            }

        }
        return false;
    }

}
