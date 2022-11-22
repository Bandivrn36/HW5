package Attachments

class VideoAttachments(video: Video) : Attachment() {
    override val type: String = "video"
}

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val date: Int,
    val addingDate: Int,
    val views: Int,
    val localViews: Int,
    val comments: Int,
    val player: String,
    val platform: String,
    val canAdd: Boolean,
    val isPrivate: Boolean,
    val accessKey: String,
    val processId: Int?

)