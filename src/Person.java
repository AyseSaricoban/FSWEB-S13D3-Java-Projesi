public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String address;
    private String phoneNumber;
    private boolean isStudent;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, String address, String phoneNumber, boolean isStudent) {
        this(firstname, lastname, age);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.isStudent = isStudent;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
