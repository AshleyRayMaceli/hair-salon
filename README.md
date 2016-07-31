![Home Page] (screenshot_1.png)

![List of clients] (screenshot_2.png)

# _Hair Salon_

#### _A web app where the user can add stylists and their clients to a database with SQL_

#### By _**Ashley Maceli**_

## Description

_A web app designed with Java that makes use of objects within objects and storing them into a database. Spark/Velocity is used for the framework. Designed as a princess themed hair salon. The user can add stylists and clients for each stylist (Some stylists and clients pre-seeded in the database). BDD testing was possible with the use of Gradle and JUnit. Integration testing was possible with the use of FluentLenium. Databases stored with SQL._

##Database Tables

![Database](sqldesign.png)

## Setup/Installation Requirements

* _SETTING UP THE DATABASE AND TEST DATABASE_
* _Clone repository to desktop_
* _Use console to enter directory with all files_
* _In a new console window run the command 'postgres' and keep running_
* _In bash console run the command 'psql hair_salon_am < hair_salon_am.sql'_
* _In a new console window run the command 'psql' then 'CREATE DATABASE hair_salon_am;'_
* _For test database run the command '\c hair_salon_am' to connect to the database_
* _To create the test database run the command 'CREATE DATABASE hair_salon_am_test WITH TEMPLATE hair_salon_am;'_
* _RUNNING THE WEB APP_
* _In console run the command 'gradle run'_
* _Go to http://localhost:4567/_

## Known Bugs

_No known bugs at this time_

## Support and contact details

_For all issues and support, please contact:
Ashley Maceli at ashley.maceli@gmail.com_

## Technologies Used

_Java, SQL, Spark, Velocity, HTML, CSS, Gradle, JUnit, FluentLenium_

### License

The MIT License (MIT)

Copyright (c) 2016 Ashley Maceli

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
