package parser;

public class ParsingABooleanExpression1106 {
    public boolean parseBoolExpr(String expression) {
        return parse(expression, 0, expression.length());
    }

    private boolean parse(String s, int left, int right) {
        char c = s.charAt(left);
        if(right - left == 1) return c == 't';
        boolean ans = c == '&'; //the variable needs to initiated,    false&true = false, =>set ans = true
        for(int i = left +2, start = i, level = 0; i < right; i++){
            char d = s.charAt(i);
            // 使用逗号来分割，因为逗号与逗号之间可能是boolean， 也可能是一个表达式，而）是当前最外层的，也是最后面的），最后一个元素需要用）来分割
            if(level == 0 && ( d == ',' || d == ')')){  // 找到下一个sub
                boolean cur = parse(s,start,i);  //
                start = i+1;
                if(c == '&') ans &= cur;
                else if(c == '|') ans |=cur;
                else if(c == '!') ans  =!cur; //只有一个，不用考虑ans

            }
            if(d == '(') level ++;
            if(d == ')') level --;
        }
        return ans;

    }
}
