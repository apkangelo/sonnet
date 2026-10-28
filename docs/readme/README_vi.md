<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · **Tiếng Việt** · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

Ứng dụng khách Android cho [Jellyfin](https://jellyfin.org/), tông đen và tím, được thiết kế cho Galaxy Z Fold.
Bạn dùng lại giao diện web của Jellyfin (Trang chủ, Top 10, Xem tiếp…) và ngay khi bấm Phát,
**trình phát native** (ExoPlayer) sẽ tiếp quản. Ứng dụng còn có một khu vực dành cho Bridge Hub.

Sonnet là dự án cá nhân, không liên kết với dự án Jellyfin.

## Tải APK

➡️ **[Tải Sonnet v0.4 (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, dung lượng 22 MB. Tệp này cũng hiển thị
trong danh sách tệp của kho mã.

Mã băm SHA-256 để kiểm tra tệp: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Cài đặt trên Android 8.0 trở lên:
1. Tải `sonnet.apk` trực tiếp về điện thoại.
2. Mở tệp. Android sẽ yêu cầu cho phép cài đặt từ nguồn này (trình duyệt hoặc trình quản lý tệp): hãy đồng ý.
3. Nhấn **Cài đặt**.

Lưu ý:
- Đây là APK **debug** (ký bằng khóa debug của Android Studio, mã ứng dụng `com.matheo.sonnet.debug`).
- **Không có địa chỉ nào được viết cứng**: ở lần mở đầu tiên, Sonnet sẽ hỏi địa chỉ máy chủ Jellyfin của bạn (và, nếu muốn,
  địa chỉ Bridge Hub). Bạn có thể đổi lại sau trong Cài đặt.
- Ứng dụng cho phép HTTP không mã hóa, tiện khi dùng trong mạng riêng (Tailscale, mạng nội bộ).

## Tính năng

### Trình phát native
- **Vị trí khung hình**: Trên, Giữa hoặc Dưới (nút ở góc trên bên phải, hoặc vuốt hai ngón). Trên Fold khi mở ra, bạn có thể
  dán phim lên phía trên để dồn các dải đen xuống dưới. Vị trí được ghi nhớ riêng cho màn hình ngoài và
  màn hình khi mở.
- **±10 giây ở mọi nơi**: nút ⟲10 và 10⟳, và chạm hai lần vào bên trái hoặc bên phải video. Mỗi lần chạm thêm cộng 10 giây.
  Chạm hai lần ở giữa = tạm dừng. Bước tua có thể chỉnh (5, 10, 15 hoặc 30 giây).
- **Phụ đề trong dải đen**: phụ đề không còn che hình khi phía dưới còn chỗ.
- **Cử chỉ**: độ sáng (bên trái), âm lượng (bên phải), vuốt ngang để tua kèm xem trước trickplay,
  chụm để phóng to, nhấn giữ để phát tốc độ 2×, khóa màn hình.
- **Chế độ để bàn / sách** (Fold gập một nửa): video ở trên, bảng điều khiển ở dưới.
- **Hình trong hình tự động**, phát tiếp khi gập hoặc mở máy, MediaSession (Bluetooth, PiP).
- **Bỏ qua đoạn mở đầu hoặc kết thúc** (phân đoạn Jellyfin 10.10+ hoặc chương), dạng nút hoặc tự động.
- **Tập tiếp theo** có đếm ngược, danh sách tập của mùa, chương có hình ảnh.
- Rãnh âm thanh và phụ đề, tốc độ từ 0,5 đến 3×, hẹn giờ ngủ, chất lượng và bitrate tối đa, tăng âm lượng, thông tin
  phát (codec, phát trực tiếp hay chuyển mã); nếu tệp không phát được thì tự chuyển sang chuyển mã, rồi sang chế độ tương thích (H.264 + AAC), màn hình lỗi sẽ giải thích nguyên nhân.
- Tiến độ đồng bộ với Jellyfin (xem tiếp, "Đã xem", Xem tiếp).

### Tùy chọn Sonnet (Cài đặt › Tùy chọn Sonnet)
Mỗi tùy chọn có thể bật hoặc tắt riêng, cho Jellyfin và cho Bridge Hub:
- **Hiệu ứng GSAP**: áp phích xuất hiện lần lượt, chuyển trang, hiệu ứng lò xo khi chạm, rung nhẹ.
- **Hiệu ứng điên rồ**: cực quang động, thẻ 3D nghiêng theo ngón tay, tia lửa, tiêu đề hiện từng chữ, parallax, gợn sóng khi chạm.
- **Kéo xuống** ở đầu trang: lối tắt (Trang chủ, Tìm kiếm, Yêu thích, Làm mới, Lên đầu trang).
- **Chạm hai lần vào áp phích** ở trang chi tiết: yêu thích. **Vuốt một tập**: sang phải = đã xem / chưa xem, sang trái = yêu thích.
- **Giao diện** Tối, AMOLED (đen tuyền) và Sáng, cùng **màu nhấn tự chọn**.
- [GSAP](https://gsap.com) (GreenSock) được tích hợp sẵn cục bộ trong ứng dụng.

### Ứng dụng
- WebView Jellyfin **thường trực**: chuyển thẻ tức thì, gập hay mở máy không tải lại gì.
- **Thanh điều hướng** bên trái trên màn hình khi mở, thanh dưới cùng trên màn hình ngoài.
- **Thư viện native** (có Tìm kiếm, Yêu thích, TV trực tiếp) và một thẻ Ảnh.
- **Mọi cài đặt của Jellyfin** trong Cài đặt: hồ sơ, hiển thị, trang chủ, phát, phụ đề, điều khiển, Quick Connect, và
  toàn bộ phần quản trị (người dùng, thư viện, chuyển mã, plugin, tác vụ, nhật ký, mạng, TV, khóa API,
  sao lưu…). Các đường dẫn đã được kiểm tra trên jellyfin-web 10.11.
- **Màu nhấn tím được chèn vào Jellyfin** (phần cài đặt và quản trị, hoặc ở mọi nơi), có thể dùng CSS tùy chỉnh.
- Toàn màn hình của trình phát web, tải tệp lên (ảnh, phụ đề) và nút "Tải xuống" đều hoạt động.
- Nút quay lại của Android sẽ quay lại trong Jellyfin.

Trình phát native có thể tắt trong Cài đặt › Trình phát Sonnet. Khi phát bị lỗi, có tùy chọn "Phát bằng trình phát web
của Jellyfin".

## Tự biên dịch

Yêu cầu: Android Studio (hoặc Android SDK) và JDK 17 trở lên.

1. Mở thư mục dự án (thư mục chứa `app/`) trong Android Studio và đợi Gradle đồng bộ xong.
2. Chạy **Build › Build APK(s)**, hoặc từ dòng lệnh:
   ```
   gradlew.bat assembleDebug
   ```
3. APK nằm trong `app/build/outputs/apk/debug/` hoặc, tùy phiên bản Android Studio, trong
   `app/build/intermediates/apk/debug/`.

Nếu Gradle không biên dịch được, trước tiên hãy kiểm tra `local.properties` có chứa đường dẫn tới Android SDK của bạn
(`sdk.dir=...`) và `JAVA_HOME` trỏ tới một JDK tương thích với phiên bản Gradle của bạn.

## Kỹ thuật

Kotlin và Jetpack Compose, Media3 (ExoPlayer) để phát, `androidx.window` cho các tư thế của Fold, Coil cho
áp phích, DataStore cho cài đặt. Tối thiểu Android 8.0 (API 26), API mục tiêu 34.

## v0.5 – trình phát lấy cảm hứng từ Jellyfin Android
Viết lại hồ sơ thiết bị (bộ giải mã thực của điện thoại), bộ giải mã âm thanh FFmpeg (AC3, E-AC3, DTS, TrueHD…) do dự án Jellyfin cung cấp, sửa URL phát (phát trực tiếp / luồng trực tiếp / chuyển mã), bộ đệm mạng lớn. Biên dịch tự động qua GitHub Actions.
Ghi công: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
