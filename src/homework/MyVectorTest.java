package homework;
import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class MyVectorTest {
	
	//2차원 배열 arr의 빙고 갯수를 세어서 반환 
	int bingoCheck(int[][] arr) {
		int cnt = 0;
		
		//2차원배열에서 빙고 갯수를 센다 
		
		// 대각선 세기 - i,j 같은 곳만 판단 
		// 가로 세로 세기 - 한줄씩 같은지 판단 
		
		boolean flag1 = true; // 대각선
		boolean flag2 = true; //대각선 반대방향
		for(int i=0; i<arr.length; i++) {
			
			int tmp1 = arr[0][0];
			if(tmp1!=arr[i][i]) flag1 = false;
			
			int tmp2 = arr[0][arr.length-1];
			if(tmp2!=arr[i][arr.length-1-i]) flag2 = false;
			
		}
		if(flag1) cnt++;
		if(flag2) cnt++;
		
		
		for(int i=0; i<arr.length; i++) {
			
			boolean flag3 = true;//세로줄 비교
			boolean flag4 = true;//가로줄 비교
			
			for(int j=0; j<arr[i].length; j++) {
				
				int tmp3 = arr[0][i]; //세로줄 비교
				if(tmp3!=arr[j][i]) flag3 = false;
				
				int tmp4 = arr[i][0];
				if(tmp4!=arr[i][j]) flag4 = false;
			}
			
			if(flag3) cnt++;
			if(flag4) cnt++; 
		}
		
		
		return cnt;
	}
	
	@Test
	public void test1() {
		int [][] arr = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}
		};
	
		assertTrue(bingoCheck(arr)==12);
	}
	
	@Test
	public void test2() {
		int [][] arr = {
				{1,2,1,1,1},
				{1,1,2,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}
		};
		
		assertTrue(bingoCheck(arr)==8);
	}
	
	@Test
	public void test3() {
		int [][] arr = {
				{1,2,2,1,1},
				{1,1,2,1,1},
				{1,1,2,1,1},
				{1,1,2,1,1},
				{1,1,2,1,1}
		};
		
		assertTrue(bingoCheck(arr)==4);
	}
	
	
	@Test
	public void test4() {
		int [][] arr = {
				{1,2,2,1,1},
				{1,1,6,1,1},
				{1,1,2,9,1},
				{1,7,2,1,8},
				{1,1,2,1,1}
		};
		
		assertTrue(bingoCheck(arr)==1);
	}
	
	
	
	
	@Test
	public void test5() {
		int [][] arr = {
				{1,1,1,1,1,1},
				{1,1,1,1,1,1},
				{1,1,1,1,1,1},
				{1,1,1,1,1,1},
				{1,1,1,1,1,1},
				{1,1,1,1,1,1}
		};
		
		assertTrue(bingoCheck(arr)==14);
	}
	
	
	

	@Test
	public void test() {
		Vector v = new Vector();
//		MyVector v = new MyVector();
		
//		v=null;
		for(int i=0; i<1000; i++) {
			v.add(""+i);
		}
		
		System.out.println("capacity="+v.capacity());
		System.out.println(v.size());
		// 괄호() 안의 결과가 true 테스트 통과 
		assertTrue(v.size()==1000);
		
	}

}
