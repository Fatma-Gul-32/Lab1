package tr.edu.maltepe.oop;

public class Person {
    private String name;
    private String surname;
    private String major;

    public Person(String name, String surname, String major){
        this.name= name;
        this.surname= surname;
        this.major= major;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
