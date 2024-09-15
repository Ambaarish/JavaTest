public class StringTest2 {
//    public static void main(String[] args) {
//        String a = "Geeks";
//        int index = 3;
//        char ch = 'g';
//        a = a.substring(0,index)+ch+a.substring(index+1);
//        System.out.println(a);
//    }
    public static void main(String[] args) {
        String a = "Geeks";
        int index = 3;
        char ch = 'g';

        StringBuilder builder = new StringBuilder(a);
        builder.setCharAt(index , ch);

        System.out.println(builder);
    }

}
