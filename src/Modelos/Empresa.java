package Modelos;

/**
 *
 * @author JAIME
 */
public class Empresa {
    private String nit;
    private String name;
    private String address;
    private String city;

    public Empresa() {
    }

    public Empresa(String nit, String name, String address, String city) {
        this.nit = nit;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nit=" + nit + ", name=" + name + ", address=" + address + ", city=" + city + '}';
    }
    
    
}
