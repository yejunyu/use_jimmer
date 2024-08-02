package org.example.jimmerdemo.model

import org.babyfish.jimmer.sql.EnumItem

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/7/31
 * @description
 **/
enum class Gender(val classes: Int, val classesName: String) {

    @EnumItem(name = "1")
    GONGLUE(1, "攻略"),

    @EnumItem(name = "2")
    BUG(2, "bug"),

    @EnumItem(name = "3")
    JIAOYI(3, "交易"),

    @EnumItem(name = "4")
    FENXIANG(4, "分享"),

    @EnumItem(name = "5")
    SHIJIEXIAN(5, "世界线"),

    @EnumItem(name = "6")
    JUESE(6, "角色"),

    @EnumItem(name = "7")
    KUOLIE(7, "扩列"),
}