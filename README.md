# Example projects for SOAP-based web services

These simple projects show the minimal set of capabilities.

## Running the SOAP projects
To run the SOAP projects, proceed as follows.
1. Clone this repository to a temporary folder.
1. Import the projects as described in the [Java EE tutorial](https://wwu-pi.github.io/tutorials/lectures/acse/018_tutorial_sample_app.html#import).
1. Once you published the SoapService projects onto your application server and started the server, your adder service is accessible under <a href="http://localhost:8080/SoapService/SoapAdderServiceBean">http://localhost:8080/SoapService/SoapAdderServiceBean</a> (replace `localhost` with your Docker-IP, when using Docker Toolbox). It will, however, only accept SOAP messages and has no web user interface.
1. The SoapClient is a plain Java project that contains the generated proxy classes and a main method in class `Adder`. Run this class from Eclipse to get a result.

## Creating Web services using wsimport
This procedure uses standardized JAX-WS technology (part of Java EE). It does, however, require some manual work.

1. Ensure the PATH environment variable includes the "bin" folder from the JDK installation.
1. From the command line, execute ``wsimport -keep <URL of WSDL>``. This will generate Java source and class files.
1. Import the generated source files into your Eclipse project that should serve as client system: *File* > *Import* > *General* > *File System*
1. Depending on the Web service, several message and data classes will be generated. Furthermore, there will be a service class which inherits from *javax.xml.ws.Service*. Instantiate this class or, in a managed environment, use dependency injection with the annotation ``@WebServiceRef`` (see lecture). The service instance will offer a method that returns a proxy providing the Web service operation(s).
