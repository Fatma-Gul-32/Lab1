package tr.edu.maltepe.oop;

public class simple2main {

    public static void main(String[] args){
        Prof p1;
        Student s1;

        p1 = new Prof("Ensar Gul");
        s1 = new Student("Fatma Gul");

        p1.teaches();
        s1.learns();
    }

}
