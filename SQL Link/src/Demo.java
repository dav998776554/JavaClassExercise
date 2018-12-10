import java.sql.*;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		Student student = new Student();
		StudentDAO dao = new StudentDAO();
		System.out.println("請選擇  1：增加學生資料  2：顯示學生資料");
		int input = sca.nextInt();
		switch(input) {
		case 1:
			add(student,sca,dao);
			break;
		case 2:
			break;
		default:
			break;
		}
		System.out.println("離開");
	}
	
	private static void add(Student student,Scanner sca, StudentDAO dao) {
		System.out.println("請輸入學生姓名");
		student.setName(sca.next());
		System.out.println("請輸入學生學號");
		student.setSid(sca.next());
		System.out.println("請輸入學生住址");
		student.setAddresses(sca.next());
		System.out.println("請輸入學生性別");
		student.setSex(sca.next());
		dao.add(student);
	}

}
