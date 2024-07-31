package org.example.jimmerdemo.model1

import org.babyfish.jimmer.sql.*

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/7/31
 * @description
 **/
@Entity
interface TreeNode {

    @Id
    @Column(name = "NODE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    val name: String

    @ManyToOne
    val parent: TreeNode?

    @OneToMany(mappedBy = "parent")
    val childNodes: List<TreeNode>
}