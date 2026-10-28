<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · **Română**

</div>

# Sonnet

Client Android pentru [Jellyfin](https://jellyfin.org/), în negru și violet, gândit pentru Galaxy Z Fold.
Ai interfața web Jellyfin (Acasă, Top 10, Continuă vizionarea…) și, imediat ce atingi Redare,
preia controlul un **player nativ** (ExoPlayer). Aplicația include și un spațiu pentru un Bridge Hub.

Sonnet este un proiect personal, neafiliat proiectului Jellyfin.

## Descarcă APK-ul

➡️ **[Descarcă Sonnet v0.4 (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. Fișierul apare și
în lista de fișiere a depozitului.

Suma SHA-256 pentru verificarea fișierului: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Instalare pe Android 8.0 sau mai nou:
1. Descarcă `sonnet.apk` direct pe telefon.
2. Deschide fișierul. Android cere permisiunea de a instala din această sursă (browser sau manager de fișiere): acceptă.
3. Atinge **Instalează**.

Observații:
- Este un APK de **debug** (semnat cu cheia de depanare a Android Studio, identificator `com.matheo.sonnet.debug`).
- **Nicio adresă nu este scrisă în cod**: la prima pornire, Sonnet îți cere adresa serverului Jellyfin (și, opțional,
  pe cea a Bridge Hub-ului). Le poți schimba apoi din Setări.
- Aplicația permite HTTP necriptat, ceea ce e practic într-o rețea privată (Tailscale, rețea locală).

## Funcții

### Player nativ
- **Poziția imaginii**: Sus, Centru sau Jos (butonul din dreapta sus, sau glisare cu două degete). Pe Fold-ul desfăcut poți
  lipi filmul sus, ca benzile negre să ajungă jos. Poziția este memorată separat pentru ecranul exterior și
  ecranul desfăcut.
- **±10 secunde peste tot**: butoanele ⟲10 și 10⟳, plus atingere dublă în stânga sau în dreapta videoclipului. Fiecare atingere în plus adaugă 10 s.
  Atingere dublă în centru = pauză. Pasul este reglabil (5, 10, 15 sau 30 s).
- **Subtitrări în banda neagră**: nu mai acoperă imaginea când există loc dedesubt.
- **Gesturi**: luminozitate (partea stângă), volum (partea dreaptă), glisare orizontală pentru derulare cu previzualizare trickplay,
  ciupire pentru zoom, apăsare lungă pentru viteză 2×, blocarea ecranului.
- **Mod masă / carte** (Fold pe jumătate pliat): video sus, telecomandă jos.
- **Picture-in-picture automat**, redare care continuă când pliezi sau desfaci, MediaSession (Bluetooth, PiP).
- **Sari peste intro sau generic** (segmente Jellyfin 10.10+ sau capitole), cu buton sau automat.
- **Episodul următor** cu numărătoare inversă, lista episoadelor din sezon, capitole cu imagini.
- Piste audio și subtitrări, viteză de la 0,5 la 3×, temporizator de somn, calitate și bitrate maxime, amplificare volum, informații
  de redare (codec, redare directă sau transcodare), trecere automată la transcodare și apoi la modul compatibil (H.264 + AAC) dacă un fișier nu pornește; ecranul de eroare explică în detaliu cauza.
- Progres sincronizat cu Jellyfin (reluare, „Vizionat”, Continuă vizionarea).

### Opțiuni Sonnet (Setări › Opțiuni Sonnet)
Fiecare opțiune se activează sau se dezactivează separat, pentru Jellyfin și pentru Bridge Hub:
- **Animații GSAP**: afișe în cascadă, tranziție de pagină, efect de arc la atingere, vibrații ușoare.
- **Efecte nebune**: auroră animată, carduri 3D care urmăresc degetul, scântei, titluri literă cu literă, paralaxă, unde la atingere.
- **Trage în jos** în partea de sus a unei pagini: scurtături (Acasă, Căutare, Favorite, Reîmprospătare, Sus).
- **Atingere dublă pe afiș** într-o pagină de detalii: favorit. **Glisează un episod**: la dreapta = vizionat / nevizionat, la stânga = favorit.
- **Teme** Întunecată, AMOLED (negru pur) și Luminoasă, plus o **culoare de accent liberă**.
- [GSAP](https://gsap.com) (GreenSock) este inclus local în aplicație.

### Aplicație
- WebView Jellyfin **persistent**: schimbarea filei e instantanee, plierea sau desfacerea nu reîncarcă nimic.
- **Bară de navigare laterală** în stânga pe ecranul desfăcut, bară jos pe ecranul exterior.
- **Biblioteci native** (cu Căutare, Favorite, TV live) și o filă Fotografii.
- **Toate setările Jellyfin** în Setări: profil, afișare, acasă, redare, subtitrări, comenzi, Quick Connect și
  toată administrarea (utilizatori, biblioteci, transcodare, pluginuri, sarcini, jurnale, rețea, TV, chei API,
  backupuri…). Rutele au fost verificate pe jellyfin-web 10.11.
- **Accent violet injectat în Jellyfin** (setări și administrare, sau peste tot), cu CSS personalizat opțional.
- Ecranul complet al playerului web, trimiterea de fișiere (imagini, subtitrări) și „Descarcă” funcționează.
- Butonul înapoi al Android-ului revine în Jellyfin.

Playerul nativ poate fi dezactivat din Setări › Player Sonnet. La o eroare de redare, este disponibilă opțiunea „Redă cu playerul web
Jellyfin”.

## Compilează-l singur

Cerințe: Android Studio (sau Android SDK) și un JDK 17 sau mai nou.

1. Deschide dosarul proiectului (cel care conține `app/`) în Android Studio și lasă sincronizarea Gradle să se termine.
2. Rulează **Build › Build APK(s)**, sau din linia de comandă:
   ```
   gradlew.bat assembleDebug
   ```
3. APK-ul se află în `app/build/outputs/apk/debug/` sau, în funcție de versiunea Android Studio, în
   `app/build/intermediates/apk/debug/`.

Dacă Gradle nu reușește să compileze, verifică mai întâi că `local.properties` conține calea către Android SDK-ul tău
(`sdk.dir=...`) și că `JAVA_HOME` indică un JDK compatibil cu versiunea ta de Gradle.

## Detalii tehnice

Kotlin și Jetpack Compose, Media3 (ExoPlayer) pentru redare, `androidx.window` pentru posturile Fold, Coil pentru
afișe, DataStore pentru setări. Minimum Android 8.0 (API 26), API țintă 34.

## v0.5 – player inspirat de Jellyfin Android
Profil de dispozitiv rescris (decodoarele reale ale telefonului), decodoare audio FFmpeg (AC3, E-AC3, DTS, TrueHD…) furnizate de proiectul Jellyfin, URL-uri de redare corectate (direct play / direct stream / transcodare), buffere de rețea mari. Compilare automată prin GitHub Actions.
Mulțumiri: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
