//package org.example.jimmerdemo.repository
//
//import org.babyfish.jimmer.Page
//import org.babyfish.jimmer.spring.SqlClients
//import org.babyfish.jimmer.spring.repository.KRepository
//import org.babyfish.jimmer.sql.fetcher.Fetcher
//import org.babyfish.jimmer.sql.kt.KSqlClient
//import org.babyfish.jimmer.sql.kt.ast.expression.`between?`
//import org.babyfish.jimmer.sql.kt.ast.expression.`eq?`
//import org.babyfish.jimmer.sql.kt.ast.expression.`ilike?`
//import org.babyfish.jimmer.sql.kt.ast.expression.or
//import org.babyfish.jimmer.sql.kt.ast.table.makeOrders
//import org.example.jimmerdemo.model1.*
//import java.math.BigDecimal
//
///**
// * @author yjy
// * @emial yyyejunyu@gmail.com
// * @date 2024/8/1
// * @description
// **/
//interface AuthorRepository : KRepository<Author, Long> {
//    fun findAuthorById(id: Long): Author
//
//    fun findBooks(
//
//        pageIndex: Int, // 从0开始
//        pageSize: Int = 10,
//        fetcher: Fetcher<Book>? = null,
//        sortCode: String = "name asc, edition desc",
//        name: String? = null,
//        minPrice: BigDecimal? = null,
//        maxPrice: BigDecimal? = null,
//        storeName: String? = null,
//        storeWebsite: String? = null,
//        authorName: String? = null,
//        authorGender: Gender? = null
//    ): Page<Book> =
//        sql
//            .createQuery(Book::class) {
//                where(table.name `ilike?` name)
//                where(table.price.`between?`(minPrice, maxPrice))
//                where(table.store.name `ilike?` storeName)
//                where(table.store.website `ilike?` storeWebsite)
//                where += table.authors {
//                    or(
//                        firstName `ilike?` authorName,
//                        lastName `ilike?` authorName
//                    )
//                }
//                where += table.authors { gender `eq?` authorGender }
//                orderBy(table.makeOrders(sortCode))
//                select(
//                    table.fetch(fetcher)
//                )
//            }
//            .fetchPage(pageIndex, pageSize)
//}
