package org.example.jimmerdemo.model1

import org.babyfish.jimmer.sql.EnumItem

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/7/31
 * @description
 **/
enum class Gender {

    @EnumItem(name = "M")
    MALE,

    @EnumItem(name = "F")
    FEMALE
}