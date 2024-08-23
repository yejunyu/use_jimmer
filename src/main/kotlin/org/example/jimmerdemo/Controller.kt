package org.example.jimmerdemo

import com.thss.fswjj.entity.Users
import org.example.jimmerdemo.entity.Chapter
import org.example.jimmerdemo.entity.Script
import org.example.jimmerdemo.repository.ChapterMapper
import org.example.jimmerdemo.repository.ScriptRepository
import org.example.jimmerdemo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/8/2
 * @description
 **/
@RestController
class Controller(
    val userMapper1: UserRepository,
    val scriptMapper: ScriptRepository
) {

    @Autowired
    lateinit var chapterMapper: ChapterMapper

    @GetMapping("/test")
    fun test(@RequestParam id: Long): Users? {
        val user = userMapper1.findUserByPhone("123456")
        return user
    }

    @RequestMapping("/test2")
    fun test2(): List<Users>? {
//        return userMapper1.findUsersByNickname("问心")
        return userMapper1.findAll()
    }

    @RequestMapping("/test1")
    fun test1(): Page<Chapter> {
        return chapterMapper.findAll(PageRequest.of(0, 10))
    }

    @RequestMapping("/test3")
    fun test3(): List<Script> {
        val script = scriptMapper.findAll()
        return script
    }
}