/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import model.*;

/**
 *
 * @author idoia
 */
public interface ControladorCustomerInterface {
    //Metodos que van en la implementacion
    
    public void createCustomer(Customer cust,int Id,String firstName,String lastName,
    String middleInitial,String street,String city,String state,int zip,int phone,
    String email)throws Exception;
}
