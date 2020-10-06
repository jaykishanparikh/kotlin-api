package au.com.inteqnet.api.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Country(
	@Id
	val id : Int,
	val name : String,
	val iso3 : String,
	val iso2 : String,
	val phone_code : String,
	val capital : String,
	val currency : String,
	val native : String,
	val emoji : String,
	val emojiU : String
)
