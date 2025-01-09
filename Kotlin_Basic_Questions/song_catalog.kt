/*
Imagine that you need to create a music-player app.

Create a class that can represent the structure of a song.
The Song class must include these code elements:

Properties for the title, artist, year published, and play count
A property that indicates whether the song is popular.
If the play count is less than 1,000, consider it unpopular.
A method that prints a song description in this format:
"[Title], performed by [artist], was released in [year published]."
 */

fun main() {
    val song1 = Song("Love Yourself", "Justin Bieber", "2005")
    val song2 = Song("My Woman", "Zayn", "2024")

    repeat(10000) {
        song1.playSong()
    }

    repeat(999) {
        song2.playSong()
    }

    song1.totalCount()
    song2.totalCount()

    song1.checkPopularity()
    song2.checkPopularity()

    song1.printSongDescription()
    song2.printSongDescription()

}

class Song (
    private val title: String,
    private val artist: String,
    private val yearPublished: String,
) {
    private var playCount: Int = 0

    // count the no of time the song was played
    fun playSong () {
        playCount++
        println("Started playing $title")
    }

    // check if the song is popular or not
    fun checkPopularity () {
        if (playCount < 1000) {
            println("$title is unpopular.")
        } else {
            println("$title is popular.")
        }
    }

    // prints the song description
    fun printSongDescription () {
        println("$title, performed by $artist, was released in $yearPublished.")
    }

    // total count
    fun totalCount () {
        println("$title was played $playCount times.")
    }
}
