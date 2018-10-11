//immutable point class:
public class Point{
    private double x,y;
    
//constructor takes one value per instance variable
    public Point(double X, double Y){
        x=X;
        y=Y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }

//constructor takes an other point to copy
    public Point(Point p){
        x = p.x;
        y = p.y;
    }

//method that returns a new copy of 'this'
    public Point copy(){
        return new Point(this); //this.x and this.y OR x and y
    }

    public static double distance(Point a, Point b){
        return Math.sqrt(((a.getX() - b.getX()) * (a.getX() - b.getX())) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
    }
    
    public String toString(){
        return "(" + this.getX() + "," + this.getY() + ")" ;
    }
}
