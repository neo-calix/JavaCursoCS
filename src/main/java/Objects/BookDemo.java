package Objects;

public class BookDemo {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();

        book1.changeautor("Paulo Coelho");
        book1.changename("El Alquimista");
        book1.changenum_pages(205);
        book1.printBookInfo();

        System.out.println("\n");

        book2.changeautor("Matt Haig");
        book2.changename("La biblioteca de la medianoche");
        book2.changenum_pages(330);
        book2.printBookInfo();
    }
}
