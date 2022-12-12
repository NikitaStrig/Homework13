public class Main {
    public static void main(String[] args) {
        Author Abba = new Author("Max","Abba");
        Author Pelevin = new Author("Alex","Pelevin");
       Book World = new Book("World",Pelevin, 1995);
       Book Zed = new Book("Zed", Pelevin,2001);
       Book Murka = new Book("Murka",Abba,2010);

        System.out.println("Zed.publicationYear = " + Zed.publicationYear);
        Zed.setPublicationYear(2015);
        System.out.println("Zed.publicationYear = " + Zed.publicationYear);
    }
}