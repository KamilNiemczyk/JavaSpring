class Author {
    public enum Gender {
        MALE, FEMALE
    }
    private String name;
    private String email;
    private Gender gender;

    public Author(String name, String email, Gender gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Gender getGender(){
        return this.gender;
    }
    public String toString(){
        return "Author[name=" + this.name + ", email=" + this.email + ", gender=" + this.getGender() + "]";
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "Book[name=" + this.name + ", " + this.author.toString() + ", price=" + this.price + ", qty=" + this.qty + "]";
    }
}

class Zad5 {
    public static void main(String[] args){
        Author author = new Author("Jan Kowalski", "jan.kowalski@gmail", Author.Gender.MALE);
        System.out.println(author.toString());
        Book book = new Book("BookAAA", author, 80.00);
        System.out.println(book.toString());
        book.setQty(10000000);
        System.out.println(book.toString());
        author.setEmail("a@a.com");
        System.out.println(book.toString());
    }
}
