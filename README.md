dbs-example-jpa-simple
-------------------
Example of simple Spring Data JPA application.  Hibernate is used as JPA implementation.

Documentation
-------------------
 * [wiki][wiki]

References
-------------------
 * [public site for dbs-example-jpa-simple][public-site]
 * [JPA annotation documentation][My-JPA-annotation-documentation]
 * [Using Spring Java/Annotation Config instead of XML][Spring-Config-XML-to-Java]
 * [GitHub configuration and settings cheat sheet][GitHub-cheat-sheet]
 * [Spring Framework Developer Community YouTube videos][SpringSourceDev-YouTube]
 * [JPA One-to-Many][JPA-One-to-Many]

Build & Deployment
-------------------
### To get the code
Clone the repository:

    $ git clone git:/github.com/Daugherty/dbs-example-jpa-simple

If this is your first time using Github, review http://help.github.com to learn the basics.

### To run the application unit-tests
From the command line with Maven:

    $ cd dbs-example-jpa-simple
    $ mvn test

### To install the application
From the command line with Maven:

    $ cd dbs-example-jpa-simple
    $ mvn install

**or**

*In your preferred IDE such as SpringSource Tool Suite (STS)*

* Import "dbs-example-jpa-simple" as a Maven Project
* Drag-n-drop the project onto the "SpringSource tc Server Developer Edition" or another Servlet 2.5 or > Server to run, such as Tomcat.

Access the deployed web application at: http://localhost:8080/dbs-example-jpa-simple/

[My-JPA-annotation-documentation]: http://www.evernote.com/shard/s8/sh/147ea1ec-d9d2-46fd-a0d9-3d2b819703fb/8e476ca6950c7d6c9551dbcc54d8c7f3
[Overview-ERD]: https://github.com/johntday/dbs-example-jpa-simple/blob/master/src/main/resources/img/erd.png
[MySQL-ERD]: https://github.com/johntday/dbs-example-jpa-simple/blob/master/src/main/resources/img/erd-detail.png
[public-site]:  http://johntday.github.io/dbs-example-jpa-simple
[wiki]:  https://github.com/johntday/dbs-example-jpa-simple/wiki
[CloudBees]:  http://www.cloudbees.com/
[CloudBees-deployed-url]:  http://dbs-example-jpa-simple2.johntday.cloudbees.net/
[Spring-Config-XML-to-Java]:  http://www.evernote.com/shard/s8/sh/4748cf18-2c5b-4d48-b415-925182c6f15f/0a2883985b1682367bb09612c002fa8c
[GitHub-cheat-sheet]:  http://johntday.github.io/GitHub/
[My-CloudFoundry-dbs-development]:  https://console.run.pivotal.io/organizations/e743a212-1895-4cc1-91b2-cd959c806fdf/spaces/da84f92c-5b79-41b9-84d5-d9fe48515f71
[SpringSourceDev-YouTube]:  http://www.youtube.com/SpringSourceDev
[JPA-One-to-Many]:  http://www.evernote.com/shard/s8/sh/1d1e797a-ffce-4dbb-a4dd-53470adbf1ce/d3a2e3f1876dfed9dac6a90bf4b7804e
[database-diagrams]:  https://github.com/johntday/dbs-example-jpa-simple/tree/master/src/main/webapp/static/img