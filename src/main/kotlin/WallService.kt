object WallService {
    var posts = mutableListOf<Post>()
    private var lastId = 0

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
    }

