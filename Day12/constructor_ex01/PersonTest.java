package constructor_ex01;

public class PersonTest {

	public static void main(String[] args) {
		// TODO: ��ü ���� �� �� �ֱ�
		Person p1 = new Person("�ٴ�", "20190126", "����");
//		p1.name = "������";
//		p1.birth = "19961108";
//		p1.sex = "����";
//		p1.setName("������");
//		p1.setBirth("19961108");
//		p1.setSex("����");
		
		System.out.println(p1.getName());
		System.out.println(p1.getBirth());
		System.out.println(p1.getSex());
		System.out.println();

		// �޼ҵ� ȣ��
		p1.sayHello();
		p1.walking();
		p1.introducceMyself();
		p1.tellAge();
	}

}
