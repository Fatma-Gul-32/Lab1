package tr.edu.maltepe.oop;

public class simple2main {

    public static void main(String[] args){
        Prof p1=new Prof();
        Student s1=new Student();

        //p1 = new Prof("Ensar", "Gul");
        //s1 = new Student("Fatma Gul","Bagriacik",7);

        p1.setName("Ensar");
        p1.setSurname("Gul");
        s1.setName("Fatma Gul");
        s1.setSurname("Bagriacik");
        s1.setId(7);

        p1.teaches();
        s1.learns();

    }

}
