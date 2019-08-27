# Build RESTful API with Spring Boot Framework
[![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/pevensey/spring-boot-api.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/pevensey/spring-boot-api/context:java)
[![fuzzit](https://app.fuzzit.dev/badge?org_id=yuliantopambudi)](https://app.fuzzit.dev/orgs/yuliantopambudi/dashboard)
[![Travis CI](https://travis-ci.org/pevensey/spring-boot-api.svg?branch=master)](https://travis-ci.org/pevensey/spring-boot-api)

Build API with GET,POST,PUT,DELETE, and SORT method for mobile applications.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

I'm using intellij idea for IDE, 
* Spring tools suits 4-4.3.0, 
* JDK 1.8, 
* Maven 3.6.1,
* XAMPP.

Dependencies :
* Devtools
* JPA
* MySQL
### Prerequisites

What things you need to install the software and how to install them

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Parameter

### `/pengaduan`

Returns all information about all episodes. This returns an array of Episode
objects as defined above.

### `/newest`

Returns the episode of My Little Pony: Friendship is Magic that will air next.

### `/last_aired`

Returns the episode of My Little Pony: Friendship is Magic that most recently
aired.

### `/season/<number>`

Returns all information about episodes in the given season number or a `404`
reply if no episodes could be found. To get all information about the movies
shown, set the season as `99`.

### `/season/<number>/episode/<number>`

Returns all information about the episode with the given season and episode
number. If the episode cannot be found, this will return a `404`.

### `/random`

Returns a random episode record from the list of episodes.

### `/search`

This must be given a query paramater `q` containing the text to search for. Not
including this will return a `406` reply. This will search the list of episode
records for any episodes whose names match the given search terms. This is
case-insensitive. If no episodes can be found, this will return a `404` reply.

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* 
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring tools suit](https://spring.io/tools) -  a web framework used
* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) -  a development environment for building applications, applets, and components using the Java programming language.
* [XAMPP](https://www.apachefriends.org/index.html) - an easy to install Apache distribution containing MariaDB, PHP and Perl. 

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
