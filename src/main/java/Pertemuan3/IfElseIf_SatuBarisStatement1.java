package Pertemuan3;

public class IfElseIf_SatuBarisStatement1 {
    public static void main(String[] args) {
        int nilai = 60;
        char grade;
        
        if (nilai > 85 && nilai <= 100)
            grade = 'A';
        else if (nilai >= 75 && nilai < 85)
            grade = 'B';
        else if (nilai >= 60 && nilai < 75) // Diperbaiki dari modul (nilai < 75) agar logis
            grade = 'C';
        else if (nilai >= 35 && nilai < 60)
            grade = 'D';
        else
            grade = 'E';
            
        System.out.println("Nilai = " + nilai);
        System.out.println("Grade Anda = " + grade);
    }
}