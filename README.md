# spring-boot-basic-customer-https


#### Endpoints

  - https://localhost:8443/customers/isAlive
  - https://localhost:8443/customers/1
  - https://localhost:8443/customers/

#### Creating the docker image

  - docker image build . -t basic-customer-https
  
#### Creating the docker container
  
  - docker container create --name basic-customer-container-https basic-customer-https

#### Running the docker container

  - docker container run -d --name "basic-customer-container" -p 8080:8080 basic-customer
  - docker inspect basic-customer
  - docker ps
  
#### Keys (PKCS12)
  
  - keytool -genkeypair -alias my-key -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore my-keystore.pfx -validity 3650
  
  
#### Public Key
  
  - keytool -list -rfc --keystore my-keystore.pfx | C:\openssl-1.1\x64\bin\openssl x509 -inform pem -pubkey