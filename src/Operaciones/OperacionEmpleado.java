package Operaciones;

import Modelos.Admin;
import Modelos.Desarrollador;
import Modelos.EmpresaDesarrollo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JAIME
 */
public class OperacionEmpleado implements IOperacionEmpleado {

    private String nameEmployee;
    private String Documentempleyee;
    private float timeValue;
    private EmpresaDesarrollo employeeEm;

    OperacionEmpresa operationCompany = new OperacionEmpresa();
    Desarrollador developer = new Desarrollador();
    Admin adminCompany = new Admin();

    Scanner input = new Scanner(System.in);

    ArrayList<Desarrollador> ListDev = new ArrayList<>();
    ArrayList<Admin> ListAdmin = new ArrayList<>();
    ArrayList<String> company = new ArrayList<>();

    public ArrayList<String> nameCompany() {
        operationCompany = new OperacionEmpresa();
        ArrayList<EmpresaDesarrollo> CompanyDevCreate = new ArrayList<>();
        CompanyDevCreate = this.operationCompany.registrationComapny();
        for (int i = 0; i < CompanyDevCreate.size(); i++) {
            this.company.add(CompanyDevCreate.get(i).getName());
        }
        return this.company;
    }

    @Override
    public void crearEmpleado() {
        ArrayList<String> nameEmploye = new ArrayList<>();
        nameEmploye = nameCompany();
        System.out.println("Seleccione la empresa a la cual desea contratar empleados\n");
        for (int i = 0; i < nameEmploye.size(); i++) {
            System.out.println("Empresa " + i + ": " + nameEmploye.get(i));
        }
        String nameCompany = input.nextLine();
        if (nameEmploye.contains(nameCompany)) {
            System.out.println("Empresa encontrada");
            System.out.println("\nQué perfil deseas añadir?");
            System.out.println("1. Desarrollador");
            System.out.println("2 Administrador");
            
            int optionPerfil = input.nextInt();
            input.nextLine();
            switch (optionPerfil) {
                case 1:
                    System.out.println("Nombre: ");
                    this.nameEmployee = input.nextLine();
                    System.out.println("Documento: ");
                    this.Documentempleyee = input.nextLine();
                    System.out.println("Valor hora: ");
                    this.timeValue = input.nextFloat();
                    input.nextLine();
                    developer.setName(this.nameEmployee);
                    developer.setDocument(Documentempleyee);
                    developer.setHourlywage(timeValue);
                    this.ListDev.add(developer);
                    break;
                case 2:
                    System.out.println("Nombre: ");
                    this.nameEmployee = input.nextLine();
                    System.out.println("Documento: ");
                    this.Documentempleyee = input.nextLine();
                    System.out.println("Valor hora: ");
                    this.timeValue = input.nextFloat();

                    adminCompany.setName(this.nameEmployee);
                    adminCompany.setDocument(Documentempleyee);
                    adminCompany.setHourlywage(timeValue);
                    this.ListAdmin.add(adminCompany);
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("Desarrolladores: " + this.ListDev + "\nAdministradores" + this.ListAdmin);
        } else {
            System.out.println("LA EMPRESA NO EXISTE*");
        }

    }
}
