package tr.edu.maltepe.oop;

public class Student extends Person {

    private int id;

    public Student(String name, String surname, int id){
        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
    }
    //this cause overloading
    public Student(){
        System.out.println("Student çalıştı");
    }

    void learns(){

        System.out.println("Student " + getName() + " " + getSurname() + " number " + getId() + " learns now");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
