import java.util.Scanner;

class todolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        todolist x = new todolist();
        todo obj = x.new todo();

        obj.list(sc);
    }

    class todo {
        void list(Scanner sc) {

            System.out.print("Enter task 1: ");
            String task1 = sc.nextLine();

            System.out.print("Enter task 2: ");
            String task2 = sc.nextLine();

            System.out.print("Enter task 3: ");
            String task3 = sc.nextLine();

            System.out.println("Your To-Do List:");
            System.out.println("1. " + task1);
            System.out.println("2. " + task2);
            System.out.println("3. " + task3);
        }
    }
}