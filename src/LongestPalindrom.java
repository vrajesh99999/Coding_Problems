public class LongestPalindrom {

    public static void FindPalindrom(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                StringBuilder reverse = new StringBuilder(s.substring(i,j));
                reverse=reverse.reverse();
                boolean b = s.substring(i,j).equals(reverse.toString());
                System.out.println(b);
            }
        }
    }

    public static void main(String args[]){
        FindPalindrom("wenavjvanwe");
    }
}
// write manacher algorithm