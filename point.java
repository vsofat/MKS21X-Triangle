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
    
//    public Point copy() {
//        return new Point(this);
//    }

//method that returns a new copy of 'this'
    public Point copy(){
        return new Point(this); //this.x and this.y OR x and y
    }

    /*public static double distanceTo(Point a, Point b){
        return Math.sqrt(((a.getX() - b.getX()) * (a.getX() - b.getX())) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
    }
    
    public double distanceTo(Point p){
        return Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
    }
    
    public static double distance(Point a, Point b) {
        return Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y)); */
    
    public double distanceTo(Point other){
        return(Math.sqrt((Math.pow((this.x - other.x), 2)) + (Math.pow((this.y - other.y), 2))));
    }
    public static double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
    }
    public String toString(){
        return "(" + this.getX() + "," + this.getY() + ")" ;
    }
    
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(3,2);
        System.out.println(p1.distanceTo(p2));
    }
    
}
