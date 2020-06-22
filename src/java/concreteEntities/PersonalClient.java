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
public class PersonalClient extends AbstractClient{

    private static PersonalClient personal;

    
    private PersonalClient(String address, String name, String type) {
        super(address, name, type);
    }
   
   public static PersonalClient getPersonal(String address, String name, String type){
       personal = new PersonalClient(address, name, type);
       return personal;
   }

    @Override
    public void setInfo(String productName, int ammount, String state) {
        super.setInfo(productName,ammount,state);
    }

   
    
    
    
    
}
