package Exercise3;

public class Square {
    private double edge;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public void displayEdge() {
        System.out.println("Edge = " + this.edge);
    }

    public void displayPerimeter() {
        System.out.println("Perimeter = " + this.edge * 4);
    }

    public void displayArea() {
        System.out.println("Area = " + Math.pow(this.edge, 2.0));
    }

    public void displayInfo() {
        displayEdge();
        displayPerimeter();
        displayArea();
    }
}
