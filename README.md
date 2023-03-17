<div align="center">
    <h1>MovieFlix</h1>
  </a>
  <p>Rate and comment what you found out about your favourite movie</p>
</div>

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/romuloabbiati/dsmeta/blob/main/LICENSE) 

# About the Project
MovieFlix is an full stack web and mobile application, although I have done only the back-end, built during the **Bootcamp DevSuperior** (#BDS2). This event was organised by [DevSuperior](https://devsuperior.com.br "DevSuperior's site").

This application consists of a movie database, in which those movies can be rated by the users. Users may be visitors (VISITOR) or members (MEMBER). Only members can rate on this app.

When accessing the app, the user should log into it. Only logged users can navigate to movies. Right after logging in, the movie listing pops on screen, which shows a list of movies in pages, ordered alphabetically by title. An user can filter movies by genre.

If the a movie is select in the list, a page is displayed with some movie details, where it is possible to see all info in regards to the movie selected and also its overall rate. If the user is a member, he/she can even register a comment in this screen.

An user has name, email and password; the email address is its username. Each and every movie has got a title, subtitle, an image, release date, synopsis and a genre. Members can log a rate for movies. The same member can leave more than one assessment for the same movie.


The application can be accessed with the following user/member:
<p>VISITOR -> email: bob@gmail.com | senha: 123456</p>
<p>MEMBER -> email: ana@gmail.com | senha: 123456</p>


## UML
![Conceptual Model](https://github.com/romuloabbiati/images/blob/main/movieflix/movieflix1.png)

# Technologies used
## Backend
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Technologies used to deploy the app
- Backend: Heroku
- DB: Postgresql

# How to run the project

## Back end
Pre-requisites: Java 11

```bash
# Clone the following reporitoy
git clone https://github.com/romuloabbiati/bds06

# Enter the project's backend folder
cd backend

# Use the following command on terminal to run the project
./mvnw spring-boot:run
```


<h3>Author</h3>

 <h4><b>Rômulo Hipólito Abbiati</b></h4> <a href="https://www.instagram.com/romulohipolitoabbiati/" title="Instagram"></a>

Made by Rômulo Abbiati 👋🏽 Contact Details

[![Linkedin Badge](https://img.shields.io/badge/-Romulo-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/romulo-hip%C3%B3lito-abbiati-73b9b696/?locale=en_US)](https://www.linkedin.com/in/romulo-hip%C3%B3lito-abbiati-73b9b696/?locale=en_US)
<hr>

