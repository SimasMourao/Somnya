//função mostrar playlist:
fun showPlaylist(){

    if(dataBasePlaylists.isNotEmpty()){
        dataBasePlaylists.forEachIndexed{
                index, Playlist ->
            println("\n${index + 1} - ${Playlist.playlistName}")
        }
    }
    else{
        println("NO PLAYLISTS!")
    }
}

fun createPlaylist()/*: Playlist*/ {
    do{
        println("Choose a Name For The Playlist:")
        //lê a entrada do usuário e exclui espaços da esquerda e direita
        val namePlaylist: String = readln().trim()

        if(namePlaylist.isNotEmpty()){
            //criar instância da classe laylist
            val newPlaylist = Playlist(namePlaylist)

            println("\n$namePlaylist created!")

            //adiciona a nova Playlist na lista global de playlist
            dataBasePlaylists.add(newPlaylist)
            println("*\t".repeat(5))

            //return newPlaylist
        }
        else{
            println("\nInvalid name!\n")
            println("=".repeat(50))
        }
    }while(namePlaylist.isEmpty())
    //return TODO("Provide the return value")
}

fun playlistsManager(){

    //função tocar playlist:
    fun playPlaylist(playlistChoose: Int){
        print("\u001b[H\u001b[2J")

        println("""
                    ${"-".repeat(50)}
                    ▶ ${dataBasePlaylists[playlistChoose].playlistName}
                    
                    """.trimIndent())

        val playlist = dataBasePlaylists[playlistChoose]

        val songPlaylist = playlist.songs

        if(songPlaylist.isNotEmpty()){
            songPlaylist.forEachIndexed{
                    index, song ->
                println("${index + 1} - ${song.name}\t\t ${song.duration.minutes}:${song.duration.seconds}\n")
            }
        }
        else{
            println("empty!".uppercase())
        }

    }

    while(true){
        println(""" 
        ${"=".repeat(50)}
        
                    Playlist Manager
        
            1 - Play Playlist
            
            2 - Create Playlist
            
            3 - Delete Playlist
            
            4 - Exit
        
        ${"=".repeat(50)}
        """.trimIndent())

        when(readln()){
            "1" -> {
                print("\u001b[H\u001b[2J")
                if(dataBasePlaylists.isNotEmpty()){
                    showPlaylist()

                    println("\nSelect playlist: \n")

                    val playingPlaylist = readln().toInt() - 1
                    playPlaylist(playingPlaylist)


                }
                else{
                    println("\nNo playlists!\n")
                }
            }

            "2" -> {
                print("\u001b[H\u001b[2J")
                createPlaylist()
            }

            "3" -> {
                print("\u001b[H\u001b[2J")
                if(dataBasePlaylists.isNotEmpty()){
                    println("Select a Playlist To Delete:")

                    showPlaylist()
                    do{
                        val delete = readln().toInt() -1

                        if(delete >= 0 && delete < dataBasePlaylists.size){
                            println("${dataBasePlaylists[delete].playlistName} HAS BEEN DELETED!")
                            dataBasePlaylists.removeAt(delete)
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

            "4" ->{
                print("\u001b[H\u001b[2J")
                break
            }

            else -> println("\nInvalid option!\n".uppercase())

        }
    }
}