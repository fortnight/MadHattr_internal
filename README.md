# MadHattr_internal
For the internal use of the MadHattr team, will be used to test out implementations of the codebase to be generated later.  
This being the main branch of the code the code is already generated. To generate code, use the "ungenerated" branch.

## Code Generation
As is specified in the pom.xml file, code is generated from a yaml api contract in the following the path location: `${project.basedir}/src/main/resources/api.yaml`  
Download the api contract yaml from our [apicurio project](https://studio.apicur.io/apis/36563) and place the downloaded file in the above path location with the proper name.  
To generate, run the command `$ mvn clean compile`  
Code should be generated in the `target/generated-sources/openapi/src/` directory.  
