package Pertemuan3;

public class ClassString {
    public static void main (String[] args) {
        String abc = new String("Saya Suka Belajar Java");
        
        System.out.println("Panjang data String: " + abc.length());
        System.out.println("Penggabungan data String: " + abc.concat(" di LABKOM"));
        System.out.println("Perbandingan data String abc dengan data: " + abc.equals("saya suka java"));
        System.out.println("Perbandingan data String abc dengan data: " + abc.equals("Saya Suka Belajar Java"));
        System.out.println("Pergantian data String untuk Semua Kata: " + abc.replaceAll("Saya Suka Belajar Java", "Kami Senang Belajar"));
        System.out.println("Pergantian data String untuk Karakter: " + abc.replace('S', ' '));
        System.out.println("Pergantian data String untuk 1 kata dalam kalimat: " + abc.replaceFirst("Saya", "Kami"));
        System.out.println("Kapitalisme data String (menjadi huruf kecil semua): " + abc.toLowerCase());
        System.out.println("Kapitalisme data String (menjadi huruf besar semua): " + abc.toUpperCase());
        System.out.println("Sub-String data String mulai dari index ke 5: " + abc.substring(5));
        System.out.println("Sub-String data String mulai dari index ke 5 sampai huruf ke 9: " + abc.substring(5, 9));
        System.out.println("Operasi Character mengambil index ke-5: " + abc.charAt(5));
        System.out.println("Operasi Character: " + abc.toCharArray());
        System.out.println("Konversi: " + String.valueOf(abc));
        System.out.println("Konversi: " + abc.toString());
    }
}