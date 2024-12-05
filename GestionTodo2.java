package pTodo;

import java.util.ArrayList;
import java.util.List;

public class GestionTodo {
    public class Todo {
        private int id;
        private String description;
        private boolean terminer;

        public Todo(int id, String description, boolean terminer) {
            this.id = id;
            this.description = description;
            this.terminer = terminer;
        }

        public int getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean getterminer() {
            return terminer;
        }

        public void setterminer(boolean terminer) {
            this.terminer = terminer;
        }

        public String afficher() {
            return "Todo [ID: " + id  + ", Description: " + description + "]";
        }
    }


    public class GestionTodo1 {
        private List<Todo> todos;
        private int Id;

        public GestionTodo1() {
            todos = new ArrayList<>();
            Id = 1;
        }
        
        public List<Todo> list() {
            return new ArrayList<>(todos);
        }

        public class Todo {
            private int id;
            private String description;
            private boolean terminer;

            public Todo(int id, String description, boolean terminer) {
                this.id = id;
                this.description = description;
                this.terminer = terminer;
            }

            public int getId() {
                return id;
            }

   
            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public boolean getTerminer() {
                return terminer;
            }

            public void setTerminer(boolean terminer) {
                this.terminer = terminer;
            }

            public void add(int id, String description, boolean terminer) {
                Todo TodoAdd = new Todo(id, description, terminer);
                todos.add(TodoAdd);
                Id = Id + 1;
            }
            
            public boolean delete(int id) {
                for (int i = 0; i < todos.size(); i++) {
                    Todo todoDelete = todos.get(i);
                    if (todoDelete.getId() == id) {
                        todos.remove(i);
                        return true;
                    }
                }
                return false;
            }

            public String afficher() {
                return "Todo [ID: " + id + "Description: " + description + ", Terminé: " + terminer + "]";
            }
        }
    }


}


