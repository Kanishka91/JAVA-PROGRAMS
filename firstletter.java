import java.util.Scanner;

class firstletter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();   

        System.out.println(text.charAt(0));   
    }
}