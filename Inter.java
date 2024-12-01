 interface Solid {
  
    public  double calculate_volume();

}

class Cylinder implements Solid {
  final private double radius;
    final private double height;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
@Override
    public double calculate_volume() {
        return Math.PI * radius * radius * height;
    }
}

class Sphere implements Solid {
    final private double radius;

    public Sphere(double r1) {
        radius = r1;
    }
@Override
    public double calculate_volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

  public class Inter {
    public static void main(String[] args) {
        Solid ss;
        Cylinder cy = new Cylinder(5, 10);
        ss=cy;
        System.out.println("Cylinder volume: " + ss.calculate_volume());
        
        Sphere sh  = new Sphere(7);

        ss=sh;
        System.out.println("Sphere volume: " + ss.calculate_volume());
    }
}