package point;

public class Point {
	
	int x; // this.x - iv
	int y; // this.y - iv
	
	public Point() {
		this(1,1);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override // toString : 객체(x,y)를 문자열로 
	public String toString() {
		return "x = "+ x + ", y = "+y;
	}
	
	//static 메서드로 거리구하기
	public static double getDistance(Point p1, Point p2) {
		
		double a = Math.abs(p1.x-p2.x);
		double b = Math.abs(p1.y-p2.y);
		
		double d = Math.sqrt(a*a + b*b);
		return d;
	}
	
	// 일반 메서드로 거리구하기
	public double getDistance(Point p) {
		return Point.getDistance(this,p);
	}
	
	@Override
	public boolean equals(Object obj) {

		if(!(this instanceof Point)) {
			return false;
		} 
		
		Point p = (Point)obj;
		if(p.x == this.x && p.y == this.y) {
			return true;
		}
		return false;
	}
}
