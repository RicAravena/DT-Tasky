import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String respuesta = null;
		Scanner input = new Scanner(System.in);
		
		List<Task> taskList = new ArrayList<>();
		do {
			clearScreen();
		    System.out.flush(); 
			System.out.println("Tasky 1.0\n1)Crear nueva tarea\n2)Consultar tareas\n3)Salir");
			System.out.print("\nOpcion: ");
			respuesta = input.nextLine();
			clearScreen();
			switch (respuesta) {
			case "1":
				Task tarea = new Task();
				System.out.print("Nombre de la tarea: ");
				tarea.setTask_title(input.nextLine());

				System.out.print("Descripcion de la tarea: ");
				tarea.setTask_description(input.nextLine());

				taskList.add(tarea);
				break;
			case "2":
				for(Task task: taskList) {
					System.out.println(task.toString());
				}
				System.out.println("----------------------------------------------\n"
						+ "Presione enter para continuar...");
				input.nextLine();
			default:
				System.out.println("Opcion invalida");
				break;

			}
		} while (!respuesta.equals("3"));
		System.out.println("Vuelve pronto!");
		input.close();
		
		

	}
	
    public static void clearScreen() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


