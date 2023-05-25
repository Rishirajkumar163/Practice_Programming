import java.util.*;

public class ConvertwordtoString {

        static HashMap<String, Integer> numbers= new HashMap<String, Integer>();

        static HashMap<String, Integer> onumbers= new HashMap<String, Integer>();
        static HashMap<String, Integer> tnumbers= new HashMap<String, Integer>();
     static HashMap<String, String> str= new HashMap<String,String >();

        static {
            str.put("maths","M-");
            str.put("science","S-");
            str.put("english","E-");
            str.put("hindi","H-");
            str.put("computer","C-");
        }

        static {
            numbers.put("zero", 0);
            numbers.put("one", 1);
            numbers.put("two", 2);
            numbers.put("three", 3);
            numbers.put("four", 4);
            numbers.put("five", 5);
            numbers.put("six", 6);
            numbers.put("seven", 7);
            numbers.put("eight", 8);
            numbers.put("nine", 9);
            numbers.put("ten", 10);
            numbers.put("eleven", 11);
            numbers.put("twelve", 12);
            numbers.put("thirteen", 13);
            numbers.put("fourteen", 14);
            numbers.put("fifteen", 15);
            numbers.put("sixteen", 16);
            numbers.put("seventeen", 17);
            numbers.put("eighteen", 18);
            numbers.put("nineteen", 19);


            tnumbers.put("twenty", 20);
            tnumbers.put("thirty", 30);
            tnumbers.put("fourty", 40);
            tnumbers.put("fifty", 50);
            tnumbers.put("sixty", 60);
            tnumbers.put("seventy", 70);
            tnumbers.put("eighty", 80);
            tnumbers.put("ninety", 90);

            onumbers.put("hundred", 100);
            onumbers.put("thousand", 1000);
            onumbers.put("million", 1000000);
            onumbers.put("billion", 1000000000);

            //numbers.put("", );
        }

        public static void main(String args[]){
           Scanner scanner=new Scanner(System.in);
           String input1=scanner.nextLine();
            wordToNumber(input1);



        }

        private static void wordToNumber(String input) {
            long sum=0;
            Integer temp=null;
            Integer previous=null;
            String [] splitted= input.toLowerCase().split(" ");

            String s="";
            int count=0;
            for(int i=0;i<splitted.length;i++){

                if( numbers.get(splitted[i])!=null){
                    temp= numbers.get(splitted[i]);
                    count++;
                    if(count==1){
                    System.out.println(s+" "+temp);}

                s="";}

                else if (tnumbers.get(splitted[i])!=null) {
                    temp=tnumbers.get(splitted[i]);
                    if(numbers.get(splitted[i+1])!=null)temp=temp+numbers.get(splitted[i+1]);
                    System.out.println(s+" "+temp); s="";


                } else if (onumbers.get(splitted[i])!=null) {
                    temp=onumbers.get(splitted[i]);
                    System.out.println(temp);

                } else{
                    if(str.containsKey(splitted[i])){
                        s+=str.get(splitted[i]);
                    }else{
                        s=s+splitted[i]+" ";
                    }
                }
            }
        }
}

