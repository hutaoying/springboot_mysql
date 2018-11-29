###springboot入门篇  
1 在test中测试controller中的get路由  
2 不重启服务修改日志的打印级别。  
management.endpoints.web.exposure.include=*  
http://localhost:8080/actuator/loggers 来获取支持的日志等级  
http://localhost:8080/actuator/loggers/com.h3c.springboot_mysql.controller Post请求修改  
{
	"configuredLevel":"DEBUG",
	"effectiveLevel":"DEBUG"
}
此时，指定包中的日志的级别改为DEBUG级别  
3 
