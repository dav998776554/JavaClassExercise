import java.sql.*;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		Student student = new Student();
		StudentDAO dao = new StudentDAO();
		System.out.println("�п��  1�G�W�[�ǥ͸��  2�G��ܾǥ͸��");
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
		System.out.println("���}");
	}
	
	private static void add(Student student,Scanner sca, StudentDAO dao) {
		System.out.println("�п�J�ǥͩm�W");
		student.setName(sca.next());
		System.out.println("�п�J�ǥ;Ǹ�");
		student.setSid(sca.next());
		System.out.println("�п�J�ǥͦ�}");
		student.setAddresses(sca.next());
		System.out.println("�п�J�ǥͩʧO");
		student.setSex(sca.next());
		dao.add(student);
	}

}
