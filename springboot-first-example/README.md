# Springboot First Example
This example includes setting the project for serving as a basic Rest Service.
* configuring *pom.xml* file
* Setting Up Springboot Application
* Testing Welcome Request.

## configuring *pom.xml* file
Parent tag in pom should contain springboot configuration.
This tag specifies the Version of Springboot and all of Springboots children we will be using
teh version we used is : *2.0.0.RELEASE*
```
<parent>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-parent</artifactId>
  <version>2.0.0.RELEASE</version>
</parent>
  ```
 ## Setting Up Springboot Application
  Use of default package in not recommended. hence I advise you to create a root package.
  Ive created the package *application*
  
  *Application.java*
  It is the first file that runs.
  
  The *Controller.java* takes the requests and give response.
  You should always keeps these controllers file in same package or sub package of *Application.java* or else you will have to specifically point it using _@ComponentScan("packagename")_
 
 ## Testing Welcome Request.
 All the controllers are hosted on *localhost:8080/*
 You can specify the controller using the RequestName is the *value* we specified in *RequestMapping*
 ```
 @RequestMapping(value = "/welcome" method = RequestMethod.GET)
	 public String functionNameDoesntMatter()
	 {
		 return "Welcome";
	 }
 ```
 
 ### About me
 * Hilal Kaldane
