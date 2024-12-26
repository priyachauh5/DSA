public class subset{
    public static void subsets(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        //choice yes
        subsets(str, ans+str.charAt(i), i+1);
        //choice no
        subsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str="abc";
        subsets(str, "", 0);
    }
}