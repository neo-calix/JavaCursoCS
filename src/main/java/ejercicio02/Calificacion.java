package ejercicio02;

public class Calificacion {
    public static void main(String[] args){
        int grade = 78;

        if (grade>=90){
            System.out.println("The grade is A");
        } else if (grade>=80){
            System.out.println("The grade is B");
        } else if (grade>=70){
            System.out.println("The grade is C");
        } else if (grade>=60){
            System.out.println("The grade is D");
        } else{
            System.out.println("The grade is F");
        }
    }
}
