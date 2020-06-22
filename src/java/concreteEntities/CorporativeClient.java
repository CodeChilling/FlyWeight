/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package concreteEntities;

import abstractEntities.AbstractClient;
import java.util.ArrayList;

/**
 *
 * @author jackl
 */
public class CorporativeClient extends AbstractClient{

    private static CorporativeClient corporative;
    
    private CorporativeClient(String address, String name, String type) {
        super(address, name, type);
    }
    
    public static CorporativeClient getCorporative(String address, String name, String type){
        corporative = new CorporativeClient(address,name,type);
        return corporative;
    }
    

    @Override
    public void setInfo(String productName, int ammount, String state) {
        super.setInfo(productName,ammount,state);   
    }

   
    

    
    
}
