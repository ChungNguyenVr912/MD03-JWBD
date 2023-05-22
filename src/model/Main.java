import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        decimalDisplay(1312334.5678);
    }
    private static void decimalDisplay(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        String formattedNumber = decimalFormat.format(number);
        System.out.println(formattedNumber);
    }
}
