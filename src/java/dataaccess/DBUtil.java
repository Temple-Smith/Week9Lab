/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

/**
 *
 * @author Drew-
 */
package dataaccess;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    public static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("UserPU");
    
    public static EntityManagerFactory getEmFactory() {
        return EMF;
    }
}