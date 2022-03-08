package tr.edu.maltepe.oop;

public class Student {
    String name;
    String surname;
    int id;

    public Student(String name, String surname, int id){
        this.name= name;
        this.surname= surname;
        this.id= id;
    }

    void learns(){
        System.out.println("Student " +name+ " " +surname+ " number " +id+ " learns now");
    }
}
