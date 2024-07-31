package org.example.jimmerdemo.model1

import org.babyfish.jimmer.sql.*

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/7/31
 * @description
 **/
@Entity
interface BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    @Key
    val name: String

    val website: String?
}