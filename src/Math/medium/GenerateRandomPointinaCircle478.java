package Math.medium;

public class GenerateRandomPointinaCircle478 {
    double r, x, y;

    public GenerateRandomPointinaCircle478(double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;

    }

    public double[] randPoint() {
        double len = Math.sqrt(Math.random()) * r;
        double deg = Math.random() * Math.PI * 2;
        double xx = x + len * Math.cos(deg);
        double yy = y + len * Math.sin(deg);
        return new double[]{xx, yy};
    }
}
