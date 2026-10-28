<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · **繁體中文** · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

[Jellyfin](https://jellyfin.org/) 的 Android 用戶端，黑紫配色，專為 Galaxy Z Fold 設計。
你能使用 Jellyfin 網頁介面（首頁、Top 10、繼續觀看……），一按下播放，
**原生播放器**（ExoPlayer）就會接手。App 也整合了 Bridge Hub 專區。

Sonnet 是個人專案，與 Jellyfin 專案無關。

## 下載 APK

➡️ **[下載 Sonnet v0.4（`sonnet.apk`）](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**，大小 22 MB。這個檔案也能在
儲存庫的檔案清單中看到。

用來驗證檔案的 SHA-256 雜湊值：`3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

在 Android 8.0 或更新版本上安裝：
1. 直接在手機上下載 `sonnet.apk`。
2. 開啟檔案。Android 會要求允許從此來源（瀏覽器或檔案管理員）安裝：同意即可。
3. 點選**安裝**。

注意事項：
- 這是 **debug** APK（以 Android Studio 的偵錯金鑰簽署，應用程式 ID 為 `com.matheo.sonnet.debug`）。
- **沒有寫死任何位址**：第一次啟動時，Sonnet 會詢問你的 Jellyfin 伺服器位址（以及可選的
  Bridge Hub 位址）。之後可以在設定中更改。
- App 允許未加密的 HTTP，在私人網路（Tailscale、區域網路）中很方便。

## 功能

### 原生播放器
- **畫面位置**：上、中或下（右上角按鈕，或雙指滑動）。在展開的 Fold 上，你可以
  把影片貼到上方，讓黑邊留在下方。外螢幕與展開螢幕的位置會分別記住。
- **到處都能 ±10 秒**：⟲10 和 10⟳ 按鈕，以及在影片左側或右側點兩下。每多點一下再加 10 秒。
  在中間點兩下 = 暫停。間隔可調整（5、10、15 或 30 秒）。
- **字幕顯示在黑邊中**：下方有空間時，字幕不再遮住畫面。
- **手勢**：亮度（左側）、音量（右側）、水平滑動跳轉並附 trickplay 預覽、
  雙指縮放、長按 2× 倍速、鎖定螢幕。
- **桌面 / 書本模式**（Fold 半摺）：影片在上，遙控在下。
- **自動子母畫面**，摺疊或展開時持續播放，MediaSession（藍牙、子母畫面）。
- **略過片頭或片尾**（Jellyfin 10.10+ 的片段或章節），按鈕或自動模式。
- **下一集**倒數、本季集數清單、附圖片的章節。
- 音軌和字幕軌、0.5 到 3× 的速度、睡眠計時器、最高畫質與位元率、音量增強、播放
  資訊（編碼、直接播放或轉碼）；檔案無法播放時自動改為轉碼，再改為相容模式（H.264 + AAC），錯誤畫面會說明原因。
- 進度與 Jellyfin 同步（接續播放、「已觀看」、繼續觀看）。

### Sonnet 選項（設定 › Sonnet 選項）
每個選項都能分別針對 Jellyfin 和 Bridge Hub 開啟或關閉：
- **GSAP 動畫**：海報依序出現、頁面轉場、觸碰時的彈簧效果、輕微震動。
- **瘋狂特效**：動態極光、跟著手指轉的 3D 卡片、火花、逐字出現的標題、視差、觸碰漣漪。
- 在頁面頂端**往下拉**：捷徑（首頁、搜尋、我的最愛、重新整理、回到頂端）。
- 在詳細資料頁**點兩下海報**：加入最愛。**滑動集數**：往右 = 已看 / 未看，往左 = 加入最愛。
- **主題**：深色、AMOLED（純黑）和淺色，外加**自由選擇的強調色**。
- [GSAP](https://gsap.com)（GreenSock）已在 App 內本機內建。

### App
- **常駐**的 Jellyfin WebView：切換分頁瞬間完成，摺疊或展開都不會重新載入。
- 展開螢幕左側為**導覽列**，外螢幕則為底部導覽列。
- **原生媒體庫**（含搜尋、我的最愛、電視直播）以及相片分頁。
- 設定中包含 **Jellyfin 的所有設定**：個人資料、顯示、首頁、播放、字幕、控制項、Quick Connect，以及
  完整的管理功能（使用者、媒體庫、轉碼、外掛程式、排程工作、記錄檔、網路、電視、API 金鑰、
  備份……）。所有路徑都已在 jellyfin-web 10.11 上驗證。
- **在 Jellyfin 注入紫色強調色**（只套用在設定與管理頁面，或全部頁面），並可自訂 CSS。
- 網頁播放器全螢幕、上傳檔案（圖片、字幕）和「下載」都能正常運作。
- Android 的返回鍵會在 Jellyfin 中回到上一頁。

可以在 設定 › Sonnet 播放器 中關閉原生播放器。播放發生錯誤時，可選擇「使用 Jellyfin 網頁
播放器播放」。

## 自行編譯

需求：Android Studio（或 Android SDK）以及 JDK 17 或更新版本。

1. 在 Android Studio 中開啟專案資料夾（包含 `app/` 的那個），等 Gradle 同步完成。
2. 執行 **Build › Build APK(s)**，或在命令列中執行：
   ```
   gradlew.bat assembleDebug
   ```
3. APK 位於 `app/build/outputs/apk/debug/`，或依 Android Studio 版本位於
   `app/build/intermediates/apk/debug/`。

如果 Gradle 無法編譯，請先確認 `local.properties` 中有你的 Android SDK 路徑
（`sdk.dir=...`），且 `JAVA_HOME` 指向與你的 Gradle 版本相容的 JDK。

## 技術

Kotlin 與 Jetpack Compose，播放使用 Media3（ExoPlayer），Fold 姿態使用 `androidx.window`，海報使用 Coil，
設定使用 DataStore。最低需求 Android 8.0（API 26），目標 API 34。

## v0.5 – 參考 Jellyfin Android 的播放器
重寫了裝置設定檔（使用手機實際的解碼器），加入 Jellyfin 專案提供的 FFmpeg 音訊解碼器（AC3、E-AC3、DTS、TrueHD……），修正播放 URL（直接播放 / 直接串流 / 轉碼），使用大型網路緩衝區。透過 GitHub Actions 自動編譯。
致謝：[jellyfin-android](https://github.com/jellyfin/jellyfin-android)（GPL-2.0）。
