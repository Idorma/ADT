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
public class Movement {
    private int Id;
    private int idAccount;
    //private DatabaseDate timestamp;
    private Date timestamp;
    private float amount;
    private float balance;
    private String description;
}
