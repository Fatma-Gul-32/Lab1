package tr.edu.maltepe.oop;

public class Prof extends Person {

    public Prof(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);
    }

    public Prof(){
        System.out.println("Prof çalıştı");
    }

    void teaches() {
        System.out.println("Prof " + getName() + " " + getSurname() + " teaches now");
    }

}
