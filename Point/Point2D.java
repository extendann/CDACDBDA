package Point;

public class Point2D {
//Cinstructor for Class 
	int x,y;
	Point2D (int x, int y)
{
	this.x = x;
	this.y =y;
}
//string commened
public String show()
{
	return ("("+this.x+" "+this.y+" )");
}
public boolean isEqual(Point2D p2)
{
return this.x==p2.x && this.y == p2.y;
}

public double calcDistance(Point2D p2)
{
	return Math.sqrt(Math.pow(p2.x-this.x,2)+Math.pow(p2.y-this.y,2)); 
}
}

