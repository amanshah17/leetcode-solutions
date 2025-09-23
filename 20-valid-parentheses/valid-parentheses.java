class Solution {
    public boolean isValid(String s) {
        String opening = "([{";
        String closing = ")]}";
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(opening.indexOf(ch) >= 0){
                st.push(ch);
            }else if(closing.indexOf(ch) >= 0){
                if(st.isEmpty()){
                    return false;
                }else if(closing.indexOf(ch) != opening.indexOf(st.pop())){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}