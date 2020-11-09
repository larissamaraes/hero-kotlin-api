package com.larissa.maraes.herokotlinapi.controller

import com.larissa.maraes.herokotlinapi.entity.Hero
import com.larissa.maraes.herokotlinapi.service.HeroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hero")
class HeroController(
        @Autowired
        private val heroService: HeroService
) {
    @GetMapping("/")
    fun getAllHeroes(): List<Hero>{
        return heroService.findAllHeroes()
    }

    @GetMapping("/find")
    fun getHeroById(@RequestParam("id") id: Long): Hero{
        return heroService.findHeroById(id)
    }

    @PostMapping("/")
    fun createHero(@RequestBody hero: Hero): Hero{
        return heroService.createHero(hero)
    }

    @PutMapping("/{id}")
    fun updateHero(@PathVariable("id") id: Long, @RequestBody hero: Hero): Hero{
        return heroService.updateHero(id, hero)
    }

    @DeleteMapping("/{id}")
    fun deleteHero(@PathVariable("id") id: Long): String{
        return heroService.deleteHero(id)
    }
}