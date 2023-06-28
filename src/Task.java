import java.util.Date;

public class Task {
	private String task_title;
	private String task_description;
	private String task_status;
	private Date task_date;
	private int task_priority;

	public Task() {
		this.task_date = new Date();
		this.task_status = "Pending";
		this.task_priority = 0;
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

}
