class LCP {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder("");
        int len = strs.length;
        Arrays.sort(strs);
        if (strs.length == 0)   {
            return prefix.toString();
        }
        int min = Math.min(strs[0].length(), strs[len - 1].length());
        int i = 0;
        while (i < min && strs[0].charAt(i) == strs[len - 1].charAt(i)) {
            prefix.append(strs[0].charAt(i));
            i++;
        }
        return prefix.toString();   
    }
}
