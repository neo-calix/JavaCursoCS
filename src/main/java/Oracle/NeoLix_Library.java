package Oracle;

import javax.sound.midi.Soundbank;

public class NeoLix_Library {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        Book book6 = new Book();
        Book book7 = new Book();

        System.out.println("Welcome to Neo Calix's Library, the following books are the books that she all ready finished. Enjoy!!" + "\n");

        book1.changeBname("El Alquimista");
        book1.changeBautor("Paulo Coelho");
        book1.changeBcolor("Naranja");
        book1.changePage_num(205);
        book1.printBookInfo();
        book1.statusbook(205);

        System.out.println("\n");

        book2.changeBname("Orgullo y Prejuicio");
        book2.changeBautor("Jane Austen");
        book2.changeBcolor("Morado");
        book2.changePage_num(620);
        book2.printBookInfo();
        book2.statusbook(620);

        System.out.println("\n");

        book3.changeBname("La Biblioteca de la Medianoche");
        book3.changeBautor("Matt Haig");
        book3.changeBcolor("Azul");
        book3.changePage_num(330);
        book3.printBookInfo();
        book3.statusbook(330);

        System.out.println("\n");

        book4.changeBname("Harry Potter y la piedra filosofal");
        book4.changeBautor("J.K. Rowling");
        book4.changeBcolor("Amarillo");
        book4.changePage_num(260);
        book4.printBookInfo();
        book4.statusbook(260);

        System.out.println("\n");

        book5.changeBname("Harry Potter y la cámara secreta");
        book5.changeBautor("J.K. Rowling");
        book5.changeBcolor("Azul");
        book5.changePage_num(292);
        book5.printBookInfo();
        book5.statusbook(292);

        System.out.println("\n");

        book6.changeBname("Harry Potter y el prisionero de Azkaban");
        book6.changeBautor("J.K. Rowling");
        book6.changeBcolor("Verde");
        book6.changePage_num(226);
        book6.printBookInfo();
        book6.statusbook(226);

        System.out.println("\n");

        book6.changeBname("Harry Potter y el cáliz de fuego");
        book6.changeBautor("J.K. Rowling");
        book6.changeBcolor("Naranja");
        book6.changePage_num(665);
        book6.printBookInfo();
        book6.statusbook(143);
    }
}
