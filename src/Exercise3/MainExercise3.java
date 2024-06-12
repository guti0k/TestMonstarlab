package Exercise3;

public class MainExercise3 {
    public static void main(String[] args) {
        Square square = new Square(2);

        square.displayEdge();
        square.displayPerimeter();
        square.displayArea();

        System.out.println("---- Display info ----");
        square.displayInfo();
    }
}
