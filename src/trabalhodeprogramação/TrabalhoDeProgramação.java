package trabalhodeprogramação;

public class TrabalhoDeProgramação {

    public static void main(String[] args) {
        // c) objeto do tipo course
        Course c1 = new Course();
        c1.setName("Sistemas de Informação");
        c1.setCodeCourse(54321);
        User use1 = new User();
        use1.setName("Sthephany");
        use1.setLast_name("Barbosa");
        use1.setEmail("sthephanycb@icloud.com");
        use1.setPassword("87654321");
        Address a1 = new Address();
        a1.setCep("69305160");
        a1.setIdAddress(90);
        a1.setPublic_place("Gaúcho Dias");
        a1.setUf("RR");
        a1.setCity("Boa Vista");
                       
        // d) objeto do tipo student
        Student s1 = new Student(2019, 3, c1);  
        System.out.println("INFORMAÇÕES DO ALUNO(A)");
        System.out.println("Nome: " + use1.getName());
        System.out.println("Sobrenome: " + use1.getLast_name());
        System.out.println("E-mail: " + use1.getEmail());
        System.out.println("Senha: " + use1.getPassword());
        System.out.println("Endereçado(a) na rua: " + a1.getPublic_place()+ 
                " número: " + a1.getIdAddress() + ". Localizado na cidade: " + a1.getCity() + " e Estado de: " + a1.getUf());
        System.out.println("Ano que ingressou: " + s1.getYear_registration());
        System.out.println("Cursando o semestre de número: " + s1.getCurrent_semester());
        System.out.println("Curso: " + s1.getCourse().getName()+ 
                           " que possui o código de número " + c1.getCodeCourse());
                
             
       }
    
}
