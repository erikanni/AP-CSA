public class beQuiet {
    public int amplitudeChecker (int beQuiet){


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
}
