public class pattern_q {

    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <=a; i++) {
            int num=i;
            for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num=num+a-j;
        }
            System.out.println();
        }
    }
}
