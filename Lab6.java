package Lab_6;

public class Lab62 {
    public static void main(String[] args) {
        int number = 21;
        String binaryString = intToBinaryString(number);
        System.out.println("Результат: " + binaryString);
    }

    public static String intToBinaryString(int i) {
        return Integer.toBinaryString(i);
    }
}