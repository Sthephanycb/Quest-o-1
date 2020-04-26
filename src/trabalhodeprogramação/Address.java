package trabalhodeprogramação;

public class Address { // classe
    // atributos com visibilidade privada
    private int idAddress;
    private String cep;
    private String public_place;
    private String uf;
    private String city;

    //método construtor
    public Address() {
        
    }
        
    // métodos get e set
    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPublic_place() {
        return public_place;
    }

    public void setPublic_place(String public_place) {
        this.public_place = public_place;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
   
    
}
