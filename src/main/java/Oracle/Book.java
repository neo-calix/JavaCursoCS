package Oracle;

public class Book {
    String Bname = "BookName";
    String Bautor = "BookAutor";
    String Bcolor = "BookColor";
    int Page_num = 0;
    //Boolean Bstatus = Boolean.valueOf("In process");

    void changeBname(String newValue){
        Bname = newValue;
    }
    void changeBautor(String newValue){
        Bautor = newValue;
    }
    void changeBcolor (String newValue){
        Bcolor = newValue;
    }
    void changePage_num(int newValue){
        Page_num = newValue;
    }
    void printBookInfo(){
        System.out.println("Book's name: " + Bname + "\n" + "Book's autor: " + Bautor + "\n" + "Book's color: " + Bcolor + "\n" + "Book's pages number: " + Page_num);
    }
}
