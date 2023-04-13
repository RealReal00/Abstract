public class Main {
    public static void main(String[] args){
        /*Shape s = new Star();
        Shape c = new Circle();*/
        Shape[] vett = new Shape[2];
        vett[0]= new Star();
        vett[1] = new Circle();
        for(Shape forma : vett){
            disegna(forma);

        }

    }
    public static void disegna(Shape shape){
        shape.draw();
    }
}
