# Build REST API with Spring Boot Framework
[![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/pevensey/spring-boot-api.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/pevensey/spring-boot-api/context:java)
[![fuzzit](https://app.fuzzit.dev/badge?org_id=yuliantopambudi)](https://app.fuzzit.dev/orgs/yuliantopambudi/dashboard)
[![Travis CI](https://travis-ci.org/pevensey/spring-boot-api.svg?branch=master)](https://travis-ci.org/pevensey/spring-boot-api)
[![](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/images/0)](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/links/0)[![](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/images/1)](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/links/1)[![](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/images/2)](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/links/2)[![](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/images/3)](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/links/3)[![](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/images/4)](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/links/4)[![](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/images/5)](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/links/5)[![](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/images/6)](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/links/6)[![](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/images/7)](https://sourcerer.io/fame/pevensey/pevensey/spring-boot-api/links/7)


## General Info
I'm build this rest-api as backend system for android app called [template-dpr-now](https://github.com/aannisagita/Template_dpr_now). This backend system provide feature for 'pengaduan'
and login to android app. This rest-api could perform GET, POST, PUT, DELETE, and SORT method.

## Getting Started

I'm using intellij idea for IDE, 
* Spring tools suits 4-4.3.0, 
* JDK 1.8, 
* Maven 3.6.1,
* XAMPP.

Dependencies :
* Devtools
* JPA
* MySQL

### Parameter
These parameter tested on Postman v5.5.4

### `GET /pengaduan`

Returns all pengaduan. 

### `POST/pengaduan`

Send data to pengaduan, with field (nama, email, nomor-telepon, isi-aduan). 

### `PUT /pengaduan`

Return all pengaduan, then update with newest field (nama, email, nomor-telepon, isi-aduan).

### `DELETE /pengaduan`

Delete pengaduan with ID. 

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring tools suit](https://spring.io/tools) -  a web framework used
* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) -  a development environment for building applications, applets, and components using the Java programming language.
* [XAMPP](https://www.apachefriends.org/index.html) - an easy to install Apache distribution containing MariaDB, PHP and Perl. 


