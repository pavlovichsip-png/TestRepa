public class Main {
    public static void main(String[] args) {
        ILine line = new Line();
        line.drawLine();
        ICircle circle = new Circle();
        circle.drawCircle();
        IRect rect = new Rect();
        rect.drawRect();
    }
}
