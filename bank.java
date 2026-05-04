import java.util.Scanner;
class bank{
    public static void main(String[] args){
        int pin_no=1905;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your pin: ");
        int pin=sc.nextInt();
        sample o = new sample();
        if(pin_no == pin){
            System.out.println("1.Check balance\n2.Deposit amount\n3.Exit");
            System.out.println("Enter your choice: (1/2/3)");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println(o.getBalance());
            }
            else if(choice==2){
                System.out.println("Enter the amount to be deposited: ");
                double amt = sc.nextDouble();
                o.deposit(amt);
            }
            else if(choice==3){
                System.out.println("Exiting... Thank you!");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else{
            System.out.println("Incorrect Pin!!");
        }
    }
}

class sample{
    private double balance = 5000.00;
    double getBalance(){
        return balance;
    }
    void deposit(double amount){
        balance+=amount;
    }
}