package com.goshopping.application;

import com.goshopping.framework.ShopFactory;
import com.goshopping.framework.PrimeAcc;
import com.goshopping.application.GSShopFactory;
import com.goshopping.framework.NormalAcc;

public class ApplicationEntryPoint {
    public static void main(String[] args) {
        
        ShopFactory shopFactory = new GSShopFactory();

       
        PrimeAcc primeAcc = shopFactory.getNewPrimeAcc(101, "PrimeCustomer", 50.0f, true);

        
        NormalAcc normalAcc = shopFactory.getNewNormalAcc(201, "NormalCustomer", 50.0f, 5.0f);

        
        primeAcc.bookProduct(30.0f);
        normalAcc.bookProduct(20.0f);

        
        System.out.println(primeAcc.toString());
        System.out.println(normalAcc.toString());
    }
}
