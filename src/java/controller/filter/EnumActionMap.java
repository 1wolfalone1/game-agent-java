/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.filter;

import controller.filter.EnumAction;

/**
 *
 * @author ASUS
 */
public enum EnumActionMap {
    //html
    HOME("", EnumAction.INDEX_PAGE),
    PAGE_NOT_FOUND("page_not_found", EnumAction.PAGE_NOT_FOUND),
    LOGIN_HTML("login_page", EnumAction.LOGIN_HTML),
    //servlet
    WELCOMEPAGE("navigate_first_page", EnumAction.NATIGATE_WELCOME_PAGE),
    LOGIN("login", EnumAction.LOGIN_CONTROLLER),
    NAVBAR("navbar", EnumAction.NAVBAR_ACTION_CONTROLLER),
    REGISTER("register", EnumAction.REGISTER_CONTROLLER),
    LOGOUT("logout", EnumAction.LOGOUT_CONTROLLER),
    ORDER("order", EnumAction.ORDER_CONTRLLER),
    //jsp
    SEARCH_JSP("search_game", EnumAction.SEARCH_GAME_JSP),
    REGISTER_JSP("regis_jsp", EnumAction.REGISTER_JSP),
    VIEW_CART_JSP("cart", EnumAction.VIEW_CART_JSP)
    ;
    
    
    private EnumActionMap(String key, EnumAction action) {
        this.key = key;
        this.action = action;
    }
    private final String key;
    private final EnumAction action;

    public String getKey() {
        return key;
    }

    public EnumAction getAction() {
        return action;
    }
    
}
