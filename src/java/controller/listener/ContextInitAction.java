/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.listener;

import controller.filter.EnumActionMap;
import controller.filter.EnumAction;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Set;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author ASUS
 */
public class ContextInitAction implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        HashMap<String, EnumAction> map = new HashMap();
        ServletContext context = sce.getServletContext();
        Set<EnumActionMap> set = EnumSet.allOf(EnumActionMap.class);
        for (EnumActionMap enumEntity : set) {
            map.put(enumEntity.getKey(), enumEntity.getAction());
        }
        context.setAttribute("map", map);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
