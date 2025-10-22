import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		/*
		 List <Integer> operationNums = new ArrayList<>();
		 Collections.addAll(operationNums, 1,2,3,4,5,6);
		 List <Integer> operationNumForCaseOne = new ArrayList<>();
		 Collections.addAll(operationNumForCaseOne, 1,2,3);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue sur Task Tracker.\n Veuillez choisir une operation\n1.Ajouter,Modifier ou Supprimer une tache\n2.Activer une tâche ou mettre fin à une tâche\n3.Lister toutes les taches\n4.Lister toutes les tâches deja faites\n5Lister toutes les tâches qui ne sont pas encore faites\n6Lister les taches en cours\n");
		int operationNums = sc.nextInt();
		
		final TaskCrudService taskCrudService; 
		
		 switch(operationNums) {
		 case 1 :
			 System.out.println("1.Ajouter\n2.Modifier\n3.Supprimer");
			 int operationNumForCaseOne = sc.nextInt();
			 switch(operationNumForCaseOne) {
			 case 1 :
				 System.out.println("Ajouter une tache");
				 break;
			 case 2 :
				 System.out.println("Modifier une tache");
				 break;
			 case 3 :
				 System.out.println("Supprimer une tache");
				 break;
			 default :
				 System.out.println("Veuillez choisir une option valide");
				 break;  
			 }
			 break;
		 case 2 :
			 System.out.println("1.Activer une tache\n2.Mettre fin à une tache\n");
			 int operationNumForCaseTwo = sc.nextInt();
			 switch(operationNumForCaseTwo) {
			 case 1 :
				 System.out.println("Activer une tache");
				 break;
			 case 2 :
				 System.out.println("Mettre fin à une tâche");
				 break;
			 default :
				 System.out.println("Veuillez choisir une option valide");
				 break;
			 }
			 break;
		 case 3 :
			 System.out.println("Lister toutes les taches");
			 break;
		 case 4 :
			 System.out.println("Lister toutes les tâches deja faites");
			 break;
		 case 5 :
			 System.out.println("Lister touts les tâches qui ne sont pas encore faites");
			 break;
		 case 6 :
			 System.out.println("Lister les taches en cours");
			 break;
		  default : 
			  System.out.println("Veuillez choisir une option valide");
		 
		 }
	}
}
