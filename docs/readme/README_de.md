<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · **Deutsch** · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

Android-Client für [Jellyfin](https://jellyfin.org/) in Schwarz und Violett, gemacht für das Galaxy Z Fold.
Du nutzt die Jellyfin-Weboberfläche (Startseite, Top 10, Weiterschauen…), und sobald du auf Abspielen tippst, übernimmt
ein **nativer Player** (ExoPlayer). Die App enthält außerdem einen Bereich für einen Bridge Hub.

Sonnet ist ein persönliches Projekt und steht in keiner Verbindung zum Jellyfin-Projekt.

## APK herunterladen

➡️ **[Sonnet v0.4 herunterladen (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. Die Datei ist auch
in der Dateiliste des Repositorys zu sehen.

SHA-256-Prüfsumme zum Überprüfen der Datei: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Installation unter Android 8.0 oder neuer:
1. Lade `sonnet.apk` direkt auf das Handy herunter.
2. Öffne die Datei. Android fragt, ob die Installation aus dieser Quelle (Browser oder Dateimanager) erlaubt werden soll: zustimmen.
3. Tippe auf **Installieren**.

Hinweise:
- Das ist eine **Debug**-APK (signiert mit dem Debug-Schlüssel von Android Studio, App-ID `com.matheo.sonnet.debug`).
- **Keine Adresse ist fest einprogrammiert**: Beim ersten Start fragt Sonnet nach der Adresse deines Jellyfin-Servers (und optional
  nach der deines Bridge Hubs). Du kannst sie später in den Einstellungen ändern.
- Die App erlaubt unverschlüsseltes HTTP, was in einem privaten Netzwerk (Tailscale, lokales Netz) praktisch ist.

## Funktionen

### Nativer Player
- **Bildposition**: Oben, Mitte oder Unten (Schaltfläche oben rechts oder mit zwei Fingern wischen). Auf dem aufgeklappten Fold kannst du
  den Film oben andocken, damit die schwarzen Balken unten landen. Die Position wird für den Außenbildschirm und den
  aufgeklappten Bildschirm getrennt gespeichert.
- **±10 Sekunden überall**: Schaltflächen ⟲10 und 10⟳ sowie Doppeltippen links oder rechts im Video. Jedes weitere Tippen addiert 10 s.
  Doppeltippen in der Mitte = Pause. Die Schrittweite ist einstellbar (5, 10, 15 oder 30 s).
- **Untertitel im schwarzen Balken**: Sie verdecken das Bild nicht mehr, wenn darunter Platz ist.
- **Gesten**: Helligkeit (linke Seite), Lautstärke (rechte Seite), horizontal wischen zum Spulen mit Trickplay-Vorschau,
  Zoom per Kneifgeste, lange drücken für 2×-Geschwindigkeit, Bildschirmsperre.
- **Tabletop-/Buchmodus** (Fold halb geklappt): Video oben, Fernbedienung unten.
- **Automatisches Bild-in-Bild**, Wiedergabe läuft beim Zu- oder Aufklappen weiter, MediaSession (Bluetooth, PiP).
- **Intro oder Abspann überspringen** (Segmente ab Jellyfin 10.10 oder Kapitel), per Schaltfläche oder automatisch.
- **Nächste Folge** mit Countdown, Episodenliste der Staffel, Kapitel mit Bildern.
- Audio- und Untertitelspuren, Geschwindigkeit von 0,5 bis 3×, Sleep-Timer, maximale Qualität und Bitrate, Lautstärkeverstärkung, Wiedergabe-
  infos (Codec, Direktwiedergabe oder Transkodierung), automatischer Rückfall auf Transkodierung und dann auf den Kompatibilitätsmodus (H.264 + AAC), wenn eine Datei nicht abspielbar ist; der Fehlerbildschirm nennt die Ursache.
- Fortschritt mit Jellyfin synchronisiert (Fortsetzen, „Gesehen“, Weiterschauen).

### Sonnet-Optionen (Einstellungen › Sonnet-Optionen)
Jede Option lässt sich einzeln ein- oder ausschalten, für Jellyfin und für den Bridge Hub:
- **GSAP-Animationen**: Poster in Kaskade, Seitenübergänge, Federeffekt beim Antippen, leichte Vibrationen.
- **Verrückte Effekte**: animierte Polarlichter, 3D-Karten, die dem Finger folgen, Funken, Titel Buchstabe für Buchstabe, Parallaxe, Wellen beim Antippen.
- **Nach unten ziehen** am oberen Seitenrand: Verknüpfungen (Startseite, Suche, Favoriten, Aktualisieren, Nach oben).
- **Doppeltippen auf das Poster** einer Detailseite: Favorit. **Folge wischen**: nach rechts = gesehen / nicht gesehen, nach links = Favorit.
- **Themes** Dunkel, AMOLED (reines Schwarz) und Hell, dazu eine **frei wählbare Akzentfarbe**.
- [GSAP](https://gsap.com) (GreenSock) ist lokal in die App eingebettet.

### App
- **Dauerhafte** Jellyfin-WebView: Tabwechsel sind sofort da, Zu- oder Aufklappen lädt nichts neu.
- **Navigationsleiste** links auf dem aufgeklappten Bildschirm, untere Leiste auf dem Außenbildschirm.
- **Native Mediatheken** (mit Suche, Favoriten, Live-TV) und ein Fotos-Tab.
- **Alle Jellyfin-Einstellungen** in den Einstellungen: Profil, Anzeige, Startseite, Wiedergabe, Untertitel, Steuerung, Quick Connect und
  die gesamte Verwaltung (Benutzer, Mediatheken, Transkodierung, Plugins, Aufgaben, Protokolle, Netzwerk, TV, API-Schlüssel,
  Sicherungen…). Die Routen wurden mit jellyfin-web 10.11 geprüft.
- **In Jellyfin eingefügter violetter Akzent** (Einstellungen und Verwaltung oder überall), mit optionalem eigenem CSS.
- Vollbild im Web-Player, Datei-Uploads (Bilder, Untertitel) und „Herunterladen“ funktionieren.
- Die Zurück-Taste von Android geht in Jellyfin zurück.

Der native Player lässt sich unter Einstellungen › Sonnet-Player deaktivieren. Bei einem Wiedergabefehler steht „Mit dem Jellyfin-Web-
Player abspielen“ zur Verfügung.

## Selbst kompilieren

Voraussetzungen: Android Studio (oder das Android SDK) und ein JDK 17 oder neuer.

1. Öffne den Projektordner (den mit `app/`) in Android Studio und lass die Gradle-Synchronisierung durchlaufen.
2. Starte **Build › Build APK(s)** oder auf der Kommandozeile:
   ```
   gradlew.bat assembleDebug
   ```
3. Die APK liegt in `app/build/outputs/apk/debug/` oder, je nach Android-Studio-Version, in
   `app/build/intermediates/apk/debug/`.

Wenn Gradle nicht kompilieren kann, prüfe zuerst, ob `local.properties` den Pfad zu deinem Android SDK enthält
(`sdk.dir=...`) und ob `JAVA_HOME` auf ein JDK zeigt, das zu deiner Gradle-Version passt.

## Technik

Kotlin und Jetpack Compose, Media3 (ExoPlayer) für die Wiedergabe, `androidx.window` für die Fold-Haltungen, Coil für die
Poster, DataStore für die Einstellungen. Mindestens Android 8.0 (API 26), Ziel-API 34.

## v0.5 – Player nach dem Vorbild von Jellyfin Android
Neu geschriebenes Geräteprofil (die echten Decoder des Handys), FFmpeg-Audiodecoder (AC3, E-AC3, DTS, TrueHD…) aus dem Jellyfin-Projekt, korrigierte Wiedergabe-URLs (Direct Play / Direct Stream / Transkodierung), große Netzwerkpuffer. Automatischer Build über GitHub Actions.
Dank an: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
