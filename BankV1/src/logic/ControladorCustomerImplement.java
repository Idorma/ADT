/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.ejb.CreateException;
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
    private ConnectionOpenClose conection = new ConnectionOpenClose();

    private ResourceBundle configFile;
    private String driverBD;
    private String urlBD;
    private String userBD;
    private String contraBD;
    
    private final String createCustomer = "CALL `alta_usuario`(?,?,?,?,?)";//CAMBIAR

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
            int phone, String email) throws CreateException, ConnectException {
        try {
			con = conection.openConnection();
		} catch (ConnectException e1) {
			throw new ConnectException(e1.getMessage());
		}
		try {
			stmt = con.prepareStatement(createCustomer);
			stmt.setInt(1, Id);
			stmt.setString(2, firstName);
			stmt.setString(3, lastName);
			stmt.setString(4, middleInitial);
			stmt.setString(5, street);
                        stmt.setString(6, city);
                        stmt.setString(7, state);
                        stmt.setInt(8, zip);
                        stmt.setInt(9, phone);
                        stmt.setString(10, email);

			stmt.executeUpdate();

		} catch (Exception e) {
			throw new CreateException("Error al Crear");
		}
		try {
			conection.closeConnection(stmt, con);
		} catch (ConnectException e) {
			throw new ConnectException(e.getMessage());
		}

	}
    }

    

    
    
}
