<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · **한국어** · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

[Jellyfin](https://jellyfin.org/)용 Android 클라이언트로, 검정과 보라색 디자인에 Galaxy Z Fold를 염두에 두고 만들었습니다.
Jellyfin 웹 인터페이스(홈, Top 10, 이어 보기…)를 그대로 쓰다가, 재생을 누르는 순간
**네이티브 플레이어**(ExoPlayer)가 이어받습니다. 앱에는 Bridge Hub 공간도 들어 있습니다.

Sonnet은 개인 프로젝트이며 Jellyfin 프로젝트와는 관련이 없습니다.

## APK 다운로드

➡️ **[Sonnet v0.4 다운로드(`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22MB. 이 파일은
저장소의 파일 목록에서도 볼 수 있습니다.

파일 확인용 SHA-256 해시: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Android 8.0 이상에서 설치하기:
1. 휴대폰에서 `sonnet.apk`를 직접 다운로드합니다.
2. 파일을 엽니다. Android가 이 출처(브라우저 또는 파일 관리자)에서의 설치를 허용할지 물으면 허용합니다.
3. **설치**를 누릅니다.

참고:
- **debug** APK입니다(Android Studio의 디버그 키로 서명, 앱 ID `com.matheo.sonnet.debug`).
- **주소가 하드코딩되어 있지 않습니다**: 처음 실행할 때 Sonnet이 Jellyfin 서버 주소(그리고 선택적으로
  Bridge Hub 주소)를 묻습니다. 나중에 설정에서 바꿀 수 있습니다.
- 앱은 암호화되지 않은 HTTP를 허용하므로 사설 네트워크(Tailscale, 로컬 네트워크)에서 편리합니다.

## 기능

### 네이티브 플레이어
- **화면 위치**: 위, 가운데, 아래(오른쪽 위 버튼 또는 두 손가락 스와이프). 펼친 Fold에서는
  영상을 위쪽에 붙여 검은 띠를 아래로 몰 수 있습니다. 위치는 커버 화면과 펼친 화면에서 따로 기억됩니다.
- **어디서나 ±10초**: ⟲10과 10⟳ 버튼, 영상 왼쪽이나 오른쪽 더블 탭. 탭할 때마다 10초씩 더해집니다.
  가운데 더블 탭 = 일시 정지. 간격은 조정 가능(5, 10, 15, 30초).
- **검은 띠 안의 자막**: 아래에 공간이 있으면 자막이 더 이상 화면을 가리지 않습니다.
- **제스처**: 밝기(왼쪽), 볼륨(오른쪽), 가로 스와이프로 trickplay 미리보기와 함께 탐색,
  핀치 확대, 길게 눌러 2배속, 화면 잠금.
- **테이블톱 / 북 모드**(Fold를 반쯤 접은 상태): 위에는 영상, 아래에는 리모컨.
- **자동 PIP**, 접거나 펼쳐도 계속되는 재생, MediaSession(블루투스, PIP).
- **인트로나 엔딩 건너뛰기**(Jellyfin 10.10+ 세그먼트 또는 챕터), 버튼 방식 또는 자동.
- 카운트다운이 있는 **다음 에피소드**, 시즌 에피소드 목록, 이미지가 있는 챕터.
- 오디오 및 자막 트랙, 0.5~3배속, 수면 타이머, 최대 화질과 비트레이트, 볼륨 증폭, 재생
  정보(코덱, 다이렉트 재생 또는 트랜스코딩). 파일이 재생되지 않으면 자동으로 트랜스코딩, 그다음 호환 모드(H.264 + AAC)로 전환하며, 오류 화면에서 원인을 자세히 알려 줍니다.
- Jellyfin과 진행 상황 동기화(이어서 재생, "시청함", 이어 보기).

### Sonnet 옵션(설정 › Sonnet 옵션)
각 옵션은 Jellyfin과 Bridge Hub에서 따로 켜고 끌 수 있습니다:
- **GSAP 애니메이션**: 포스터가 차례로 나타나는 효과, 페이지 전환, 터치 시 스프링 효과, 가벼운 진동.
- **화려한 효과**: 움직이는 오로라, 손가락을 따라 기우는 3D 카드, 불꽃, 한 글자씩 나타나는 제목, 패럴랙스, 터치 물결.
- 페이지 맨 위에서 **아래로 당기기**: 바로 가기(홈, 검색, 즐겨찾기, 새로 고침, 맨 위로).
- 상세 페이지에서 **포스터 더블 탭**: 즐겨찾기. **에피소드 스와이프**: 오른쪽 = 봄 / 안 봄, 왼쪽 = 즐겨찾기.
- **테마**: 다크, AMOLED(완전한 검정), 라이트, 그리고 **자유 강조 색상**.
- [GSAP](https://gsap.com)(GreenSock)은 앱 안에 로컬로 포함되어 있습니다.

### 앱
- **상주하는** Jellyfin WebView: 탭 전환이 즉시 이루어지고, 접거나 펼쳐도 다시 불러오지 않습니다.
- 펼친 화면에서는 왼쪽에 **내비게이션 레일**, 커버 화면에서는 하단 바.
- **네이티브 라이브러리**(검색, 즐겨찾기, 실시간 TV 포함)와 사진 탭.
- 설정 안의 **Jellyfin 전체 설정**: 프로필, 표시, 홈, 재생, 자막, 컨트롤, Quick Connect, 그리고
  관리 기능 전체(사용자, 라이브러리, 트랜스코딩, 플러그인, 작업, 로그, 네트워크, TV, API 키,
  백업…). 모든 경로는 jellyfin-web 10.11에서 확인했습니다.
- **Jellyfin에 보라색 강조색 주입**(설정과 관리 화면만, 또는 전체), 사용자 지정 CSS도 가능.
- 웹 플레이어 전체 화면, 파일 업로드(이미지, 자막), "다운로드"가 모두 동작합니다.
- Android 뒤로 가기 버튼으로 Jellyfin 안에서 이전 화면으로 돌아갑니다.

네이티브 플레이어는 설정 › Sonnet 플레이어에서 끌 수 있습니다. 재생 오류가 나면 "Jellyfin 웹
플레이어로 재생"을 선택할 수 있습니다.

## 직접 빌드하기

필요한 것: Android Studio(또는 Android SDK)와 JDK 17 이상.

1. 프로젝트 폴더(`app/`이 들어 있는 폴더)를 Android Studio에서 열고 Gradle 동기화가 끝날 때까지 기다립니다.
2. **Build › Build APK(s)**를 실행하거나, 명령줄에서 다음을 실행합니다:
   ```
   gradlew.bat assembleDebug
   ```
3. APK는 `app/build/outputs/apk/debug/`에, Android Studio 버전에 따라서는
   `app/build/intermediates/apk/debug/`에 있습니다.

Gradle 빌드가 실패하면 먼저 `local.properties`에 Android SDK 경로
(`sdk.dir=...`)가 들어 있는지, `JAVA_HOME`이 사용 중인 Gradle 버전과 호환되는 JDK를 가리키는지 확인하세요.

## 기술 정보

Kotlin과 Jetpack Compose, 재생에는 Media3(ExoPlayer), Fold 자세 감지에는 `androidx.window`, 포스터에는 Coil,
설정에는 DataStore. 최소 Android 8.0(API 26), 타깃 API 34.

## v0.5 – Jellyfin Android에서 영감을 받은 플레이어
기기 프로필을 새로 작성했고(휴대폰의 실제 디코더), Jellyfin 프로젝트가 제공하는 FFmpeg 오디오 디코더(AC3, E-AC3, DTS, TrueHD…)를 넣었으며, 재생 URL을 수정했고(다이렉트 재생 / 다이렉트 스트림 / 트랜스코딩), 네트워크 버퍼를 크게 늘렸습니다. GitHub Actions로 자동 빌드됩니다.
크레딧: [jellyfin-android](https://github.com/jellyfin/jellyfin-android)(GPL-2.0).
