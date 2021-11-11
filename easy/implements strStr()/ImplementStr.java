class ImplementStr {
    public int strStr(String haystack, String needle) {
        int count = 0;
        if (haystack.equals("") && needle.equals("") || needle.equals(""))    {
            return 0;
        }
        if (needle.length() > haystack.length())    {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int start = 0;
            if (haystack.charAt(i) == needle.charAt(0)) {
                int len = i + needle.length();
                if (len > haystack.length())    {
                    return -1;
                }
                else if (haystack.substring(i, len).equals(needle))  {
                    return i;
                }
            }
        }
        return -1;
    }
}
