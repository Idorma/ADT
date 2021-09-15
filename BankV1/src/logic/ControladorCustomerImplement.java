/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import model.Customer;

/**
 *
 * @author idoia
 */
public class ControladorCustomerImplement implements ControladorCustomerInterface {
    //Aqui se implementan los metodos del interface
    //tambien se abren las conexiones con la base de datos

    private Connection con;
    private PreparedStatement stmt;

    private ResourceBundle configFile;
    private String driverBD;
    private String urlBD;
    private String userBD;
    private String contraBD;

    private void openConnection() {
        try {
            con = DriverManager.getConnection(this.urlBD, this.userBD, this.contraBD);

        } catch (SQLException e) {
            System.out.println("Error al intentar abrir la BD");
        }
    }

    private void closeConnection() throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }

    @Override
    public void createCustomer(Customer cust, int Id, String firstName, String lastName, 
            String middleInitial, String street, String city, String state, int zip, 
            int phone, String email) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }
}
