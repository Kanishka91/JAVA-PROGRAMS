import java.util.Scanner;

class expense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        expenseTracker x = new expenseTracker();
        expenseTracker.expense obj = x.new expense();

        obj.addExpense(sc, 0);
    }
}

class expenseTracker {

    class expense {
        void addExpense(Scanner sc, double total) {
            System.out.print("Enter expense name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            int price = sc.nextInt();
            sc.nextLine();  

            total += price;

            System.out.print("Enter 1 to continue or 0 to stop: ");
            int choice = sc.nextInt();
            sc.nextLine();  

            if (choice == 1) {
                addExpense(sc, total); 
            } else {
                System.out.println("Total Expense: " + total);
                System.out.println("Thank you for using Expense Tracker");
            }
        }
    }
}