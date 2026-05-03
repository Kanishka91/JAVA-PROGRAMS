import java.util.Arrays;

class library{
    public static void main(String[] args) {
    
        int[] bookIds = {105, 101, 109, 103, 102};

        Arrays.sort(bookIds);

        System.out.println("Sorted Book IDs:");
        for (int i = 0; i < bookIds.length; i++) {
            System.out.println(bookIds[i]);
        }
    }
}