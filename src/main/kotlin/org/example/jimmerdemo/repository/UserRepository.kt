package org.example.jimmerdemo.repository

import com.thss.fswjj.entity.Users
import org.babyfish.jimmer.spring.repository.KRepository

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/8/19
 * @description
 **/
interface UserRepository : KRepository<Users, Long> {
    fun findUserByPhone(phone: String): Users?
    fun findUsersByNickname(name: String): List<Users>?
}