package com.company;

/**
 * @author christinaathecoder 
 * runtime: 235ms (need better solution)
 */

public class ValidAnagram {
    public static boolean isAnagram (String s, String t)    {
        //base cases
        if (s.length() != t.length())   {
            return false;
        }

        //string builder for removal
        StringBuilder sb = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++)    {
            char c = s.charAt(i);
            String test = Character.toString(c);
            //check if t contains character
            if (t.contains(test))    {
                int x = sb.indexOf(test);

                //remove letter from the string builder
                sb.deleteCharAt(x);
                //also remove from original string
                t = sb.toString();
            }
            else    {
                return false;
            }
        }
        if (sb.toString().length() == 0)    {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main (String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
