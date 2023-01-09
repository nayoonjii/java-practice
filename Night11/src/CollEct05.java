import java.util.Vector;

/* 벡터 원소값 검색과 삭제 실습 
 */
public class CollEct05 {
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		double[] arr = new double[] {38.6,9.2,45.3,6.1,4.7,1.6};// new double[]은 생략가능하다.
		
		for(int i = 0; i<arr.length; i++) {
			vec.add(arr[i]);
		}//배열원소값을 백터컬렉션에 추가
		
		System.out.println("\n >> 벡터 원소값 출력 << ");
		for(int i = 0; i<vec.size();i++) {
			System.out.print(" "+vec.get(i));
		}
		System.out.println();//줄바꿈
		
		double findData = 6.1;//검색할 값을 저장
		int index = vec.indexOf(findData);//주어진 인자값을 벡터로부터 검색해서 주소 인덱스 번호를 반환. 반환값이 -1이면
		//해당 원소가 없다라는 뜻. 첫번쨰 원소값은 0부터 카운터
		
		if(index != -1) {
			System.out.println("\n 검색성공: "+index);//3
		}else {
			System.out.println("\n 검색 실패");
		}
		
		double delData = 45.3;//삭제할 값 저장
		if(vec.contains(delData)) {//벡터에 해당 원소값이 있다면 참 contains():대상 문자열에 특정 문자열이 포함되어 있는지 확인
			vec.remove(delData);//해당원소값 삭제
			System.out.println("\n 삭제완료");
		}
		
		System.out.println("\n >> 전체 원소값 출력 <<");
		for(int a = 0; a<vec.size();a++) {
			System.out.print(" "+vec.get(a));
		}

	}

}
