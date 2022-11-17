
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before


class WallServiceTest {
    //lateinit var wallService: WallService
    lateinit var post: Post


    @Before
    fun clearPostsTest(){
        WallService.clearPosts()
    }

    @Test
    fun addPost(){
        post = WallService.addPost(Post(0,
            2,
            3,
            4,
            555,
            "text",
            2,
            3,
            Comments(1,true,true,true,true),
            Copyright(1,"11q","namee","type"),
            Likes(1,true,true,true),
            Reposts(12,true),
            Views(12),
            PostType.suggest,
            PostSource(Type.vk,Platform.android,"urlik"),
            Geo("w","coor",Place(123,"tit",12,13,4321,"icon.ico",12,12,3,36,36,"adr")),
            135,
            true,
            true,
            true,
            true,
            false,
            true,
            Donut(false,0,"strrrrrr",true,EditMode.all),
            75757,
            true,
            12,
            Dislikes(0,true,true,true),
            "black",
            false,
            0,
            0,
            false,
            364,
            false))


        val postId = post.id.toInt()
        assertNotEquals(0, postId)
    }

    @Test
    fun updateTrue(){
        post = WallService.addPost(Post(0,
            2,
            3,
            4,
            555,
            "text",
            2,
            3,
            Comments(1,true,true,true,true),
            Copyright(1,"11q","namee","type"),
            Likes(1,true,true,true),
            Reposts(12,true),
            Views(12),
            PostType.suggest,
            PostSource(Type.vk,Platform.android,"urlik"),
            Geo("w","coor",Place(123,"tit",12,13,4321,"icon.ico",12,12,3,36,36,"adr")),
            135,
            true,
            true,
            true,
            true,
            false,
            true,
            Donut(false,0,"strrrrrr",true,EditMode.all),
            75757,
            true,
            12,
            Dislikes(0,true,true,true),
            "black",
            false,
            0,
            0,
            false,
            364,
            false))

        val updatingPost = WallService.updatePost(Post(1,
            2,
            3,
            4,
            555,
            "new text",
            2,
            3,
            Comments(1,true,true,true,true),
            Copyright(1,"11q","namee","type"),
            Likes(1,true,true,true),
            Reposts(12,true),
            Views(12),
            PostType.suggest,
            PostSource(Type.vk,Platform.android,"urlik"),
            Geo("w","coor",Place(123,"tit",12,13,4321,"icon.ico",12,12,3,36,36,"adr")),
            135,
            true,
            true,
            true,
            true,
            false,
            true,
            Donut(false,0,"strrrrrr",true,EditMode.all),
            75757,
            true,
            12,
            Dislikes(0,true,true,true),
            "black",
            false,
            0,
            0,
            false,
            364,
            false))

        assertTrue(updatingPost)
    }

    @Test
    fun updateFalse() {
        post = WallService.addPost(Post(0,
            2,
            3,
            4,
            555,
            "text",
            2,
            3,
            Comments(1,true,true,true,true),
            Copyright(1,"11q","namee","type"),
            Likes(1,true,true,true),
            Reposts(12,true),
            Views(12),
            PostType.suggest,
            PostSource(Type.vk,Platform.android,"urlik"),
            Geo("w","coor",Place(123,"tit",12,13,4321,"icon.ico",12,12,3,36,36,"adr")),
            135,
            true,
            true,
            true,
            true,
            false,
            true,
            Donut(false,0,"strrrrrr",true,EditMode.all),
            75757,
            true,
            12,
            Dislikes(0,true,true,true),
            "black",
            false,
            0,
            0,
            false,
            364,
            false))

        val updatingPost = WallService.updatePost(Post(12,
            2,
            3,
            4,
            555,
            "new text",
            2,
            3,
            Comments(1,true,true,true,true),
            Copyright(1,"11q","namee","type"),
            Likes(1,true,true,true),
            Reposts(12,true),
            Views(12),
            PostType.suggest,
            PostSource(Type.vk,Platform.android,"urlik"),
            Geo("w","coor",Place(123,"tit",12,13,4321,"icon.ico",12,12,3,36,36,"adr")),
            135,
            true,
            true,
            true,
            true,
            false,
            true,
            Donut(false,0,"strrrrrr",true,EditMode.all),
            75757,
            true,
            12,
            Dislikes(0,true,true,true),
            "black",
            false,
            0,
            0,
            false,
            364,
            false))
        assertFalse(updatingPost)
    }


}