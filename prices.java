import java.util.ArrayList;
import java.util.Scanner; // Importante para leer la entrada del usuario

public class prices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> pricesList = new ArrayList<>();

        // Agregando precios a la lista
        pricesList.add(10.99);
        pricesList.add(1.99);
        pricesList.add(7.99);
        pricesList.add(3.99);
        pricesList.add(12.75);

        System.out.print("¿Quieres ver la lista de precios? (si/no): ");
        String respuestaLista = sc.nextLine();

        if (respuestaLista.equalsIgnoreCase("si")) {
            System.out.println("Lista de precios: " + pricesList);
        }

        System.out.print("¿Quieres ver el total de la compra? (si/no): ");
        String respuestaTotal = sc.nextLine();

        if (respuestaTotal.equalsIgnoreCase("si")) {
            double totalCompra = calculateTotal(pricesList);
            System.out.println("Total de la compra: $" + totalCompra);
        } else {
            System.out.println("Entendido, ¡que tengas un buen día!");
        }

        sc.close(); 
    }
    public static double calculateTotal(ArrayList<Double> prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}
