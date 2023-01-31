public class Cub {
    double width;
    double height;


    public Cub(double w, double h) {
        width = w;
        height = h;

    }

    Cub(double w) {
        width = w;
    }
    double volumee(){
        return width*2;
    }

    double volume(){
    return width*height;
    }

}
