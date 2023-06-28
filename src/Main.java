import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int respuesta = 0;
		Scanner input = new Scanner(System.in);
		Task tarea = new Task();
		do {
		    //System.out.print("\033[H\033[2J");  
		    System.out.flush(); 
			System.out.println("Tasky 1.0\n1)Crear nueva tarea\n2)Consultar tareas\n3)Salir");
			System.out.print("\nOpcion: ");
			respuesta = input.nextInt();
			switch (respuesta) {
			case 1:
				System.out.println("Nombre de la tarea: ");
				tarea.setTask_title(input.next());
				System.out.println("Descripcion de la tarea: ");
				tarea.setTask_description(input.next());
				break;
			case 2:
				input.nextLine();
				System.out.println("task_title: " + tarea.getTask_title());
				System.out.println("task_description: " + tarea.getTask_description());
				System.out.println("task_date: " + tarea.getTask_date());
				System.out.println("task_priority: " + tarea.getTask_priority());
				System.out.println("task_status: " + tarea.getTask_status());
				System.out.println("----------------------------------------------\n"
						+ "Presione enter para continuar...");
				input.nextLine();
			default:
				System.out.println("Opcion invalida");
				break;

			}
		} while (respuesta != 3);
		System.out.println("Vuelve pronto!");
		input.close();

	}

}
