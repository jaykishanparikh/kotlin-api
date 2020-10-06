package au.com.inteqnet.api.controller

import au.com.inteqnet.api.repo.CountryRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong
import au.com.inteqnet.api.service.CountryService
@RestController
class CountryController(private val countryService: CountryService) {

	@GetMapping("/countries")
	fun findAll() = countryService.findAll()

	@GetMapping("/countries/{name}")
	fun findByName(@PathVariable name:String)
			= countryService.findByName(name)
}