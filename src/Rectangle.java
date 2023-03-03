public class Rectangle {
    public static void main(String[] args) {

        int width = 1;
        int length = 2;
        int circumference = calculateCircumference(width, length);
        int area = calculateArea(width, length);

        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);

    }

    public static int calculateCircumference(int width, int length) {
        return 2 * width + 2 * length;
    }

    public static int calculateArea (int width, int length) {
        return width * length;
    }
}
