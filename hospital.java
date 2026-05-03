class hospital{
    public static void main(String[] args) {

        int[] ids = {101, 102, 103, 104};

        int search = 103;
        int i;

        for (i = 0; i < ids.length; i++) {
            if (ids[i] == search) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Not Found");
    }
}