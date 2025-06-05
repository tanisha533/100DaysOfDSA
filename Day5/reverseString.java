// to reverse String in Java using Recursion.
public class reverseString {
    
    public static String reversestr(String s){
        if(s==null || s.isEmpty()) return s;

        return reversestr(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {
        String original = "HelloWorld";
        String reversed = reversestr(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
