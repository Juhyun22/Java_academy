package class_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO: stu1 ��ü ���� �� �� �ֱ� �����ϱ�
		// ���� �ǽ�
		StudentData stu1 = new StudentData();
		stu1.name = "���缮";
		stu1.age = 21;
		stu1.className = "java";
		stu1.phoneNumber = "01023453223";
		
        // ����� ���
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.className);
        System.out.println(stu1.phoneNumber);
        stu1.isAdult();

        System.out.println();

        // TODO: stu2 ��ü ���� �� �� �ֱ� �����ϱ�
        StudentData stu2 = new StudentData();
        stu2.name = "��ȿ��";
		stu2.age = 17;
		stu2.className = "java";
		stu2.phoneNumber = "01096482734";

        // ����� ���
        System.out.println(stu2.name);
        System.out.println(stu2.age);
        System.out.println(stu2.className);
        System.out.println(stu2.phoneNumber);
        stu2.isAdult();
	}

}
