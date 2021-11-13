/**
 * @author christinaadanks
 */
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String reverse = "";
        String normal = "";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String[] split = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (s == null || s.trim().isEmpty())  {
            return true;
        }
        for (int i = 0; i < split.length; i++)    {
            sb.append(split[i].trim());  
        }
        normal = sb.toString();
        
        for (int i = normal.length() - 1; i >= 0; i--)  {
            sb2.append(normal.charAt(i));
        }
        reverse = sb2.toString();
        
        if (normal.equalsIgnoreCase(reverse)) {
            return true;
        }
        else    {
            return false;
        }
    }
}
