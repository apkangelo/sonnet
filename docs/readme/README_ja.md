<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · **日本語** · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

[Jellyfin](https://jellyfin.org/) 用の Android クライアント。黒と紫のデザインで、Galaxy Z Fold 向けに作られています。
Jellyfin の Web インターフェース（ホーム、トップ 10、続きを見る……）がそのまま使え、再生をタップすると
**ネイティブプレーヤー**（ExoPlayer）に切り替わります。Bridge Hub 用のスペースも組み込まれています。

Sonnet は個人プロジェクトであり、Jellyfin プロジェクトとは関係ありません。

## APK のダウンロード

➡️ **[Sonnet v0.4 をダウンロード（`sonnet.apk`）](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**（22 MB）。このファイルは
リポジトリのファイル一覧にも表示されています。

ファイル確認用の SHA-256 ハッシュ：`3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Android 8.0 以降でのインストール：
1. スマホで `sonnet.apk` を直接ダウンロードします。
2. ファイルを開きます。Android がこの提供元（ブラウザまたはファイルマネージャー）からのインストール許可を求めるので、許可します。
3. **インストール**をタップします。

補足：
- これは **debug** 版の APK です（Android Studio のデバッグ鍵で署名、アプリ ID は `com.matheo.sonnet.debug`）。
- **アドレスはハードコードされていません**：初回起動時に Jellyfin サーバーのアドレス（必要なら
  Bridge Hub のアドレスも）を尋ねます。あとから設定で変更できます。
- アプリは暗号化されていない HTTP を許可しているため、プライベートネットワーク（Tailscale、ローカルネットワーク）で便利です。

## 機能

### ネイティブプレーヤー
- **映像の位置**：上・中央・下（右上のボタン、または 2 本指スワイプ）。開いた Fold では、
  映画を上に寄せて黒帯を下にまとめられます。位置はカバー画面と開いた画面で別々に記憶されます。
- **どこでも ±10 秒**：⟲10 と 10⟳ ボタン、動画の左側または右側をダブルタップ。追加のタップごとに 10 秒ずつ進みます。
  中央をダブルタップ = 一時停止。間隔は調整可能（5、10、15、30 秒）。
- **字幕を黒帯に表示**：下に余白があれば、字幕が映像に重なりません。
- **ジェスチャー**：明るさ（左側）、音量（右側）、横スワイプで trickplay プレビュー付きシーク、
  ピンチでズーム、長押しで 2 倍速、画面ロック。
- **テーブルトップ / ブックモード**（Fold を半分折りたたんだ状態）：上に動画、下にリモコン。
- **自動ピクチャー・イン・ピクチャー**、折りたたんだり開いたりしても再生が続く、MediaSession（Bluetooth、PiP）。
- **イントロやエンディングのスキップ**（Jellyfin 10.10 以降のセグメントまたはチャプター）、ボタン式または自動。
- カウントダウン付きの**次のエピソード**、シーズンのエピソード一覧、画像付きチャプター。
- 音声トラックと字幕トラック、0.5〜3 倍速、スリープタイマー、最大画質とビットレート、音量ブースト、再生
  情報（コーデック、ダイレクト再生かトランスコードか）。ファイルが再生できないときは自動でトランスコード、さらに互換モード（H.264 + AAC）に切り替え、エラー画面に原因を詳しく表示します。
- 進行状況を Jellyfin と同期（再開、「視聴済み」、続きを見る）。

### Sonnet のオプション（設定 › Sonnet のオプション）
各オプションは Jellyfin と Bridge Hub で別々にオン / オフできます：
- **GSAP アニメーション**：ポスターが順に現れる演出、ページ遷移、タッチ時のバネ効果、軽いバイブレーション。
- **ド派手エフェクト**：動くオーロラ、指に合わせて傾く 3D カード、火花、1 文字ずつ現れるタイトル、パララックス、タッチの波紋。
- ページの上端で**下に引く**：ショートカット（ホーム、検索、お気に入り、更新、ページの先頭へ）。
- 詳細ページで**ポスターをダブルタップ**：お気に入り。**エピソードをスワイプ**：右 = 視聴済み / 未視聴、左 = お気に入り。
- **テーマ**：ダーク、AMOLED（純粋な黒）、ライト。さらに**自由なアクセントカラー**。
- [GSAP](https://gsap.com)（GreenSock）はアプリ内にローカルで同梱されています。

### アプリ
- **常駐する** Jellyfin WebView：タブの切り替えは一瞬で、折りたたんでも開いても再読み込みされません。
- 開いた画面では左に**ナビゲーションレール**、カバー画面では下部バー。
- **ネイティブのライブラリ**（検索、お気に入り、ライブ TV 付き）と写真タブ。
- 設定に **Jellyfin のすべての設定**：プロフィール、表示、ホーム、再生、字幕、操作、Quick Connect、そして
  管理機能すべて（ユーザー、ライブラリ、トランスコード、プラグイン、タスク、ログ、ネットワーク、TV、API キー、
  バックアップ……）。各ルートは jellyfin-web 10.11 で確認済みです。
- **Jellyfin に紫のアクセントを注入**（設定と管理画面のみ、またはすべて）、カスタム CSS も可能。
- Web プレーヤーの全画面表示、ファイルのアップロード（画像、字幕）、「ダウンロード」が動作します。
- Android の戻るボタンで Jellyfin 内の前の画面に戻ります。

ネイティブプレーヤーは 設定 › Sonnet プレーヤー で無効にできます。再生エラーのときは「Jellyfin Web
プレーヤーで再生」を選べます。

## 自分でビルドする

必要なもの：Android Studio（または Android SDK）と JDK 17 以降。

1. プロジェクトフォルダー（`app/` を含むフォルダー）を Android Studio で開き、Gradle の同期が終わるのを待ちます。
2. **Build › Build APK(s)** を実行するか、コマンドラインで次を実行します：
   ```
   gradlew.bat assembleDebug
   ```
3. APK は `app/build/outputs/apk/debug/`、または Android Studio のバージョンによっては
   `app/build/intermediates/apk/debug/` にあります。

Gradle でビルドできない場合は、まず `local.properties` に Android SDK のパス
（`sdk.dir=...`）が書かれているか、`JAVA_HOME` が使用中の Gradle のバージョンに対応した JDK を指しているかを確認してください。

## 技術情報

Kotlin と Jetpack Compose、再生には Media3（ExoPlayer）、Fold の姿勢検出には `androidx.window`、ポスターには Coil、
設定には DataStore。最小 Android 8.0（API 26）、ターゲット API 34。

## v0.5 – Jellyfin Android をお手本にしたプレーヤー
デバイスプロファイルを書き直し（スマホの実際のデコーダー）、Jellyfin プロジェクト提供の FFmpeg 音声デコーダー（AC3、E-AC3、DTS、TrueHD……）を導入、再生 URL を修正（ダイレクト再生 / ダイレクトストリーム / トランスコード）、大きなネットワークバッファ。GitHub Actions による自動ビルド。
クレジット：[jellyfin-android](https://github.com/jellyfin/jellyfin-android)（GPL-2.0）。
