

2018-8-18
这是配置客户端中心

通过向注册中心进行注册可以确保高可用


如果
management:
    endpoints:
        web:
            exposure:
                include:  '*'


那么 http://localhost:9530/actuator/bus-refresh
    端口就是management的端口不再是服务的端口,否则会提示management