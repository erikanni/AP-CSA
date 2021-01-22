public class beQuiet {
    int beQuiet = 90;
    public static int amplitudeChecker (int beQuiet){
        int count = 0;
        for (int i = 0; i < what.length; i++){
           if (what[i] > beQuiet){
               what[i] = beQuiet;
               count++;
               }
           else if (what[i] < -beQuiet)
           {
           what[i] = -beQuiet;
           count++;
           }       
        }
     return count;
     }
    public static void main()
    {
        int[] what = new int[6];
        int what[] = {100, 100, 50, 75, -100, -200};
        int beQuiet = 90;
        amplitudeChecker(beQuiet);
    }
}

