import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamTest {

    public static void  main(String[] args){

        List<Person> persons = new Persons().getPersons();
        
        List<Person> persons2 = new ArrayList<Person>();
        persons2.add(new Person("Sheron",34,67.5));
        persons2.add(new Person("Terron",56,78.2));
        persons2.add(new Person("Uthay",45,54.3));
        persons2.add(new Person("Stalin",56,65.3));
        persons2.add(new Person("Vinay",56,68.2));

        List<Person> myProfile = Stream.concat(persons.stream(),persons2.stream())
                .filter(person -> person.getWeight()>=60)
				.sorted((o1,o2) -> o1.getAge() - o2.getAge())
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

    public double getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
    }

}

class Persons {

    public List<Person> getPersons(){
        return Arrays.asList(new Person("Hamzath",27,69.5),
                new Person("Sriram",28,64.2),
                new Person("Mario",56,85));
    }
}
