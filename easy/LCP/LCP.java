/**
 * @author christinaathecoder
 * runtime: 1ms
 */

class LCP {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder("");
        int len = strs.length;
        
        //sort array first
        Arrays.sort(strs);
        if (strs.length == 0)   { //if empty, return string
            return prefix.toString();
        }
        
        //find minimum string length
        int min = Math.min(strs[0].length(), strs[len - 1].length());
        
        int i = 0;
        while (i < min && strs[0].charAt(i) == strs[len - 1].charAt(i)) {
            prefix.append(strs[0].charAt(i));
            i++;
        }
        return prefix.toString();   
    }
}
