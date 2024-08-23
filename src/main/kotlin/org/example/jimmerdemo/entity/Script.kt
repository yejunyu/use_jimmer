package org.example.jimmerdemo.entity

import org.babyfish.jimmer.sql.*
import java.time.LocalDateTime

/**
 * 剧本表
 */
@Entity
interface Script {

    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    val id: Long

    /**
     * 剧本名称
     */
    val name: String

    /**
     * 剧本封面

     */
    val coverImgUrl: String

    /**
     * 描述
     */
    val description: String

    val createAt: LocalDateTime

    val updateAt: LocalDateTime

    /**
     * 是否下架
     */
    @Column(name = "is_deleted")
    val deleted: Short
}

