package tr.edu.maltepe.oop;
public class Prof {
    String name;

    public Prof(String name){
        this.name= name;
    }

    void teaches(){
        System.out.println("Prof " +name+ " teaches now");
    }
}
