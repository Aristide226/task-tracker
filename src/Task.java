import java.time.LocalDateTime;
import java.util.Objects;

public class Task {
	private int id;
	private String description;
	private TaskStatus taskStatus;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public Task (int id, String description, TaskStatus taskStatus, LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.id = id;
		this.description = description;
		this.taskStatus = taskStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public int getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public TaskStatus getTaskStatus() {
		return taskStatus;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Task [id= "+ id + ", description= " + description + ", taskStatus=" + taskStatus +", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "] ";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return id == other.id;
	}
	
}

