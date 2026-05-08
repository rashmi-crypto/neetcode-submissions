class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String ch:tokens)
        {
            if(isOperator(ch))
            {
                int a=stack.pop();
                int b=stack.pop();
                int c=calc(a,b,ch);
                stack.push(c);
            }
            else
            {
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
    private boolean isOperator(String ch)
    {
        return (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/"));
    }
    private int calc(int a,int b,String c)
    {
        switch(c)
        {
            case "+":return a+b;
            case "-":return b-a;
            case "*":return a*b;
            case "/":return b/a;
        }
        return 0;
    }
}
