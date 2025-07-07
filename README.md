
### Start docker
1- docker build -t labseq-service .
2- docker run -i -p 8080:8080 labseq-service

### Test API 
-Swagger: http://localhost:8080/q/swagger-ui

-Postman API
(GET) http://localhost:8080/labseq/100000
