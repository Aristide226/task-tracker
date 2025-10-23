import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class TaskTrackerCLI {
	public static void main(String[] args) {
		
		if (args.length == 0) {
			printUsage();
			return ;
		}
		
		String command = args[0];
		
		switch(command.toLowerCase()) {
		case "add":
			handleAddCommand(args);
			break;
		case "list":
			break;
		case "update":
			break;
		case "delete":
			break;
		case "mark-done":
			break;
		case "mark-in-progress":
			break;
		default :
			System.err.println("Erreur : commande inconnue :"+command);
			printUsage();
			break;
		}
	}
	
	private static void printUsage() {
		System.out.println("\n Task Tracker CLI - Guide d'utilisation");
		System.out.println("-------------------------------------");
		System.out.println("Utilisation : task-cli <commande> [argument]");
		System.out.println("\nCOMMANDES :");
		System.out.println("add \"description\"....................Ajoute une nouvelle tâche.");
		System.out.println("list [status]..........................Liste de toutes les tâches.Status optionnels : done, todo, in-progress.");
		System.out.println("update <id> \"nouvelle description\"...Met à jour la description d'une tâche.");
		System.out.println("delete <id>............................Supprime une tâche par ID.");
		System.out.println("mark-done <id>.........................Marque une tâche comme 'done'.");
		System.out.println("mark-in-progress <id>..................Marque une tâche comme 'in-progress'.");
		System.out.println("-------------------------------------");
	}
	
	private static void handleAddCommand(String [] args) {
		if(args.length < 2) {
			System.err.println("Erreur: la commande 'add' nécessite une description");
			printUsage();
			return;
		}
		
		String description = args[1];
		System.out.println("Tâche à ajouter : "+description);
		
		// TaskManager manager = new TaskManager();
	    // manager.addTask(description);
	}
}
