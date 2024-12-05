package pProjetJava;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Todo> todoList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean continuer = true;
        
        while (continuer = true) {
            System.out.println("Donnée n°" + todoList.size());

            System.out.print("Entrez l'ID de la tâche : ");
            Long id = scan.nextLong();
            scan.nextLine();

            System.out.print("Entrez la description de la tâche : ");
            String description = scan.nextLine();  

            System.out.print("Entrer True/False : ");
            Boolean terminer = scan.nextBoolean();
            scan.nextLine();

            todoList.add(new Todo(id, description, terminer));

        
            for (int i = 1; i < todoList.size(); i++) {
                Todo todo = todoList.get(i);
                todo.affichage();
            }

            System.out.print("Voulez-vous continuer ? (oui/non) : ");
            String reponse = scan.nextLine();

            if (reponse.equals("non")) {
                continuer = false;
            }
        }
    }
}
