public class Author {
    String firstName; // имя
    String twoName; // фамилия

    public Author(String firstName, String twoName) {
        this.firstName = firstName;
        this.twoName = twoName;
    }

    public String getFirstName() {
        return firstName;

    }

    public String getTwoName() {
        return twoName;
    }

    public String toString() {
        return getFirstName() + " " + getTwoName();

    }
}
