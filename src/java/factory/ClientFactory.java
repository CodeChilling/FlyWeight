/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import abstractEntities.AbstractClient;
import concreteEntities.*;
import java.util.HashMap;

/**
 *
 * @author jackl
 */
public class ClientFactory {
    public static String state;
    private static HashMap<String,AbstractClient> pool = new HashMap<String,AbstractClient>();
    public static AbstractClient getTypeClient(String address, String name, String type){
        AbstractClient generic;
        if(pool.containsKey(address + name)){
            generic = pool.get( address + name);
            state="Recovered";
        }
        else{
            if(type.equals("Persona natural")){
                generic = PersonalClient.getPersonal(address, name, type);
            }
            else{
                generic = CorporativeClient.getCorporative(address, name, type);
            }       
            pool.put(address + name, generic);
            state="Entered";
        }
        return generic;
    }

    public static HashMap<String, AbstractClient> getPool() {
        return pool;
    }
    
}
