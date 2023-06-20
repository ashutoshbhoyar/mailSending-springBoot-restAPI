# mailSending-springBoot-restAPI

Adding the spring-boot-starter-mail dependency in pom.xml.
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-mail</artifactId>
</dependency>


Step 2: Setting up Application.properties file with configurations required for using Gmail SMTP server.
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=<Login User >
spring.mail.password=<Login password>
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

For password generation, 2-step verification needs to be enabled for your account
Login to Gmail 
-> Manage your Google Account 
-> Security 
-> App Passwords 
-> Provide your login password 
-> Select app with a custom name 
-> Click on Generate

