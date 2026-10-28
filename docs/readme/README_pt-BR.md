<div align="center">

[English](README_en.md) · [简体中文](README_zh.md) · [繁體中文](README_zh-TW.md) · [日本語](README_ja.md) · [한국어](README_ko.md) · [Türkçe](README_tr.md) · [Русский](README_ru.md) · [Tiếng Việt](README_vi.md) · [ไทย](README_th.md) · [Deutsch](README_de.md) · [Español](README_es.md) · [Français](../../README.md) · [Українська](README_uk.md) · [Polski](README_pl.md) · **Português (Brasil)** · [العربية](README_ar.md) · [فارسی](README_fa.md) · [Bahasa Indonesia](README_id.md) · [Italiano](README_it.md)
· [Ελληνικά](README_el.md) · [മലയാളം](README_ml.md) · [Roman Urdu](README_ur-Latn.md) · [Română](README_ro.md)

</div>

# Sonnet

Cliente Android para o [Jellyfin](https://jellyfin.org/), em preto e roxo, pensado para o Galaxy Z Fold.
Você usa a interface web do Jellyfin (Início, Top 10, Continuar assistindo…) e, assim que toca em Reproduzir, um
**player nativo** (ExoPlayer) assume. O app também traz um espaço para um Bridge Hub.

O Sonnet é um projeto pessoal, sem vínculo com o projeto Jellyfin.

## Baixar o APK

➡️ **[Baixar o Sonnet v0.4 (`sonnet.apk`)](https://github.com/apk-fold/sonnet/raw/main/sonnet.apk)**, 22 MB. O arquivo também aparece
na lista de arquivos do repositório.

Soma SHA-256 para verificar o arquivo: `3a39339de771e0e0ab1326ded792f8eab62249b5476c74f9073505ba82328a3d`

Instalação no Android 8.0 ou mais recente:
1. Baixe `sonnet.apk` diretamente no celular.
2. Abra o arquivo. O Android pede para permitir a instalação a partir desta fonte (navegador ou gerenciador de arquivos): aceite.
3. Toque em **Instalar**.

Observações:
- É um APK de **debug** (assinado com a chave de depuração do Android Studio, identificador `com.matheo.sonnet.debug`).
- **Nenhum endereço está fixo no código**: na primeira abertura, o Sonnet pede o endereço do seu servidor Jellyfin (e, opcionalmente,
  o do seu Bridge Hub). Você pode alterá-los depois em Configurações.
- O app permite HTTP sem criptografia, o que é prático em uma rede privada (Tailscale, rede local).

## Recursos

### Player nativo
- **Posição da imagem**: Topo, Centro ou Base (botão no canto superior direito, ou deslizar com dois dedos). No Fold aberto, você pode
  colar o filme no topo para deixar as faixas pretas embaixo. A posição é lembrada separadamente para a tela externa e
  a tela aberta.
- **±10 segundos em todo lugar**: botões ⟲10 e 10⟳, e toque duplo à esquerda ou à direita do vídeo. Cada toque a mais soma 10 s.
  Toque duplo no centro = pausa. O intervalo é ajustável (5, 10, 15 ou 30 s).
- **Legendas na faixa preta**: elas não cobrem mais a imagem quando há espaço embaixo.
- **Gestos**: brilho (lado esquerdo), volume (lado direito), deslizar na horizontal para avançar com prévia trickplay,
  pinça para zoom, toque longo para velocidade 2×, bloqueio da tela.
- **Modo mesa / livro** (Fold meio dobrado): vídeo em cima, controle embaixo.
- **Picture-in-picture automático**, reprodução que continua ao dobrar ou abrir, MediaSession (Bluetooth, PiP).
- **Pular abertura ou créditos** (segmentos do Jellyfin 10.10+ ou capítulos), por botão ou automaticamente.
- **Próximo episódio** com contagem regressiva, lista de episódios da temporada, capítulos com imagens.
- Faixas de áudio e legendas, velocidade de 0,5 a 3×, timer para dormir, qualidade e taxa de bits máximas, reforço de volume, informações
  de reprodução (codec, reprodução direta ou transcodificação), troca automática para transcodificação e depois para o modo compatível (H.264 + AAC) se um arquivo não tocar; a tela de erro detalha a causa.
- Progresso sincronizado com o Jellyfin (retomar, "Assistido", Continuar assistindo).

### Opções do Sonnet (Configurações › Opções do Sonnet)
Cada opção é ligada ou desligada separadamente, para o Jellyfin e para o Bridge Hub:
- **Animações GSAP**: pôsteres em cascata, transição de página, efeito mola ao tocar, vibrações leves.
- **Efeitos malucos**: aurora animada, cards em 3D que seguem o dedo, faíscas, títulos letra por letra, parallax, ondas ao tocar.
- **Puxar para baixo** no topo de uma página: atalhos (Início, Busca, Favoritos, Atualizar, Topo da página).
- **Toque duplo no pôster** de uma página de detalhes: favorito. **Deslizar um episódio**: para a direita = assistido / não assistido, para a esquerda = favorito.
- **Temas** Escuro, AMOLED (preto puro) e Claro, além de uma **cor de destaque livre**.
- O [GSAP](https://gsap.com) (GreenSock) vem embutido localmente no app.

### Aplicativo
- WebView do Jellyfin **persistente**: trocar de aba é instantâneo, dobrar ou abrir não recarrega nada.
- **Trilho de navegação** à esquerda na tela aberta, barra inferior na tela externa.
- **Bibliotecas nativas** (com Busca, Favoritos, TV ao vivo) e uma aba Fotos.
- **Todas as configurações do Jellyfin** em Configurações: perfil, exibição, início, reprodução, legendas, controles, Quick Connect e
  toda a administração (usuários, bibliotecas, transcodificação, plugins, tarefas, logs, rede, TV, chaves de API,
  backups…). As rotas foram verificadas no jellyfin-web 10.11.
- **Destaque roxo injetado no Jellyfin** (configurações e administração, ou em todo lugar), com CSS personalizado opcional.
- Tela cheia do player web, envio de arquivos (imagens, legendas) e "Baixar" funcionam.
- O botão voltar do Android volta dentro do Jellyfin.

O player nativo pode ser desativado em Configurações › Player do Sonnet. Em caso de erro de reprodução, a opção "Reproduzir com o player web
do Jellyfin" está disponível.

## Compilar você mesmo

Pré-requisitos: Android Studio (ou o SDK do Android) e um JDK 17 ou mais recente.

1. Abra a pasta do projeto (a que contém `app/`) no Android Studio e deixe a sincronização do Gradle terminar.
2. Execute **Build › Build APK(s)**, ou na linha de comando:
   ```
   gradlew.bat assembleDebug
   ```
3. O APK fica em `app/build/outputs/apk/debug/` ou, dependendo da versão do Android Studio, em
   `app/build/intermediates/apk/debug/`.

Se o Gradle não conseguir compilar, verifique primeiro se `local.properties` contém o caminho do seu SDK do Android
(`sdk.dir=...`) e se `JAVA_HOME` aponta para um JDK compatível com a sua versão do Gradle.

## Parte técnica

Kotlin e Jetpack Compose, Media3 (ExoPlayer) para a reprodução, `androidx.window` para as posturas do Fold, Coil para os
pôsteres, DataStore para as configurações. Android 8.0 (API 26) no mínimo, API alvo 34.

## v0.5 – player inspirado no Jellyfin Android
Perfil de dispositivo reescrito (os decodificadores reais do celular), decodificadores de áudio FFmpeg (AC3, E-AC3, DTS, TrueHD…) fornecidos pelo projeto Jellyfin, URLs de reprodução corrigidas (direct play / direct stream / transcodificação), buffers de rede grandes. Compilação automática via GitHub Actions.
Créditos: [jellyfin-android](https://github.com/jellyfin/jellyfin-android) (GPL-2.0).
