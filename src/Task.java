import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Task {
	
	private static Map<Integer, Task> tasks = new HashMap<>();
	
	private static int lastTaskId = 1;
	
	private int task_id;
	private String task_title;
	private String task_description;
	private String task_status;
	private Date task_date;
	private int task_priority;

	public Task() {
		this.task_id = lastTaskId++;
		this.task_date = new Date();
		this.task_status = "Pending";
		this.task_priority = 0;
	}

	public int get_Task_id() {
		return task_id;
	}
	
	public String getTask_title() {
		return task_title;
	}

	public void setTask_title(String task_title) {
		this.task_title = task_title;
	}

	public String getTask_description() {
		return task_description;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
		
	public void setTask_description(String task_description) {
		this.task_description = task_description;
	}

	public Date getTask_date() {
		return task_date;
	}

	public void setTask_date(Date task_date) {
		this.task_date = task_date;
	}

	public int getTask_priority() {
		return task_priority;
	}

	public void setTask_priority(int task_priority) {
		this.task_priority = task_priority;
	}

	public String getTask_status() {
		return task_status;
	}

	public void setTask_status(String task_status) {
		this.task_status = task_status;
	}
	
	public static void deleteTask(int taskId) {
		tasks.remove(taskId);
	}

	@Override
	public String toString() {
		return "\n\tTarea Nro: " + task_id
				+ "\n\t" + task_title + ": "
				+ "\n\tDescripcion tarea: " + task_description 
				+ "\n\tEstado tarea: " + task_status 
				+ "\n\tFecha tarea: " +  task_date
				+ "\n\tPrioridad tarea: " + task_priority;
	}
	
	

}
