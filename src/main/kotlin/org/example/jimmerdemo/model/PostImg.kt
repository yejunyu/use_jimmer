package org.example.jimmerdemo.model

import org.babyfish.jimmer.sql.Entity
import org.babyfish.jimmer.sql.GeneratedValue
import org.babyfish.jimmer.sql.GenerationType
import org.babyfish.jimmer.sql.Id

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/7/31
 * @description
 **/
@Entity
interface PostImg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    val imgUrl: String

    val postId: Long
}