package model;

public class Manager extends Employee implements IManager {
    String roleTitle;
    public Manager(int id_employee, String name, String username, String password, int age, float salary, int years_experienced, String roleTitle) {
        super(id_employee, name, username, password, age, salary, years_experienced);
        this.roleTitle = roleTitle;
    }
    
    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
