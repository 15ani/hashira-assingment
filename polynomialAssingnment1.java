import java.math.BigInteger;

public class polynomialAssingnment1 {
    public static void main(String[] args) {
       
        int n = 4;      
        int k = 3;      
        
      
        String[] bases = {
            "10", "2", "10", "4"
        };
        String[] values = {
            "4", "111", "12", "213"
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
