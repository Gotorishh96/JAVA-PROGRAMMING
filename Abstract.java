 abstract class Solid {
    abstract void Volume();
    double v;
}

class Cylinder extends Solid {
    double radius;
    double height;
    Cylinder(double r,double h) {
         radius = r;
         height = h;
    }
    @Override
        void Volume() {
        v = Math.PI * radius * radius * height;
        System.out.println("The Volume Of Cylinder= "+ v); 
    }
}
class Sphere extends Solid {
    double radius;
    Sphere(double r1) {
         radius = r1;
    }
    @Override
    void Volume() {
         v = 1.33 * Math.PI * (radius*radius*radius);
        System.out.println("The Volume Of the Sphere= "+ v);
    }
}
public class Abstract {
    public static void main(String[] args) {
        Solid ss;
        Cylinder cn = new Cylinder(6,8);
        Sphere sh = new Sphere(5);
        ss =cn;
        ss.Volume();
        ss =sh;
        ss.Volume();
    }
}
