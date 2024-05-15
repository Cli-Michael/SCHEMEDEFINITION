package Resource;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class DB {
    public static Connection getConnection(){
    Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //con=DriverManager.getConnection("jdbc:mysql://rdstp.crz4cx9xjch6.ap-south-1.rds.amazonaws.com:3306/DataTP?allowPublicKeyRetrieval=true&useSSL=false","utecTP","utecconfig2022");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SchemeDefinition?allowPublicKeyRetrieval=true&useSSL=false","root","holder123");
        }catch(Exception e){
            System.out.println(e);
        }
            return con;
        }
}//