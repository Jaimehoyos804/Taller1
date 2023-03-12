package Operaciones;

import Modelos.EmpresaDesarrollo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JAIME
 */
public class OperacionEmpresa implements IOperacionEmpresa {

    private String namecompanyOp;
    private String nitCompanyOp;
    private String adressComapanyOp;
    private String cityComapnyOp;
    private EmpresaDesarrollo Companydev;
    Scanner input = new Scanner(System.in);

    ArrayList<EmpresaDesarrollo> listCompany = new ArrayList<>();
    ArrayList<String> nameCompany = new ArrayList<>();

    public OperacionEmpresa() {
    }

    public ArrayList<EmpresaDesarrollo> registrationComapny() {
        System.out.println("-----------------------------------");
        System.out.println("REGISTRAR EMPRESA");
        System.out.println("\nCuántas empresas de desarrollo deseas crear?");
        int sizeCompany = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= sizeCompany; i++) {
            System.out.println("Empresa N° " + i);
            Companydev = new EmpresaDesarrollo();

            System.out.println("Nombre empresa: ");
            this.namecompanyOp = input.nextLine();

            System.out.println("NIT: ");
            this.nitCompanyOp = input.nextLine();

            System.out.println("Dirección: ");
            this.adressComapanyOp = input.nextLine();

            System.out.println("Ciudad:  ");
            this.cityComapnyOp = input.nextLine();

            Companydev.setName(namecompanyOp);
            Companydev.setNit(nitCompanyOp);
            Companydev.setAddress(adressComapanyOp);
            Companydev.setCity(cityComapnyOp);

            this.listCompany.add(Companydev);
        }
        return listCompany;
    }

    public ArrayList<String> showNameCompany() {
        for (int i = 0; i < listCompany.size(); i++) {
            this.nameCompany.add(listCompany.get(i).getName());
        }
        return this.nameCompany;
    }

    @Override
    public void ListComapny() {
       System.out.println("VER EMPRESAS");
        for (int i = 0; i < this.listCompany.size(); i++) {
            System.out.println(listCompany.get(i).getName());
        }
    }

    @Override
    public void ListEmpleoyeComapny() {
        
    }
    
    
}
