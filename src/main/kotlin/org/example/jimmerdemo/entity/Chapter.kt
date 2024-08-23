package org.example.jimmerdemo.entity

import org.babyfish.jimmer.sql.*
import java.time.LocalDateTime

/**
 * 剧本的章节
 */
@Entity
interface Chapter {

    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    val id: Long

    /**
     * 剧本id
     */
    @IdView
    val scriptId: Long?

    /**
     * 章节名称
     */
    val name: String

    val description: String

    val createAt: LocalDateTime

    val updateAt: LocalDateTime

    @ManyToOne
    @JoinColumn(name = "script_id", foreignKeyType = ForeignKeyType.FAKE)
    val script: Script?
}

