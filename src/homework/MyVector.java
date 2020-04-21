package homework;

import java.util.Arrays;

//Vector 를 따라하는 클래스이다. 테스트하면서 똑같이 가다듬을 것 
public class MyVector {
	
	
	Object[] objArr;
	
	int size;
	
	public MyVector() {
		this(16);
	}
	
	public MyVector(int capacity) {
		objArr = new Object[capacity];
	}
	
	// size 의 값을 반환
	public int size() {
		return size;
	}
	
	//배열의 길이를 반환
	public int capacity() {
		return objArr.length;
	}
	
	//객체배열이 비었는지 확인
	public boolean isEmpty() {
		if(size()==0) return true;
		return false;
	}
	
	//객체를 추가하는 메서드
	public void add(Object obj) {
		objArr[size++] = obj;
	}
	
	//objArr의 index번째 객체를 반환
	public Object get(int index) {
		return this.objArr[index];
	}
	
	@Override
	public String toString() {
		return "objArr=" + Arrays.toString(objArr) ;
	}

	// 저장되어 있는 위치를 반환
	public int indexOf(Object obj) {
		int index=0;
		for(int i=0; i<objArr.length; i++) {
			if(obj.equals(objArr[i])) index = i;
		}
		return index;
	}
	
	// 객체 삭제하는 메서드
	public boolean remove(Object obj) {

		
		boolean flag = false;
		int index=-1;
		
		if(obj.equals(objArr[indexOf(obj)])) {
			index = this.indexOf(obj);
			objArr[index] = null;
			size--;
			flag = true;
			
			for(int i=index; i<objArr.length-1; i++) {
				objArr[i] = objArr[i+1];
			}
			
		}
		return flag;
	}
	
	
	
	//테스트용 메인 메서드 
	public static void main(String[] args) {
		
		//isEmpty 테스트 
		MyVector v = new MyVector();
		System.out.println(v.isEmpty()); // true
		System.out.println(v.size()); //0개
		
		v.add(1);
		System.out.println(v.isEmpty()); //false
		System.out.println(v.size()); //1개
		
		//capacity() 테스트
		System.out.println(v.capacity()); // 16
		
		v.add("추가");
		System.out.println(v.get(0)); //1
		System.out.println(v.get(1)); //"추가"
		System.out.println(v.get(2)); //null
		
		System.out.println(v.size()); //2개
		
		v.add("테스트");
		System.out.println(v.size());
		
		System.out.println(v.toString());
		
		System.out.println(v.indexOf("추가"));
		System.out.println(v.indexOf(1));
		
		System.out.println(v.remove("추가"));
		System.out.println(v.remove("타스트"));
		
		System.out.println(v.toString());
		
		
	}
	
	
}
