package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CapitalTest {
	// final: �ѹ��� �ʱ�ȭ �ϵ��� �ϴ� ��. �ʱ�ȭ �Ҷ� ���� �ٷ� �ȳ־��൵ ��. static������ ���� �־������.
	// 1. ����: ������ ���̸� �ѹ� �ʱ�ȭ�� ������ ���� ���Ҵ� �Ұ�
	// 2. �޼ҵ�: �������̵� �Ұ�. �θ����� ��ӹ����� �籸�� �Ұ�.
	// 3. Ŭ����: ��� �Ұ�
    public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("���ѹα�", "����");
            put("����ũ", "�����ϰ�");
            put("����", "������");
            put("���þ�", "��ũ��");
            put("���⿡", "���");
            put("�����", "���������");
            put("������", "����Ȧ��");
            put("������", "����");
            put("������", "���帮��");
            put("�Ƹ���Ƽ��", "�ο��뽺���̷���");
            put("����Ʈ", "ī�̷�");
            put("�̶�", "�����");
            put("��Ż����", "�θ�");
            put("�Ϻ�", "����");
            put("�ʸ���", "���Ҷ�");
            put("�ɶ���", "���Ű");
            put("������", "�ĸ�");
            put("��Ű", "��ī��");
            put("ĳ����", "��Ÿ��");
            put("�ݷҺ��", "����Ÿ");
        }
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys); // �����̸� List�� index�� ���� �� ��
        
        // TODO: �����ϱ�
        // �ߺ� �˻縦 ���� - randIndex �����丮 ����Ʈ 
        List<Integer> quizIndex = new ArrayList<>();
        
        int score = 0;
        for (int i = 0; i < 5; i++) {
        	// ������ ����.
        	// ���� Ŭ�������� �ε��� ���� ���ڸ� �̾Ƽ� �� ����� ������ ����.
        	int randIndex = rand.nextInt(20);
        	
        	// �ߺ� �˻�
        	if (quizIndex.contains(randIndex)) {
        		i--; // �ߺ��̸� �ٽõ���.
        		continue;
        	}
        	
        	quizIndex.add(randIndex); // �´� ������ �ε��� ���� - �ߺ� �˻縦 ���ؼ�
        	
        	String capitalKey = keyList.get(randIndex);
        	System.out.print(capitalKey + "�� ���� �̸���? : ");
        	
        	// �Է��� �޴´�.
        	String answer = scan.next();
        	
        	// �Է� ���� ���� ���� ���Ѵ�.
        	if (capitalMap.get(capitalKey).equals(answer)) {
        		System.out.println("����");
        		score += 20;
        	} else {
        		System.out.println("Ʋ�Ƚ��ϴ�.");
        	}
        }
        
        System.out.println("�� ������ : " + score);
        
        scan.close();
    }
}







