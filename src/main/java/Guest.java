public class Guest {

    private String firstName, lastName;
    private int age;
    private Gender gender;

    public Guest(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getInfo() {
        return String.format("Dodano nowego gościa: %s %s (%d) %s", this.firstName, this.lastName, this.age, this.gender);
    }
}
