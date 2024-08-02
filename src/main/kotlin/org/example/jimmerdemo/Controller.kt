package org.example.jimmerdemo

import org.example.jimmerdemo.repository.PostRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/8/2
 * @description
 **/
@RestController
class Controller(val postRepository: PostRepository) {

    @GetMapping("/test")
    fun test(@RequestParam id: Long): Any {
        return postRepository.findForumPosts()
    }
}