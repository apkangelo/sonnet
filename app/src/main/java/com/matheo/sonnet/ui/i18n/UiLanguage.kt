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
            saved in available -> saved!!
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
        val index = languages.indexOfFirst { it.code == current }.coerceAtLeast(0)
        return translations[text]?.getOrNull(index) ?: text
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
