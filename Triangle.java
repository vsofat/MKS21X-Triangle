public class Triangle {
  private Point p0, p1, p2;

// constructor
  public Triangle(Point a, Point b, Point c){
    p0 = a;
    p1 = b;
    p2 = c;
  }
  public Triangle(double aX, double aY, double bX, double bY, double cX, double cY){
    p0 = new Point(aX, aY);
    p1 = new Point(bX, bY);
      p2 = new Point(cX, cY);}
  

  public double getPerimeter(){
      return p0.distanceTo(p1) + p1.distanceTo(p2) + p2.distanceTo(p0);

    // use distance between two points to find distance of side and repeat for all three sides
  }
      
  public Point getVertex(int pt_number){
    if(pt_number == 0){
      return new Point(p0.getX(), p0.getY());
    }
    if(pt_number == 1){
      return new Point(p1.getX(), p1.getY());
    }
    else{
    return new Point(p2.getX(), p2.getY());
    }}
      
  public String toString(){
    return "Triangle: A" + p0.toString() + " B" + p1.toString() + " C" + p2.toString();
  }
      
  public void setVertex(int pt_number, Point newP){
    if(pt_number == 0){
      p0 = newP;
    }
    if(pt_number == 1){
      p1 = newP;
    }
    if(pt_number == 2){
      p2 = newP;
    }
  }

}
