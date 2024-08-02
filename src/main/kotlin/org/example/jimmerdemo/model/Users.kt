package org.example.jimmerdemo.model

import org.babyfish.jimmer.sql.*

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/7/31
 * @description
 **/
@Entity
@Table(name = "users")
interface Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    val nickname: String

    val avatar: String?

    @Key
    val phone: String
}