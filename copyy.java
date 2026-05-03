
import java.util.Arrays;
class copyy{
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = a.clone();

        
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
         System.arraycopy(a, 0, b, 0,5);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        b=Arrays.copyOf(a,3);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        
    }
}