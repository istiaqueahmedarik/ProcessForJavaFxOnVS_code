PreReq:
1. download and install "jdk-20" or before
2. update JAVA_HOME with the address of jdk-20 in path variable like this "C://Program Files//Java//jdk-20"



# ProcessForJavaFxOnVS_code

1. Install  JAVA FX sdk, mavin
Java FX - https://gluonhq.com/products/javafx/
Maven - https://maven.apache.org/download.cgi

2. Update Path variable of mvn from maven docs.

3. update settings.json in your computer if set before with correct javafx address and jdk address. If not set it in this way:
   ***json
    "javafx.libPath": "F:/openjfx-21.0.1_windows-x64_bin-sdk/javafx-sdk-21.0.1/lib",
  "java.configuration.runtimes": [
    {
      "name": "JavaSE-20",
      "path": "C://Program Files//Java//jdk-20",
      "default": true
    }
  ],
***


4. Install essential java and maven java fx extension in vs code(Maven for Java, Extension Pack for Java, Project Manager for Java) 

5. Install scene builder from https://gluonhq.com/products/scene-builder/

6. Press ctrl + shift + p then type "Java: create java project" 

7. Click on that and click JavaFX created from archetype

8. Fill necessary info

9. Copy the pom.xml file from this repo and update some name inside the file (instruction is given inside the file).

10. make java and resource on main folder in same structure for direct import of fxml

11. ENJOY!!Run with (mvn clean javafx:run) or from Maven section on explorer tab
