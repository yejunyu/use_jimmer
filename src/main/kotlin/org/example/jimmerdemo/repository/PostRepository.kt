package org.example.jimmerdemo.repository

import org.babyfish.jimmer.spring.repository.KRepository
import org.babyfish.jimmer.sql.fetcher.Fetcher
import org.example.jimmerdemo.model.ForumPosts

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/8/2
 * @description
 **/
interface PostRepository : KRepository<ForumPosts, Long> {

    fun findForumPosts(
        index: Int = 0,
        pageSize: Int = 10,
        fetcher: Fetcher<ForumPosts>? = null
    ): List<ForumPosts> =
        sql.createQuery(ForumPosts::class) {
            select(
                table.fetch(fetcher)
            )
        }.execute()
}