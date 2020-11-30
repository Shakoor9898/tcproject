/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Acer
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.sql.SQLException;
import java.sql.*;
public class tc {
   
    
    static final String JDBC_DRIVER="";//enter drive name
    static final String DB_URL="";//enter database URL
    static final String USER="";//enter username
    static final String PASS="";//enter password
            
    public static void main(String[] args){
        Connection conn=null;
        Statement stmt=null;
        try{
        Class.forName("enter class name");
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt=conn.createStatement();
        String sql="SELECT part_name,quantity FROM parts";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            String name=rs.getString("part_name");
            int count=rs.getInt("count");
            if(count==0){
                
            }
        }
        rs.close();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
        }
    
    
        
    
    

