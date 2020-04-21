package point;

public class PointTest {
	
	public static void main(String[] args) {
		
		Point p = new Point();
		
		Point p1 = new Point();
		System.out.println(p1.toString());
		
		Point p2 = new Point(4,8); 
		System.out.println(p2.toString());
		
		Point p3 = new Point(0,0);
		System.out.println(p3.toString());
		
		//static 메서드로 거리구하기
		System.out.println(Point.getDistance(p1, p2));
		
		//일반 메서드로 거리구하기
		System.out.println(p2.getDistance(p3));
		
		
		// p와 p1이 같은가 (x값과 y값이 같은가) 
		System.out.println(p3.equals(p1));
		
		
		//Point3D 테스트 
		Point3D t = new Point3D(9,9,7);
		System.out.println(t.toString());
		
	}
	

}
