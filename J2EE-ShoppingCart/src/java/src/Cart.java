/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lakmal
 */
public class Cart {
    private List<CartItem> crt_itm;
    public Cart(){
    crt_itm=new ArrayList<CartItem>();
    }

    public void addProductToCart(CartItem ci){
        int qty;
        for (int i = 0; i < crt_itm.size(); i++) {
            CartItem cartItem = crt_itm.get(i);
            if (cartItem.getPro_id()==ci.getPro_id()) {
                qty=cartItem.getQty()+ci.getQty();
                ci.setQty(qty);
                crt_itm.remove(cartItem);
            }
        }
    crt_itm.add(ci);
    }
    
    public void removeProduct(CartItem ci){
        for (int i = 0; i < crt_itm.size(); i++) {
            CartItem cartItem = crt_itm.get(i);
            if (cartItem.getPro_id()==ci.getPro_id()) {
                crt_itm.remove(cartItem);
            }
        }
    }
    
    public List<CartItem> getCrt_itm() {
        return crt_itm;
    }

    public void setCrt_itm(List<CartItem> crt_itm) {
        this.crt_itm = crt_itm;
    }
}
