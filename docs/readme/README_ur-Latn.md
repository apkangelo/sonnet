<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · **Roman Urdu** · [Română](README_ro.md)

</div>

# Sonnet

[Jellyfin](https://jellyfin.org/) ke liye Android client, siyah aur jamni rangon mein, Galaxy Z Fold ke liye banaya gaya.
Aap ko Jellyfin ki web interface (Home, Top 10, Dekhna jaari rakhein…) milti hai aur jaise hi aap Play dabate hain,
ek **native player** (ExoPlayer) kaam sambhal leta hai. App mein ek Bridge Hub ki jagah bhi hai.

Sonnet ek zaati project hai, Jellyfin project se is ka koi talluq nahin.

## APK download karein

➡️ **[Sonnet v0.4 download karein (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. Yeh file
repository ki files ki list mein bhi nazar aati hai.

File ki tasdeeq ke liye SHA-256 hash: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Android 8.0 ya naye par install karna:
1. `sonnet.apk` seedha phone par download karein.
2. File kholein. Android is source (browser ya file manager) se install karne ki ijazat maangega: qubool karein.
3. **Install** dabayein.

Notes:
- Yeh ek **debug** APK hai (Android Studio ki debug key se signed, app ID `com.matheo.sonnet.debug`).
- **Koi address code mein pakka nahin likha**: pehli baar kholne par Sonnet aap ke Jellyfin server ka address (aur chahein to
  Bridge Hub ka address) poochhta hai. Baad mein Settings mein badal sakte hain.
- App unencrypted HTTP ki ijazat deti hai, jo private network (Tailscale, local network) mein kaam ka hai.

## Features

### Native player
- **Tasveer ki jagah**: Upar, Darmiyan ya Neeche (upar daayen button, ya do ungliyon se swipe). Khule hue Fold par aap
  film ko upar chipka kar kaali pattiyan neeche bhej sakte hain. Jagah bahar wali screen aur
  khuli screen ke liye alag alag yaad rakhi jaati hai.
- **Har jagah ±10 second**: ⟲10 aur 10⟳ buttons, aur video ke baayen ya daayen double-tap. Har izafi tap 10 second barhata hai.
  Darmiyan mein double-tap = pause. Qadam set ho sakta hai (5, 10, 15 ya 30 second).
- **Kaali patti mein subtitles**: neeche jagah ho to subtitles ab tasveer ko nahin dhaanpte.
- **Gestures**: roshni (baayan hissa), awaaz (daayan hissa), trickplay preview ke saath aage peeche jaane ke liye ufqi swipe,
  zoom ke liye pinch, 2× raftaar ke liye lamba dabana, screen lock.
- **Tabletop / book mode** (Fold aadha mura hua): video upar, remote neeche.
- **Khud-ba-khud picture-in-picture**, morne ya kholne par bhi jaari rehne wali playback, MediaSession (Bluetooth, PiP).
- **Intro ya credits skip karein** (Jellyfin 10.10+ ke segments ya chapters), button se ya khud-ba-khud.
- Countdown ke saath **agla episode**, season ke episodes ki list, tasveeron wale chapters.
- Audio aur subtitle tracks, 0.5 se 3× tak raftaar, sleep timer, zyada se zyada quality aur bitrate, awaaz boost, playback
  ki maloomat (codec, direct play ya transcoding); agar koi file na chale to khud transcoding par, phir compatible mode (H.264 + AAC) par chali jaati hai, aur error screen wajah tafseel se batati hai.
- Progress Jellyfin ke saath sync (resume, "Dekh liya", Dekhna jaari rakhein).

### Sonnet options (Settings › Sonnet options)
Har option Jellyfin aur Bridge Hub ke liye alag alag on ya off hota hai:
- **GSAP animations**: ek ke baad ek aate posters, page transitions, chhoone par spring effect, halki vibrations.
- **Pagal effects**: harkat karti aurora, ungli ke peeche chalte 3D cards, chingariyan, harf-ba-harf aate titles, parallax, chhoone par lehrein.
- Page ke upar **neeche kheenchein**: shortcuts (Home, Search, Favorites, Refresh, Page ke upar).
- Detail page par **poster par double-tap**: favorite. **Episode swipe karein**: daayen = dekh liya / nahin dekha, baayen = favorite.
- **Themes** Dark, AMOLED (bilkul kaala) aur Light, saath mein **apni pasand ka accent rang**.
- [GSAP](https://gsap.com) (GreenSock) app ke andar locally shamil hai.

### App
- **Mustaqil** Jellyfin WebView: tab badalna fauran hota hai, morne ya kholne se kuch dobara load nahin hota.
- Khuli screen par baayen taraf **navigation rail**, bahar wali screen par neeche bar.
- **Native libraries** (Search, Favorites, Live TV ke saath) aur ek Photos tab.
- Settings mein **Jellyfin ki tamam settings**: profile, display, home, playback, subtitles, controls, Quick Connect, aur
  poori administration (users, libraries, transcoding, plugins, tasks, logs, network, TV, API keys,
  backups…). Routes jellyfin-web 10.11 par check kiye gaye hain.
- **Jellyfin mein daala gaya jamni accent** (settings aur administration, ya har jagah), apni marzi ki CSS ke saath.
- Web player ki full screen, files bhejna (images, subtitles) aur "Download" kaam karte hain.
- Android ka back button Jellyfin ke andar peeche jata hai.

Native player Settings › Sonnet player mein band kiya ja sakta hai. Playback mein ghalati ho to "Jellyfin web
player se chalayein" maujood hai.

## Khud build karein

Zaroori cheezein: Android Studio (ya Android SDK) aur JDK 17 ya naya.

1. Project folder (jis mein `app/` hai) Android Studio mein kholein aur Gradle sync mukammal hone dein.
2. **Build › Build APK(s)** chalayein, ya command line se:
   ```
   gradlew.bat assembleDebug
   ```
3. APK `app/build/outputs/apk/debug/` mein hai ya, Android Studio ke version ke hisaab se,
   `app/build/intermediates/apk/debug/` mein.

Agar Gradle build na kar sake, to pehle check karein ke `local.properties` mein aap ke Android SDK ka path
(`sdk.dir=...`) maujood hai aur `JAVA_HOME` aap ke Gradle version ke mutabiq JDK ki taraf ishara karta hai.

## Technical

Kotlin aur Jetpack Compose, playback ke liye Media3 (ExoPlayer), Fold ki postures ke liye `androidx.window`, posters ke liye Coil,
settings ke liye DataStore. Kam se kam Android 8.0 (API 26), target API 34.

## v0.5 – Jellyfin Android se mutasir player
Dobara likha gaya device profile (phone ke asli decoders), Jellyfin project ke diye hue FFmpeg audio decoders (AC3, E-AC3, DTS, TrueHD…), durust kiye gaye playback URLs (direct play / direct stream / transcoding), bade network buffers. GitHub Actions ke zariye khud-ba-khud build.
Shukriya: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
