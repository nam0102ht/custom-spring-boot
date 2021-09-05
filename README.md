##CUSTOM SPRING BOOT
###Start app in backgound process java
`javaw -Xmx200m -jar build\libs\meow-0.0.1.jar`

###Stop app backgound process java
`taskkill /f /im javaw.exe`

###Register Schema
Make sure you have jq tool installed. Type jq --help to test.
Prepare the avro schema (for key/value) in a file.
Use the following command to register the above schema (for key/value) to your topic.
Register Value schema to a topic

`jq '. | {schema: tojson}' ./<YOUR_SCHEMA_FILE.avsc> | \
curl -X POST \
http://localhost:8081/subjects/<YOUR_TOPIC_NAME>-value/versions \
-H 'Content-Type: application/vnd.schemaregistry.v1+json' \
-d @-`

### Run kafka UI management
`docker run -it -p 9000:9000 \
-e KAFKA_BROKERCONNECT=<host:port,host:port> \
obsidiandynamics/kafdrop`