class Song(
    val name: String,
    val singer: String,
    val album: String = "Unknow"
)

class Playlist(val playlistName: String)

val allPlaylist = mutableListOf<Playlist>()

val dataBaseSongs = mutableListOf<Song>()

//função mostrar playlists:
fun showPlaylist(){
    if(allPlaylist.isNotEmpty()){
        allPlaylist.forEachIndexed{
            index, Playlist -> 
            println("\n${index + 1} - ${Playlist.playlistName}")
        }
    }
    else{
        println("NO PLAYLISTS!")
    }
}

//função criar playlist:
fun createPlaylist(): Playlist{

    var namePlaylist: String
    var newPlaylist: Playlist? = null
    
    do{
        println("Choose a Name For The Playlist:")
        
        //lê a entrada do usuário e exclui espaços da esquerda e direita
        namePlaylist = readln().trim()
        
        if(namePlaylist.isNotEmpty()){
            //criar instância da classe playlist
            newPlaylist = Playlist(namePlaylist)
            
            println("\n$namePlaylist created!")
            
            //adiciona a nova Playlist na lista global de playlist
            allPlaylist.add(newPlaylist)
            println("*\t".repeat(5))
        }
        else{
            println("\nInvalid name!\n")
            println("=".repeat(50))
        }
    }while(namePlaylist.isEmpty())
    
    return newPlaylist!!
}

fun main(){

    val song01 = Song("Faint", "Linkin Park", "Meteora")
    val song02 = Song("Everlong", "Foo Figthers")
    val song03 = Song("Fórmula Mágica da Paz", "Racionais Mc's", "Sobrevivendo no Inferno")
    
    dataBaseSongs.add(song01)
    dataBaseSongs.add(song02)
    dataBaseSongs.add(song03)
    
    while(true){
        println(""" 
        ${"=".repeat(50)}
                    MP3 Launcher
        
            1 - Playlist Manager
            
            2 - Exit
        
                
        ${"=".repeat(50)}
        """.trimIndent())
        
        when(readln()){
            "1" -> {
                print("\u001b[H\u001b[2J")
                
                while(true){
                    println(""" 
                    ${"=".repeat(50)}
                    
                                Playlist Manager
                    
                        1 - Show Playlists
                        
                        2 - Create Playlist
                        
                        3 - Delete Playlist
                        
                        4 - Exit
                    
                    ${"=".repeat(50)}
                    """.trimIndent())
                    
                    when(readln()){
                        "1" -> {
                            print("\u001b[H\u001b[2J")
                            showPlaylist()
                        }
                        
                        "2" -> {
                            print("\u001b[H\u001b[2J")
                            createPlaylist()
                        }
                        
                        "3" -> {
                            print("\u001b[H\u001b[2J")
                            
                            if(allPlaylist.isNotEmpty()){
                                println("Select a Playlist To Delete:")
                                
                                showPlaylist()
                                
                                do{
                                    var delete = readln().toInt() - 1
                                    
                                    if(delete >= 0 && delete < allPlaylist.size){
                                        println("${allPlaylist[delete].playlistName} HAS BEEN DELETED!")
                                        allPlaylist.removeAt(delete)
                                        break
                                    }
                                    else{
                                        println("Invalid option!".uppercase())
                                    }
                                }while(true)
                            }
                            else{
                                println("\nNo playlists!\n")
                            }
                        }
                        
                        "4" -> {
                            print("\u001b[H\u001b[2J")
                            break
                        }
                        
                        else -> {
                            println("\nInvalid option!".uppercase())
                            println("_".repeat(50))
                        }
                    }
                }
            }
            
            "2" -> {
                print("\u001b[H\u001b[2J")
                break
            }
            
            else -> {
                print("\u001b[H\u001b[2J")
                println("\nInvalid option!".uppercase())
                println("_".repeat(50))
            }
        }
    }
}
