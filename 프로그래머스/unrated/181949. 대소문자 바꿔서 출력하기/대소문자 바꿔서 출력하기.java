
import java.util.Scanner;

public class Solution  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 사용 값 받기
		String a = sc.next(); //a string 값 저장
		String answer = "";  //answer str형 미리 만들어두기
		
		for(int i = 0;i< a.length();i++){ //받은 값 만큼 반복
			char c = a.charAt(i);			//문자열 받음 만큼 나눠서 c에 임시 저장
			if(Character.isUpperCase(c)) {	//c에 저장된 문자 대문자가 True 라면 
				answer += Character.toLowerCase(c);//소문자로 만들어서 answer에 +=로(추가로) 집어넣기
				
			}else {
				answer += Character.toUpperCase(c); //아니라면 그냥 집어넣기
			}
		}
		System.out.println(answer);
		
		
		
	}

}
