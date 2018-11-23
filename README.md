# TUGAS 3 - DOMAIN SPESIFIC LANGUAGE
## IF4150 - Rekayasa Perangkat Lunak Spesifik Domain

Program ini dibangun menggunakan *plugin* Antlr4 yang dibangun dengan Maven. Oleh sebab itu, agar program ini dapat dijalankan maka perangkat keras pengguna harus melakukan instalasi **Maven** terlebih dahulu.

### Cara Pemakaian

1. Ubah isi dari `src/test/test.txt` menjadi jadwal mata kuliah secara rinci dan daftar ruangan yang dapat digunakan, lengkap dengan kapasitas dan fasilitas yang dimiliki oleh ruangan tersebut.
2. Buka terminal pada `root`, kemudian ketikkan `mvn clean`.
3. Setelah terdapat keterangan ***BUILD SUCCESS***, ketikkan `mvn package` pada terminal. Untuk pemakaian pertama kali, tahap ini mebutuhkan waktu yang lebih lama.
4. Jalankan program **Java** dengan `App.java` sebagai *main class*.

### Contoh

Isi dari file *src/test/test.txt*:
```
begin
{
 Rekayasa Perangkat Lunak Spesifik Domain ;
 requirement 1 ;
 capacity 50 ;
 { 2 4 5 ;} ;
}
{
 Pembelajaran Mesin ;
 requirement 1 ;
 capacity 100 ;
 { 1 7 8 ;
   2 3 3 ;
 } ;
}
{
 Sistem Informasi Lanjut ;
 requirement 1 ;
 capacity 50 ;
 { 3 9 10 ;} ;
}
{
 Representasi Pengetahuan dan Penalaran ;
 requirement 1 ;
 capacity 50 ;
 { 2 7 8 ;
   3 3 3 ;
 } ;
}
{
 Tugas Akhir I dan Seminar ;
 requirement 0 ;
 capacity 100 ;
 { 1 5 6 ;} ;
}
{
 Kerja Praktek ;
 requirement 0 ;
 capacity 100 ;
 { 4 5 6 ;} ;
}
{
 Pembangunan Perangkat Lunak Berorientasi Service ;
 requirement 1 ;
 capacity 50 ;
 { 1 9 10 ;
   3 11 11 ;
 } ;
}
end

begin
{ 7602 100 1 ;}
{ 7603 50 1 ;}
{ 7604 50 1 ;}
{ 7609 50 1 ;}
{ 7606 50 1 ;}
{ 7601 100 1 ;}
end
```

Hasil penjadwalan oleh program:
```
parsing src/test/test.txt
Hari: Senin | jam: 1 -> 
Hari: Senin | jam: 2 -> 
Hari: Senin | jam: 3 -> 
Hari: Senin | jam: 4 -> 
Hari: Senin | jam: 5 -> 7602 : Tugas Akhir I dan Seminar , 
Hari: Senin | jam: 6 -> 7602 : Tugas Akhir I dan Seminar , 
Hari: Senin | jam: 7 -> 7602 : Pembelajaran Mesin , 
Hari: Senin | jam: 8 -> 7602 : Pembelajaran Mesin , 
Hari: Senin | jam: 9 -> 7603 : Pembangunan Perangkat Lunak Berorientasi Service , 
Hari: Senin | jam: 10 -> 7603 : Pembangunan Perangkat Lunak Berorientasi Service , 
Hari: Senin | jam: 11 -> 
 
Hari: Selasa | jam: 1 -> 
Hari: Selasa | jam: 2 -> 
Hari: Selasa | jam: 3 -> 7602 : Pembelajaran Mesin , 
Hari: Selasa | jam: 4 -> 7603 : Rekayasa Perangkat Lunak Spesifik Domain , 
Hari: Selasa | jam: 5 -> 7603 : Rekayasa Perangkat Lunak Spesifik Domain , 
Hari: Selasa | jam: 6 -> 
Hari: Selasa | jam: 7 -> 7603 : Representasi Pengetahuan dan Penalaran , 
Hari: Selasa | jam: 8 -> 7603 : Representasi Pengetahuan dan Penalaran , 
Hari: Selasa | jam: 9 -> 
Hari: Selasa | jam: 10 -> 
Hari: Selasa | jam: 11 -> 
 
Hari: Rabu | jam: 1 -> 
Hari: Rabu | jam: 2 -> 
Hari: Rabu | jam: 3 -> 7603 : Representasi Pengetahuan dan Penalaran , 
Hari: Rabu | jam: 4 -> 
Hari: Rabu | jam: 5 -> 
Hari: Rabu | jam: 6 -> 
Hari: Rabu | jam: 7 -> 
Hari: Rabu | jam: 8 -> 
Hari: Rabu | jam: 9 -> 7603 : Sistem Informasi Lanjut , 
Hari: Rabu | jam: 10 -> 7603 : Sistem Informasi Lanjut , 
Hari: Rabu | jam: 11 -> 7603 : Pembangunan Perangkat Lunak Berorientasi Service , 
 
Hari: Kamis | jam: 1 -> 
Hari: Kamis | jam: 2 -> 
Hari: Kamis | jam: 3 -> 
Hari: Kamis | jam: 4 -> 
Hari: Kamis | jam: 5 -> 7602 : Kerja Praktek , 
Hari: Kamis | jam: 6 -> 7602 : Kerja Praktek , 
Hari: Kamis | jam: 7 -> 
Hari: Kamis | jam: 8 -> 
Hari: Kamis | jam: 9 -> 
Hari: Kamis | jam: 10 -> 
Hari: Kamis | jam: 11 -> 
 
Hari: Jumat | jam: 1 -> 
Hari: Jumat | jam: 2 -> 
Hari: Jumat | jam: 3 -> 
Hari: Jumat | jam: 4 -> 
Hari: Jumat | jam: 5 -> 
Hari: Jumat | jam: 6 -> 
Hari: Jumat | jam: 7 -> 
Hari: Jumat | jam: 8 -> 
Hari: Jumat | jam: 9 -> 
Hari: Jumat | jam: 10 -> 
Hari: Jumat | jam: 11 -> 
 

Process finished with exit code 0
```

## Kelompok:
13515064 - Tasya

13515104 - Rizki Ihza Parama

13515126 - Mico