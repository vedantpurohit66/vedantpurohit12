package arrays;

public class differenceString {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            sum = sum + t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            sum = sum - s.charAt(i);
        }
        return (char) sum;
    }

    public static void main(String[] args) {
        String s1="abcd";
        String s2="abcde";
        differenceString d=new differenceString();
       char ch= d.findTheDifference(s1,s2);
        System.out.println(ch);

    }

}
