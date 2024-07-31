//package org.example.jimmerdemo.model
//
//import org.babyfish.jimmer.sql.*
//
///**
// * @author yjy
// * @emial yyyejunyu@gmail.com
// * @date 2024/7/31
// * @description
// **/
//@Entity
//interface ForumPosts {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    val id: Long
//
//    @Key
//    val uid: Long
//
//    val title: String
//
//    val content: String
//
//    val classes: Gender
//
//    val isOfficial: Int
//        get() = 0
//}