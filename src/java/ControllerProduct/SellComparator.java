/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerProduct;

import Model.*;
import java.text.SimpleDateFormat;
import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class SellComparator implements Comparator<Product> {

    @Override
    public int compare(Product a, Product b) {
        
      
        if (a.getTotalSell()< b.getTotalSell() )//case name a great than name b
        {
            return 1;
        } else if (a.getTotalSell()> b.getTotalSell()) //case name a equal name b
        {
            return -1;
        } else //case name a less than name b
        {
            return 0;
        }
    }

}
