public class Person {

    // declaring variables that all "Persons" have in common
    private String lastName;
    private String firstName;
    public int age;

    // constructor
    public Person(String lN, String fN, int a) {
        this.lastName = lN;
        this.firstName = fN;
        this.age = a;
    }

    // sets the lastName and the firstName to lN and fN
    public void setName(String lN, String fN) {
        this.lastName = lN;
        this.firstName = fN;
    }

    // returns the fullname as a string
    public String fullName() {
        return lastName + " " +  firstName;
    }

    // prints everything of that specific person
    public void printAll() {
        System.out.println("The Employees name is: " + fullName() + " and his age is " + this.age + ".");
    }
}
