package generic;

//�˴�T�������дΪ�����ʶ����������T��E��K��V����ʽ�Ĳ��������ڱ�ʾ����
//��ʵ����������ʱ������ָ��T�ľ�������
public class Generic<T>{ 
  //key�����Ա����������ΪT,T���������ⲿָ��  
  private T key;

  public Generic(T key) { //���͹��췽���β�key������ҲΪT��T���������ⲿָ��
      this.key = key;
  }

  public T getKey(){ //���ͷ���getKey�ķ���ֵ����ΪT��T���������ⲿָ��
      return key;
  }
}