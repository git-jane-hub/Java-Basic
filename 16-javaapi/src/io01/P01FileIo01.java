package io01;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
// 이거 안됨
public class P01FileIo01 {
	public static void main(String[] args) throws IOException {
		/* 외부에 텍스트 파일을 만들기 위해서 FileOutputStream을 사용
		 * 변수를 만들고 파일 경로를 작성
		 * main메서들에 반드시 throws IOException을 작성해야함
		 */
//		FileOutputStream output = new FileOutputStream("c:/io/test.txt");
		
		// 간편한 사용을 위해 FileOutputStream 자료형 대신 DileWriter 자료형 사용
		FileWriter output = new FileWriter("c:/io/test.txt");
		
		/* .write("내용") 으로 메모장 내부에 작성가능
		 * 단 줄바꿈이 자동으로 작성되지 않기 때문에 줄바꿈이 필요한 부분에 \n을 작성
		 */
		output.write("작성 내용");
		output.write("작성 내용 추가");
		
	}
}
