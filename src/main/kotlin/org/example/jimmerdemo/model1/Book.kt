//package org.example.jimmerdemo.model1
//
//import org.babyfish.jimmer.sql.*
//import java.math.BigDecimal
//
///**
// * @author yjy
// * @emial yyyejunyu@gmail.com
// * @date 2024/7/31
// * @description
// **/
//@Entity
//interface Book {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    val id: Long
//
//    @Key
//    val name: String
//
//    @Key
//    val edition: Int
//
//    val price: BigDecimal
//
//    @ManyToOne
//    val store: BookStore?
//
//    @ManyToMany
//    @JoinTable(
//        name = "BOOK_AUTHOR_MAPPING",
//        joinColumnName = "BOOK_ID",
//        inverseJoinColumnName = "AUTHOR_id"
//    )
//    val authors: List<Author>
//}