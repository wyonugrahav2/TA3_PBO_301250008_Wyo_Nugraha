# Tugas Pertemuan 3 — Percabangan, Perulangan, dan String

**NIM/Nama:** 301250008 - Wyo Nugraha
**Project:** TugasPertemuan3 (Maven, package `Pertemuan3`)

## Deskripsi
Latihan struktur kontrol (if, if-else, if-else-if, switch), perulangan
(for, while, do-while), dan operasi/method pada objek `String`.

## Struktur Project
```
TugasPertemuan3/
├── pom.xml
└── src/main/java/Pertemuan3/
    ├── If_SatuBarisStatement.java
    ├── IfElse_SatuBarisStatement.java
    ├── If_BlockStatement.java
    ├── IfElseIf_SatuBarisStatement1.java
    ├── KondisiSwitch.java
    ├── PengulanganFor.java
    ├── PengulanganWhile.java
    ├── PengulanganDoWhile.java
    └── ClassString.java
```

## Daftar Kelas

| Kelas | Materi | Ringkasan |
|---|---|---|
| `If_SatuBarisStatement.java` | If | Statement `if` satu baris tanpa kurung kurawal, membandingkan dua variabel `p` dan `q`. |
| `IfElse_SatuBarisStatement.java` | If-Else | Statement `if-else` satu baris membandingkan `t` dan `r`. |
| `If_BlockStatement.java` | If (block) | Statement `if` dengan blok berisi lebih dari satu baris instruksi. |
| `IfElseIf_SatuBarisStatement1.java` | If-Else-If | Penentuan grade (A–E) berdasarkan rentang `nilai` menggunakan rangkaian `if-else if`. |
| `KondisiSwitch.java` | Switch-Case | Penentuan predikat nilai (A–E) menggunakan `switch...case` dengan `default`. |
| `PengulanganFor.java` | Perulangan For | Mencetak angka 0 sampai 5 menggunakan `for`. |
| `PengulanganWhile.java` | Perulangan While | Mencetak angka 1 sampai 5 menggunakan `while`. |
| `PengulanganDoWhile.java` | Perulangan Do-While | Mencetak angka 1 sampai 5 menggunakan `do...while`. |
| `ClassString.java` | Class String | Contoh method bawaan `String`: `length()`, `concat()`, `equals()`, `replace()`, `replaceAll()`, `replaceFirst()`, `toLowerCase()`, `toUpperCase()`, `substring()`, `charAt()`, `toCharArray()`, `valueOf()`, `toString()`. |

## Cara Menjalankan
```bash
cd TugasPertemuan3
mvn compile
mvn exec:java -Dexec.mainClass="Pertemuan3.KondisiSwitch"
```

Atau kompilasi & jalankan manual tanpa Maven:
```bash
javac -d target/classes src/main/java/Pertemuan3/ClassString.java
java -cp target/classes Pertemuan3.ClassString
```

## Requirement
- Java 8+ (JDK)
- Maven 3.x
