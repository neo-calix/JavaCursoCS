package Objects;

public class BookDemo{
    public static void main(String[] args){
        Book book1 = new Book() {
            @Override
            public void read(int pages) {
                System.out.println("You've read: "+ pages);
            }
        };
        Book book2 = new Book() {
            @Override
            public void read(int pages) {
                System.out.println("You've read: "+ pages);
            }
        };

        book1.changeautor("Paulo Coelho");
        book1.changename("El Alquimista");
        book1.changenum_pages(205);
        book1.printBookInfo();
        book1.read(200);

        System.out.println("\n");

        book2.changeautor("Matt Haig");
        book2.changename("La biblioteca de la medianoche");
        book2.changenum_pages(330);
        book2.printBookInfo();
        book2.read(300);
    }
}
