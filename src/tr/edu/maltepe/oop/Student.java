package tr.edu.maltepe.oop;

public class Student extends Person {

    private int id;
    //we can use 2 constructors, one of them is with referances and the other one is empty
    public Student(String name, String surname, int id, String major){
        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
        this.setMajor(major);
    }
    //but this causes overloading
    public Student(){
        System.out.println("Student çalıştı");
    }

    void learns(){

        System.out.println("Student " + getName() + " " + getSurname() + " number " + getId() + " learns now " + getMajor());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
