package org.example.jimmerdemo.repository

import org.babyfish.jimmer.spring.repository.KRepository
import org.example.jimmerdemo.entity.Script

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/8/23
 * @description
 **/
interface ScriptRepository : KRepository<Script, Long> {
}