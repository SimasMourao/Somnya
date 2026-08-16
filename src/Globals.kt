class Playlist(val playlistName: String) {
    val songs = mutableListOf<Song>()
}

val dataBasePlaylists = mutableListOf<Playlist>()

class Duration(
    val minutes: Int,
    val seconds: Int
)

class Song(
    val name: String,
    val singer: String,
    val duration: Duration,
    val album: String = "Unknow"
)

val dataBaseSongs = mutableListOf<Song>()


