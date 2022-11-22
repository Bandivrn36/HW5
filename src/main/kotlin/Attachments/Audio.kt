package Attachments

class AudioAttachments(audio: Audio) : Attachment() {

    override val type: String = "Audio"
}
    data class Audio(
        val id: Int,
        val ownerId: Int,
        val artist: String,
        val title: String,
        val duration: Int,
        val url: String,
        val date: Int,
        val lyricsId: Int?,
        val albumID: Int?,
        val genreId: Int?,
        val noSearch: Boolean,
        val isHq: Boolean

    )
