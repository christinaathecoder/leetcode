/**
 * @author christinaadanks
 */
class Sqrt {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double s = (double)x/2;
        double n;
        do  {
            n = s;
            s = (s + ((double)x/s))/2;
        }
        while   ((n - s) != 0);
        return (int)s;
    }
}
