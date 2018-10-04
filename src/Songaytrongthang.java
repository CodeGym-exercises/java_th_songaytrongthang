import java.util.Scanner;

public class Songaytrongthang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang:");
        int thang = sc.nextInt();
        boolean nhuan = false;

        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+thang+" co 31 ngay: ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+thang+" co 30 ngay: ");
                break;
                default:
                    System.out.println("Thang "+thang+" co 29 hoac 28 ngay: ");
        }
    }
}
