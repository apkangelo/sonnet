<div align="center">

[English](README_en.md) · **简体中文** · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

[Jellyfin](https://jellyfin.org/) 的 Android 客户端，黑紫配色，专为 Galaxy Z Fold 设计。
你可以使用 Jellyfin 网页界面（首页、Top 10、继续观看……），一旦点击播放，
**原生播放器**（ExoPlayer）就会接管。应用还集成了 Bridge Hub 专区。

Sonnet 是个人项目，与 Jellyfin 项目无关。

## 下载 APK

➡️ **[下载 Sonnet v0.4（`sonnet.apk`）](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**，大小 22 MB。该文件也可以在
仓库的文件列表中看到。

用于校验文件的 SHA-256 值：`3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

在 Android 8.0 或更高版本上安装：
1. 直接在手机上下载 `sonnet.apk`。
2. 打开文件。Android 会要求允许从该来源（浏览器或文件管理器）安装：同意即可。
3. 点击**安装**。

说明：
- 这是一个 **debug** APK（使用 Android Studio 的调试密钥签名，应用 ID 为 `com.matheo.sonnet.debug`）。
- **没有写死任何地址**：首次启动时，Sonnet 会询问你的 Jellyfin 服务器地址（以及可选的
  Bridge Hub 地址）。之后可以在设置中修改。
- 应用允许未加密的 HTTP，在私有网络（Tailscale、局域网）中很方便。

## 功能

### 原生播放器
- **画面位置**：顶部、居中或底部（右上角按钮，或双指滑动）。在展开的 Fold 上，可以
  把影片贴到顶部，让黑边留在下方。外屏和展开屏的位置分别记忆。
- **随处 ±10 秒**：⟲10 和 10⟳ 按钮，以及在视频左侧或右侧双击。每多点一次再加 10 秒。
  中间双击 = 暂停。步长可调（5、10、15 或 30 秒）。
- **字幕显示在黑边中**：下方有空间时，字幕不再遮挡画面。
- **手势**：亮度（左侧）、音量（右侧）、水平滑动快进/快退并带 trickplay 预览、
  双指缩放、长按 2× 倍速、锁定屏幕。
- **桌面 / 书本模式**（Fold 半折叠）：视频在上，遥控在下。
- **自动画中画**，折叠或展开时继续播放，MediaSession（蓝牙、画中画）。
- **跳过片头或片尾**（Jellyfin 10.10+ 的片段或章节），按钮或自动模式。
- **下一集**倒计时、本季剧集列表、带缩略图的章节。
- 音轨和字幕轨、0.5 到 3× 的倍速、睡眠定时器、最高画质和码率、音量增强、播放
  信息（编码、直接播放或转码）；文件无法播放时自动回退到转码，再回退到兼容模式（H.264 + AAC），错误页面会说明原因。
- 进度与 Jellyfin 同步（续播、"已观看"、继续观看）。

### Sonnet 选项（设置 › Sonnet 选项）
每个选项都可以分别为 Jellyfin 和 Bridge Hub 单独开启或关闭：
- **GSAP 动画**：海报依次出现、页面过渡、触摸时的弹性效果、轻微振动。
- **疯狂特效**：动态极光、跟随手指的 3D 卡片、火花、逐字出现的标题、视差、触摸波纹。
- 在页面顶部**下拉**：快捷方式（首页、搜索、收藏、刷新、回到顶部）。
- 在详情页**双击海报**：收藏。**滑动剧集**：向右 = 已看 / 未看，向左 = 收藏。
- **主题**：深色、AMOLED（纯黑）和浅色，以及**自由选择的强调色**。
- [GSAP](https://gsap.com)（GreenSock）已本地内置在应用中。

### 应用
- **常驻**的 Jellyfin WebView：切换标签页即时完成，折叠或展开都不会重新加载。
- 展开屏左侧为**导航栏**，外屏为底部导航栏。
- **原生媒体库**（含搜索、收藏、电视直播）以及照片标签页。
- 设置中包含 **Jellyfin 的全部设置**：个人资料、显示、首页、播放、字幕、控件、Quick Connect，以及
  全部管理功能（用户、媒体库、转码、插件、计划任务、日志、网络、电视、API 密钥、
  备份……）。所有路由都已在 jellyfin-web 10.11 上验证。
- **向 Jellyfin 注入紫色强调色**（仅设置和管理页面，或全部页面），并可使用自定义 CSS。
- 网页播放器全屏、上传文件（图片、字幕）和"下载"都可正常使用。
- Android 返回键会在 Jellyfin 中返回上一页。

可以在 设置 › Sonnet 播放器 中关闭原生播放器。播放出错时，可选择"用 Jellyfin 网页
播放器播放"。

## 自行编译

前提条件：Android Studio（或 Android SDK）以及 JDK 17 或更高版本。

1. 在 Android Studio 中打开项目文件夹（包含 `app/` 的那个），等待 Gradle 同步完成。
2. 执行 **Build › Build APK(s)**，或在命令行中运行：
   ```
   gradlew.bat assembleDebug
   ```
3. APK 位于 `app/build/outputs/apk/debug/`，或根据 Android Studio 版本位于
   `app/build/intermediates/apk/debug/`。

如果 Gradle 无法编译，请先确认 `local.properties` 中有你的 Android SDK 路径
（`sdk.dir=...`），并且 `JAVA_HOME` 指向与你的 Gradle 版本兼容的 JDK。

## 技术

Kotlin 和 Jetpack Compose，播放使用 Media3（ExoPlayer），Fold 姿态使用 `androidx.window`，海报使用 Coil，
设置使用 DataStore。最低 Android 8.0（API 26），目标 API 34。

## v0.5 – 借鉴 Jellyfin Android 的播放器
重写了设备配置文件（使用手机真实的解码器），加入由 Jellyfin 项目提供的 FFmpeg 音频解码器（AC3、E-AC3、DTS、TrueHD……），修正了播放 URL（直接播放 / 直接串流 / 转码），使用大容量网络缓冲。通过 GitHub Actions 自动编译。
致谢：[jellyfin-android](https://github.com/jellyfin/jellyfin-android)（GPL-2.0）。
