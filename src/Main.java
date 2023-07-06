import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String respuesta = null;
		Scanner input = new Scanner(System.in);
		do {
			clearScreen();
			System.out.flush();
			System.out.println(
					"Tasky 1.0\n1)Crear nueva tarea\n2)Consultar tareas\n3)Actualizar tarea\n4)Eliminar tarea\n5)Salir");
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
				break;
			case "2":
				System.out.println("** Tareas registradas **");
				for (Task task : Task.getTasks().values()) {
					System.out.println(task.toString());
				}
				System.out.println(
						"----------------------------------------------\n" + "Presione enter para continuar...");
				input.nextLine(); // Consumir el carácter de nueva línea
				break;

			case "3":
				System.out.println("Ingrese el numero de tarea a actualizar: ");
				int tareaActualizar = input.nextInt();
				input.nextLine(); // Consumir el carácter de nueva línea

				System.out.println("Ingrese la nueva descripcion: ");
				String nuevaDescripcion = input.nextLine();

				String mensaje = Task.updateTaskDescripcion(tareaActualizar, nuevaDescripcion);
				System.out.println(mensaje);
				System.out.println(
						"----------------------------------------------\n" + "Presione enter para continuar...");
				input.nextLine();
				break;

			case "4":
				System.out.print("Ingrese el numero de tarea a eliminar: ");
				int tareaEliminar = input.nextInt();
				input.nextLine();
				int indiceEliminar = tareaEliminar;
				if (indiceEliminar >= 0 || indiceEliminar < Task.getTasks().size()) {
					Task.deleteTask(indiceEliminar);
					System.out.println("Tarea " + tareaEliminar + " eliminada exitosamente.");
				} else {
					System.out.println("El numero de tarea ingresado no es valido.");
				}
				System.out.println(
						"----------------------------------------------\n" + "Presione enter para continuar...");
				input.nextLine();
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			}
		} while (!respuesta.equals("5"));
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
