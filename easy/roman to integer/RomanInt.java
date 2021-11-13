/**
 * @author christinaadanks
 * runtime: 4ms
 */

class RomanInt {
    public int romanToInt(String s) {
        int total = 0;
        int add = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++)    {
            char c = s.charAt(i);
            if (i + 1 < s.length() && map.get(c) < map.get(s.charAt(i + 1)))  {
                add = map.get(s.charAt(i + 1)) - map.get(c);
                total += add;
                i++;
            }
            else    {
                total += map.get(c);
            }
        }
        return total;
    }
}
