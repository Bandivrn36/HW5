import Exception.PostNotFoundException

object WallService {
    private var posts = mutableListOf<Post>()
    private var lastId = 0
    private var comments = mutableListOf<Comment>()

    fun addPost(post: Post): Post {
        lastId++
        val postNew = post.copy(id = lastId)
        posts += postNew
        return posts.last()
    }


    fun updatePost(post: Post): Boolean {
        for ((index, postOrigin) in posts.withIndex()) {
            if (post.id == postOrigin.id && post.ownerId == postOrigin.ownerId) {
                posts[index] = post.copy(dateCreated = postOrigin.dateCreated)
                return true
            }
        }
        return false
    }
    fun clearPosts() {
        posts.clear()
        lastId = 0
    }

    private fun findPost(id: Int): Post? {
        for ((index, postOrigin) in posts.withIndex()) {
            if (id == postOrigin.id) {
                return posts[index]
            }
        }
        return null
    }

    fun createComment(postId: Int, comment: Comment): Boolean {

        val post: Post = findPost(postId) ?: throw PostNotFoundException("Пост с id=$postId не найден.")
        comments += comment
        return true
    }

    }


