import java.util.ArrayList;
import java.util.Scanner;

public class students {

    public static void main(String[] args) {

 ArrayList<String> students = new ArrayList<>();

   students.add("Ana");
    students.add("Luis");
    students.add("Carlos");
    students.add("Maria");
    students.add("Sofia");
    students.add("Pedro");

    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el nombre del estudiante: ");
    String nombre = sc.nextLine();

     if (students.contains(nombre)) {
        System.out.println("Student found");
    } else { System.out.println("Student not found"); }

sc.close();
    }
}
