import java.math.BigInteger;

public class PolynomialAssignment {
    public static void main(String[] args) {
       
        int n = 10;

        int k = 7; 
        
      
        String[] bases = {
            "6", "15", "15", "16", "8", "3", "3", "6", "12", "7"
        };
        String[] values = {
            "13444211440455345511",
            "aed7015a346d635",
            "6aeeb69631c227c",
            "e1b5e05623d881f",
            "316034514573652620673",
            "2122212201122002221120200210011020220200",
            "20120221122211000100210021102001201112121",
            "20220554335330240002224253",
            "45153788322a1255483",
            "1101613130313526312514143"
        };

     
        System.out.println("n (total roots): " + n);
        System.out.println("k (minimum required roots): " + k);
        System.out.println("Use first k roots for coefficient calculations.\n");

        
        for (int i = 0; i < k; i++) {
            BigInteger rootValue = new BigInteger(values[i], Integer.parseInt(bases[i]));
            System.out.println("Root " + (i + 1) + " (base " + bases[i] + "): " + values[i] + " -> " + rootValue.toString());
        }
    }
}
