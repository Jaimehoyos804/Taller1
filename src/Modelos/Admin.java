package Modelos;

/**
 *
 * @author JAIME
 */
public class Admin extends Empleado {

    public Admin() {
    }

    public Admin(String Document, String Name, float Hourlywage, EmpresaDesarrollo company) {
        super(Document, Name, Hourlywage, company);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
