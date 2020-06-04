# domrf-embedded

Репозиторий Docker:

docker pull ste5an/domrf-test-app:domrf

docker run -p 8080:8080 ste5an/domrf-test-app:domrf

SWAGGER - описание Api
http://localhost:8080//swagger-ui.html

POSTMAN:
1. POST (save user) - http://localhost:8080/rest/user/save
{ 
	"passportId": "1234",
	"fullName": "Ivanov Ivan Ivanivich",
	"address": "Moscow"
}

2. GET (get all users) - http://localhost:8080/rest/user/users

3. GET (get user by id) - http://localhost:8080/rest/user/find/1234

4. PUT (update user) - http://localhost:8080/rest/user/update
{ 
	"passportId": "1234",
	"fullName": "Petrov Petr Petrovich",
	"address": "Samara"
}
5. DELETE (remove user by id) - http://localhost:8080/rest/user/delete/1234
