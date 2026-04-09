import java.util.ArrayList;
import java.util.Scanner; 

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);
        String respuesta;

        shoppingList.add("camisa");
        shoppingList.add("leguins");
        shoppingList.add("sueter");
        shoppingList.add("medias");
        shoppingList.add("accesorios");

        System.out.print("¿Quieres ver la lista de compras?");
        respuesta = sc.nextLine().toLowerCase();

        if (respuesta.equals("si")) {
            System.out.println("\n--- Tu Lista Actual ---");
            for (String prod : shoppingList) {
                System.out.println("- " + prod);
            }
        }else { System.out.println("Okey");  }

        System.out.println("\n¿Qué deseas hacer?");
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Buscar producto");
       
 
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Escribe el nombre del producto a agregar: ");
                String nuevo = sc.nextLine();
                shoppingList.add(nuevo);
                System.out.println(nuevo + " ha sido agregado.");
                break;

            case 2:
                System.out.print("Escribe el nombre del producto a eliminar: ");
                String eliminar = sc.nextLine();
                if (shoppingList.remove(eliminar)) {
                    System.out.println("Eliminado correctamente."); 
                    System.out.println (shoppingList);
                } else {
                    System.out.println("No se encontró ese producto.");
                }
                break;

            case 3:
                System.out.print("¿Qué producto buscas?: ");
                String buscar = sc.nextLine();

                if (shoppingList.contains(buscar)) {
                    System.out.println("Sí, está en la lista");
                } else {
                    System.out.println("No lo has comprado aún.");
                }
                break;
        }

        sc.close();
    }
}
