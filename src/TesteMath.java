import java.text.DecimalFormat;
public class TesteMath {
    public static void main(String[] args) {
        double n1 = 2.6547898;
        double n2 = 3.4234567;
        System.out.println("------------Math.round-------------");
        System.out.println(Math.round(n1));
        System.out.println(Math.round(n2));
        System.out.println("------------Math.rint-------------");
        System.out.println(Math.rint(n1));
        System.out.println(Math.rint(n2));
        System.out.println("------------Math.ceil-------------");
        System.out.println(Math.ceil(n1));
        System.out.println(Math.ceil(n2));
        System.out.println("------------Math.floor------------");
        System.out.println(Math.floor(n1));
        System.out.println(Math.floor(n2));
        System.out.println("-----------------------------");
        System.out.println("Math.min(n1, n2) = " + Math.min(n1, n2));
        System.out.println("Math.max(n1, n2) = " + Math.max(n1, n2));
        System.out.println("------------------------");
        double n3 = 25;
        System.out.println("Math.sqrt(n3) = " + Math.sqrt(n3));
        System.out.println("Math.pow(n3, 2) = " + Math.pow(n3, 2));
        System.out.println("Math.random() = " + Math.random());
        int numero = (int)(Math.random() * 100);
        System.out.println("Número: " + numero);
        System.out.println("---------------------------------");
        n1 = 10520.12387984546;
        double n4 = 0.123556789;
        double n5 = 0;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n4=" + n4);
        System.out.println("n5=" + n5);
        System.out.println("---------------------------");
        DecimalFormat df = new DecimalFormat();
        System.out.println(df.format(n1));
        System.out.println(df.format(n2));
        System.out.println(df.format(n4));
        System.out.println(df.format(n5));
        System.out.println("---------------------------");
        DecimalFormat df2 = new DecimalFormat(",##0.00");
        System.out.println(df2.format(n1));
        System.out.println(df2.format(n2));
        System.out.println(df2.format(n4));
        System.out.println(df2.format(n5));
    }
}
