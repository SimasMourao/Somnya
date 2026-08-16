fun showSongs(){
    //print("\u001b[H\u001b[2J")
    dataBaseSongs.forEachIndexed{
            index, Song ->

        val nameSong = Song.name
        val durationSong = "${Song.duration.minutes}:${Song.duration.seconds}"
        val singerSong = Song.singer
        val albumSong = Song.album

        print("""

                        
        ${index + 1} - $nameSong            $durationSong
            $singerSong
        
        """.trimIndent())
    }
}

fun songsManager(){
    while (true){
        println(""" 
        ${"_".repeat(50)}
                    Songs Manager:
        
            1 - Play Song
            
            2 - Add Song to Playlist 
            
            3 - Add Song
            
            4 - Delete Song
            
            5 - Exit
                
        ${"_".repeat(50)}
        """.trimIndent())
        val option = readln().trim()

        when(option){
            "1"->{
                print("\u001b[H\u001b[2J")
                println("CHOSEN A MUSIC: ")
                //var musicChosen = readln().toInt()
            }

            "2"->{
                //print("\u001b[H\u001b[2J")
                println("CHOSEN A MUSIC: ")
                val musicChosen  = readln().toInt() -1

                showPlaylist()
                println("CHOSEN A PLAYLIST: ")
                val playlistChosen = readln().toInt() -1

                val music = dataBaseSongs[musicChosen]
                val playlist = dataBasePlaylists[playlistChosen]

                playlist.songs.add(music)
            }

            "3"->{
                print("\u001b[H\u001b[2J")
            }

            "4"->{
                print("\u001b[H\u001b[2J")
            }

            "5"->{
                print("\u001b[H\u001b[2J")
                break;
            }

            else ->{
                print("\u001b[H\u001b[2J")
                println("\nInvalid option!\n".uppercase())
            }
        }
    }
}