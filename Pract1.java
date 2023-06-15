import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Pract1 {

    public static void  main(String[] args){

        List<String> test = Arrays.asList("I", "am", "a", "list", "of", "Strings");

        System.out.println("Hello World!");

        List<Person> persons = new Persons().getPersons();

        List<Person> myProfile = persons.stream()
                .filter(person -> person.getName().equals("Hamzath"))
                .collect(Collectors.toList());

        System.out.println("Profile Details: " + myProfile);
    }


}

class Person {

    private final String name;
    private final int age;
    private final double weight;

    public Person(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double weight(){
        return weight;
    }

}

class Persons {

    public List<Person> getPersons(){
        return Arrays.asList(new Person("Hamzath",27,69.5),
                new Person("Sriram",28,64.2),
                new Person("Mario",29,85));
    }


}
