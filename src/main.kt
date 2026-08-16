
fun main(){

    val plLst1 = Playlist("puta")
    val plLst2 = Playlist("bunda")
    val plLst3 = Playlist("vadia")

    dataBasePlaylists.add(plLst1)
    dataBasePlaylists.add(plLst2)
    dataBasePlaylists.add(plLst3)

    val song01 = Song("Faint", "Linkin Park", Duration(3, 50), "Meteora")
    val song02 = Song("Everlong", "Foo Figthers", Duration(3, 45))
    val song03 = Song("Fórmula Mágica da Paz", "Racionais Mc's", Duration(10, 30), "Sobrevivendo no Inferno")

    dataBaseSongs.add(song01)
    dataBaseSongs.add(song02)
    dataBaseSongs.add(song03)

    while(true){
        println(""" 
        ${"=".repeat(50)}
                    MP3 Launcher
        
            1 - Songs
            
            2 - Playlist Manager
            
            3 - Exit
        
                
        ${"=".repeat(50)}
        """.trimIndent())

        var chosen = readln().toInt()
        when(chosen){
            1 ->{
                print("\u001b[H\u001b[2J")
                println("${"_".repeat(50)}\n\t\t\tSongs")
                showSongs()
                songsManager()

            }

            2 -> {
                print("\u001b[H\u001b[2J")
                playlistsManager()
            }
            3 -> {
                print("\u001b[H\u001b[2J")
                break
            }
            else -> {
                print("\u001b[H\u001b[2J")
                println("\nInvalid option!\n".uppercase())
            }
        }
    }
}







