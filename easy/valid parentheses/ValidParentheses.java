/**
 * @author christinaathecoder
 * runtime: 2ms
 */

class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++)    {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            }
            else if (map.containsValue(c))  {
                if (!stack.empty() && map.get(stack.peek()) == c)   {
                    stack.pop();
                }
                else    {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
