<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a name="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->


<!-- PROJECT LOGO -->
<br />
<div align="center">
    <img src="src/main/resources/static/images/logo/logo2.png" alt="Logo" width="92" height="92">
</div>

<h3 align="center">World Politics Explorer</h3>

<!-- ABOUT THE PROJECT -->
## About The Project
<div>
    <p>Welcome to the World Politics Explorer! This platform delves into the powerful ideas and ideologies that shape our world today. Through dynamic graphs and interactive maps, we present a clear picture of the prevailing political, social, and economic ideologies governing different countries. These insights are supported by careful analysis and reliable sources, offering users a gateway to understanding the complex web of ideas driving global systems.</p>
    <img src="src/main/resources/static/images/about/screen.png" alt="Screenshot" width="681" height="310">
</div>

### Features:
* **Interactive Maps and Graphs::** Visualize and explore the dominant ideologies across different countries.
* **Comprehensive Ideology Database:** Access detailed information on a wide range of political, social, and economic ideologies.
* **Explore API v1.0:** Utilize our RESTful API to fetch data related to countries and their associated ideologies.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- TECHNOLOGIES USED -->
## Technologies used

* [![Java][Java.com]][Java-url]
* [![MySQL][MySQL.com]][MySQL-url]
* [![Spring Boot][SpringBoot.com]][SpringBoot-url]
* [![HTML][HTML.com]][HTML-url]
* [![JavaScript][JavaScript.com]][JavaScript-url]
* [![Maven][Maven.com]][Maven-url]
* [![CSS][CSS.com]][CSS-url]
* [![RESTful API][RESTfulAPI.com]][RESTfulAPI-url]
<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- Explore API v1.0 -->
## Explore API v1.0
<p>The World Politics Explorer API v1 is organized around REST principles and provides access to all the data available through the platform in a structured, hierarchical manner. The API currently supports only the HTTP GET method, and all endpoints return data in JSON format.</p>

#### API Endpoints:

- **GET /api/countries:** Retrieve all countries.
- **GET /api/countries/id/{id}:**   Retrieve country information by its ID.
- **GET /api/countries/name/{name}:** Retrieve country information by its name.
- **GET /api/countries/ideology/{ideology}:** Retrieve all countries associated with a specific ideology.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

To run this project, you need to have the following software installed:

* Java Development Kit (JDK) 11 or higher.
* Maven for managing dependencies and building the project.
* MySQL for database management.

#### Installation
* Clone the repository.
* Build the project using Maven.
* Run the tests to ensure everything is set up correctly.
* To start the application, run the following command: java -jar target/world-politics-explorer-1.0-SNAPSHOT.jar.
<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- LICENSE -->
## License
Distributed under the MIT License.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact
Kerem Bjälvenäs Tazedal - kerem.tazedal.89@gmail.com

Project Link: [https://github.com/Kerem1989/world-politics-explorer](https://github.com/Kerem1989/JavaEE-Webshop)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[Java.com]: https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white
[Java-url]: https://www.java.com
[MySQL.com]: https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white
[MySQL-url]: https://www.mysql.com
[SpringBoot.com]: https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white
[SpringBoot-url]: https://spring.io/projects/spring-boot
[HTML.com]: https://img.shields.io/badge/HTML-E34F26?style=for-the-badge&logo=html5&logoColor=white
[HTML-url]: https://developer.mozilla.org/en-US/docs/Web/HTML
[JavaScript.com]: https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black
[JavaScript-url]: https://developer.mozilla.org/en-US/docs/Web/JavaScript
[Maven.com]: https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white
[Maven-url]: https://maven.apache.org
[CSS.com]: https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=css3&logoColor=white
[CSS-url]: https://developer.mozilla.org/en-US/docs/Web/CSS
[RESTfulAPI.com]: https://img.shields.io/badge/RESTful_API-005571?style=for-the-badge&logo=api&logoColor=white
[RESTfulAPI-url]: https://restfulapi.net

