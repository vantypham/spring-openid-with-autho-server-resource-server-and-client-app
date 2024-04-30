# spring-openid-with-autho-server-resource-server-and-client-app
In this project, a demostration of OpenID Connect on top of OAuth 2 by using 
- Spring Authorization Server, 
- Spring Resource Server,
- Spring CLient + Gateway
You can use Postman/SOAP UI or any any test REST client tools to verify. Or start Client App to verify
## Steps to reproduce
- Run oauth2-server (authorization server)
- Run oauth2-resource (resource server)
- Use Postman to test
- Run oauth2-clientapp-gateway (client app and gateway)
- Test using browser
## OAuth 2 flow:
[![OAuth2 flow](https://github.com/vantypham/spring-openid-with-autho-server-resource-server-and-client-app/blob/main/Oauth2-flow1-ClientAppwebserver.png 'Oauth2flow')](https://github.com/vantypham/spring-openid-with-autho-server-resource-server-and-client-app/tree/main/screenshots)

## Consent
[![Consent](https://github.com/vantypham/spring-openid-with-autho-server-resource-server-and-client-app/blob/main/screenshots/Screenshot%202024-04-30%20at%2012.06.56%E2%80%AFPM.png 'consent')](https://github.com/vantypham/spring-openid-with-autho-server-resource-server-and-client-app/tree/main/screenshots)

## Access Token, ID Token, and Refresh Token

[![accesstoken](https://github.com/vantypham/spring-openid-with-autho-server-resource-server-and-client-app/blob/main/screenshots/Screenshot%202024-04-30%20at%2012.07.29%E2%80%AFPM.png 'accesstoken')](https://github.com/vantypham/spring-openid-with-autho-server-resource-server-and-client-app/tree/main/screenshots)

## Use Access Token to access Resource API
[![accessResource](https://github.com/vantypham/spring-openid-with-autho-server-resource-server-and-client-app/blob/main/screenshots/Screenshot%202024-04-30%20at%2012.08.14%E2%80%AFPM.png 'accessResource')](https://github.com/vantypham/spring-openid-with-autho-server-resource-server-and-client-app/tree/main/screenshots)

