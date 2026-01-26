public class MathOperations {
    public static void main(String[] args) {
        double x = 41.0;
        
        double xs = Math.sqrt(x);
        System.out.println(xs);
        
        int xc = (int) Math.ceil(xs);
        System.out.println(xc);
        
        int xf = (int) Math.floor(-xs);
        System.out.println(xf);
        
        double xp = Math.pow(x, 3);
        System.out.println(xp);
        
        double maxValue = Math.max(xs, xp);
        System.out.println(maxValue);
    }
}