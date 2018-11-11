package com.larissa.maraes.herokotlinapi.entity

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.Id
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
data class Hero(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val realName: String?,
        val heroName: String?,
        val power: String?,
        @JsonFormat(pattern = "dd/MM/yyyy")
        val birthDate: Date?,
        val occupation: String?
)