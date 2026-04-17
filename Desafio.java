import java.util.ArrayList;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        ArrayList<String> tarea = new ArrayList<>();
        ArrayList<String> completadas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean stop = false;
        int userOption;

        tarea.add("Examen de ingles");
        tarea.add("Laboratorio 3");
        tarea.add("desafio de programacion");
        tarea.add("Practicar consultas SQL");

        while (!stop) {
            System.out.println("\n--- TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Mostrar tareas completadas");
            System.out.print("Que deseas hacer? ");

            if (sc.hasNextInt()) {
                userOption = sc.nextInt();
                sc.nextLine(); 

                switch (userOption) {
                    case 1:
                        agregarTarea(tarea, sc);
                        break;
                    case 2:
                        System.out.println("\nLista de tareas actuales:");
                        for (String mostrar : tarea) {
                            System.out.println("- " + mostrar);
                        }
                        break;
                    case 3:
                        marcarCompletada(tarea, completadas, sc);
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("\nTus tareas completadas son:");
                        if (completadas.isEmpty()) {
                            System.out.println("No hay tareas completadas aún");
                        } else {
                            for (String tareasTerminadas : completadas) {
                                System.out.println("[X] " + tareasTerminadas);
                            }
                        }
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }
            } else {
                System.out.println("Escribe bien bobo");
                sc.nextLine();
            }
        }
        sc.close();
    }

    public static void agregarTarea(ArrayList<String> tareas, Scanner sc) {
        boolean detener = false;
        while (!detener) {
            System.out.print("Dime qué tarea quieres agregar: ");
            String taskAdd = sc.nextLine(); 
            tareas.add(taskAdd);
            System.out.println("Tarea guardada.");

            System.out.print("¿Deseas agregar otra tarea?: ");
            String seguir = sc.nextLine();
            if (seguir.equalsIgnoreCase("no")) {
                detener = true;
            }
        }
    }

    public static void marcarCompletada(ArrayList<String> tareas, ArrayList<String> completadas, Scanner sc) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para completar.");
            return;
        }
        System.out.println("Tus tareas: " + tareas);
        System.out.print("Escribe el nombre exacto de la tarea completada: ");
        String nombre = sc.nextLine();

        if (tareas.contains(nombre)) {
            tareas.remove(nombre);
            completadas.add(nombre);
            System.out.println("Tarea movida a completadas");
        } else {
            System.out.println("No se encontró esa tarea.");
        }
    }

    public static void eliminarTarea(ArrayList<String> tareas, Scanner sc) {
        if (tareas.isEmpty()) {
            System.out.println("Nada que eliminar.");
            return;
        }
        System.out.println("Lista: " + tareas);
        System.out.print("¿Cuál eliminarás?: ");
        String borrar = sc.nextLine();
        
        if (tareas.remove(borrar)) {
            System.out.println("Tarea eliminada correctamente.");
        } else {
            System.out.println("No se encontró la tarea.");
        }
    }
}