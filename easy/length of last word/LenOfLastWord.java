/**
 * @author christinaadanks
 */
class LenOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s");
        int end = arr.length - 1;
        return arr[end].length();   
    }
}
