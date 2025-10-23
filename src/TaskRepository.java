import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TaskRepository {
	private static final String FILE_NAME = "tasks.json";
	private static final Path FILE_PATH = Paths.get(FILE_NAME);
	
	public void saveTasks (List <Task> tasks) {
		//demarrer la chaine json comme un tableau vide
		StringBuilder jsonBuilder = new StringBuilder();
		jsonBuilder.append("[\n");
		
		//parcourir toutes les taches
		for (int i = 0; i < tasks.size(); i++) {
			Task task = tasks.get(i);
			
			//convertir l'objet Task en son format json (un objet entre accolade {}) 
			jsonBuilder.append(taskToJson(task));
			
			//ajouter une virgule après chaque tâche, sauf la dernière
			if (i < tasks.size() - 1) {
				jsonBuilder.append(",\n");
			} else {
				jsonBuilder.append("\n");
			}
		}
		//fermer le tableau json
		jsonBuilder.append("]");
		
		//ecrire la chaine dans le fichier en gérant les erreurs
		try {
			//la méthode Files.write écrit toute la chaîne dans le fichier
			Files.write(FILE_PATH, jsonBuilder.toString().getBytes());
		} catch (IOException e) {
			System.err.println("Erreur lors de la sauvegarde des tâches : " + e.getMessage());
		}
	}
	
	private String taskToJson(Task task) {
		String jsonString = String.format("""
				{
					"id": %d,
					"description": "%s",
					"status": "%s",
					"createdAt": "%s",
					"updatedAt": "%s"
				}""",
				task.getId(),
				task.getDescription(),
				task.getTaskStatus().name().toLowerCase(), // Utilisation de .name() de l'enum
				task.getCreatedAt().toString(), // toString() pour LocalDateTime donne un format ISO-8601 parfait pour JSON
				task.getUpdatedAt()
				);
		return jsonString;
	}
}







