package base;

/**
 * 	����:��������ʵ��ջ����ջ����ջ�����ջ
 * 
 * @author Administrator
 *
 */
public class StackBasedLinkedList {
	// ����ջ��ָ��
	private Node top = null;

	// ����ջ���
	private static class Node {
		// ջ���������
		private int data;
		// ջ���ָ����
		private Node next;

		// ���캯��
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		// get ��ȡ�����򷽷�
		public int getData() {
			return data;
		}
	}

	/**
	 * 	����:��ջ
	 * 
	 * @param value:Ҫ��ջ������Ԫ��
	 */
	public void push(int value) {
		// ����һ��ջ���
		Node newNode = new Node(value, null);
		// �ж�ջ�Ƿ�Ϊ��
		if (top == null) {
			// ���ջΪ�գ��ͽ���ջ��ֵ��Ϊջ�ĵ�һ��Ԫ��
			top = newNode;
		} else {
			// ������뵽topջ���ǰ����ν�ľ��ǵ������ͷ�巨��
			newNode.next = top;
			top = newNode;
		}
	}

	/**
	 * 	���� : ��ջ
	 * 
	 * @return: -1 Ϊջ��û������
	 */
	public int pop() {
		// ���ջ�����ջ���Ϊnull,ջΪ��
		if (top == null)
			return -1;

		// ����ִ�г�ջ�������ֽ�ջ����������Ԫ�ظ�ֵ�� Value
		int value = top.data;
		// �� top ָ�������ƶ�
		top = top.next;
		// ���س�ջ��ֵ
		return value;
	}

	/**
	 * 	����:���ջ������Ԫ��
	 */
	public void printAll() {
		// ��ջ��ָ�븳ֵ��p
		Node p = top;
		// ѭ������ջ(����������)
		while (p != null) {
			System.out.print(p.data + " ");
			// ָ����һ�����
			p = p.next;
		}
		System.out.println();
	}
}