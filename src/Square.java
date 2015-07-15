
public class Square extends Shape{
int edge;
	public Square(int edgeSize){
	super("square");
	assert(edgeSize>0);
	this.edge=edgeSize;
}
/**
 * calculates the area of the square
 */
@Override
public int area() {
	return edge * edge;
}
}
