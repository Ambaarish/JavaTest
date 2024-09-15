public class StringTest3 {
    public static void main(String[] args) {
        String s = "abcdefg";
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        System.out.println(str);
        
    }
//    public static String reverseString(String s) {
//        String rev = "";
//       for(int i=s.length()-1 ; i>=0 ; i--) {
//           rev = rev + s.charAt(i);
//       }
//       return rev;
//    }


}
