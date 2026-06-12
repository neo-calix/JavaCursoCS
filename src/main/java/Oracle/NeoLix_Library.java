package Oracle;

public class NeoLix_Library {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        System.out.println("Welcome to Neo Calix's Library, the following books are the books that she all ready finished. Enjoy!!" + "\n");

        book1.changeBname("El Alquimista");
        book1.changeBautor("Paulo Coelho");
        book1.changeBcolor("Naranja");
        book1.changePage_num(205);
        book1.printBookInfo();

        System.out.println("\n");

        book2.changeBname("Orgullo y Prejuicio");
        book2.changeBautor("Jane Austen");
        book2.changeBcolor("Morado");
        book2.changePage_num(620);
        book2.printBookInfo();

        System.out.println("\n");

        book3.changeBname("La Biblioteca de la Medianoche");
        book3.changeBautor("Matt Haig");
        book3.changeBcolor("Azul");
        book3.changePage_num(330);
        book3.printBookInfo();
    }
}
