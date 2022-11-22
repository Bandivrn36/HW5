package Attachments

class GraffitiAttachments(graffiti: Graffiti) : Attachment() {
    override val type: String = "Graffiti"
}

data class Graffiti(
    val id: Int,
    val ownerId: Int,
    val url: String,
    val width: Int,
    val height: Int
)