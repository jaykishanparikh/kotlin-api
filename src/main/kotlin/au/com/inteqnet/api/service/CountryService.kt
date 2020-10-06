package au.com.inteqnet.api.service

import au.com.inteqnet.api.repo.CountryRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong
import org.springframework.stereotype.Service;

@Service
class CountryService (private val repository: CountryRepo) {
	fun findAll() = repository.findAll()

	fun findByName(name:String)
			= repository.findByName(name)
}