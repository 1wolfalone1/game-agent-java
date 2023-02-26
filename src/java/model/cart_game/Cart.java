/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cart_game;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class Cart {

    private HashMap<String, Integer> items;

    public Cart() {
        items = new HashMap<>();
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public boolean addNewItem(String id) {
        if (id == null) {
            return false;
        } else {
            Integer tmp = items.get(id);
            if (tmp == null) {
                items.put(id, 1);
            } else {
                items.put(id, tmp + 1);
            }
            
        }
        return true;
    }
    
    public boolean removeItem(String id){
        if(id == null){
            return false;
        } else {
            items.remove(id);
        }
        return true;
    }
    
    public boolean decreaseItemByOne(String id){
        if(id == null){
            return false;
        } else {
            Integer tmp = items.get(id);
            if(tmp == null){
                return false;
            } else {
                if(tmp == 1){
                    this.removeItem(id);
                } else {
                    items.put(id, tmp - 1);
                }
            }
            
        }
        return true;
    }
    

}
