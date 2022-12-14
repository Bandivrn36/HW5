import Attachments.Attachment

data class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val dateCreated: Int,
    val text: String?,
    val replyOwnerID: Int,
    val replyPostId: Int,
    val comments: Comments?,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts?,
    val views: Views?,
    val postType: PostType,
    val postSource: PostSource,
    val geo: Geo,
    val signerId: Int?,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedIsAdds: Boolean,
    val isFavorites: Boolean,
    val donut: Donut?,
    val postPonedId: Int?,
    val externalLinks: Boolean,
    val countFiles: Int,
    val dislikes: Dislikes,
    val backgroundColor: String,
    val VirusTotalCheck: Boolean,
    val ageLimit: Int,
    val countOfComplaints: Int,
    val internalLinks: Boolean,
    val countSymbols: Int,
    val availableDislikes: Boolean
    ) {
    private var attachments = mutableListOf<Attachment>()

    fun addAttachments(attachment: Attachment): Boolean {
        attachments += attachment
        return true
    }
}