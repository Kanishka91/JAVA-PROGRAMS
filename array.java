class array{
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = new int[5];

        System.arraycopy(a, 0, b, 0,5);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        // b=Arrays.copyOf(a,3);
        // for(int i=0;i<b.length;i++){
        //     System.out.println(b[i]);
        // }
    }
}