## Synopsis
This is an kotlin based rest api application that implements a simple rest service about country details.

## Assumptions
1. API Security is not part of this project. This api is accessible through API gateway such as apigee and it is handled by API gateway to avoid unnecessary complexcity and better management at one place.
2. The build can be configured as part of CI/CD tools such as Jenkins, Bamboo or cloud pipelines.
3. Everytime project is build, junit reports are generated and can be accessible through [build/reports/tests/test/index.html] (/.build/reports/tests/test/index.html)
4. Build machine has Gradle, Groovy installed.
5. Dev machine has Kotlin, and JVM installed

## Technologies
  1. Programming Language - Kotlin (1.3.71)
  2. Framework - Spring
  3. Database - In memory H2
  4. Build - Gradle 6.4

## Instructions
1 - Run the server
```
./gradlew bootRun
```
2 - Test the API
There is a [postman configuration](./doc/postman/MobileAPI.postman_collection.json)
 that you can import and start testing the web services.
 
## Gradle tasks
```
./gradlew detekt //Code analysis.
./gradlew checkDependencyUpdates //Check dependency updates.
```

## API Reference
1. Inquire details of all countries - 

  ``` localhost:8085/countries/id/76 ```
  Response
 
  ```
 [
    {
        "id": 1,
        "name": "Afghanistan",
        "iso3": "AFG",
        "iso2": "AF",
        "phone_code": "93",
        "capital": "Kabul",
        "currency": "AFN",
        "native": "افغانستان",
        "emoji": "🇦🇫",
        "emojiU": "U+1F1E6 U+1F1EB"
    },
    {
        "id": 2,
        "name": "Aland Islands",
        "iso3": "ALA",
        "iso2": "AX",
        "phone_code": "+358-18",
        "capital": "Mariehamn",
        "currency": "EUR",
        "native": "Åland",
        "emoji": "🇦🇽",
        "emojiU": "U+1F1E6 U+1F1FD"
    },
    {
        "id": 3,
        "name": "Albania",
        "iso3": "ALB",
        "iso2": "AL",
        "phone_code": "355",
        "capital": "Tirana",
        "currency": "ALL",
        "native": "Shqipëria",
        "emoji": "🇦🇱",
        "emojiU": "U+1F1E6 U+1F1F1"
    },
    .
    .
    .
    .
    .
 ]
  ```
  
2. Inquire details of a specific country through variuos parameters - 
  2.1 By Id - 
  ``` localhost:8085/countries/id/76 ```
  
 Response
 
  ```
  [
    {
        "id": 76,
        "name": "French Guiana",
        "iso3": "GUF",
        "iso2": "GF",
        "phone_code": "594",
        "capital": "Cayenne",
        "currency": "EUR",
        "native": "Guyane française",
        "emoji": "🇬🇫",
        "emojiU": "U+1F1EC U+1F1EB"
    }
]
  ```
  2.2 By Name - 
  ``` localhost:8085/countries/name/Australia ```
 
 Response
 
  ```
  [
    {
        "id": 14,
        "name": "Australia",
        "iso3": "AUS",
        "iso2": "AU",
        "phone_code": "61",
        "capital": "Canberra",
        "currency": "AUD",
        "native": "Australia",
        "emoji": "🇦🇺",
        "emojiU": "U+1F1E6 U+1F1FA"
    }
]
  ```
  2.3 By Currancy - 
  ```
  localhost:8085/countries/currency/AUD
  ```
 Response
 
  ```
 [
    {
        "id": 14,
        "name": "Australia",
        "iso3": "AUS",
        "iso2": "AU",
        "phone_code": "61",
        "capital": "Canberra",
        "currency": "AUD",
        "native": "Australia",
        "emoji": "🇦🇺",
        "emojiU": "U+1F1E6 U+1F1FA"
    },
    {
        "id": 46,
        "name": "Christmas Island",
        "iso3": "CXR",
        "iso2": "CX",
        "phone_code": "61",
        "capital": "Flying Fish Cove",
        "currency": "AUD",
        "native": "Christmas Island",
        "emoji": "🇨🇽",
        "emojiU": "U+1F1E8 U+1F1FD"
    },
    {
        "id": 47,
        "name": "Cocos (Keeling) Islands",
        "iso3": "CCK",
        "iso2": "CC",
        "phone_code": "61",
        "capital": "West Island",
        "currency": "AUD",
        "native": "Cocos (Keeling) Islands",
        "emoji": "🇨🇨",
        "emojiU": "U+1F1E8 U+1F1E8"
    },
    {
        "id": 96,
        "name": "Heard and McDonald Islands",
        "iso3": "HMD",
        "iso2": "HM",
        "phone_code": " ",
        "capital": "",
        "currency": "AUD",
        "native": "Heard Island and McDonald Islands",
        "emoji": "🇭🇲",
        "emojiU": "U+1F1ED U+1F1F2"
    },
    {
        "id": 114,
        "name": "Kiribati",
        "iso3": "KIR",
        "iso2": "KI",
        "phone_code": "686",
        "capital": "Tarawa",
        "currency": "AUD",
        "native": "Kiribati",
        "emoji": "🇰🇮",
        "emojiU": "U+1F1F0 U+1F1EE"
    },
    {
        "id": 153,
        "name": "Nauru",
        "iso3": "NRU",
        "iso2": "NR",
        "phone_code": "674",
        "capital": "Yaren",
        "currency": "AUD",
        "native": "Nauru",
        "emoji": "🇳🇷",
        "emojiU": "U+1F1F3 U+1F1F7"
    },
    {
        "id": 163,
        "name": "Norfolk Island",
        "iso3": "NFK",
        "iso2": "NF",
        "phone_code": "672",
        "capital": "Kingston",
        "currency": "AUD",
        "native": "Norfolk Island",
        "emoji": "🇳🇫",
        "emojiU": "U+1F1F3 U+1F1EB"
    },
    {
        "id": 228,
        "name": "Tuvalu",
        "iso3": "TUV",
        "iso2": "TV",
        "phone_code": "688",
        "capital": "Funafuti",
        "currency": "AUD",
        "native": "Tuvalu",
        "emoji": "🇹🇻",
        "emojiU": "U+1F1F9 U+1F1FB"
    }
]
  ```
  
  2.4 By Capital - 
  ```
  localhost:8085/countries/capital/New Delhi
  ```
 Response
 
  ```
 [
    {
        "id": 101,
        "name": "India",
        "iso3": "IND",
        "iso2": "IN",
        "phone_code": "91",
        "capital": "New Delhi",
        "currency": "INR",
        "native": "भारत",
        "emoji": "🇮🇳",
        "emojiU": "U+1F1EE U+1F1F3"
    }
]
  ```
## Unit Testing
