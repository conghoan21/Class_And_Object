
public class SimpleCircle {
        public static void main(String[] args) {
            SimpleCircle circle1 = new SimpleCircle();
            System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
            SimpleCircle circle2 = new SimpleCircle(25);
            System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
            SimpleCircle circle3 = new SimpleCircle(125);
            System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
            circle2.radius = 100;
            System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        }

        double radius;
        // Dựng một đường tròn có bán kính
        SimpleCircle() {
            radius = 1;
        }
        // Dựng một đường tròn có bán kính xác định
        SimpleCircle(double newRadius) {
            radius = newRadius;
        }
        // Trả về diện tích của đường tròn
        double getArea() {
            return radius * radius * Math.PI;
        }
        // Trả về chu vi của đường tròn
        double getPerimeter() {
            return 2 * radius * Math.PI;
        }
        // Đặt bán kính mới cho đường tròn
        void setRadius(double newRadius) {
            radius = newRadius;
        }
    }

