package Modelos;

/**
 *
 * @author JAIME
 */
public abstract class Empleado {
    private String Document;
    private String Name;
    private float Hourlywage;
    private EmpresaDesarrollo company;

    public Empleado() {
    }

    public Empleado(String Document, String Name, float Hourlywage, EmpresaDesarrollo company) {
        this.Document = Document;
        this.Name = Name;
        this.Hourlywage = Hourlywage;
        this.company = company;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String Document) {
        this.Document = Document;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getHourlywage() {
        return Hourlywage;
    }

    public void setHourlywage(float Hourlywage) {
        this.Hourlywage = Hourlywage;
    }

    public EmpresaDesarrollo getCompany() {
        return company;
    }

    public void setCompany(EmpresaDesarrollo company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Document=" + Document + ", Name=" + Name + ", Hourlywage=" + Hourlywage + ", company=" + company + '}';
    }
    
    
}
