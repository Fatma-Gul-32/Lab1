package tr.edu.maltepe.oop;

public class Prof extends Person {

    //we can use 2 constructors, one of them is with referances and the other one is empty
    public Prof(String name, String surname, String major) {
        this.setName(name);
        this.setSurname(surname);
        this.setMajor(major);
    }
    //but this causes overloading
    public Prof(){
        System.out.println("Prof works");
    }

    void teaches() {
        System.out.println("Prof " + getName() + " " + getSurname() + " teaches now " +getMajor());
    }

}
