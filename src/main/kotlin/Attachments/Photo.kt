package Attachments

class PhotoAttachments(photo: Photo) : Attachment() {
    override val type: String = "Photo"
}

data class Photo(
    val id: Int,
    val albumID: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val width: Int?,
    val high: Int?
)

