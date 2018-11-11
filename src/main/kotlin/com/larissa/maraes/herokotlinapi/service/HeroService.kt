package com.larissa.maraes.herokotlinapi.service

import com.larissa.maraes.herokotlinapi.entity.Hero
import org.springframework.transaction.annotation.Transactional

interface HeroService {
    fun findAllHeroes(): List<Hero>
    fun findHeroById(id: Long): Hero
    @Transactional
    fun createHero(hero: Hero): Hero
    @Transactional
    fun updateHero(id: Long, hero: Hero): Hero
    @Transactional
    fun deleteHero(id: Long): String
}