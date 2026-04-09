import java.util.ArrayList;
import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        grades.add(5.0);
        grades.add(4.6);
        grades.add(3.3);
        grades.add(3.0);
        grades.add(2.9);

        System.out.println("¿Quieres ver la lista de notas?");
        String rcp = sc.nextLine();

        if (rcp.equalsIgnoreCase("si")) {
            System.out.println("Notas: " + grades);
        }

        System.out.println("¿Quieres ver el promedio? (si/no)");
        String rcp2 = sc.nextLine();

        if (rcp2.equalsIgnoreCase("si")) {
            double promedio = calculateAverage(grades);
            System.out.println("El promedio es: " + promedio);
        }
        
        sc.close();
    }
    
    public static double calculateAverage(ArrayList<Double> grades) {
        if (grades.isEmpty()) return 0; 
        
        double suma = 0; // Importante: inicializar en 0
        for (int i = 0; i < grades.size(); i++) {
            suma += grades.get(i);
        }

        return suma / grades.size();
    }
}