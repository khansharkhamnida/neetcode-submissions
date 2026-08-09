class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> num = new Stack<>();
        for(String token:tokens){

            if(isOperator(token)){
                int num2 = Integer.parseInt(num.pop());
                int num1 = Integer.parseInt(num.pop());
                int result = 0;
                if(token.equals("+")){
                    result = num1 + num2;
                } else if(token.equals("-")){
                    result = num1 - num2;
                } else if(token.equals("*")){
                    result = num1 * num2;
                } else if(token.equals("/")){
                    result = num1 / num2;
                }
                num.push(Integer.toString(result));
            } else{
                num.push(token);
            }
        }
        return Integer.parseInt(num.peek());
    }
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

}
