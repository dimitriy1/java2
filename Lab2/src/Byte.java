import java.util.Scanner;

public class Byte {
    public static void main(String[] args) {

        int[] array1 = new int[4];
        String[] data = new String[4];
        int suma=0;
        Scanner sc = new Scanner(System.in, "cp1251");

        for(int i=0; i<array1.length;i++) {
            data[i] = sc.nextLine();
            if (data[i].matches("\\d+")!=true){
                throw new IllegalArgumentException("�������� ����� ������ �����");
            }else array1[i] = Integer.parseInt(data[i]);
            if (array1[i]>127 || array1[i]<-128) {
                throw new IllegalArgumentException("�������� ����� �� ��������� ����");
            }
        }

        for(int i=0; i<array1.length;i++) {
            suma=suma+array1[i];
        }
        if (suma>127 || suma<-128) {
            throw new IllegalArgumentException("����� �������� �� �������");
        }
        System.out.println(suma);
    }
}


