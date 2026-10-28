package com.matheo.sonnet.ui.i18n

import android.content.Context
import androidx.compose.material3.Text as MaterialText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.material3.LocalTextStyle
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import java.util.Locale

/** Offline interface language preference and translation for native Compose labels. */
object UiLanguage {
    data class Language(val code: String, val label: String)
    val languages = listOf(
        Language("fr", "Français"),
        Language("en", "English"),
        Language("es", "Español"),
        Language("de", "Deutsch"),
        Language("it", "Italiano"),
        Language("pt", "Português"),
    )

    var current by mutableStateOf("fr")
        private set

    private const val PREFS = "sonnet.language"
    private val translations = """
Accueil|Home|Inicio|Startseite|Home|Início
Bibliothèques|Libraries|Bibliotecas|Bibliotheken|Librerie|Bibliotecas
Photos|Photos|Fotos|Fotos|Foto|Fotos
Bridges|Bridges|Bridges|Bridges|Bridge|Bridges
Réglages|Settings|Ajustes|Einstellungen|Impostazioni|Configurações
Lecteur|Player|Reproductor|Player|Lettore|Reprodutor
Options Sonnet|Sonnet options|Opciones de Sonnet|Sonnet-Optionen|Opzioni Sonnet|Opções do Sonnet
Aucun Bridge Hub configuré|No Bridge Hub configured|No hay ningún Bridge Hub configurado|Kein Bridge Hub konfiguriert|Nessun Bridge Hub configurato|Nenhum Bridge Hub configurado
Ajoute l'adresse de ton Bridge Hub dans Réglages pour accéder aux Jellyfin des autres.|Add your Bridge Hub address in Settings to access other people's Jellyfin servers.|Añade la dirección de Bridge Hub en Ajustes para acceder a los servidores Jellyfin de otras personas.|Füge die Bridge-Hub-Adresse in den Einstellungen hinzu, um auf andere Jellyfin-Server zuzugreifen.|Aggiungi l'indirizzo del Bridge Hub nelle Impostazioni per accedere ai server Jellyfin degli altri.|Adicione o endereço do Bridge Hub em Configurações para acessar os servidores Jellyfin de outras pessoas.
Ouvrir les réglages|Open settings|Abrir ajustes|Einstellungen öffnen|Apri impostazioni|Abrir configurações
Impossible de joindre le serveur|Cannot reach the server|No se puede conectar con el servidor|Server nicht erreichbar|Impossibile raggiungere il server|Não foi possível acessar o servidor
Vérifie l'adresse du serveur (Réglages) et ta connexion : Wi-Fi, données mobiles ou VPN.|Check the server address (Settings) and your connection: Wi-Fi, mobile data, or VPN.|Comprueba la dirección del servidor (Ajustes) y tu conexión: Wi-Fi, datos móviles o VPN.|Prüfe die Serveradresse (Einstellungen) und deine Verbindung: WLAN, mobile Daten oder VPN.|Verifica l'indirizzo del server (Impostazioni) e la connessione: Wi-Fi, dati mobili o VPN.|Verifique o endereço do servidor (Configurações) e sua conexão: Wi-Fi, dados móveis ou VPN.
Réessayer|Retry|Reintentar|Erneut versuchen|Riprova|Tentar novamente
Erreur|Error|Error|Fehler|Errore|Erro
Connecté à Jellyfin|Connected to Jellyfin|Conectado a Jellyfin|Mit Jellyfin verbunden|Connesso a Jellyfin|Conectado ao Jellyfin
Pas encore connecté — ouvre l'onglet Accueil|Not connected yet — open the Home tab|Aún no conectado: abre la pestaña Inicio|Noch nicht verbunden — öffne die Registerkarte Startseite|Non ancora connesso — apri la scheda Home|Ainda não conectado — abra a aba Início
Lecteur Sonnet|Sonnet player|Reproductor Sonnet|Sonnet-Player|Lettore Sonnet|Player Sonnet
Lire avec le lecteur Sonnet|Play with Sonnet player|Reproducir con el reproductor Sonnet|Mit dem Sonnet-Player abspielen|Riproduci con il lettore Sonnet|Reproduzir com o player Sonnet
Tous les réglages du lecteur|All player settings|Todos los ajustes del reproductor|Alle Player-Einstellungen|Tutte le impostazioni del lettore|Todas as configurações do player
Serveur Jellyfin|Jellyfin server|Servidor Jellyfin|Jellyfin-Server|Server Jellyfin|Servidor Jellyfin
Bridge Hub|Bridge Hub|Bridge Hub|Bridge Hub|Bridge Hub|Bridge Hub
Ton espace pour accéder aux Jellyfin des autres.|Your hub for accessing other Jellyfin servers.|Tu espacio para acceder a otros servidores Jellyfin.|Dein Hub für den Zugriff auf andere Jellyfin-Server.|Il tuo spazio per accedere agli altri server Jellyfin.|Seu espaço para acessar outros servidores Jellyfin.
URL du Bridge Hub|Bridge Hub URL|URL de Bridge Hub|Bridge-Hub-URL|URL Bridge Hub|URL do Bridge Hub
Apparence|Appearance|Apariencia|Erscheinungsbild|Aspetto|Aparência
Couleur d'accent|Accent color|Color de acento|Akzentfarbe|Colore accento|Cor de destaque
Couleur d'accent dans Jellyfin|Accent color in Jellyfin|Color de acento en Jellyfin|Akzentfarbe in Jellyfin|Colore accento in Jellyfin|Cor de destaque no Jellyfin
Jamais|Never|Nunca|Nie|Mai|Nunca
Réglages et admin|Settings and admin|Ajustes y administración|Einstellungen und Administration|Impostazioni e amministrazione|Configurações e administração
Partout|Everywhere|En todas partes|Überall|Ovunque|Em todo lugar
Mes réglages Jellyfin|My Jellyfin settings|Mis ajustes de Jellyfin|Meine Jellyfin-Einstellungen|Le mie impostazioni Jellyfin|Minhas configurações Jellyfin
Administration du serveur|Server administration|Administración del servidor|Serververwaltung|Amministrazione del server|Administração do servidor
À propos|About|Acerca de|Über|Informazioni|Sobre
Application|Application|Aplicación|Anwendung|Applicazione|Aplicativo
Version|Version|Versión|Version|Versione|Versão
Package|Package|Paquete|Paket|Pacchetto|Pacote
Serveur|Server|Servidor|Server|Server|Servidor
Décodeurs détectés|Detected decoders|Decodificadores detectados|Erkannte Decoder|Decoder rilevati|Decodificadores detectados
Enregistrer|Save|Guardar|Speichern|Salva|Salvar
Retour|Back|Atrás|Zurück|Indietro|Voltar
Bienvenue dans Sonnet|Welcome to Sonnet|Te damos la bienvenida a Sonnet|Willkommen bei Sonnet|Benvenuto in Sonnet|Bem-vindo ao Sonnet
Bridge Hub (facultatif)|Bridge Hub (optional)|Bridge Hub (opcional)|Bridge Hub (optional)|Bridge Hub (facoltativo)|Bridge Hub (opcional)
Entre l'adresse de ton serveur Jellyfin.|Enter your Jellyfin server address.|Introduce la dirección de tu servidor Jellyfin.|Gib die Adresse deines Jellyfin-Servers ein.|Inserisci l'indirizzo del tuo server Jellyfin.|Insira o endereço do seu servidor Jellyfin.
Commencer|Get started|Comenzar|Loslegen|Inizia|Começar
Profil et mot de passe|Profile and password|Perfil y contraseña|Profil und Passwort|Profilo e password|Perfil e senha
Écran d'accueil|Home screen|Pantalla de inicio|Startbildschirm|Schermata iniziale|Tela inicial
Ordre des sections, médiathèques affichées|Section order, displayed libraries|Orden de secciones y bibliotecas mostradas|Reihenfolge der Bereiche und angezeigte Bibliotheken|Ordine delle sezioni e librerie mostrate|Ordem das seções e bibliotecas exibidas
Lecture|Playback|Reproducción|Wiedergabe|Riproduzione|Reprodução
Langue audio, qualité, épisode suivant, segments|Audio language, quality, next episode, segments|Idioma de audio, calidad, siguiente episodio, segmentos|Audiosprache, Qualität, nächste Folge, Segmente|Lingua audio, qualità, episodio successivo, segmenti|Idioma do áudio, qualidade, próximo episódio, segmentos
Sous-titres|Subtitles|Subtítulos|Untertitel|Sottotitoli|Legendas
Contrôles|Controls|Controles|Steuerung|Controlli|Controles
Tous mes réglages|All my settings|Todos mis ajustes|Alle meine Einstellungen|Tutte le mie impostazioni|Todas as minhas configurações
Tableau de bord|Dashboard|Panel de control|Dashboard|Dashboard|Painel
Général|General|General|Allgemein|Generale|Geral
Utilisateurs|Users|Usuarios|Benutzer|Utenti|Usuários
Médiathèques|Libraries|Bibliotecas|Bibliotheken|Librerie|Bibliotecas
Métadonnées|Metadata|Metadatos|Metadaten|Metadati|Metadados
Transcodage|Transcoding|Transcodificación|Transkodierung|Transcodifica|Transcodificação
Streaming|Streaming|Streaming|Streaming|Streaming|Streaming
Plugins|Plugins|Complementos|Plugins|Plugin|Plugins
Journaux|Logs|Registros|Protokolle|Log|Registros
Réseau|Network|Red|Netzwerk|Rete|Rede
TV en direct|Live TV|TV en directo|Live-TV|TV in diretta|TV ao vivo
Clés API|API keys|Claves API|API-Schlüssel|Chiavi API|Chaves de API
Sauvegardes|Backups|Copias de seguridad|Sicherungen|Backup|Backups
Bibliothèques|Libraries|Bibliotecas|Bibliotheken|Librerie|Bibliotecas
Profil et mot de passe|Profile and password|Perfil y contraseña|Profil und Passwort|Profilo e password|Perfil e senha
Langue, thème Jellyfin, bandes-annonces, fonds animés|Language, Jellyfin theme, trailers, animated backgrounds|Idioma, tema de Jellyfin, avances y fondos animados|Sprache, Jellyfin-Design, Trailer, animierte Hintergründe|Lingua, tema Jellyfin, trailer, sfondi animati|Idioma, tema do Jellyfin, trailers e fundos animados
Écran d'accueil|Home screen|Pantalla de inicio|Startbildschirm|Schermata iniziale|Tela inicial
Ordre des sections, médiathèques affichées|Section order, displayed libraries|Orden de secciones y bibliotecas mostradas|Reihenfolge der Bereiche und angezeigte Bibliotheken|Ordine delle sezioni e librerie mostrate|Ordem das seções e bibliotecas exibidas
Langue audio, qualité, épisode suivant, segments|Audio language, quality, next episode, segments|Idioma de audio, calidad, siguiente episodio y segmentos|Audiosprache, Qualität, nächste Folge und Segmente|Lingua audio, qualità, episodio successivo e segmenti|Idioma do áudio, qualidade, próximo episódio e segmentos
Langue, mode, style du lecteur web|Language, mode, web player style|Idioma, modo y estilo del reproductor web|Sprache, Modus und Webplayer-Stil|Lingua, modalità e stile del lettore web|Idioma, modo e estilo do player web
Connecter une TV avec un code|Connect a TV with a code|Conectar un televisor con un código|Einen Fernseher mit einem Code verbinden|Collega una TV con un codice|Conectar uma TV com um código
Tous mes réglages|All my settings|Todos mis ajustes|Alle meine Einstellungen|Tutte le mie impostazioni|Todas as minhas configurações
Tableau de bord|Dashboard|Panel de control|Dashboard|Dashboard|Painel
Serveur, activité, appareils connectés|Server, activity, connected devices|Servidor, actividad y dispositivos conectados|Server, Aktivität und verbundene Geräte|Server, attività e dispositivi connessi|Servidor, atividade e dispositivos conectados
Nom du serveur, langue, chemins|Server name, language, paths|Nombre del servidor, idioma y rutas|Servername, Sprache und Pfade|Nome server, lingua e percorsi|Nome do servidor, idioma e caminhos
Slogan et personnalisation|Branding and customization|Marca y personalización|Markenauftritt und Anpassung|Branding e personalizzazione|Marca e personalização
CSS personnalisé côté serveur, message de connexion|Server-side custom CSS, login message|CSS personalizado del servidor y mensaje de inicio de sesión|Benutzerdefiniertes Server-CSS und Anmeldenachricht|CSS personalizzato lato server e messaggio di accesso|CSS personalizado no servidor e mensagem de login
Affichage des médiathèques|Library display|Visualización de bibliotecas|Bibliotheksanzeige|Visualizzazione librerie|Exibição das bibliotecas
Fichiers NFO|NFO files|Archivos NFO|NFO-Dateien|File NFO|Arquivos NFO
Accélération matérielle, codecs|Hardware acceleration, codecs|Aceleración por hardware y códecs|Hardwarebeschleunigung und Codecs|Accelerazione hardware e codec|Aceleração de hardware e codecs
Reprise de lecture|Playback resume|Reanudar reproducción|Wiedergabefortsetzung|Ripresa della riproduzione|Retomar reprodução
Limite de débit à distance|Remote bitrate limit|Límite de tasa de bits remota|Remote-Bitratenlimit|Limite bitrate remoto|Limite de taxa de bits remoto
Aperçus utilisés par la barre de Sonnet|Previews used by Sonnet's seek bar|Vistas previas usadas por la barra de búsqueda de Sonnet|Vorschauen für Sonnet-Suchleiste|Anteprime usate dalla barra di ricerca di Sonnet|Pré-visualizações usadas pela barra de busca do Sonnet
Installés + catalogue|Installed + catalog|Instalados + catálogo|Installiert + Katalog|Installati + catalogo|Instalados + catálogo
Dépôts de plugins|Plugin repositories|Repositorios de complementos|Plugin-Repositories|Repository plugin|Repositórios de plugins
Tâches planifiées|Scheduled tasks|Tareas programadas|Geplante Aufgaben|Attività pianificate|Tarefas agendadas
Animations GSAP, gestes, thèmes sombre / AMOLED / clair, teinte libre.|GSAP animations, gestures, dark / AMOLED / light themes, custom tint.|Animaciones GSAP, gestos, temas oscuro / AMOLED / claro y tinte personalizado.|GSAP-Animationen, Gesten, dunkle / AMOLED- / helle Designs, eigene Tönung.|Animazioni GSAP, gesti, temi scuro / AMOLED / chiaro, tinta personalizzata.|Animações GSAP, gestos, temas escuro / AMOLED / claro, tonalidade personalizada.
S'applique tout de suite à Jellyfin et au Bridge Hub.|Applies immediately to Jellyfin and Bridge Hub.|Se aplica inmediatamente a Jellyfin y Bridge Hub.|Wird sofort auf Jellyfin und Bridge Hub angewendet.|Si applica subito a Jellyfin e Bridge Hub.|Aplica-se imediatamente ao Jellyfin e ao Bridge Hub.
Animations (GSAP)|Animations (GSAP)|Animaciones (GSAP)|Animationen (GSAP)|Animazioni (GSAP)|Animações (GSAP)
Les affiches arrivent en cascade, les pages glissent en douceur.|Posters cascade in and pages slide smoothly.|Los carteles aparecen en cascada y las páginas se deslizan suavemente.|Poster erscheinen nacheinander und Seiten gleiten sanft.|Le locandine appaiono in sequenza e le pagine scorrono dolcemente.|Os cartazes aparecem em cascata e as páginas deslizam suavemente.
Effets de fou|Wild effects|Efectos intensos|Starke Effekte|Effetti intensi|Efeitos intensos
Aurore animée, cartes en 3D, étincelles, titres lettre par lettre, parallaxe, ondes au toucher.|Animated aurora, 3D cards, sparks, letter-by-letter titles, parallax, touch ripples.|Aurora animada, tarjetas 3D, destellos, títulos letra a letra, paralaje y ondas al tocar.|Animiertes Polarlicht, 3D-Karten, Funken, Buchstaben-Titel, Parallaxe und Touch-Wellen.|Aurora animata, schede 3D, scintille, titoli lettera per lettera, parallasse e onde al tocco.|Aurora animada, cartões 3D, faíscas, títulos letra por letra, paralaxe e ondas ao tocar.
Effet de ressort au toucher|Spring effect on touch|Efecto elástico al tocar|Federeffekt bei Berührung|Effetto elastico al tocco|Efeito de mola ao tocar
Les cartes et boutons s'enfoncent puis rebondissent.|Cards and buttons press down then bounce back.|Las tarjetas y botones se hunden y rebotan.|Karten und Schaltflächen drücken sich ein und federn zurück.|Schede e pulsanti si abbassano e rimbalzano.|Cartões e botões afundam e voltam.
Vibrations légères|Light haptics|Vibraciones suaves|Leichte Vibrationen|Vibrazioni leggere|Vibrações leves
Au toucher et quand un geste est prêt.|On touch and when a gesture is ready.|Al tocar y cuando un gesto está listo.|Bei Berührung und wenn eine Geste bereit ist.|Al tocco e quando un gesto è pronto.|Ao tocar e quando um gesto está pronto.
Aussi dans le Bridge Hub|Also in Bridge Hub|También en Bridge Hub|Auch im Bridge Hub|Anche nel Bridge Hub|Também no Bridge Hub
Tirer vers le bas = raccourcis|Pull down = shortcuts|Deslizar hacia abajo = accesos directos|Nach unten ziehen = Verknüpfungen|Tira verso il basso = scorciatoie|Puxar para baixo = atalhos
En haut d'une page : Accueil, Recherche, Favoris, Actualiser…|At the top of a page: Home, Search, Favorites, Refresh…|En la parte superior: Inicio, Buscar, Favoritos, Actualizar…|Oben auf einer Seite: Start, Suche, Favoriten, Aktualisieren…|In cima a una pagina: Home, Cerca, Preferiti, Aggiorna…|No topo da página: Início, Pesquisa, Favoritos, Atualizar…
Double-tap sur l'affiche = favori|Double-tap poster = favorite|Doble toque en el cartel = favorito|Poster doppeltippen = Favorit|Doppio tocco sulla locandina = preferito|Toque duplo no cartaz = favorito
Sur la fiche d'un film, d'une série ou d'un album.|On a movie, series, or album page.|En la ficha de una película, serie o álbum.|Auf einer Film-, Serien- oder Albumseite.|Nella scheda di un film, serie o album.|Na página de um filme, série ou álbum.
Glisser un épisode|Swipe an episode|Deslizar un episodio|Eine Folge wischen|Scorri un episodio|Deslizar um episódio
Vers la droite : vu / non vu. Vers la gauche : favori.|Right: watched / unwatched. Left: favorite.|Derecha: visto / no visto. Izquierda: favorito.|Rechts: gesehen / ungesehen. Links: Favorit.|Destra: visto / non visto. Sinistra: preferito.|Direita: assistido / não assistido. Esquerda: favorito.
Mode|Mode|Modo|Modus|Modalità|Modo
AMOLED = noir pur, économise la batterie.|AMOLED = pure black, saves battery.|AMOLED = negro puro, ahorra batería.|AMOLED = reines Schwarz, spart Akku.|AMOLED = nero puro, risparmia batteria.|AMOLED = preto puro, economiza bateria.
Teinte libre|Custom tint|Tinte personalizado|Eigene Tönung|Tinta personalizzata|Tonalidade personalizada
Teinte active|Active tint|Tinte activo|Aktive Tönung|Tinta attiva|Tonalidade ativa
Teinte inactive : la pastille de Réglages > Apparence est utilisée.|Inactive tint: the swatch from Settings > Appearance is used.|Tinte inactivo: se usa el color de Ajustes > Apariencia.|Inaktive Tönung: Die Farbe aus Einstellungen > Erscheinungsbild wird verwendet.|Tinta inattiva: viene usato il colore in Impostazioni > Aspetto.|Tonalidade inativa: usa a cor em Configurações > Aparência.
Désactiver|Disable|Desactivar|Deaktivieren|Disattiva|Desativar
Rétablir les options par défaut|Restore default options|Restaurar opciones predeterminadas|Standardeinstellungen wiederherstellen|Ripristina opzioni predefinite|Restaurar opções padrão
Avance et recul rapides|Seek forward and backward|Avance y retroceso rápidos|Schneller Vor- und Rücklauf|Avanzamento e riavvolgimento rapidi|Avanço e retrocesso rápidos
Recul (bouton et double-tap à gauche)|Rewind (button and double-tap left)|Retroceder (botón y doble toque a la izquierda)|Zurückspulen (Taste und Doppeltipp links)|Riavvolgi (pulsante e doppio tocco a sinistra)|Retroceder (botão e toque duplo à esquerda)
Avance (bouton et double-tap à droite)|Forward (button and double-tap right)|Avanzar (botón y doble toque a la derecha)|Vorspulen (Taste und Doppeltipp rechts)|Avanti (pulsante e doppio tocco a destra)|Avançar (botão e toque duplo à direita)
Double-tap gauche / droite sur la vidéo|Double-tap left / right on video|Doble toque izquierda/derecha en el vídeo|Video links/rechts doppeltippen|Doppio tocco sinistra/destra sul video|Toque duplo esquerdo/direito no vídeo
Chaque tap en plus ajoute encore la même durée (3 taps = 30 s). Double-tap au centre = pause.|Each extra tap adds the same interval (3 taps = 30s). Double-tap center = pause.|Cada toque extra añade el mismo intervalo (3 toques = 30 s). Doble toque al centro = pausa.|Jeder weitere Tipp addiert dasselbe Intervall (3 Tipps = 30 s). Mitte doppeltippen = Pause.|Ogni tocco aggiunge lo stesso intervallo (3 tocchi = 30 s). Doppio tocco al centro = pausa.|Cada toque extra adiciona o mesmo intervalo (3 toques = 30 s). Toque duplo no centro = pausa.
Gestes|Gestures|Gestos|Gesten|Gesti|Gestos
Luminosité et volume|Brightness and volume|Brillo y volumen|Helligkeit und Lautstärke|Luminosità e volume|Brilho e volume
Glisser à gauche = luminosité, à droite = volume|Swipe left = brightness, right = volume|Desliza a la izquierda = brillo, a la derecha = volumen|Links wischen = Helligkeit, rechts = Lautstärke|Scorri a sinistra = luminosità, a destra = volume|Deslize à esquerda = brilho, à direita = volume
Glisser pour avancer / reculer|Swipe to seek|Deslizar para avanzar/retroceder|Wischen zum Spulen|Scorri per avanzare/riavvolgere|Deslizar para avançar/retroceder
Avec aperçu de l'image (trickplay)|With image previews (trickplay)|Con vistas previas (trickplay)|Mit Bildvorschau (Trickplay)|Con anteprime immagine (trickplay)|Com pré-visualização de imagem (trickplay)
Pincer pour zoomer|Pinch to zoom|Pellizcar para ampliar|Zum Zoomen zusammenziehen|Pizzica per zoomare|Pinçar para ampliar
Déplacer l'image à deux doigts|Pan image with two fingers|Mover la imagen con dos dedos|Bild mit zwei Fingern verschieben|Sposta l'immagine con due dita|Mover imagem com dois dedos
Monte ou descend la vidéo librement|Move the video freely up or down|Mueve el vídeo libremente hacia arriba o abajo|Video frei nach oben oder unten verschieben|Sposta liberamente il video in alto o in basso|Mova o vídeo livremente para cima ou para baixo
Image (Fold)|Video (Fold)|Vídeo (Fold)|Bild (Fold)|Video (Fold)|Vídeo (Fold)
Position sur l'écran déplié|Position on unfolded screen|Posición en pantalla desplegada|Position auf aufgeklapptem Bildschirm|Posizione sullo schermo aperto|Posição na tela desdobrada
Position sur l'écran extérieur / téléphone|Position on outer screen / phone|Posición en pantalla exterior/teléfono|Position auf Außendisplay/Telefon|Posizione sullo schermo esterno/telefono|Posição na tela externa/telefone
Remplissage par défaut|Default fit|Ajuste predeterminado|Standardanpassung|Adattamento predefinito|Ajuste padrão
Mémoriser la dernière position|Remember last position|Recordar la última posición|Letzte Position merken|Ricorda ultima posizione|Lembrar última posição
Retenue séparément pour chaque écran|Stored separately for each screen|Guardada por separado para cada pantalla|Für jeden Bildschirm separat gespeichert|Memorizzata separatamente per ogni schermo|Salva separadamente para cada tela
Dans la bande noire|In the black bar|En la banda negra|Im schwarzen Balken|Nella banda nera|Na faixa preta
Affichés sous l'image au lieu de la recouvrir quand il y a la place|Show below the image rather than covering it when space allows|Mostrar debajo de la imagen en lugar de cubrirla si hay espacio|Wenn Platz ist unter dem Bild statt darüber anzeigen|Mostra sotto l'immagine invece di coprirla, quando c'è spazio|Exibir abaixo da imagem em vez de sobrepor quando houver espaço
Petits|Small|Pequeños|Klein|Piccoli|Pequenos
Normaux|Normal|Normales|Normal|Normali|Normais
Grands|Large|Grandes|Groß|Grandi|Grandes
Très grands|Very large|Muy grandes|Sehr groß|Molto grandi|Muito grandes
Contour|Outline|Contorno|Kontur|Contorno|Contorno
Fond léger|Light background|Fondo claro|Heller Hintergrund|Sfondo chiaro|Fundo claro
Fond noir|Black background|Fondo negro|Schwarzer Hintergrund|Sfondo nero|Fundo preto
Blanc|White|Blanco|Weiß|Bianco|Branco
Jaune|Yellow|Amarillo|Gelb|Giallo|Amarelo
Violet|Purple|Morado|Violett|Viola|Roxo
Intro, générique, récap (segments Jellyfin)|Intro, credits, recap (Jellyfin segments)|Intro, créditos, resumen (segmentos Jellyfin)|Intro, Abspann, Zusammenfassung (Jellyfin-Segmente)|Intro, titoli, riepilogo (segmenti Jellyfin)|Intro, créditos, resumo (segmentos Jellyfin)
Épisode suivant automatique|Auto-play next episode|Reproducir automáticamente el siguiente episodio|Nächste Folge automatisch abspielen|Riproduci automaticamente l'episodio successivo|Reproduzir próximo episódio automaticamente
Carte avec compte à rebours pendant le générique|Countdown card during credits|Tarjeta de cuenta atrás durante los créditos|Countdown-Karte während des Abspanns|Scheda con conto alla rovescia durante i titoli|Cartão de contagem regressiva durante os créditos
Compte à rebours|Countdown|Cuenta atrás|Countdown|Conto alla rovescia|Contagem regressiva
Vitesse par défaut|Default speed|Velocidad predeterminada|Standardgeschwindigkeit|Velocità predefinita|Velocidade padrão
Reculer un peu à la reprise|Rewind slightly on resume|Retroceder un poco al reanudar|Beim Fortsetzen etwas zurückspulen|Riavvolgi leggermente alla ripresa|Retroceder um pouco ao retomar
Boost du volume (haut-parleurs du téléphone)|Volume boost (phone speakers)|Aumento de volumen (altavoces del teléfono)|Lautstärkeverstärkung (Telefonlautsprecher)|Aumento volume (altoparlanti del telefono)|Aumento de volume (alto-falantes do telefone)
Qualité maximale|Maximum quality|Calidad máxima|Maximale Qualität|Qualità massima|Qualidade máxima
Toujours transcoder|Always transcode|Transcodificar siempre|Immer transkodieren|Transcodifica sempre|Sempre transcodificar
À n'activer que si un fichier refuse de se lire|Enable only if a file refuses to play|Activar solo si un archivo no se reproduce|Nur aktivieren, wenn eine Datei nicht abgespielt wird|Attiva solo se un file non viene riprodotto|Ative somente se um arquivo não reproduzir
Fold et interface|Fold and interface|Fold e interfaz|Fold und Oberfläche|Fold e interfaccia|Fold e interface
Fold à moitié plié : vidéo en haut, télécommande en bas|Fold half-folded: video on top, remote controls below|Fold medio plegado: vídeo arriba, mando abajo|Fold halb gefaltet: Video oben, Fernbedienung unten|Fold piegato a metà: video sopra, telecomando sotto|Fold meio dobrado: vídeo acima, controles abaixo
Image dans l'image automatique|Automatic picture-in-picture|Imagen en imagen automática|Automatisches Bild-in-Bild|Picture-in-picture automatico|Picture-in-picture automático
En quittant l'app pendant la lecture|When leaving the app during playback|Al salir de la aplicación durante la reproducción|Beim Verlassen der App während der Wiedergabe|Quando esci dall'app durante la riproduzione|Ao sair do app durante a reprodução
Afficher l'heure|Show clock|Mostrar reloj|Uhr anzeigen|Mostra orologio|Mostrar relógio
Afficher le temps restant|Show remaining time|Mostrar tiempo restante|Restzeit anzeigen|Mostra tempo rimanente|Mostrar tempo restante
Sinon la durée totale|Otherwise total duration|De lo contrario, duración total|Sonst Gesamtdauer|Altrimenti durata totale|Caso contrário, duração total
Masquer les contrôles après|Hide controls after|Ocultar controles después de|Steuerung ausblenden nach|Nascondi controlli dopo|Ocultar controles após
Réinitialiser les réglages du lecteur|Reset player settings|Restablecer ajustes del reproductor|Player-Einstellungen zurücksetzen|Reimposta impostazioni lettore|Redefinir configurações do player
DEEP_PLAYER_TRANSLATIONS
Retour|Back|Atrás|Zurück|Indietro|Voltar
S'applique tout de suite à Jellyfin et au Bridge Hub.|Applies immediately to Jellyfin and Bridge Hub.|Se aplica inmediatamente a Jellyfin y Bridge Hub.|Wird sofort auf Jellyfin und Bridge Hub angewendet.|Si applica subito a Jellyfin e Bridge Hub.|Aplica-se imediatamente ao Jellyfin e ao Bridge Hub.
Animations (GSAP)|Animations (GSAP)|Animaciones (GSAP)|Animationen (GSAP)|Animazioni (GSAP)|Animações (GSAP)
Effets de fou|Wild effects|Efectos intensos|Starke Effekte|Effetti intensi|Efeitos intensos
Aurore animée, cartes en 3D, étincelles, titres lettre par lettre, parallaxe, ondes au toucher.|Animated aurora, 3D cards, sparks, letter-by-letter titles, parallax, touch ripples.|Aurora animada, tarjetas 3D, destellos, títulos letra a letra, paralaje y ondas al tocar.|Animiertes Polarlicht, 3D-Karten, Funken, Buchstaben-Titel, Parallaxe und Touch-Wellen.|Aurora animata, schede 3D, scintille, titoli lettera per lettera, parallasse e onde al tocco.|Aurora animada, cartões 3D, faíscas, títulos letra por letra, paralaxe e ondas ao tocar.
Effet de ressort au toucher|Spring effect on touch|Efecto elástico al tocar|Federeffekt bei Berührung|Effetto elastico al tocco|Efeito de mola ao tocar
Les cartes et boutons s'enfoncent puis rebondissent.|Cards and buttons press down then bounce back.|Las tarjetas y botones se hunden y rebotan.|Karten und Schaltflächen drücken sich ein und federn zurück.|Schede e pulsanti si abbassano e rimbalzano.|Cartões e botões afundam e voltam.
Vibrations légères|Light haptics|Vibraciones suaves|Leichte Vibrationen|Vibrazioni leggere|Vibrações leves
Au toucher et quand un geste est prêt.|On touch and when a gesture is ready.|Al tocar y cuando un gesto está listo.|Bei Berührung und wenn eine Geste bereit ist.|Al tocco e quando un gesto è pronto.|Ao tocar e quando um gesto está pronto.
Aussi dans le Bridge Hub|Also in Bridge Hub|También en Bridge Hub|Auch im Bridge Hub|Anche nel Bridge Hub|Também no Bridge Hub
Tirer vers le bas = raccourcis|Pull down = shortcuts|Deslizar hacia abajo = accesos directos|Nach unten ziehen = Verknüpfungen|Tira verso il basso = scorciatoie|Puxar para baixo = atalhos
En haut d'une page : Accueil, Recherche, Favoris, Actualiser…|At the top of a page: Home, Search, Favorites, Refresh…|En la parte superior: Inicio, Buscar, Favoritos, Actualizar…|Oben auf einer Seite: Start, Suche, Favoriten, Aktualisieren…|In cima a una pagina: Home, Cerca, Preferiti, Aggiorna…|No topo de uma página: Início, Pesquisa, Favoritos, Atualizar…
Double-tap sur l'affiche = favori|Double-tap poster = favorite|Doble toque en el cartel = favorito|Poster doppeltippen = Favorit|Doppio tocco sulla locandina = preferito|Toque duplo no cartaz = favorito
Sur la fiche d'un film, d'une série ou d'un album.|On a movie, series, or album page.|En la ficha de una película, serie o álbum.|Auf einer Film-, Serien- oder Albumseite.|Nella scheda di un film, serie o album.|Na página de um filme, série ou álbum.
Glisser un épisode|Swipe an episode|Deslizar un episodio|Eine Folge wischen|Scorri un episodio|Deslizar um episódio
Vers la droite : vu / non vu. Vers la gauche : favori.|Right: watched / unwatched. Left: favorite.|Derecha: visto / no visto. Izquierda: favorito.|Rechts: gesehen / ungesehen. Links: Favorit.|Destra: visto / non visto. Sinistra: preferito.|Direita: assistido / não assistido. Esquerda: favorito.
AMOLED = noir pur, économise la batterie.|AMOLED = pure black, saves battery.|AMOLED = negro puro, ahorra batería.|AMOLED = reines Schwarz, spart Akku.|AMOLED = nero puro, risparmia batteria.|AMOLED = preto puro, economiza bateria.
Teinte libre|Custom tint|Tinte personalizado|Eigene Tönung|Tinta personalizzata|Tonalidade personalizada
Teinte active|Active tint|Tinte activo|Aktive Tönung|Tinta attiva|Tonalidade ativa
Teinte inactive : la pastille de Réglages > Apparence est utilisée.|Inactive tint: the swatch from Settings > Appearance is used.|Tinte inactivo: se usa el color de Ajustes > Apariencia.|Inaktive Tönung: Die Farbe aus Einstellungen > Erscheinungsbild wird verwendet.|Tinta inattiva: viene usato il colore in Impostazioni > Aspetto.|Tonalidade inativa: usa a cor em Configurações > Aparência.
Désactiver|Disable|Desactivar|Deaktivieren|Disattiva|Desativar
Rétablir les options par défaut|Restore default options|Restaurar opciones predeterminadas|Standardeinstellungen wiederherstellen|Ripristina opzioni predefinite|Restaurar opções padrão
Avance et recul rapides|Seek forward and backward|Avance y retroceso rápidos|Schneller Vor- und Rücklauf|Avanzamento e riavvolgimento rapidi|Avanço e retrocesso rápidos
Recul (bouton et double-tap à gauche)|Rewind (button and double-tap left)|Retroceder (botón y doble toque a la izquierda)|Zurückspulen (Taste und Doppeltipp links)|Riavvolgi (pulsante e doppio tocco a sinistra)|Retroceder (botão e toque duplo à esquerda)
Avance (bouton et double-tap à droite)|Forward (button and double-tap right)|Avanzar (botón y doble toque a la derecha)|Vorspulen (Taste und Doppeltipp rechts)|Avanti (pulsante e doppio tocco a destra)|Avançar (botão e toque duplo à direita)
Double-tap gauche / droite sur la vidéo|Double-tap left / right on video|Doble toque izquierda/derecha en el vídeo|Video links/rechts doppeltippen|Doppio tocco sinistra/destra sul video|Toque duplo esquerdo/direito no vídeo
Chaque tap en plus ajoute encore la même durée (3 taps = 30 s). Double-tap au centre = pause.|Each extra tap adds the same interval (3 taps = 30s). Double-tap center = pause.|Cada toque extra añade el mismo intervalo (3 toques = 30 s). Doble toque al centro = pausa.|Jeder weitere Tipp addiert dasselbe Intervall (3 Tipps = 30 s). Mitte doppeltippen = Pause.|Ogni tocco aggiunge lo stesso intervallo (3 tocchi = 30 s). Doppio tocco al centro = pausa.|Cada toque extra adiciona o mesmo intervalo (3 toques = 30 s). Toque duplo no centro = pausa.
Gestes|Gestures|Gestos|Gesten|Gesti|Gestos
Luminosité et volume|Brightness and volume|Brillo y volumen|Helligkeit und Lautstärke|Luminosità e volume|Brilho e volume
Glisser à gauche = luminosité, à droite = volume|Swipe left = brightness, right = volume|Desliza a la izquierda = brillo, a la derecha = volumen|Links wischen = Helligkeit, rechts = Lautstärke|Scorri a sinistra = luminosità, a destra = volume|Deslize à esquerda = brilho, à direita = volume
Glisser pour avancer / reculer|Swipe to seek|Deslizar para avanzar/retroceder|Wischen zum Spulen|Scorri per avanzare/riavvolgere|Deslizar para avançar/retroceder
Avec aperçu de l'image (trickplay)|With image previews (trickplay)|Con vistas previas (trickplay)|Mit Bildvorschau (Trickplay)|Con anteprime immagine (trickplay)|Com pré-visualização de imagem (trickplay)
Pincer pour zoomer|Pinch to zoom|Pellizcar para ampliar|Zum Zoomen zusammenziehen|Pizzica per zoomare|Pinçar para ampliar
Déplacer l'image à deux doigts|Pan image with two fingers|Mover la imagen con dos dedos|Bild mit zwei Fingern verschieben|Sposta l'immagine con due dita|Mover imagem com dois dedos
Monte ou descend la vidéo librement|Move the video freely up or down|Mueve el vídeo libremente hacia arriba o abajo|Video frei nach oben oder unten verschieben|Sposta liberamente il video in alto o in basso|Mova o vídeo livremente para cima ou para baixo
Image (Fold)|Video (Fold)|Vídeo (Fold)|Bild (Fold)|Video (Fold)|Vídeo (Fold)
Position sur l'écran déplié|Position on unfolded screen|Posición en pantalla desplegada|Position auf aufgeklapptem Bildschirm|Posizione sullo schermo aperto|Posição na tela desdobrada
Position sur l'écran extérieur / téléphone|Position on outer screen / phone|Posición en pantalla exterior/teléfono|Position auf Außendisplay/Telefon|Posizione sullo schermo esterno/telefono|Posição na tela externa/telefone
Remplissage par défaut|Default fit|Ajuste predeterminado|Standardanpassung|Adattamento predefinito|Ajuste padrão
Mémoriser la dernière position|Remember last position|Recordar la última posición|Letzte Position merken|Ricorda ultima posizione|Lembrar última posição
Retenue séparément pour chaque écran|Stored separately for each screen|Guardada por separado para cada pantalla|Für jeden Bildschirm separat gespeichert|Memorizzata separatamente per ogni schermo|Salva separadamente para cada tela
Dans la bande noire|In the black bar|En la banda negra|Im schwarzen Balken|Nella banda nera|Na faixa preta
Affichés sous l'image au lieu de la recouvrir quand il y a la place|Show below the image rather than covering it when space allows|Mostrar debajo de la imagen en lugar de cubrirla si hay espacio|Wenn Platz ist unter dem Bild statt darüber anzeigen|Mostra sotto l'immagine invece di coprirla, quando c'è spazio|Exibir abaixo da imagem em vez de sobrepor quando houver espaço
Petits|Small|Pequeños|Klein|Piccoli|Pequenos
Normaux|Normal|Normales|Normal|Normali|Normais
Grands|Large|Grandes|Groß|Grandi|Grandes
Très grands|Very large|Muy grandes|Sehr groß|Molto grandi|Muito grandes
Contour|Outline|Contorno|Kontur|Contorno|Contorno
Fond léger|Light background|Fondo claro|Heller Hintergrund|Sfondo chiaro|Fundo claro
Fond noir|Black background|Fondo negro|Schwarzer Hintergrund|Sfondo nero|Fundo preto
Blanc|White|Blanco|Weiß|Bianco|Branco
Jaune|Yellow|Amarillo|Gelb|Giallo|Amarelo
Violet|Purple|Morado|Violett|Viola|Roxo
Intro, générique, récap (segments Jellyfin)|Intro, credits, recap (Jellyfin segments)|Intro, créditos, resumen (segmentos Jellyfin)|Intro, Abspann, Zusammenfassung (Jellyfin-Segmente)|Intro, titoli, riepilogo (segmenti Jellyfin)|Intro, créditos, resumo (segmentos Jellyfin)
Épisode suivant automatique|Auto-play next episode|Reproducir automáticamente el siguiente episodio|Nächste Folge automatisch abspielen|Riproduci automaticamente l'episodio successivo|Reproduzir próximo episódio automaticamente
Carte avec compte à rebours pendant le générique|Countdown card during credits|Tarjeta de cuenta atrás durante los créditos|Countdown-Karte während des Abspanns|Scheda con conto alla rovescia durante i titoli|Cartão de contagem regressiva durante os créditos
Compte à rebours|Countdown|Cuenta atrás|Countdown|Conto alla rovescia|Contagem regressiva
Vitesse par défaut|Default speed|Velocidad predeterminada|Standardgeschwindigkeit|Velocità predefinita|Velocidade padrão
Reculer un peu à la reprise|Rewind slightly on resume|Retroceder un poco al reanudar|Beim Fortsetzen etwas zurückspulen|Riavvolgi leggermente alla ripresa|Retroceder um pouco ao retomar
Boost du volume (haut-parleurs du téléphone)|Volume boost (phone speakers)|Aumento de volumen (altavoces del teléfono)|Lautstärkeverstärkung (Telefonlautsprecher)|Aumento volume (altoparlanti del telefono)|Aumento de volume (alto-falantes do telefone)
Qualité maximale|Maximum quality|Calidad máxima|Maximale Qualität|Qualità massima|Qualidade máxima
Toujours transcoder|Always transcode|Transcodificar siempre|Immer transkodieren|Transcodifica sempre|Sempre transcodificar
À n'activer que si un fichier refuse de se lire|Enable only if a file refuses to play|Activar solo si un archivo no se reproduce|Nur aktivieren, wenn eine Datei nicht abgespielt wird|Attiva solo se un file non viene riprodotto|Ative somente se um arquivo não reproduzir
Fold et interface|Fold and interface|Fold e interfaz|Fold und Oberfläche|Fold e interfaccia|Fold e interface
Fold à moitié plié : vidéo en haut, télécommande en bas|Fold half-folded: video on top, remote controls below|Fold medio plegado: vídeo arriba, mando abajo|Fold halb gefaltet: Video oben, Fernbedienung unten|Fold piegato a metà: video sopra, telecomando sotto|Fold meio dobrado: vídeo acima, controles abaixo
Image dans l'image automatique|Automatic picture-in-picture|Imagen en imagen automática|Automatisches Bild-in-Bild|Picture-in-picture automatico|Picture-in-picture automático
En quittant l'app pendant la lecture|When leaving the app during playback|Al salir de la aplicación durante la reproducción|Beim Verlassen der App während der Wiedergabe|Quando esci dall'app durante la riproduzione|Ao sair do app durante a reprodução
Afficher l'heure|Show clock|Mostrar reloj|Uhr anzeigen|Mostra orologio|Mostrar relógio
Afficher le temps restant|Show remaining time|Mostrar tiempo restante|Restzeit anzeigen|Mostra tempo rimanente|Mostrar tempo restante
Sinon la durée totale|Otherwise total duration|De lo contrario, duración total|Sonst Gesamtdauer|Altrimenti durata totale|Caso contrário, duração total
Masquer les contrôles après|Hide controls after|Ocultar controles después de|Steuerung ausblenden nach|Nascondi controlli dopo|Ocultar controles após
Réinitialiser les réglages du lecteur|Reset player settings|Restablecer ajustes del reproductor|Player-Einstellungen zurücksetzen|Reimposta impostazioni lettore|Redefinir configurações do player
Langue de l’interface|Interface language|Idioma de la interfaz|Sprache der Oberfläche|Lingua dell’interfaccia|Idioma da interface
"""
        .trimIndent()
        .lineSequence()
        .mapNotNull { line ->
            val columns = line.split("|")
            if (columns.size == 6) columns[0] to columns.drop(1) else null
        }
        .toMap()

    fun init(context: Context) {
        val preferences = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val saved = preferences.getString("locale", null)
        val system = Locale.getDefault().language.take(2).lowercase(Locale.ROOT)
        val available = languages.map { it.code }
        current = when {
            saved != null && saved in available -> saved
            system in available -> system
            else -> "fr"
        }
    }

    fun set(context: Context, code: String) {
        val normalized = languages.firstOrNull { it.code == code }?.code ?: "fr"
        current = normalized
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putString("locale", normalized).apply()
    }

    fun currentLabel(): String = languages.firstOrNull { it.code == current }?.label ?: "Français"

    fun translate(text: String): String {
        if (current == "fr") return text
        val index = languages.indexOfFirst { it.code == current }
        if (index <= 0) return text
        return translations[text]?.getOrNull(index - 1) ?: text
    }
}

/** Drop-in wrapper for the Compose Material Text used by this app; source strings stay intact. */
@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
) {
    MaterialText(
        text = UiLanguage.translate(text),
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout,
        style = style,
    )
}
