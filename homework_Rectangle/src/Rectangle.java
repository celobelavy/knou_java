import java.util.Scanner;
public class Rectangle extends Shape {
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        int result;
        result = calcArea(width, height);
        System.out.println("Rectangle 면적은 : " + result);
    }
    public int calcArea(int width, int height) {
        return width * height;
    }
    public static void main(String[] args) {
        int width, height, x, y;

        Scanner sc = new Scanner(System.in);
        System.out.println("X 좌표 : ");
        x = sc.nextInt();
        System.out.println("Y 좌표 : ");
        y = sc.nextInt();
        System.out.println("width 값 : ");
        width = sc.nextInt();
        System.out.println("height 값 : ");
        height = sc.nextInt();
        Rectangle REC = new Rectangle(x, y, width, height);
    }
}
