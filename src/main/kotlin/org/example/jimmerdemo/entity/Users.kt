package com.thss.fswjj.entity

import org.babyfish.jimmer.sql.Entity

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/8/19
 * @description
 **/
@Entity
interface Users : BaseEntity {

    /**
     * 昵称
     */
    val nickname: String

    /**
     * openid
     */
    val openid: String

    /**
     * 头像
     */
    val avatar: String

    /**
     * 加密后的手机号
     */
    val phone: String
}