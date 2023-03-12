package Modelos;

/**
 *
 * @author JAIME
 */
public class Desarrollador extends Empleado {

    public Desarrollador() {
    }

    public Desarrollador(String Document, String Name, float Hourlywage, EmpresaDesarrollo company) {
        super(Document, Name, Hourlywage, company);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
