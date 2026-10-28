<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · **Español** · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · [Português (Brasil)](README_pt-BR.md) · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

Cliente de Android para [Jellyfin](https://jellyfin.org/), en negro y violeta, pensado para el Galaxy Z Fold.
Tienes la interfaz web de Jellyfin (Inicio, Top 10, Seguir viendo…) y, en cuanto pulsas Reproducir, un
**reproductor nativo** (ExoPlayer) toma el relevo. La app también incluye un espacio para un Bridge Hub.

Sonnet es un proyecto personal, no afiliado al proyecto Jellyfin.

## Descargar el APK

➡️ **[Descargar Sonnet v0.4 (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. El archivo también aparece
en la lista de archivos del repositorio.

Suma SHA-256 para verificar el archivo: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Instalación en Android 8.0 o posterior:
1. Descarga `sonnet.apk` directamente en el móvil.
2. Abre el archivo. Android pide permitir la instalación desde este origen (navegador o gestor de archivos): acepta.
3. Pulsa **Instalar**.

Notas:
- Es un APK de **debug** (firmado con la clave de depuración de Android Studio, identificador `com.matheo.sonnet.debug`).
- **Ninguna dirección está escrita en el código**: en el primer inicio, Sonnet te pide la dirección de tu servidor Jellyfin (y, opcionalmente,
  la de tu Bridge Hub). Puedes cambiarlas después en Ajustes.
- La app permite HTTP sin cifrar, algo práctico en una red privada (Tailscale, red local).

## Funciones

### Reproductor nativo
- **Posición de la imagen**: Arriba, Centro o Abajo (botón arriba a la derecha, o deslizar con dos dedos). En el Fold desplegado puedes
  pegar la película arriba para dejar las bandas negras abajo. La posición se recuerda por separado para la pantalla exterior y
  la pantalla desplegada.
- **±10 segundos en todas partes**: botones ⟲10 y 10⟳, y doble toque a la izquierda o a la derecha del vídeo. Cada toque extra suma 10 s.
  Doble toque en el centro = pausa. El salto es ajustable (5, 10, 15 o 30 s).
- **Subtítulos en la banda negra**: ya no tapan la imagen cuando hay sitio debajo.
- **Gestos**: brillo (lado izquierdo), volumen (lado derecho), deslizar en horizontal para avanzar o retroceder con vista previa trickplay,
  pellizcar para hacer zoom, pulsación larga para velocidad 2×, bloqueo de pantalla.
- **Modo mesa / libro** (Fold medio plegado): vídeo arriba, mando abajo.
- **Imagen en imagen automática**, reproducción que continúa al plegar o desplegar, MediaSession (Bluetooth, PiP).
- **Saltar la intro o los créditos** (segmentos de Jellyfin 10.10+ o capítulos), con botón o de forma automática.
- **Siguiente episodio** con cuenta atrás, lista de episodios de la temporada, capítulos con imágenes.
- Pistas de audio y subtítulos, velocidad de 0,5 a 3×, temporizador de apagado, calidad y bitrate máximos, amplificación de volumen, información
  de reproducción (códec, reproducción directa o transcodificación), paso automático a transcodificación y después al modo compatible (H.264 + AAC) si un archivo no se reproduce; la pantalla de error detalla la causa.
- Progreso sincronizado con Jellyfin (reanudar, «Visto», Seguir viendo).

### Opciones de Sonnet (Ajustes › Opciones de Sonnet)
Cada opción se activa o desactiva por separado, para Jellyfin y para el Bridge Hub:
- **Animaciones GSAP**: pósteres en cascada, transición de página, efecto muelle al tocar, vibraciones ligeras.
- **Efectos locos**: aurora animada, tarjetas en 3D que siguen el dedo, chispas, títulos letra a letra, paralaje, ondas al tocar.
- **Tirar hacia abajo** en la parte superior de una página: atajos (Inicio, Búsqueda, Favoritos, Actualizar, Arriba del todo).
- **Doble toque en el póster** de una ficha: favorito. **Deslizar un episodio**: a la derecha = visto / no visto, a la izquierda = favorito.
- **Temas** Oscuro, AMOLED (negro puro) y Claro, más un **color de acento libre**.
- [GSAP](https://gsap.com) (GreenSock) viene integrado localmente en la app.

### Aplicación
- WebView de Jellyfin **persistente**: cambiar de pestaña es instantáneo, plegar o desplegar no recarga nada.
- **Riel de navegación** a la izquierda en la pantalla desplegada, barra inferior en la pantalla exterior.
- **Bibliotecas nativas** (con Búsqueda, Favoritos, TV en directo) y una pestaña Fotos.
- **Todos los ajustes de Jellyfin** en Ajustes: perfil, visualización, inicio, reproducción, subtítulos, controles, Quick Connect y
  toda la administración (usuarios, bibliotecas, transcodificación, plugins, tareas, registros, red, TV, claves de API,
  copias de seguridad…). Las rutas se han comprobado con jellyfin-web 10.11.
- **Acento violeta inyectado en Jellyfin** (ajustes y administración, o en todas partes), con CSS personalizado opcional.
- Pantalla completa del reproductor web, envío de archivos (imágenes, subtítulos) y «Descargar» funcionan.
- El botón atrás de Android vuelve atrás dentro de Jellyfin.

El reproductor nativo se puede desactivar en Ajustes › Reproductor Sonnet. Si hay un error de reproducción, está disponible «Reproducir con el
reproductor web de Jellyfin».

## Compilarlo tú mismo

Requisitos: Android Studio (o el SDK de Android) y un JDK 17 o posterior.

1. Abre la carpeta del proyecto (la que contiene `app/`) en Android Studio y deja que termine la sincronización de Gradle.
2. Ejecuta **Build › Build APK(s)**, o en la línea de comandos:
   ```
   gradlew.bat assembleDebug
   ```
3. El APK está en `app/build/outputs/apk/debug/` o, según la versión de Android Studio, en
   `app/build/intermediates/apk/debug/`.

Si Gradle no consigue compilar, comprueba primero que `local.properties` contiene la ruta de tu SDK de Android
(`sdk.dir=...`) y que `JAVA_HOME` apunta a un JDK compatible con tu versión de Gradle.

## Técnica

Kotlin y Jetpack Compose, Media3 (ExoPlayer) para la reproducción, `androidx.window` para las posturas del Fold, Coil para los
pósteres, DataStore para los ajustes. Android 8.0 (API 26) como mínimo, API objetivo 34.

## v0.5 – reproductor inspirado en Jellyfin Android
Perfil de dispositivo reescrito (los decodificadores reales del móvil), decodificadores de audio FFmpeg (AC3, E-AC3, DTS, TrueHD…) proporcionados por el proyecto Jellyfin, URL de reproducción corregidas (direct play / direct stream / transcodificación), búferes de red grandes. Compilación automática con GitHub Actions.
Créditos: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
