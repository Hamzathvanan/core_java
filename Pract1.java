public class Pract1{

    public static void  main(String[] args){

	System.out.println("Hello World!");

	List<Person> persons = new Persons().getPersons();

	List<Person> myProfile = persons.stream()
	    .filter(person -> person.getName().equals("Hamzath"))
	    .colloect(Collectors.toList());

	System.out.println("Profile Details: " + myProfile);
    }


}
