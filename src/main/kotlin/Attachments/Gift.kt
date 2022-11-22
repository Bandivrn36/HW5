package Attachments

class GiftAttachments(gift: Gift) : Attachment() {
    override val type: String = "Gift"
}

data class Gift(
    val id: Int,
    val thumb256: String,
    val thumb96: String,
    val thumb48: String
)