package mathematics;

public class Numbers {
    public static void main(String[] args) {


        Triangle triangle = new Triangle();

        int a = 3;
        int b = 4;

        double c = triangle.hypo(a, b);

        System.out.println("Hypotenusan är " + c);
    }
}
