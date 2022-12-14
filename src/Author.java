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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return firstName.equals(a2.firstName);

    }
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }
    public static String comparisonHashCode(Author one, Author two) {
        String resoult = " ";
        if (one.hashCode() == two.hashCode()) {
            resoult = "Суммы hashCode равны ";
        } else {
            resoult = "Суммы hashCode НЕ равны: " + "\n" +
                    "hashCode " + one + " = " + one.hashCode() + "\n" +
                    "hashCode " + two + " = " + two.hashCode();
        }
        return resoult;
    }
}
