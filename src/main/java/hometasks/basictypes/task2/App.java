package hometasks.basictypes.task2;

/**
 * Created by Dinara&Shaman on 10/12/2016.
 */
public class App {
    public static void main(String[] args) {

        //����������
        {
            int R = 5;
            int r = 3;

            double c = 2 * Math.PI * R; //����� ����������
            double sCirc = Math.PI * Math.pow(R, 2); //������� ����������
            double sRing = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2)); //������� ������
        }

        //�����������
        {
            int a = 3;
            int b = 4;
            int c = 5;

            double P = a + b + c; //�������� ������������
            double p = P / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //������� ������������
        }

        //�������������
        {
            int a = 8;
            int b = 6;

            int P = 2 * a + 2 * b; //�������� ��������������
            int S = a * b; //������� ��������������
        }


    }
}
