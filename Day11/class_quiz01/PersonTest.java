package class_quiz01;

public class PersonTest {

	public static void main(String[] args) {
		// TODO: ��ü ���� �� �� �ֱ�
		Person ps = new Person();
		
		ps.name = "������";
		ps.birth = "19961108";
		ps.sex = "����";

		// �޼ҵ� ȣ��
		ps.sayHello();
		ps.walking();
		ps.introducceMyself();
		ps.tellAge();
	}

}
