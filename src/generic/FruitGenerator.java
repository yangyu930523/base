package generic;

import java.util.Random;

/**
 * δ���뷺��ʵ��ʱ���뷺����Ķ�����ͬ�����������ʱ���轫���͵�����Ҳһ��ӵ�����
 * ����class FruitGenerator<T> implements Generator<T>{
 * ������������ͣ��磺class FruitGenerator implements Generator<T>���������ᱨ��"Unknown class"
 */
/**
 * ���뷺��ʵ��ʱ��
 * ����һ��������ʵ������ӿ�,��Ȼ����ֻ������һ�����ͽӿ�Generator<T>
 * �������ǿ���ΪT����������ʵ�Σ��γ����������͵�Generator�ӿڡ�
 * ��ʵ����ʵ�ַ��ͽӿ�ʱ�����ѽ��������ʹ���ʵ�����ͣ�������ʹ�÷��͵ĵط���Ҫ�滻�ɴ����ʵ������
 * ����Generator<T>��public T next();�еĵ�T��Ҫ�滻�ɴ����String���͡�
 */
public class FruitGenerator implements Generator<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}
