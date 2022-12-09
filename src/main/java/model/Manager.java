package model;

import db.Connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager extends Employee implements IManager {

    String roleTitle;
    Statement st = null;
    ResultSet rs = null;
    Connection db = null;

    public Manager() {
        db = Connect.getConnection();
    }

    public Manager(int id_employee, String name, String username, String password, int age, float salary, int years_experienced, String roleTitle) {
        super(id_employee, name, username, password, age, salary, years_experienced);
        this.roleTitle = roleTitle;
    }

    @Override
    public boolean login(String username, String password) {
        try {
            st = db.createStatement();
            String sql = String.format("SELECT COUNT(*) FROM employee e JOIN manager m ON e.id_employee = m.id_employee WHERE username = '%s' AND password = '%s'", username, password);
            if (st.execute(sql)) {
                rs = st.getResultSet();
                return rs.next() && rs.getInt(1) > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isExperienced() {
        return super.years_experienced > 20;
    }

    public void registerEmployee(Employee cashier) {

    }
}
