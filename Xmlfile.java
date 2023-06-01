<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context-3.0.xsd">
          <bean id ="baby" class="org.jsp.springpractise.autowiring.Baby" autowire="byType"></bean>
          <bean id="vanilla" class ="org.jsp.springpractise.autowiring.Vanilla"></bean>
          <bean id="chocolate" class="org.jsp.springpractise.autowiring.Chocolate" primary="true"></bean>
    </beans>