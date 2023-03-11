# CS Department TA Management System - Sprint 1

Project Overview: This is a system for Students to look and apply for TA positions, as well as for Faculty to post and receive applications. Currently, the system is in its infancy and its functionality is limited to registering a user, logging in, completing profile, filling out and submitting a general TA application, and all the components on the dashboard.

System Requirements: Java 1.8, Docker, MySQL, Scala, Play Framework

Installation Instructions: Your database should have a 'CS4345' schema and have a username/password combination of root/123456 (if not you can change this in the backend to use another combination)

Usage Instructions: Provide instructions for using the system, including how to log in, how to add/edit/delete TAs, how to assign TAs to courses, and any other relevant functionality. Include screenshots and/or video demonstrations if possible.

License: No licensing information

# Database setup: password - "toor" not "123456"
Example SQL Insert Statements for database:

Position:
INSERT INTO `CS4345`.`position` (`position_id`, `course_title`, `faculty`, `pay`, `hours`) VALUES ('4', 'CS5555', 'Prof. Pete', '15', '20');

User:
INSERT INTO `CS4345`.`user` (`id`, `username`, `password`, `firstname`, `lastname`, `research_area`, `title`, `position`, `affiliation`, `email`, `phone`, `fax`, `address`, `city`, `country`, `zipcode`, `comments`, `status`, `degree_plan`, `starting_semester`, `expected_graduation`, `answer_one`, `answer_two`) VALUES ('3', 'johnyapple', 'unicorns', 'Johnny', 'Appleseed', 'Cyber Security', 'Sir', 'Student', 'Southern Methodist University', 'johnny@apples.com', '1234567890', '0987654321', '123 Trip Lane', 'Dallas', 'United States', '75205', 'All bad things.', 'Student', 'BS-CS', 'Fall, 2021', 'Spring, 2025', 'Buttermilk Road', 'Tabasco');

Application:
INSERT INTO `CS4345`.`application` (`application_id`, `user_id`, `pref_one`, `pref_two`, `pref_three`) VALUES ('2', '3', '3', '1', '2');

# Contribution:
* Diego: TA Application/ Fetching position

* Eric: Dashboard view/ Profile

* Scott: Login/ Register/ Diagram/ Requirements

