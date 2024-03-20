// import section3.ClassPerson;
public class PersonExample {
    public static void main(String[] args) {
        // create object here
        var person1 = new ClassPerson();
        person1.name = "suryo atmojo";
        person1.address = "sukolilo";
        // person1.country secara default mengikuti atribute class

        Person person2 = new ClassPerson();  
        Person person3;
        person3 = new ClassPerson();

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        
    }
}

class ClassPerson {
   // Class representation for a person
    // This class is used to store and manipulate person-related information
    String name;
    String address;
    final String country = "indonesia";
}