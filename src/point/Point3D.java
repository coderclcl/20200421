package point;

public class Point3D extends Point {
	
	int z;
	
	public Point3D() {
		this(1,1,1);
	}
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "x= "+x+", y= "+y+", z= "+z;
	}
	
	
	
	

}
