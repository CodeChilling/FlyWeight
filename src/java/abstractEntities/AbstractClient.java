/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractEntities;

import java.util.ArrayList;

/**
 *
 * @author jackl
 */
public abstract class AbstractClient {
    
   
    
    public String address;
    public String name;
    public String type;
    public ArrayList<String> info;

    public AbstractClient(String address, String name, String type) {
        
        this.address = address;
        this.name = name;
        this.type = type;
        this.info = new ArrayList<String>();
    }
    
    
    
    
    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setBenefit(String type) {
        this.type = type;
    }

    public ArrayList<String> getInfo() {
        return info;
    }

  
    
    public void setInfo(String productName, int ammount, String state){
        this.info.add(this.name);
        this.info.add(this.address);
        this.info.add(productName);
        if(type.equals("Persona natural")){
            this.info.add("-15% discount");
            switch(productName){
            case "Capuccino":
                this.info.add("$ 2600 COP");
                break;
                
            case "Ristretto":
                this.info.add("$ 3600 COP");
                break;
                
            case "Macchiato":
                this.info.add("$ 3100 COP");
                break;
                
            case "Mocca":
                this.info.add("$ 2800 COP");
                break;
                
            case "Frappé":
                this.info.add("$ 4000 COP");
                break;            
            }
        }
        else{
            this.info.add("Nothing");
            switch(productName){
                case "Capuccino":
                    this.info.add("$ 2600 COP");
                    break;

                case "Ristretto":
                    this.info.add("$ 3600 COP");
                    break;

                case "Macchiato":
                    this.info.add("$ 3100 COP");
                    break;

                case "Mocca":
                    this.info.add("$ 2800 COP");
                    break;

                case "Frappé":
                    this.info.add("$ 4000 COP");
                    break;            
                }
        }
        
        
        this.info.add(String.valueOf(ammount));
        this.info.add(state);
        
    }

    
    
}
