<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · **Türkçe** · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

[Jellyfin](https://jellyfin.org/) için siyah ve mor renkli, Galaxy Z Fold düşünülerek tasarlanmış Android istemcisi.
Jellyfin web arayüzünü (Ana sayfa, Top 10, İzlemeye devam et…) aynen kullanırsın ve Oynat'a dokunduğun anda
**yerel oynatıcı** (ExoPlayer) devreye girer. Uygulamada bir Bridge Hub alanı da var.

Sonnet kişisel bir projedir, Jellyfin projesiyle bağlantısı yoktur.

## APK'yı indir

➡️ **[Sonnet v0.4'ü indir (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. Dosya ayrıca
deponun dosya listesinde de görünür.

Dosyayı doğrulamak için SHA-256 özeti: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Android 8.0 veya üstüne kurulum:
1. `sonnet.apk` dosyasını doğrudan telefona indir.
2. Dosyayı aç. Android bu kaynaktan (tarayıcı ya da dosya yöneticisi) yüklemeye izin vermeni ister: kabul et.
3. **Yükle**'ye dokun.

Notlar:
- Bu bir **debug** APK'dır (Android Studio'nun hata ayıklama anahtarıyla imzalanmış, uygulama kimliği `com.matheo.sonnet.debug`).
- **Hiçbir adres koda gömülü değildir**: ilk açılışta Sonnet, Jellyfin sunucunun adresini (ve isteğe bağlı olarak
  Bridge Hub'ının adresini) sorar. Daha sonra Ayarlar'dan değiştirebilirsin.
- Uygulama şifrelenmemiş HTTP'ye izin verir; bu, özel bir ağda (Tailscale, yerel ağ) işe yarar.

## Özellikler

### Yerel oynatıcı
- **Görüntü konumu**: Üst, Orta ya da Alt (sağ üstteki düğme ya da iki parmakla kaydırma). Açık Fold'da filmi
  üste yapıştırıp siyah bantları alta toplayabilirsin. Konum, dış ekran ve açık ekran için
  ayrı ayrı hatırlanır.
- **Her yerde ±10 saniye**: ⟲10 ve 10⟳ düğmeleri ile videonun soluna ya da sağına çift dokunma. Her ek dokunuş 10 sn ekler.
  Ortaya çift dokunma = duraklat. Adım ayarlanabilir (5, 10, 15 ya da 30 sn).
- **Siyah bantta altyazı**: altta yer varsa altyazılar artık görüntünün üstüne binmez.
- **Hareketler**: parlaklık (sol taraf), ses (sağ taraf), trickplay önizlemeli yatay kaydırarak sarma,
  iki parmakla yakınlaştırma, 2× hız için uzun basma, ekran kilidi.
- **Masaüstü / kitap modu** (Fold yarı katlı): video üstte, kumanda altta.
- **Otomatik resim içinde resim**, katlayıp açınca devam eden oynatma, MediaSession (Bluetooth, PiP).
- **Giriş ya da jeneriği atla** (Jellyfin 10.10+ segmentleri ya da bölümleri), düğme ya da otomatik modda.
- Geri sayımlı **sonraki bölüm**, sezonun bölüm listesi, görselli bölüm işaretleri.
- Ses ve altyazı parçaları, 0,5'ten 3×'e hız, uyku zamanlayıcısı, en yüksek kalite ve bit hızı, ses yükseltme, oynatma
  bilgisi (codec, doğrudan oynatma ya da kod dönüştürme); bir dosya oynatılamazsa otomatik olarak kod dönüştürmeye, ardından uyumlu moda (H.264 + AAC) geçer; hata ekranı nedeni ayrıntılı gösterir.
- Jellyfin ile senkronize ilerleme (kaldığın yerden devam, "İzlendi", İzlemeye devam et).

### Sonnet seçenekleri (Ayarlar › Sonnet seçenekleri)
Her seçenek Jellyfin ve Bridge Hub için ayrı ayrı açılıp kapatılabilir:
- **GSAP animasyonları**: art arda beliren afişler, sayfa geçişleri, dokunuşta yay efekti, hafif titreşimler.
- **Çılgın efektler**: hareketli kutup ışıkları, parmağı takip eden 3B kartlar, kıvılcımlar, harf harf beliren başlıklar, paralaks, dokunuş dalgaları.
- Bir sayfanın en üstünde **aşağı çekme**: kısayollar (Ana sayfa, Arama, Favoriler, Yenile, Sayfa başı).
- Bir detay sayfasında **afişe çift dokunma**: favori. **Bir bölümü kaydırma**: sağa = izlendi / izlenmedi, sola = favori.
- **Temalar**: Koyu, AMOLED (saf siyah) ve Açık, ayrıca **serbest vurgu rengi**.
- [GSAP](https://gsap.com) (GreenSock) uygulamanın içinde yerel olarak bulunur.

### Uygulama
- **Kalıcı** Jellyfin WebView: sekme değiştirmek anında olur, katlamak ya da açmak hiçbir şeyi yeniden yüklemez.
- Açık ekranda solda **gezinme rayı**, dış ekranda alt çubuk.
- **Yerel kitaplıklar** (Arama, Favoriler, Canlı TV ile) ve bir Fotoğraflar sekmesi.
- Ayarlar'da **Jellyfin'in tüm ayarları**: profil, görünüm, ana sayfa, oynatma, altyazılar, kontroller, Quick Connect ve
  tüm yönetim (kullanıcılar, kitaplıklar, kod dönüştürme, eklentiler, görevler, günlükler, ağ, TV, API anahtarları,
  yedekler…). Yollar jellyfin-web 10.11 üzerinde doğrulandı.
- **Jellyfin'e enjekte edilen mor vurgu** (ayarlar ve yönetim ya da her yer), isteğe bağlı özel CSS ile.
- Web oynatıcının tam ekranı, dosya gönderme (görseller, altyazılar) ve "İndir" çalışır.
- Android'in geri düğmesi Jellyfin içinde geri gider.

Yerel oynatıcı Ayarlar › Sonnet oynatıcısı'ndan kapatılabilir. Oynatma hatasında "Jellyfin web
oynatıcısıyla oynat" seçeneği kullanılabilir.

## Kendin derle

Gerekenler: Android Studio (ya da Android SDK) ve JDK 17 veya üstü.

1. Proje klasörünü (`app/` içeren klasör) Android Studio'da aç ve Gradle senkronizasyonunun bitmesini bekle.
2. **Build › Build APK(s)** komutunu çalıştır ya da komut satırından:
   ```
   gradlew.bat assembleDebug
   ```
3. APK, `app/build/outputs/apk/debug/` içinde ya da Android Studio sürümüne göre
   `app/build/intermediates/apk/debug/` içindedir.

Gradle derleyemezse önce `local.properties` dosyasının Android SDK'nın yolunu
(`sdk.dir=...`) içerdiğini ve `JAVA_HOME` değişkeninin Gradle sürümünle uyumlu bir JDK'yı gösterdiğini kontrol et.

## Teknik

Kotlin ve Jetpack Compose, oynatma için Media3 (ExoPlayer), Fold duruşları için `androidx.window`, afişler için Coil,
ayarlar için DataStore. En az Android 8.0 (API 26), hedef API 34.

## v0.5 – Jellyfin Android'den esinlenen oynatıcı
Yeniden yazılan cihaz profili (telefonun gerçek kod çözücüleri), Jellyfin projesinin sağladığı FFmpeg ses kod çözücüleri (AC3, E-AC3, DTS, TrueHD…), düzeltilmiş oynatma URL'leri (doğrudan oynatma / doğrudan akış / kod dönüştürme), büyük ağ arabellekleri. GitHub Actions ile otomatik derleme.
Teşekkür: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
