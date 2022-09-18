import java.util.Scanner;

public class Byte {

    public static int zapovneniaMasiva(String int1){
        Scanner sc = new Scanner(System.in, "cp1251");
        int chislo=0;
        if (int1.matches("[-]?\\d+")!=true){
            throw new IllegalArgumentException("¬веденн€ р€дка зам≥сть числа");
        }else chislo = Integer.parseInt(int1);
        if (chislo>127 || chislo<-128) {
            throw new IllegalArgumentException("¬веденн€ числа за д≥апазоном байт");
        }
        return chislo;
    }

    public static int sumaaMasiva(int[] array) {
        int sum=0;
        for(int i=0; i<array.length;i++) {
            sum=sum+array[i];
        }
        if (sum>127 || sum<-128) {
            throw new IllegalArgumentException("—умма виходить за д≥апазон");
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        int[] array1 = new int[4];
        String[] data = new String[4];
        int suma=0;

        for(int i=0; i<array1.length;i++) {
            data[i] = sc.nextLine();
            array1[i]=zapovneniaMasiva(data[i]);
        }

        suma=sumaaMasiva(array1);

        System.out.println("—умма масиву байт - ");
        System.out.println(suma);
    }
}