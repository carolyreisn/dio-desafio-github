public class P1E05 {

    public static void main (String [] args) {
        double pp = 1.2;
        double pg = 3.0;
        double dg = 40.0;
        double dp = 12.0;
        double pm = (pp+pg)/2;
        double QqtdLitros = dg * dp * pm * 785.0;
        System.out.println("Serão necessários " + QqtdLitros + " litros");

    }
    
}
