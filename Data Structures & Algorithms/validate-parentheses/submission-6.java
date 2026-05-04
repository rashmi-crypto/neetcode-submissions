class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        if(s.length()%2!=0)
        return false;
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                if(stack.isEmpty())
                return false;
                int ch=stack.pop();
                if(ch!=map.get(c))
                return false;
            }
            else
            stack.push(c);
        }
        return stack.isEmpty();
    }
}
