/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import abstractEntities.AbstractClient;
import factory.ClientFactory;
import java.util.ArrayList;

/**
 *
 * @author jackl
 */
public class Client {
    private AbstractClient implicitData;
    private String productName;
    private int ammount;
    private String address;
    private String name;
    private String type;
    public ArrayList <String> info;
    private static final ArrayList<AbstractClient> clients = new ArrayList<AbstractClient>();

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public String getAddress() {
        return implicitData.getAddress();
    }

    public String getName() {
        return implicitData.getName();
    }

    public String getType() {
        return implicitData.getType();
    }

    public static ArrayList<AbstractClient> getClients() {
        return clients;
    }
    
    

    public Client(String address, String name, String type, String productName, int ammount) {
        this.productName = productName;
        this.ammount = ammount;
        this.implicitData = ClientFactory.getTypeClient(address, name, type);  
    }
    public void order (){
        this.implicitData.setInfo(productName, ammount, ClientFactory.state);
        clients.add(this.implicitData);      
    }
    
}
