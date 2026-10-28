<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · **Bahasa Indonesia** · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

Klien Android untuk [Jellyfin](https://jellyfin.org/), bernuansa hitam dan ungu, dirancang untuk Galaxy Z Fold.
Kamu tetap memakai antarmuka web Jellyfin (Beranda, Top 10, Lanjutkan menonton…) dan, begitu kamu menekan Putar,
**pemutar native** (ExoPlayer) mengambil alih. Aplikasi ini juga punya ruang untuk Bridge Hub.

Sonnet adalah proyek pribadi, tidak berafiliasi dengan proyek Jellyfin.

## Unduh APK

➡️ **[Unduh Sonnet v0.4 (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. File ini juga terlihat
di daftar file repositori.

Checksum SHA-256 untuk memverifikasi file: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Instalasi di Android 8.0 atau lebih baru:
1. Unduh `sonnet.apk` langsung di ponsel.
2. Buka file-nya. Android akan meminta izin instalasi dari sumber ini (browser atau pengelola file): setujui.
3. Ketuk **Instal**.

Catatan:
- Ini adalah APK **debug** (ditandatangani dengan kunci debug Android Studio, ID aplikasi `com.matheo.sonnet.debug`).
- **Tidak ada alamat yang ditulis mati di kode**: saat pertama dibuka, Sonnet menanyakan alamat server Jellyfin-mu (dan, jika mau,
  alamat Bridge Hub-mu). Kamu bisa mengubahnya nanti di Pengaturan.
- Aplikasi mengizinkan HTTP tanpa enkripsi, yang praktis di jaringan pribadi (Tailscale, jaringan lokal).

## Fitur

### Pemutar native
- **Posisi gambar**: Atas, Tengah, atau Bawah (tombol di kanan atas, atau geser dua jari). Di Fold yang terbuka, kamu bisa
  menempelkan film ke atas agar pita hitam turun ke bawah. Posisi diingat terpisah untuk layar luar dan
  layar terbuka.
- **±10 detik di mana saja**: tombol ⟲10 dan 10⟳, serta ketuk dua kali di kiri atau kanan video. Setiap ketukan tambahan menambah 10 dtk.
  Ketuk dua kali di tengah = jeda. Langkahnya bisa diatur (5, 10, 15, atau 30 dtk).
- **Subtitle di pita hitam**: subtitle tidak lagi menutupi gambar jika ada ruang di bawahnya.
- **Gestur**: kecerahan (sisi kiri), volume (sisi kanan), geser horizontal untuk mencari dengan pratinjau trickplay,
  cubit untuk zoom, tekan lama untuk kecepatan 2×, kunci layar.
- **Mode meja / buku** (Fold setengah terlipat): video di atas, remote di bawah.
- **Gambar dalam gambar otomatis**, pemutaran tetap berjalan saat dilipat atau dibuka, MediaSession (Bluetooth, PiP).
- **Lewati intro atau kredit** (segmen Jellyfin 10.10+ atau bab), lewat tombol atau otomatis.
- **Episode berikutnya** dengan hitung mundur, daftar episode musim, bab dengan gambar.
- Trek audio dan subtitle, kecepatan 0,5 hingga 3×, timer tidur, kualitas dan bitrate maksimum, penguat volume, info
  pemutaran (codec, putar langsung atau transcoding), otomatis beralih ke transcoding lalu ke mode kompatibel (H.264 + AAC) jika file tidak bisa diputar; layar galat menjelaskan penyebabnya.
- Progres tersinkron dengan Jellyfin (lanjutkan, "Sudah ditonton", Lanjutkan menonton).

### Opsi Sonnet (Pengaturan › Opsi Sonnet)
Setiap opsi bisa dinyalakan atau dimatikan terpisah, untuk Jellyfin dan untuk Bridge Hub:
- **Animasi GSAP**: poster muncul berurutan, transisi halaman, efek pegas saat disentuh, getaran ringan.
- **Efek gila**: aurora animasi, kartu 3D yang mengikuti jari, percikan, judul huruf demi huruf, paralaks, riak saat disentuh.
- **Tarik ke bawah** di bagian atas halaman: pintasan (Beranda, Cari, Favorit, Muat ulang, Ke atas).
- **Ketuk dua kali poster** di halaman detail: favorit. **Geser episode**: ke kanan = sudah / belum ditonton, ke kiri = favorit.
- **Tema** Gelap, AMOLED (hitam pekat), dan Terang, plus **warna aksen bebas**.
- [GSAP](https://gsap.com) (GreenSock) sudah disertakan secara lokal di aplikasi.

### Aplikasi
- WebView Jellyfin yang **persisten**: berganti tab langsung terjadi, melipat atau membuka tidak memuat ulang apa pun.
- **Rel navigasi** di kiri pada layar terbuka, bilah bawah pada layar luar.
- **Pustaka native** (dengan Cari, Favorit, TV langsung) dan tab Foto.
- **Semua pengaturan Jellyfin** di Pengaturan: profil, tampilan, beranda, pemutaran, subtitle, kontrol, Quick Connect, dan
  seluruh administrasi (pengguna, pustaka, transcoding, plugin, tugas, log, jaringan, TV, kunci API,
  cadangan…). Rute-rutenya sudah diperiksa di jellyfin-web 10.11.
- **Aksen ungu yang disuntikkan ke Jellyfin** (pengaturan dan administrasi, atau di mana saja), dengan CSS kustom opsional.
- Layar penuh pemutar web, unggah file (gambar, subtitle), dan "Unduh" berfungsi.
- Tombol kembali Android kembali ke halaman sebelumnya di Jellyfin.

Pemutar native bisa dimatikan di Pengaturan › Pemutar Sonnet. Jika pemutaran gagal, tersedia "Putar dengan pemutar web
Jellyfin".

## Kompilasi sendiri

Prasyarat: Android Studio (atau Android SDK) dan JDK 17 atau lebih baru.

1. Buka folder proyek (yang berisi `app/`) di Android Studio dan biarkan sinkronisasi Gradle selesai.
2. Jalankan **Build › Build APK(s)**, atau dari baris perintah:
   ```
   gradlew.bat assembleDebug
   ```
3. APK ada di `app/build/outputs/apk/debug/` atau, tergantung versi Android Studio, di
   `app/build/intermediates/apk/debug/`.

Jika Gradle gagal mengompilasi, periksa dulu apakah `local.properties` berisi jalur Android SDK-mu
(`sdk.dir=...`) dan apakah `JAVA_HOME` menunjuk ke JDK yang kompatibel dengan versi Gradle-mu.

## Teknis

Kotlin dan Jetpack Compose, Media3 (ExoPlayer) untuk pemutaran, `androidx.window` untuk postur Fold, Coil untuk
poster, DataStore untuk pengaturan. Minimal Android 8.0 (API 26), target API 34.

## v0.5 – pemutar yang terinspirasi Jellyfin Android
Profil perangkat ditulis ulang (dekoder asli ponsel), dekoder audio FFmpeg (AC3, E-AC3, DTS, TrueHD…) dari proyek Jellyfin, URL pemutaran diperbaiki (direct play / direct stream / transcoding), buffer jaringan besar. Kompilasi otomatis lewat GitHub Actions.
Kredit: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
