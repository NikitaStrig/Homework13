public class Main {

    public static void main(String[] args) {
        Author Abba = new Author("Max","Abba");
        Author Pelevin = new Author("Alex","Pelevin");
       Book World = new Book("World",Pelevin, 1995);
       Book Zed = new Book("Zed", Pelevin,2001);
       Book Murka = new Book("Murka",Abba,2010);
       Book Murka2 = new Book("Murka",Abba,2010);

        System.out.println("Zed.publicationYear = " + Zed.getPublicationYear());
        Zed.setPublicationYear(2015);
        System.out.println("Zed.publicationYear = " + Zed.getPublicationYear());
        System.out.println(World.getNameBook()+" " + World.author.getTwoName()+" " + World.author.getFirstName()+" "
                + World.getPublicationYear());
        System.out.println(Abba);
        System.out.println(Murka.equals(Murka2));
        System.out.println(Murka.hashCode() + " " + Murka2.hashCode());
        System.out.println(Book.comparisonHashCode(Murka, Zed));


    }
}