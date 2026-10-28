<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · **Polski** · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

Klient Androida dla [Jellyfin](https://jellyfin.org/), w czerni i fiolecie, zaprojektowany z myślą o Galaxy Z Fold.
Masz interfejs webowy Jellyfin (Strona główna, Top 10, Kontynuuj oglądanie…), a gdy tylko dotkniesz Odtwórz,
przejmuje go **natywny odtwarzacz** (ExoPlayer). Aplikacja ma też przestrzeń na Bridge Hub.

Sonnet to projekt osobisty, niezwiązany z projektem Jellyfin.

## Pobierz APK

➡️ **[Pobierz Sonnet v0.4 (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. Plik widać też
na liście plików repozytorium.

Suma kontrolna SHA-256 do weryfikacji pliku: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Instalacja na Androidzie 8.0 lub nowszym:
1. Pobierz `sonnet.apk` bezpośrednio na telefon.
2. Otwórz plik. Android poprosi o zezwolenie na instalację z tego źródła (przeglądarka lub menedżer plików): zaakceptuj.
3. Dotknij **Zainstaluj**.

Uwagi:
- To APK w wersji **debug** (podpisany kluczem debugowania Android Studio, identyfikator `com.matheo.sonnet.debug`).
- **Żaden adres nie jest wpisany na sztywno**: przy pierwszym uruchomieniu Sonnet pyta o adres twojego serwera Jellyfin (i opcjonalnie
  o adres Bridge Hub). Możesz je potem zmienić w Ustawieniach.
- Aplikacja zezwala na nieszyfrowany HTTP, co jest wygodne w sieci prywatnej (Tailscale, sieć lokalna).

## Funkcje

### Natywny odtwarzacz
- **Położenie obrazu**: Góra, Środek lub Dół (przycisk w prawym górnym rogu albo przesunięcie dwoma palcami). Na rozłożonym Foldzie możesz
  przykleić film do góry, żeby czarne pasy zeszły na dół. Położenie jest zapamiętywane osobno dla ekranu zewnętrznego i
  ekranu rozłożonego.
- **±10 sekund wszędzie**: przyciski ⟲10 i 10⟳ oraz podwójne dotknięcie po lewej lub prawej stronie wideo. Każde kolejne dotknięcie dodaje 10 s.
  Podwójne dotknięcie na środku = pauza. Skok jest regulowany (5, 10, 15 lub 30 s).
- **Napisy na czarnym pasie**: nie zasłaniają już obrazu, gdy pod nim jest miejsce.
- **Gesty**: jasność (lewa strona), głośność (prawa strona), przesunięcie w poziomie do przewijania z podglądem trickplay,
  szczypnięcie do powiększania, długie przytrzymanie dla prędkości 2×, blokada ekranu.
- **Tryb stołu / książki** (Fold złożony do połowy): wideo u góry, pilot na dole.
- **Automatyczny obraz w obrazie**, odtwarzanie trwa dalej przy składaniu i rozkładaniu, MediaSession (Bluetooth, PiP).
- **Pomijanie czołówki lub napisów końcowych** (segmenty Jellyfin 10.10+ lub rozdziały), przyciskiem lub automatycznie.
- **Następny odcinek** z odliczaniem, lista odcinków sezonu, rozdziały z obrazami.
- Ścieżki dźwiękowe i napisy, prędkość od 0,5 do 3×, wyłącznik czasowy, maksymalna jakość i bitrate, wzmocnienie głośności, informacje
  o odtwarzaniu (kodek, odtwarzanie bezpośrednie lub transkodowanie), automatyczne przejście na transkodowanie, a potem w tryb zgodności (H.264 + AAC), jeśli plik się nie odtwarza; ekran błędu podaje szczegółową przyczynę.
- Postęp synchronizowany z Jellyfin (wznawianie, „Obejrzane”, Kontynuuj oglądanie).

### Opcje Sonnet (Ustawienia › Opcje Sonnet)
Każdą opcję włącza się lub wyłącza osobno, dla Jellyfin i dla Bridge Hub:
- **Animacje GSAP**: plakaty pojawiające się kaskadowo, przejścia między stronami, efekt sprężyny przy dotknięciu, lekkie wibracje.
- **Szalone efekty**: animowana zorza, karty 3D podążające za palcem, iskry, tytuły litera po literze, paralaksa, fale przy dotknięciu.
- **Pociągnięcie w dół** na górze strony: skróty (Strona główna, Szukaj, Ulubione, Odśwież, Na górę).
- **Podwójne dotknięcie plakatu** na stronie szczegółów: ulubione. **Przesunięcie odcinka**: w prawo = obejrzany / nieobejrzany, w lewo = ulubione.
- **Motywy** Ciemny, AMOLED (czysta czerń) i Jasny, plus **dowolny kolor akcentu**.
- [GSAP](https://gsap.com) (GreenSock) jest wbudowany lokalnie w aplikację.

### Aplikacja
- **Trwały** WebView Jellyfin: zmiana karty jest natychmiastowa, składanie i rozkładanie niczego nie przeładowuje.
- **Pasek nawigacji** po lewej na rozłożonym ekranie, dolny pasek na ekranie zewnętrznym.
- **Natywne biblioteki** (z Wyszukiwaniem, Ulubionymi, Telewizją na żywo) i karta Zdjęcia.
- **Wszystkie ustawienia Jellyfin** w Ustawieniach: profil, wyświetlanie, strona główna, odtwarzanie, napisy, sterowanie, Quick Connect oraz
  cała administracja (użytkownicy, biblioteki, transkodowanie, wtyczki, zadania, logi, sieć, TV, klucze API,
  kopie zapasowe…). Ścieżki sprawdzono na jellyfin-web 10.11.
- **Fioletowy akcent wstrzyknięty do Jellyfin** (ustawienia i administracja albo wszędzie), z opcjonalnym własnym CSS.
- Pełny ekran odtwarzacza webowego, wysyłanie plików (obrazy, napisy) i „Pobierz” działają.
- Przycisk wstecz Androida cofa w Jellyfin.

Natywny odtwarzacz można wyłączyć w Ustawienia › Odtwarzacz Sonnet. W razie błędu odtwarzania dostępna jest opcja „Odtwórz w odtwarzaczu webowym
Jellyfin”.

## Samodzielna kompilacja

Wymagania: Android Studio (lub Android SDK) i JDK 17 lub nowszy.

1. Otwórz folder projektu (ten, który zawiera `app/`) w Android Studio i poczekaj, aż synchronizacja Gradle się zakończy.
2. Uruchom **Build › Build APK(s)** albo w wierszu poleceń:
   ```
   gradlew.bat assembleDebug
   ```
3. APK znajduje się w `app/build/outputs/apk/debug/` lub, zależnie od wersji Android Studio, w
   `app/build/intermediates/apk/debug/`.

Jeśli Gradle nie może skompilować projektu, najpierw sprawdź, czy `local.properties` zawiera ścieżkę do twojego Android SDK
(`sdk.dir=...`) i czy `JAVA_HOME` wskazuje na JDK zgodny z twoją wersją Gradle.

## Szczegóły techniczne

Kotlin i Jetpack Compose, Media3 (ExoPlayer) do odtwarzania, `androidx.window` do pozycji Folda, Coil do
plakatów, DataStore do ustawień. Minimum Android 8.0 (API 26), docelowe API 34.

## v0.5 – odtwarzacz inspirowany Jellyfin Android
Przepisany profil urządzenia (prawdziwe dekodery telefonu), dekodery audio FFmpeg (AC3, E-AC3, DTS, TrueHD…) dostarczane przez projekt Jellyfin, poprawione adresy URL odtwarzania (direct play / direct stream / transkodowanie), duże bufory sieciowe. Automatyczna kompilacja przez GitHub Actions.
Podziękowania: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
