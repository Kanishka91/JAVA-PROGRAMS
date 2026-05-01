import java.util.Scanner;
class day1{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
if(x > 0)
  System.out.print("Positive");
else if(x == 0)
  System.out.print("Zero");
else
  System.out.print("Negative");
} 
}