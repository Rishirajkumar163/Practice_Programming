public class Backtracking {

   static void printPermutation(String str,String perm,int indx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curchar=str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newstr,perm+curchar,indx+1);
        }


    }
    public static void main(String[] args) {
        String str = "123";
        printPermutation(str," ",0);

    }

    private static class Array {
    }
}
