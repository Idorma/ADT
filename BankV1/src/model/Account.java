/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Real;
import java.sql.Date;


/**
 *
 * @author idoia
 */
public class Account implements java.io.Serializable{
    private int Id;
    private String description;
    private float balance;
    private float creditLine;
    private float beginBalance;
    //private DatabaseDate beginBalanceTimestamp;
    private Date beginBalanceTimestamp;
    private AccountType type;

    
    
}
