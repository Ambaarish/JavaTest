public class StringTest1 {
    public static void main(String[] args) {
        String a = "Geeks";
        char c = returnChar(a , 3);
        System.out.println(c);
    }
//    public static void returnChar(String a , int index) {
//        String[] s = a.split("");
//        int length = s.length;
//        for(int i=0 ; i<length ; i++) {
//            if(i == index) {
//                System.out.println(s[i]);
//            }
//        }
//    }

    public static char returnChar(String a , int index) {
        return a.charAt(index);
    }
}
