import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            
            if(c >= 'A' && c <= 'Z'){
                result += (char)(c - 'A' + 'a');
            }
                else if(c >= 'a' && c <= 'z'){
                    result += (char)(c - 'a' + 'A');
            }
        }
        System.out.println(result);
    }
}