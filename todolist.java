import java.util.Scanner;
   // coding for the todo listt
class todolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your task: ");
        String s = sc.nextLine();

        todolist x = new todolist();
        todo obj = x.new todo();  

        obj.list(s);   
    }

    class todo {
        void list(String s) { 
            if (s.isBlank()) {
                System.out.println("Task not entered");
                return;
            } else {
                System.out.println("Your Task: " + s);
            }

            System.out.println("Thank you for entering the task");
        }
    }
}