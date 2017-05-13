==- 170510
After some research discovered that in memory DBs are supported only with "Ultimate" IntelliJ.
Since original requirements did not talk about permanent persistence to a disc will use ArrayList.
Therefore synchronization and high performance isn not provided.

==- 170512

DISCLAIMER
This app is written for demo purpose only. Items are persisted in memory.
Synchronization, concurrency, referential constraints are not provided.


=- Test in JVM:
-1- Go to https://github.com/voleynik/pms/
-2- Download pms-0.0.1-SNAPSHOT.jar
-3- Start pms app > java -jar /path-to-file/pms-0.0.1-SNAPSHOT.jar
-4- Use Postman to run test cases.

=- Postman:
-1- Go to https://github.com/voleynik/pms/
-2- Download file: https://github.com/voleynik/pms/tree/master/src/test/PMS.postman_collection.json
-3- Download file: https://github.com/voleynik/pms/tree/master/src/test/PMS.postman_environment.json
-4- Install Postman: https://www.getpostman.com/docs/install_native
-5- Start Postman and import PMS.postman_environment.json and PMS.postman_collection.json
-6- Adjust URL variable in PMS through “Manage Environments” clicking on gear icon in right-top corner.
	(can be localhost when running in JVM).
-7- Add two headers: Content-Type=application/json and Accept=application/json
-6- Run manually all 25 test cases. First 6 should be run only once.


=- Test in Docker
-1- docker pull voleynik/pms

-2- docker images
	voleynik/pms              latest              72c3b2ef98ce        About an hour ago   659 MB

-3- docker run -p 8080:8080 -t voleynik/pms
	com.pms.PmsApplication                   : Started PmsApplication in 5.15 seconds (JVM running for 5.804)

-4- docker ps # in new terminal
CONTAINER ID        IMAGE               COMMAND                  CREATED              STATUS              PORTS                    NAMES
12a20c09703a        voleynik/pms        "java -jar pms-0.0..."   About a minute ago   Up About a minute   0.0.0.0:8080->8080/tcp   friendly_shaw

-5- It looks like a macintosh host running docker exposes 8080 port. Use "ifconfig" to get host's IP.
>ifconfig
en1: flags=8863<UP,BROADCAST,SMART,RUNNING,SIMPLEX,MULTICAST> mtu 1500
	inet 172.26.0.150 netmask 0xffffff00 broadcast 172.26.0.255

-6- Adjust "URL" environment variables in Postman:
URL     172.26.0.150
PORT    8080

-7- Use Postman to run test cases.

NOTE: For testing PMS running as a docker container on Windows or Linux may need different network
arrangement.