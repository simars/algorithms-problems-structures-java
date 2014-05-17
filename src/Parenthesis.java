/**
 * User: Simar Paul Singh
 * Date: 30/04/14
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;
class Parenthesis {

    public static void main(final String ... args) {
        System.out.println(solution("{[()()]}")) ;
    }

    public static int solution(String S) {
        if(null == S || S.isEmpty()) {
            return 1;
        }
        final Map<Character, Character> map = new HashMap<Character,Character>();
            map.put('{','}');
            map.put('(',')');
            map.put('[',']');

        final Stack<Character> stack = new Stack<Character>();
        // stack.push(S.charAt(0));
        for(int i=0; i < S.length(); i++) {
            final Character  next = S.charAt(i);
            final Character dual = map.get(next);
            if(null == dual)
            {// closing brace
                if(stack.isEmpty() )
                {
                    return 0;
                }
                final Character open = stack.pop();
                final Character close = map.get(open);
                if(null == close) {
                    return 0;
                } else if (!close.equals(next)) {
                    return 0;
                }
            } else {
                stack.push(next);
            }
        }
        if(stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}