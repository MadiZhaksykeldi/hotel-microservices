# Final Project – Hotel Systemm
## 1. Introduction
1.1 Technologies: Eureka Client, Eureka Server, MySQL, JS, Hystrix, Kafka, Zuul, Docker.
1.2 Purpose: simplifying hotel processes

## 2. Services: 
1. Support Service – information about issues that may happened, yes/no with description
2. Deals Service – rooms, description, price, ratings
3. Bookings – who own which room
4. View – Collects all microservices, gathers information, frontend

![Diagram](https://sun9-59.userapi.com/impg/EM_0wXCrQae8XEl2kP359gSRJWEXGEgQZnPh3w/UbkZd7FPpdQ.jpg?size=387x276&quality=90&proxy=1&sign=b78cfea944f2dbabceb45ff97389c289)

## 3. Database
![Support](https://sun9-32.userapi.com/impg/FzdLf7I0fF8POlSBcQE2BwnfJkn99OxxWakssg/yz1gfy7JDko.jpg?size=318x125&quality=90&proxy=1&sign=bc1924bbadd32074a88e3d6b333669e9)
![Deals](https://sun9-67.userapi.com/impg/OK2ez9NAcMwTZy__07BG8sXJdRwA8pA4Zp92Zg/1twjOv9cxws.jpg?size=515x106&quality=90&proxy=1&sign=ad52bd2656c7a13aaef4a0643ee8e25f)
![Bookings](https://sun9-29.userapi.com/impg/Rt6iETfQMsxldLDbWH0bom9lQUzDxsM-50LFFA/78DXMgV_nkw.jpg?size=451x122&quality=90&proxy=1&sign=cb5442a909bdd12092d5faceaa04ac9c)

## 4. Appendix
1) localhost:8761 Eureka Server
![Eureka](https://sun9-33.userapi.com/impg/iLbuBZaxMeJtwhcoeSwfU7qVJyAEeMEK6A9Ngw/1lM-n-p57uw.jpg?size=548x228&quality=90&proxy=1&sign=1ea9f56de9e544cd9381a5f152fa4090)
2) localhost:8081/bookings list of bookings 
![Bookings](https://sun9-3.userapi.com/impg/zJTHVmUFYA1g7eDVKfHfBLXRnbRCVIgw0voyYg/WgFnp9w5I0k.jpg?size=520x400&quality=90&proxy=1&sign=55b7b32ba81622ea729f3e5e73a0cb53)
3) localhost:8082/deals list of hotels 
![Deals](https://sun9-23.userapi.com/impg/br195nl4myMCdjpguJJf25KUQpHzRFI244t0VQ/MH_mktxzrCQ.jpg?size=496x468&quality=90&proxy=1&sign=9e8d507cab7b0cf9d9e61ce0974a2290)
4) localhost:8083/cases list of issues 
![Support](https://sun9-56.userapi.com/impg/vNsEEdUshWvlDt3_9a4zwbYjup_okHIWayH9uQ/YNN68YB9aHc.jpg?size=438x285&quality=90&proxy=1&sign=081c0457f203b6dd4b6420cedb997742)
5) localhost:8084 website 
![Website](https://sun9-60.userapi.com/impg/DVV02P7-exH_8n8WG1RW0q4976R8Em8j9I6EkA/0Bkw5ePORuI.jpg?size=1920x939&quality=96&proxy=1&sign=36433119bce74bbdf8895b8fcc67276a)
6) localhost:8081/hystrix.stream http://localhost:8081/actuator/hystrix.stream
![Hystrix](https://sun9-66.userapi.com/impg/IJAgBaWu_RXNBAcbNzEUDFwWnReBPMxsOFw7aQ/V3215Q3HMTY.jpg?size=832x492&quality=96&proxy=1&sign=d4c6b6eddc83f95e8c4416e64e788c95)
7) localhost:8090 
![Kafka](https://sun9-36.userapi.com/impg/3VBZeP-vy9wh7UdMP9gH7HmMxCWnRZN46w6VkA/nFe4kMpvzIM.jpg?size=879x134&quality=96&proxy=1&sign=1cbfa3e5a5b3047075bf6bfb62c312fa)
