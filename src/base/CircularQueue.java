package base;
/**
 * 
 * @author Administrator
 *	循环队列满的时候，我们要发现其上边的规律得出队满的条件，
 *	（尾指针 + 1）% n = 头指针。此时的循环队列会浪费一个空间。
 */
public class CircularQueue {
	//声明一个 int 队列
	private int[] items;
	private int n;
	
	// 声明头、尾 指针
	private int head = 0;
	private int tail = 0;
	
	//初始化变量
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
		//循环队列有一个空闲空间，5不在队列中
		System.out.println(c.enqueue(5));
		c.dequeue();
		System.out.println(c.enqueue(5));
		c.print();
		
	}
	/**
	 * 功能：入队
	 * 
	 */
	
	public Boolean enqueue(int data) {
		//对满
		if((tail+1)%n == head) return false;
		//入队
		items[tail] = data;
		//求下一空间
		tail = (tail+1)%n;
		
		
		return  true;
	}
	
	/**
	 * 功能：出对
	 * @return
	 */
	public int dequeue() {
		//对空
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
