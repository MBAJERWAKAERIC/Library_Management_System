/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

/**
 *
 * @author ericmbajerwaka
 */
public class DBConnection {
    static connection con = null;
    
    public static connection getConnection(){
        try {
             class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getconnection("jdbc://localhost:3306/library_ms" "root", "");
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    } 
}
