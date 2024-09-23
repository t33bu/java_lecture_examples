
// Declaration is different than in classes
public record Person(String name, String address) implements Comparable<Person> {

    // No need for default constructor to assign values
    
    // Different constructors ok
    public Person {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }

    // Getters are available through the names of data fields
		
    // Also no setters since immutable data

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }    
}

