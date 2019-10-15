# REST Assured workshop
Introductory workshop for getting acquainted with [REST Assured](http://rest-assured.io/) basic concepts (and some advanced).


## What do I need?
- Java JDK 12 (latest, minimum version 11):
    https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html
    
- Intellij IDEA Community Eddition:
    https://www.jetbrains.com/idea/download/#section=windows
    
- Git (default options):
    https://git-scm.com/downloads
    
- NodeJS:
    https://nodejs.org/en/download/

- Json Server:
    `npm install -g json-server`

## Importing the project
1. Clone the project
`git clone https://github.com/andreidrc/rest-assured-workshop.git`
2. Import the project  
From Intellij IDEA, select `Open`, browse to the project directory and select the `build.gradle` file.  
Hit `OK` and then select `Open as Project`.  
You should see Intellij opening the project, downloading the gradle distribution and all the required dependencies.
3. Build the project (from menu Build -> Build Project or `Ctrl+F9`) and check that project builds successfully.

## Running the mock server
The mock server will be used to respond to the API calls performed in the exercises.  
From the project directory, run the following command in cmd `json-server db.json`
