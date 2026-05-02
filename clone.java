
class clone{
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = a.clone();

        // source and destination size must be same to use clone method
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
            //System.out.println(Arrays.toString(b));
        }

        
    }
}