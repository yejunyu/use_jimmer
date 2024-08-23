package com.thss.fswjj.entity

import org.babyfish.jimmer.sql.GeneratedValue
import org.babyfish.jimmer.sql.GenerationType
import org.babyfish.jimmer.sql.Id
import org.babyfish.jimmer.sql.MappedSuperclass
import java.time.LocalDateTime

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/8/19
 * @description
 **/
@MappedSuperclass
interface BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    val createAt: LocalDateTime

    val updateAt: LocalDateTime
}