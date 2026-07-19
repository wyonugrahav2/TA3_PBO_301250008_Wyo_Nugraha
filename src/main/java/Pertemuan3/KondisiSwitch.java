package Pertemuan3;

public class KondisiSwitch {
    public static void main(String[] args) {
        char grade = 'B';
        
        // KONDISI SWITCH ... CASE
        switch (grade) {
            case 'A':
                System.out.println("Predikat Sangat memuaskan");
                break;
            case 'B':
                System.out.println("Predikat memuaskan");
                break;
            case 'C':
                System.out.println("Predikat Baik");
                break;
            case 'D':
                System.out.println("Grade Cukup");
                break;
            case 'E':
                System.out.println("----");
                break;
            default:
                System.out.println("Tidak memiliki grade");
                break;
        }
    }
}