import java.util.Scanner;
	
class Balanced {
    public static void main(String []args) {
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         for (int i = 0; i < n; i++) {
             String expression = s.next();
             Stack evaluate = new Stack();
             boolean isBalanced = true;
             for (int j = 0; j < expression.length(); j++) {
                 evaluate.push(expression.charAt(j));
                 if (evaluate.peek() == '}' || evaluate.peek() == ')' || evaluate.peek() == ']' || evaluate.peek() == '>') {
                     char popfirst = ((Character)evaluate.pop()).charValue();
                     char popsecond = '\0';
                     if (!evaluate.empty()) {
                         popsecond = ((Character)evaluate.pop()).charValue();
                     }
                     else {
                         isBalanced = false; break;
                     }
                     if (!isSameType(popfirst, popsecond)) {
                         isBalanced = false; break;
                     }
                 }
             }
             if (isBalanced && evaluate.empty())
                 System.out.println("YES");
             else
                 System.out.println("NO");
         }
    }

    public static boolean isSameType(char first, char second) {
        if (first == '}' && second == '{') return true;
        if (first == '>' && second == '<') return true;
        if (first == ']' && second == '[') return true;
        if (first == ')' && second == '(') return true;
        return false;
    }
}
