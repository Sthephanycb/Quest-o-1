package trabalhodeprogramação;
    
public class Student { // classe
    // atributos com visibilidade privada
    private int year_registration;
    private int current_semester;
    private Course course;

    //método construtor
    public Student(int year_registration, int current_semester, Course course) {
        this.year_registration = year_registration;
        this.current_semester = current_semester;
        this.course = course;
    }
                
    //método get e set       
    public int getYear_registration() {
        return year_registration;
    }

    public void setYear_registration(int year_registration) {
        this.year_registration = year_registration;
    }

    public int getCurrent_semester() {
        return current_semester;
    }

    public void setCurrent_semester(int current_semester) {
        this.current_semester = current_semester;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    }


