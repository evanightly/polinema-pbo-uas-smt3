package model;

public class Cashier extends Employee implements ICashier {

    int transaction_handled;

    public Cashier(int id_employee, String name, String username, String password, int age, float salary, int years_experienced, int transaction_handled) {
        super(id_employee, name, username, password, age, salary, years_experienced);
        this.transaction_handled = transaction_handled;
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
    public boolean isAdult() {
        return super.age > 18;
    }

    @Override
    public boolean isLocalResident() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
