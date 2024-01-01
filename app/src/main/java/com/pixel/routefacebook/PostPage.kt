package com.pixel.routefacebook

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pixel.routefacebook.databinding.ActivityPostsBinding

class PostPage : AppCompatActivity() {
    private lateinit var binding: ActivityPostsBinding
    private lateinit var adapter: PostAdapter
    private lateinit var postsList: MutableList<PostModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        postsList = arrayListOf()
        adapter = PostAdapter(postsList)
        binding.postRecyclerView.adapter = adapter
        createFakePosts()
    }


    private fun createFakePosts() {
        postsList.add(
            PostModel(
                R.drawable.prof_pic, "ExamsMeMes", "2hr.",
                "POV: your group", R.drawable.post_pic, 115, 32, 112
            )
        )
        postsList.add(
            PostModel(
                R.drawable.avatar4, "Abas El Aaad", "5d .",
                "Today i learned RecyclerView\n" +
                        "what is your opinion about that?", 120, 15, 90
            )
        )
        postsList.add(
            PostModel(
                R.drawable.avatar2, "Route", "5m.",
                "Now available,\n" +
                        "Route now open the gate to sign with us in FullStack diploma\n" +
                        "Join us now, link in the comments\n" +
                        "NOTE: nothing really in the comments sorry :')", R.drawable.fullstack, 236, 130, 90
            )
        )
        postsList.add(
            PostModel(
                R.drawable.avatar3, "Ahmed Ali", "5y .",
                "look what i found", R.drawable.post2, 15, 2, 1
            )
        )
        postsList.add(
            PostModel(
                R.drawable.avatar2, "Route", "1hr.",
                "A special appearance in 2024 for our most important star \uD83D\uDE0E\uD83D\uDC99\n" +
                        "There is a name that is always with us in the root and we have been seeing it for a long time\n" +
                        "This person decided to appear in 2024 \uD83D\uDD25\n" +
                        "Tell us in the comments who do you think is this person? \uD83E\uDD14\n" +
                        "We will randomly choose one person who will receive a discount of 500 pounds on any diploma he chooses from Diplomat Root \uD83D\uDE0E\n" +
                        "#Route", R.drawable.route_post, 3, 9, 2
            )
        )
    }
}