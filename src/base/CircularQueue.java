package base;
/**
 * 
 * @author Administrator
 *	ѭ����������ʱ������Ҫ�������ϱߵĹ��ɵó�������������
 *	��βָ�� + 1��% n = ͷָ�롣��ʱ��ѭ�����л��˷�һ���ռ䡣
 */
public class CircularQueue {
	//����һ�� int ����
	private int[] items;
	private int n;
	
	// ����ͷ��β ָ��
	private int head = 0;
	private int tail = 0;
	
	//��ʼ������
	public CircularQueue(int capacity) {
		items = new  int[capacity];
		n = capacity;
	}
	
	public static void main(String[] args) {
		CircularQueue c = new CircularQueue(5);
		c.enqueue(1);
		c.enqueue(2);
		c.enqueue(3);
		c.enqueue(4);
		//ѭ��������һ�����пռ䣬5���ڶ�����
		System.out.println(c.enqueue(5));
		c.dequeue();
		System.out.println(c.enqueue(5));
		c.print();
		
	}
	/**
	 * ���ܣ����
	 * 
	 */
	
	public Boolean enqueue(int data) {
		//����
		if((tail+1)%n == head) return false;
		//���
		items[tail] = data;
		//����һ�ռ�
		tail = (tail+1)%n;
		
		
		return  true;
	}
	
	/**
	 * ���ܣ�����
	 * @return
	 */
	public int dequeue() {
		//�Կ�
		if(tail == head) return -1;
		int temp = items[head];
		head = (head+1)%n;
		return temp;
	}
	
	public void print() {
		for(int i = 0;i<items.length;i++) {
			System.out.println(items[i]+"");
		}
	}
	
	
}
