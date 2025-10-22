import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class TaskCrudServiceImpl implements TaskCrudService {
	
	TaskProperties task = new TaskProperties();
	
	@Override
	public TaskProperties add(TaskProperties taskProperties) {
		task.setId(taskProperties.getId());
		task.setDescription(taskProperties.getDescription());
		task.setStatus(taskProperties.getStatus());
		task.setCreatedAt(taskProperties.getCreateAt());
		task.setUpdatedAt(taskProperties.getUpdatedAt());
		return task;
	}
	/*
	@Override
	public List<TaskProperties> getAll() {
		
	}
	
	@Override
	public TaskProperties get(int id) {
		
	}
	
	@Override
	public TaskProperties getById(int id) {
		
	}
	
	@Override
	public TaskProperties delete(int id) {
		
	}
	
	@Override
	public TaskProperties edit(int id,TaskProperties taskProperties) {
		
	}
	*/
}
