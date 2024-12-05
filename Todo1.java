package pProjetJava;
import java.util.ArrayList;

public class Todo {
	private Long id;
	private String description;
	private Boolean termine;
	
	public Todo(Long id, String description, Boolean termine) {
		this.id = id;
		this.description = description;
		this.termine = termine;
	}
	
	public Long getId() {
		return id;
		
	}
	public String getDescription() {
		return description;
	}
	public Boolean getTermine() {
		return termine;
	}
	
	public void setTerminer(Boolean termine) {
		this.termine = termine;
	}
	
	public void affichage() {
		System.out.println("Id : " + this.getId() + " Description : " +  this.getDescription() + " Description : " + this.getTermine());
		
	}
	
}


