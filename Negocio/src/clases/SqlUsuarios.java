/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SqlUsuarios extends conectar {
    
    public boolean registrar(Clientes usr ) {
        PreparedStatement ps = null;
        Connection con = getconectar();
        
        String sql ="INSERT INTO Clientes (nombre,cedula,direccion,telefono,correo"
                + ",contraseña) VALUES() ";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
             ps.setString(2, usr.getCedula());
              ps.setString(3, usr.getDireccion());
               ps.setInt(4, usr.getTelefono());
                ps.setString(5, usr.getCorreo());
                 ps.setString(6, usr.getContraseña());
                 ps.execute();
                 return true;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
