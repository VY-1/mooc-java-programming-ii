import java.util.Scanner;

public class UserInterface {

   private TodoList todoList;
   private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner){

        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String userInput = this.scanner.nextLine();
            if(userInput.equals("stop")){
                break;
            }
            if(userInput.equals("add")){
                System.out.print("To add: ");
                userInput = this.scanner.nextLine();
                todoList.add(userInput);
            }
            else if(userInput.equals("list")){
                todoList.print();
            }
            else if(userInput.equals("remove")){
                System.out.print("Which one is removed? ");
                int numToRemove = this.scanner.nextInt();
                todoList.remove(numToRemove);
                this.scanner.nextLine();
            }
        }
    }

}
