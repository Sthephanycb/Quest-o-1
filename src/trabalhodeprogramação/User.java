package trabalhodeprogramação;

public class User { // classe
    // atributos com visibilidade privada
    private int registration;
    private String name;
    private String last_name;
    private String email;
    private String password;
    private Address user_address;

    //método construtor
    public User() {
        
    }    
    
    // Métodos Get e Set
    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getUser_address() {
        return user_address;
    }

    
    
    
}
