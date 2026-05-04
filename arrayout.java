class arrayout{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try {
            arr[8]=8;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}