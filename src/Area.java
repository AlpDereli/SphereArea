import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        float f1 = take.nextFloat();
        System.out.println("Please enter the center angle: ");
        float f2 = take.nextFloat();
        float area = (3.14f*(f1*f1)*f2)/360;
        System.out.println("Area: " + area);
        System.out.println(":)");
    }
}
