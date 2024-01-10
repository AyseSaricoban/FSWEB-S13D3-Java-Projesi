public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 25);
        Person person2 = new Person("Alice", "Smith", 18, "123 Main St", "555-1234", true);

        System.out.println("Person 1:");
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        System.out.println("\nPerson 2:");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen: " + person2.isTeen());
    }
}
