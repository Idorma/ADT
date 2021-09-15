/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankv1;

import logic.ControladorCustomerImplement;
import logic.ControladorCustomerInterface;

/**
 *
 * @author idoia
 */
public class BankV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorCustomerInterface datosCustom = new ControladorCustomerImplement();
    }
    
}
