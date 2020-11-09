package com.larissa.maraes.herokotlinapi.repository

import com.larissa.maraes.herokotlinapi.entity.Hero
import org.springframework.data.jpa.repository.JpaRepository

interface HeroRepository: JpaRepository<Hero, Long>