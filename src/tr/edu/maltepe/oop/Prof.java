package tr.edu.maltepe.oop;
public class Prof {
    String name;
    String surname;

    public Prof(String name, String surname){
        this.name= name;
        this.surname=  surname;
    }

    void teaches(){
        System.out.println("Prof " +name+ " " +surname+" teaches now");
    }
}
