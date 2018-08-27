

2018-8-18
这是配置客户端中心

通过向注册中心进行注册可以确保高可用


如果放行全部api
management:
    endpoints:
        web:
            exposure:
                include:  '*'
一定要注意不要少了 ''

那么 http://localhost:9530/actuator/bus-refresh
    端口就是management的端口不再是服务的端口,否则会提示management


如果management:
      endpoints:
          web:
              exposure:
                  include:  bus-refresh
 那么Admin中的 节点一直是down状态 ,应该是需要开放 health接口