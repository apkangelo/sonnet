<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · **Italiano**
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

Client Android per [Jellyfin](https://jellyfin.org/), in nero e viola, pensato per il Galaxy Z Fold.
Ritrovi l'interfaccia web di Jellyfin (Home, Top 10, Continua a guardare…) e, appena tocchi Riproduci, un
**lettore nativo** (ExoPlayer) prende il comando. L'app integra anche uno spazio per un Bridge Hub.

Sonnet è un progetto personale, non affiliato al progetto Jellyfin.

## Scaricare l'APK

➡️ **[Scarica Sonnet v0.4 (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. Il file è visibile anche
nell'elenco dei file del repository.

Hash SHA-256 per verificare il file: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Installazione su Android 8.0 o successivo:
1. Scarica `sonnet.apk` direttamente sul telefono.
2. Apri il file. Android chiede di consentire l'installazione da questa origine (browser o gestore file): accetta.
3. Tocca **Installa**.

Note:
- È un APK di **debug** (firmato con la chiave di debug di Android Studio, identificativo `com.matheo.sonnet.debug`).
- **Nessun indirizzo è scritto nel codice**: al primo avvio, Sonnet ti chiede l'indirizzo del tuo server Jellyfin (e, facoltativamente,
  quello del tuo Bridge Hub). Puoi cambiarli in seguito nelle Impostazioni.
- L'app consente l'HTTP non cifrato, comodo su una rete privata (Tailscale, rete locale).

## Funzioni

### Lettore nativo
- **Posizione dell'immagine**: In alto, Al centro o In basso (pulsante in alto a destra, o scorrimento con due dita). Sul Fold aperto puoi
  attaccare il film in alto per spostare le bande nere in basso. La posizione è memorizzata separatamente per lo schermo esterno e
  lo schermo aperto.
- **±10 secondi ovunque**: pulsanti ⟲10 e 10⟳, e doppio tocco a sinistra o a destra del video. Ogni tocco in più aggiunge 10 s.
  Doppio tocco al centro = pausa. Il salto è regolabile (5, 10, 15 o 30 s).
- **Sottotitoli nella banda nera**: non coprono più l'immagine quando sotto c'è spazio.
- **Gesti**: luminosità (lato sinistro), volume (lato destro), scorrimento orizzontale per cercare con anteprima trickplay,
  pizzico per lo zoom, pressione prolungata per la velocità 2×, blocco dello schermo.
- **Modalità tavolo / libro** (Fold piegato a metà): video in alto, telecomando in basso.
- **Picture-in-picture automatico**, riproduzione che continua quando pieghi o apri, MediaSession (Bluetooth, PiP).
- **Salta intro o titoli di coda** (segmenti di Jellyfin 10.10+ o capitoli), con pulsante o in automatico.
- **Episodio successivo** con conto alla rovescia, elenco degli episodi della stagione, capitoli con immagini.
- Tracce audio e sottotitoli, velocità da 0,5 a 3×, timer di spegnimento, qualità e bitrate massimi, amplificazione del volume, informazioni
  di riproduzione (codec, riproduzione diretta o transcodifica), passaggio automatico alla transcodifica e poi alla modalità compatibile (H.264 + AAC) se un file non parte; la schermata d'errore spiega la causa.
- Avanzamento sincronizzato con Jellyfin (ripresa, «Visto», Continua a guardare).

### Opzioni di Sonnet (Impostazioni › Opzioni di Sonnet)
Ogni opzione si attiva o disattiva separatamente, per Jellyfin e per il Bridge Hub:
- **Animazioni GSAP**: locandine a cascata, transizioni di pagina, effetto molla al tocco, vibrazioni leggere.
- **Effetti pazzi**: aurora animata, schede in 3D che seguono il dito, scintille, titoli lettera per lettera, parallasse, onde al tocco.
- **Trascina in basso** in cima a una pagina: scorciatoie (Home, Cerca, Preferiti, Aggiorna, Inizio pagina).
- **Doppio tocco sulla locandina** di una scheda: preferito. **Scorri un episodio**: a destra = visto / non visto, a sinistra = preferito.
- **Temi** Scuro, AMOLED (nero puro) e Chiaro, più un **colore d'accento libero**.
- [GSAP](https://gsap.com) (GreenSock) è incluso localmente nell'app.

### Applicazione
- WebView di Jellyfin **persistente**: cambiare scheda è istantaneo, piegare o aprire non ricarica nulla.
- **Barra di navigazione laterale** a sinistra sullo schermo aperto, barra in basso sullo schermo esterno.
- **Librerie native** (con Cerca, Preferiti, TV in diretta) e una scheda Foto.
- **Tutte le impostazioni di Jellyfin** nelle Impostazioni: profilo, visualizzazione, home, riproduzione, sottotitoli, controlli, Quick Connect e
  tutta l'amministrazione (utenti, librerie, transcodifica, plugin, attività, log, rete, TV, chiavi API,
  backup…). I percorsi sono stati verificati su jellyfin-web 10.11.
- **Accento viola iniettato in Jellyfin** (impostazioni e amministrazione, o ovunque), con CSS personalizzato facoltativo.
- Schermo intero del lettore web, invio di file (immagini, sottotitoli) e «Scarica» funzionano.
- Il tasto Indietro di Android torna indietro in Jellyfin.

Il lettore nativo si può disattivare in Impostazioni › Lettore Sonnet. In caso di errore di riproduzione è disponibile «Riproduci con il lettore web
di Jellyfin».

## Compilarlo da solo

Prerequisiti: Android Studio (o l'SDK Android) e un JDK 17 o successivo.

1. Apri la cartella del progetto (quella che contiene `app/`) in Android Studio e lascia terminare la sincronizzazione Gradle.
2. Avvia **Build › Build APK(s)**, oppure da riga di comando:
   ```
   gradlew.bat assembleDebug
   ```
3. L'APK si trova in `app/build/outputs/apk/debug/` oppure, a seconda della versione di Android Studio, in
   `app/build/intermediates/apk/debug/`.

Se Gradle non riesce a compilare, verifica prima che `local.properties` contenga il percorso del tuo SDK Android
(`sdk.dir=...`) e che `JAVA_HOME` punti a un JDK compatibile con la tua versione di Gradle.

## Dettagli tecnici

Kotlin e Jetpack Compose, Media3 (ExoPlayer) per la riproduzione, `androidx.window` per le posture del Fold, Coil per le
locandine, DataStore per le impostazioni. Android 8.0 (API 26) minimo, API di destinazione 34.

## v0.5 – lettore ispirato a Jellyfin Android
Profilo del dispositivo riscritto (i veri decoder del telefono), decoder audio FFmpeg (AC3, E-AC3, DTS, TrueHD…) forniti dal progetto Jellyfin, URL di riproduzione corretti (direct play / direct stream / transcodifica), grandi buffer di rete. Compilazione automatica tramite GitHub Actions.
Crediti: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
