package pTodo;

public class Main {

	public static void main(String[] args) {
		GestionTodo.GestionTodo1 gestionTodo = new GestionTodo().new GestionTodo1();
		
		gestionTodo.new Todo(gestionTodo.list().size() + 1, "Terminer le projet", true);
		
		System.out.println("Affichage : ");
        for (GestionTodo.GestionTodo1.Todo todo : gestionTodo.list()) {
            System.out.println(todo.afficher());
        }
        
        

	}

}
