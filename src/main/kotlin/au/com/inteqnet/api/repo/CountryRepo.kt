package au.com.inteqnet.api.repo

import org.springframework.data.repository.CrudRepository
import au.com.inteqnet.api.model.Country

interface CountryRepo : CrudRepository<Country, Long> {

	fun findByName(name: String): Iterable<Country>
}