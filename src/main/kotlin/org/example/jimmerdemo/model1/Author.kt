package org.example.jimmerdemo.model1

import org.babyfish.jimmer.sql.*
import java.math.BigDecimal

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/7/31
 * @description
 **/
@Entity
interface Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    @Key
    val firstName: String

    @Key
    val lastName: String

    /*
     * 这里，Gender是一个枚举，，代码稍后给出
     */
    val gender: Gender
}