public class BracketBalancerChecker {
    public boolean isBalaned(String input){
        if (input.length()%2== 1) {
            return false;
        }
        CharStack stack = new CharStack();
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()){
                return false;
            }else if((c == ')') && (stack.pop() != '(')) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
