<div align="center">

**English** · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

Android client for [Jellyfin](https://jellyfin.org/), in black and purple, designed for the Galaxy Z Fold.
You get the Jellyfin web interface (Home, Top 10, Continue Watching…) and, as soon as you tap Play, a
**native player** (ExoPlayer) takes over. The app also includes a space for a Bridge Hub.

Sonnet is a personal project, not affiliated with the Jellyfin project.

## Download the APK

➡️ **[Download Sonnet v0.4 (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. The file is also visible
in the repository's file list.

SHA-256 checksum to verify the file: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Installing on Android 8.0 or newer:
1. Download `sonnet.apk` directly on the phone.
2. Open the file. Android asks you to allow installs from this source (browser or file manager): accept.
3. Tap **Install**.

Notes:
- This is a **debug** APK (signed with Android Studio's debug key, application ID `com.matheo.sonnet.debug`).
- **No address is hard-coded**: on first launch, Sonnet asks for your Jellyfin server address (and, optionally,
  your Bridge Hub's). You can change them later in Settings.
- The app allows unencrypted HTTP, which is handy on a private network (Tailscale, local network).

## Features

### Native player
- **Picture position**: Top, Center or Bottom (button at the top right, or two-finger swipe). On the unfolded Fold, you can
  pin the movie to the top to push the black bars to the bottom. The position is remembered separately for the cover screen and
  the unfolded screen.
- **±10 seconds everywhere**: ⟲10 and 10⟳ buttons, and double-tap on the left or right of the video. Each extra tap adds 10 s.
  Double-tap in the center = pause. The step is adjustable (5, 10, 15 or 30 s).
- **Subtitles in the black bar**: they no longer cover the picture when there is room below it.
- **Gestures**: brightness (left side), volume (right side), horizontal swipe to seek with trickplay preview,
  pinch to zoom, long press for 2× speed, screen lock.
- **Tabletop / book mode** (Fold half folded): video on top, remote at the bottom.
- **Automatic picture-in-picture**, playback that keeps going when you fold or unfold, MediaSession (Bluetooth, PiP).
- **Skip intro or credits** (Jellyfin 10.10+ segments or chapters), as a button or automatically.
- **Next episode** with a countdown, list of the season's episodes, chapters with images.
- Audio and subtitle tracks, speed from 0.5 to 3×, sleep timer, maximum quality and bitrate, volume boost, playback
  info (codec, direct play or transcoding), automatic fallback to transcoding, then to compatibility mode (H.264 + AAC), if a file won't play; the error screen explains the cause.
- Progress synced with Jellyfin (resume, "Watched", Continue Watching).

### Sonnet options (Settings › Sonnet options)
Each option can be turned on or off separately, for Jellyfin and for the Bridge Hub:
- **GSAP animations**: cascading posters, page transitions, spring effect on touch, light vibrations.
- **Wild effects**: animated aurora, 3D cards that follow your finger, sparkles, letter-by-letter titles, parallax, touch ripples.
- **Pull down** at the top of a page: shortcuts (Home, Search, Favorites, Refresh, Back to top).
- **Double-tap the poster** on a details page: favorite. **Swipe an episode**: right = watched / unwatched, left = favorite.
- **Themes** Dark, AMOLED (pure black) and Light, plus a **free accent color**.
- [GSAP](https://gsap.com) (GreenSock) is bundled locally in the app.

### App
- **Persistent** Jellyfin WebView: switching tabs is instant, folding or unfolding reloads nothing.
- **Navigation rail** on the left on the unfolded screen, bottom bar on the cover screen.
- **Native libraries** (with Search, Favorites, Live TV) and a Photos tab.
- **All Jellyfin settings** in Settings: profile, display, home, playback, subtitles, controls, Quick Connect, and
  the full administration (users, libraries, transcoding, plugins, tasks, logs, network, TV, API keys,
  backups…). The routes have been checked against jellyfin-web 10.11.
- **Purple accent injected into Jellyfin** (settings and administration, or everywhere), with optional custom CSS.
- Web player full screen, file uploads (images, subtitles) and "Download" all work.
- Android's back button goes back in Jellyfin.

The native player can be turned off in Settings › Sonnet player. If playback fails, "Play with the Jellyfin web
player" is available.

## Build it yourself

Requirements: Android Studio (or the Android SDK) and JDK 17 or newer.

1. Open the project folder (the one that contains `app/`) in Android Studio and let the Gradle sync finish.
2. Run **Build › Build APK(s)**, or from the command line:
   ```
   gradlew.bat assembleDebug
   ```
3. The APK is in `app/build/outputs/apk/debug/` or, depending on the Android Studio version, in
   `app/build/intermediates/apk/debug/`.

If Gradle fails to build, first check that `local.properties` contains the path to your Android SDK
(`sdk.dir=...`) and that `JAVA_HOME` points to a JDK compatible with your Gradle version.

## Technical details

Kotlin and Jetpack Compose, Media3 (ExoPlayer) for playback, `androidx.window` for Fold postures, Coil for
posters, DataStore for settings. Android 8.0 (API 26) minimum, target API 34.

## v0.5 – player inspired by Jellyfin Android
Rewritten device profile (the phone's real decoders), FFmpeg audio decoders (AC3, E-AC3, DTS, TrueHD…) provided by the Jellyfin project, fixed playback URLs (direct play / direct stream / transcoding), large network buffers. Automatic builds via GitHub Actions.
Credit: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
