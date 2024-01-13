# Microservia - (Microservices Architecture)

## About
A microservices simulation of the fictional country "_Microservia_".

Services communicate via RESTful API's over HTTP.

## Languages / tools
- Java
  - JAX-RS (Jakarta RESTful Web Services)
  - MicroProfile
  - Open Liberty

## List of services
- **Citizen Service**
  - `microservia-service-citizen`
  - Citizen management operations
  - Generates national ID number from the NI Number Service during a citizen registration
- **NI Number Service**
  - `microservia-service-ninumber`
  - Generates national ID numbers, used by the Citizen Service during citizen registrations
