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
                showSongs()
                while(true){
                    print("\u001b[H\u001b[2J")
                    println("\nCHOSEN A MUSIC: ")
                    val musicChosen = readln().toInt() - 1
                    if(musicChosen >= 0 && musicChosen < dataBaseSongs.size){
                        val durationMusicChosen =
                            "${dataBaseSongs[musicChosen].duration.minutes}:${dataBaseSongs[musicChosen].duration.seconds}"
                        println("""
                            
                        ▶   ${dataBaseSongs[musicChosen].name}            ${durationMusicChosen}
                            ${dataBaseSongs[musicChosen].album}    
                        """.trimIndent())
                        break
                    }
                    else println("\ninvalid option!".uppercase())
                }
            }

            "2"->{
                //print("\u001b[H\u001b[2J")
                println("CHOSEN A MUSIC: ")
                val musicChosen  = readln().toInt() -1
                val music = dataBaseSongs[musicChosen]

                showPlaylist()

                if(dataBasePlaylists.isEmpty()){
                    createPlaylist()
                    val choosePlaylist = dataBasePlaylists[0]
                    choosePlaylist.songs.add(music)
                    println("${music.name} HAS BEEN ADDED TO ${choosePlaylist.playlistName}!")
                }
                else {
                    println("CHOSEN A PLAYLIST: ")
                    val playlistChosen = readln().toInt() - 1


                val playlist = dataBasePlaylists[playlistChosen]

                playlist.songs.add(music)
                }
            }

            "3"->{
                print("\u001b[H\u001b[2J")

                println("\nSTATE THE NAME OF THE SONG: ")
                val nameNewSong = readln()

                println("\nSTATE THE BAND/SINGER OF THE SONG: ")
                val singerNewSong = readln()

                println("\nSTATE THE ALBUM OF THE SONG: ")
                val albumNewSong = readln()

                println("\nSTATE THE MINUTES OF THE SONG: ")
                val minuteNewSong = readln().toInt()

                println("\nSTATE THE SECONDS OF THE SONG: ")
                val secondNewSong = readln().toInt()

                val newSong = Song(nameNewSong, singerNewSong, Duration(minuteNewSong, secondNewSong),albumNewSong)
                dataBaseSongs.add(newSong)
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