import Attachments.Attachment

data class Comment(
    val id: Int,
    val postId: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut,
    val replyToUser: Int,
    val replyToComment: Int,
    val parentsStack: Array<Int>?,
    val thread: Thread,

) {
    val attachments = mutableListOf<Attachment >()
}