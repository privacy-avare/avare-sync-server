# avare-sync-server
An easy to use server to synchronize profiles

# Requirements 

1.	You need ubuntu version 18.04 and Docker version 18.09.6   
(might run with other versions, we tested only with these and a 8 GB RAM server)
2.	Upload the docker-compose-file to a new directory e.g. ~/avare
3.	In the directory, run sudo docker-compose up

#	Starting the server

The final configuration is done with swagger. 
Visit http://*server_IP_address*:*server_port*/swagger-ui.html

The default login values are:

User name: admin

Password: password

This needs to be changed as soon as possible under: src/main/resources/application.properties

On swagger a ‘‘profiles‘‘ data base has to be generated. Just follow these four last steps and the server is ready and running.




 
  
 
 
  
  
 





