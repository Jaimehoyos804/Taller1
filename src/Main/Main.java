package Main;

import Operaciones.OperacionEmpleado;
import Operaciones.OperacionEmpresa;

/**
 *
 * @author JAIME
 */
public class Main {
    public static void main(String[] args) {
        OperacionEmpresa company = new OperacionEmpresa();
        OperacionEmpleado employee = new OperacionEmpleado();
        employee.crearEmpleado();
        company.ListComapny();
        
    }
}
