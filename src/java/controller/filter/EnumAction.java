/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.filter;

/**
 *
 * @author ASUS
 */
public enum EnumAction {
    //html
    INDEX_PAGE("index.html", EnumUserRole.GUEST),
    PAGE_NOT_FOUND("page_not_found.html", EnumUserRole.GUEST),
    LOGIN_HTML("login.jsp", EnumUserRole.GUEST),
    //servlet
    NATIGATE_WELCOME_PAGE("WelcomePageController", EnumUserRole.GUEST),
    SEARCH_GAME_SERVLET("SearchGameController", EnumUserRole.GUEST),
    LOGIN_CONTROLLER("LoginController", EnumUserRole.GUEST),
    NAVBAR_ACTION_CONTROLLER("NavbarController", EnumUserRole.USER),
    LOGOUT_CONTROLLER("LogoutController",EnumUserRole.USER),
    REGISTER_CONTROLLER("RegistrationController", EnumUserRole.GUEST),
    ORDER_CONTRLLER("OrderGameController", EnumUserRole.USER),
    //jsp
    LOGIN_JSP("login.jsp", EnumUserRole.GUEST),
    SEARCH_GAME_JSP("search_in_welcome.jsp", EnumUserRole.GUEST),
    REGISTER_JSP("register.jsp", EnumUserRole.GUEST),
    VIEW_CART_JSP("view_cart.jsp", EnumUserRole.USER)
    ;
    
    private EnumAction(String action,EnumUserRole userRole) {
        this.action = action;
        this.userRole = userRole;
    }

    public String getAction() {
        return action;
    }

    public EnumUserRole getUserRole() {
        return userRole;
    }
    
    
    
    private final String action;
    private final EnumUserRole userRole;
}
