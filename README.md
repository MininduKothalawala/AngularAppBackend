# Pearson Practical Test. (Back-end)
## This project was created as the solution for the Practical Test of Pearson Lanka.


This Back-end part was created by using the Spring Boot framework


If you want to run this application please follow few steps as below
1. Open project with your favourite IDE.
2. Clone this repository.
3. Install all the maven dependencies.
4. Start the project and go through it.

## Rest end-points used in the application

* To insert a new country record, send a POST request with new country details to
* http://localhost:8080/rest/v2/country/add


* To get all countries send a GET request to,
* http://localhost:8080/rest/v2/countries


* To get spesific one country send a GET request with country id to,
* http://localhost:8080/rest/v2/country/{id}


* To edit (update) a selected country details, send a PUT request with updated details and country id to,
* http://localhost:8080/rest/v2/country/update/{id}


* To delete specific country, send a DELETE request with country id to,
* http://localhost:8080/rest/v2/country/delete/{id}

#### Please find the Front-end part of this application by going through this link,
* https://github.com/MininduKothalawala/AngularAppFrontend
