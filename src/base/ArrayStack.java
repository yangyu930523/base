package base;
/**
 * 	���������˳��ջ
 * @author Administrator
 *
 */
public class ArrayStack {
	private String[] items;//����
	private int count;//ջ��Ԫ�ظ���
	private int n;//ջ�Ĵ�С
	
	//��ʼ�����飬����һ����СΪn������ռ�
	public ArrayStack(int n) {
		this.items = new String[n];
		this.n = n;
		this.count = 0;
	}
	
	/**
	 *	 ����:��ջ 
	 *	 ˵��:������ջ�����Ϊ����β��
	 * @param item :��ջ����Ԫ��
	 * @return:�Ƿ���ջ�ɹ�
	 */
	
	public boolean push(String item) {
		// ����ռ䲻���ˣ�ֱ�ӷ��� false����ջʧ�ܡ�
		if (count == 0)  return false;
		// �� item �ŵ��±�Ϊ count ��λ��
		items[count] = item;
		// ���鳤��+1
		++count;
		// ��ջ�ɹ�

		return true;
	}
	/**
	 * 	����:��ջ
	 * @return: ���س�ջԪ��
	 */
	public String pop() {
		// ջΪ�գ���ֱ�ӷ��� null
		if (count == 0)   return null;
		// �����±�Ϊ count-1 ������Ԫ��
		String tmp = items[count - 1];
		// ���鳤��-1
		--count;
		// ���س�ջ����Ԫ��
		return tmp;
	}
}
