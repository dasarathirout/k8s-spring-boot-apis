dir
call gradle clean build

cd service-one
call docker build . -t  dasarathirout/dasarathi-api-service-one:v1.1
call docker push dasarathirout/dasarathi-api-service-one:v1.1

cd ../service-two
call docker build . -t  dasarathirout/dasarathi-api-service-two:v2.2
call docker push dasarathirout/dasarathi-api-service-two:v2.2

cd ../service-zero
call docker build . -t  dasarathirout/dasarathi-api-service-zero:v3.3
call docker push dasarathirout/dasarathi-api-service-zero:v3.3

docker images | findstr dasarathi
cd ..
