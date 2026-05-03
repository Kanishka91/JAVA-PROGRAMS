class stringbuild{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("");
        System.out.println(sb);
        char ch[] = {'k','a','n','i'};
        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}