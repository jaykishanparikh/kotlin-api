package au.com.inteqnet.api

import au.com.inteqnet.api.repo.CountryRepo
import au.com.inteqnet.api.model.Country
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.nio.file.Paths
import java.io.*

@SpringBootApplication
class ApiApplication {
	private val log = LoggerFactory.getLogger(ApiApplication::class.java)

	@Bean
	fun init(repository: CountryRepo) = CommandLineRunner {
		// Preapare data from db file
		val countryJSON: String = getResourceAsText("/static/countries.json")
		val gson = GsonBuilder().create()
		val model= gson.fromJson(countryJSON, Array<Country>::class.java).toList()
		model.forEach { repository.save(it) }
	}
}

/**
 * Main function - api application starts
 */
fun main(args: Array<String>) {
	runApplication<ApiApplication>(*args)
}

fun getResourceAsText(path: String): String {
    return object {}.javaClass.getResource(path).readText()
}