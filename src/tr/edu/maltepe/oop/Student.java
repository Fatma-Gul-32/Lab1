package tr.edu.maltepe.oop;

public class Student {
    String name;

    public Student(String name){
        this.name= name;
    }

    void learns(){
        System.out.println("Student" +name+ "learns now");
    }
}
