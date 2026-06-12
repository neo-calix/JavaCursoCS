package Objects;

public class Book {
    String name = "Book Name";
    String autor = "Book Autor";
    int num_pages = 0;

    void changeautor(String newValue) {
        autor = newValue;
    }
    void changename(String newValue){
        name = newValue;
    }
    void changenum_pages(int newValue){
        num_pages = newValue;
    }
    void printBookInfo(){
        System.out.println("Book's autor: " + autor + "\n" + "Book's name: " + name + "\n" + "Book's pages number: " + num_pages);
    }
}
