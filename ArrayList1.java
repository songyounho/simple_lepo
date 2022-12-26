package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5)); // ��ü ���� ���
		list1.add(new Integer(4)); // ��ü ���� ���
		list1.add(new Integer(2)); // ��ü ���� ���
		list1.add(new Integer(0)); // ��ü ���� ���
		list1.add(new Integer(1)); // ��ü ���� ���
		list1.add(new Integer(3)); // ��ü ���� ���
		
		// subList() : arrayList���� �Ϻθ� �̾Ƽ� ���ο� �迭�� ����
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		print(list1, list2);

		// Collection : �������̽� / Collections : ��ƿ Ŭ����
		// ��������
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1, list2);
		// ��������
		Collections.reverse(list1);
		
		print(list1, list2);
		// containsAll() : ����Ұ� ��� ���ԵǾ��ִ��� Ȯ���ϴ¹�
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
	
		// add() : ������ �߰�. ��ġ(�ε���)�� ��������
		list1.add("B");
		list1.add("C");
		list2.add("B");
		list2.add("C");
		
		list2.add(3,"A");
		print(list1, list2);
		
		 // set() : �ش���ġ(�ε���)�� �ִ� ������ ����
		list2.set(3, "AA");
		print(list1, list2);
		
		// indexOf() : ������ ��ü�� ��ġ(�ε���)�� �˷���
		list1.add(0,"1");
		System.out.println("index = " + list1.indexOf("1"));
		System.out.println("index = " + list1.indexOf(1));
		
		print(list1, list2);
		
		//remove() : �ش� ��ġ�� �ε��� ���� ����

		list1.remove(1);
		list1.remove(new Integer(1));
		print(list1, list2);
		
		// retainAll() : ��ġ�� �κи� ����� �������� ����
		System.out.println("list1.containsAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		//����
//		for (int i=0; i<list2.size(); i++) {
//			list2.remove(i);
//		}
//		print(list1, list2);
		
		// ���������� ����
//		for(int i=list2.size()-1; i>=0; i--) {
//			list2.remove(i);
//		}
//		print(list1, list2);
		
		// list2���� list1�� ��ġ�� �κ��� ����
		for (int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) 
				list2.remove(i);
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);		
	}
}
