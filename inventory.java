import java.util.ArrayList;
import java.util.Scanner;

public class inventory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> inventory = new ArrayList<>();

        inventory.add(10.99);
        inventory.add(5.50);
        inventory.add(20.00);
        inventory.add(12.75);
        inventory.add(20.55);

        System.out.print("¿Quieres ver tus precios? ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            showInventory(inventory); // Primera función
        } else {
            System.out.println("okey");
        }

        System.out.print("\n¿Quieres sumar todos los precios? ");
        String respuestaSuma = sc.nextLine();

        if (respuestaSuma.equalsIgnoreCase("si")) {
            double total = sumPrices(inventory); // Segunda función
            System.out.println("La suma total de los precios es: $" + total);
        }

        sc.close();
    }

    // FUNCIÓN 1: Solo para mostrar (usa void porque solo imprime)
    public static void showInventory(ArrayList<Double> list) {
        System.out.println("\n--- Lista de Precios ---");
        for (double price : list) {
            System.out.println("-> $" + price);
        }
    }

    // FUNCIÓN 2: Solo para sumar (usa double porque DEVUELVE el resultado)
    public static double sumPrices(ArrayList<Double> list) {
        double sum = 0;
        for (double price : list) {
            sum += price;
        }
        return sum;
    }
}
    
