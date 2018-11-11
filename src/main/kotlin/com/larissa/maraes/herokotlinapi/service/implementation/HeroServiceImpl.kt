package com.larissa.maraes.herokotlinapi.service.implementation

import com.larissa.maraes.herokotlinapi.entity.Hero
import com.larissa.maraes.herokotlinapi.repository.HeroRepository
import com.larissa.maraes.herokotlinapi.service.HeroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class HeroServiceImpl(
        @Autowired
        private val heroRepository: HeroRepository
): HeroService {
    override fun findAllHeroes(): List<Hero>{
        return heroRepository.findAll()
    }

    override fun findHeroById(id: Long): Hero{
        return heroRepository.findById(id).get()
    }

    @Transactional
    override fun createHero(hero: Hero): Hero{
        return heroRepository.save(hero)
    }

    @Transactional
    override fun updateHero(id: Long, hero: Hero): Hero{
        var h = heroRepository.getOne(id)
        return heroRepository.save(hero)
    }

    @Transactional
    override fun deleteHero(id: Long): String{
        heroRepository.deleteById(id)
        return "Done!"
    }
}