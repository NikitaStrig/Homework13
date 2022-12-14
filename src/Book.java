public class Book {
    String nameBook;
    Author author;
    int publicationYear;


    public Book(String nameBook, Author author, int publicationYear){
        this.nameBook = nameBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getNameBook(){
        return nameBook;
    }
    public Author getAuthor(){
        return author;
    }
    public  int getPublicationYear(){
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    public String toString(){
        return getNameBook() +  " " + author.toString() +  " " + getPublicationYear();
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return nameBook.equals(b2.nameBook);
    }
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }
}

