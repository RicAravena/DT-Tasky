import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String respuesta = null;
		Scanner input = new Scanner(System.in);
		
		List<Task> taskList = new ArrayList<>(); 
		do {
		    System.out.flush(); 
			System.out.println("Tasky 1.0\n1)Crear nueva tarea\n2)Consultar tareas\n3)Salir");
			System.out.print("\nOpcion: ");
			respuesta = input.next();
			switch (respuesta) {
			case "1":
				Task tarea = new Task();
				System.out.println("Nombre de la tarea: ");
				tarea.setTask_title(input.next());
				System.out.println("Descripcion de la tarea: ");
				tarea.setTask_description(input.next());
				taskList.add(tarea);
				break;
			case "2":
				input.nextLine();
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

}
