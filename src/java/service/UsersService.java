package service;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.User;
import connexion.Connexion;
import dao.IDao;

public class UsersService implements IDao<User> {

    @Override
    public boolean create(User o) {
        String sql = "insert into user values (null, ?, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, o.getUsername());
            ps.setString(2, o.getEmail());
            ps.setString(3, o.getPassword());
           
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("create : erreur sql : " + e.getMessage());

        }
        return false;
    }

     public boolean Authentification(String username, String password) {
        
        String sql = "select * from user where username = ? and password = ? ";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, username);
             ps.setString(2, password); 
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               return true;
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
       return false;
    }
    
    @Override
    public boolean delete(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 public int countusers() {
        int count = 0 ;
        String sql = "select count(*) as count from user";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt("count");
            }

        } catch (SQLException e) {
            System.out.println("error " + e.getMessage());
        }
        return count;
    }
   
}
