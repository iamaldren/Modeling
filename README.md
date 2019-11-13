# Modeling

## Getting Started

### Prerequisite/s
- Java 8
- Maven

### Running the Program

1. Clone the project repository from Github.
2. Open a command prompt, and navigate to the project repository.
3. Execute the command below to build the project.
    ```shell script
    mvn package
    ```
4. Execute the command below to run the application.
    ```shell script
    java -jar target/Modeling-1.0.0.jar
    ```
   
## Application

### Executing animal methods

The main class, `ModelingApp.java`, contains the method executions for each animals.

Once the application boots up, it will execute the commands and prints the output on the console.

Alternatively, one can run the JUnit to test each animal functions.

### Language API

An API is also provided to display the sound of the Rooster in different languages.
```
GET /api/rooster/sounds?language=tagalog
```

The `language` parameter determines which sound to return back to the caller. The language are predefined, in case the language passed does not exists from the list, it will return an `HTTP Status 400` response.

`Curl Command`:
```shell script
curl http://localhost:8080/api/rooster/sounds?language=tagalog
```

### Project Structure

#### Overall structure
```
app
|-- src
|---- main
|------ java
|-------- com.aldren.modeling       #Base package
|---------- ModelingApp.java        #Main class
|---------- animalia                #Package for animal modeling
|---------- controller              #Package for API Controller class
|---------- exception               #Exception Classes
|---------- handler                 #Handler for Controller errors
|---------- model                   #Data model for API Response
|---------- service                 #Service classes
|------ resources
|-------- application.yml
|---- test
|-- .gitignore
|-- pom.xml
|-- README.md
```

#### Animal Structure
```
animal
|-- Animal.java                         #Super parent class
|-- domain
|----- AerialAnimal.java                #Interface class for all animals that can fly
|----- LandAnimal.java                  #Interface class for all animals that can walk
|----- MusicalAnimal.java               #Interface class for all animals that can sing
|----- OceanicAnimal.java               #Interface class for all animals that can swim
|-- subclass
|----- amphibian
|--------- Amphibian.java               #Base class for all Amphibians
|--------- type
|------------- Frog.java                #Frog implementation for an Amphibian class
|----- bird
|--------- Bird.java                    #Base class for all Birds
|--------- species
|------------- OrphanRooster.java       #Orphan class
|------------- Rooster.java             #Extended class for Chicken Implementation
|--------- type
|------------- Chicken.java             #Chicken Implementation for a Bird class
|------------- Duck.java                #Duck Implementation for a Bird class
|------------- Parrot.java              #Parrot Implementation for a Bird class
|------------- SongBird.java            #SongBird Implementation for a Bird Class
|----- fish
|--------- Fish.java                    #Base class for all Fishes
|--------- type
|------------- ClownFish.java           #ClownFish Implementation for Fish class
|------------- GenericFish.java         #GenericFish Implementation for Fish class
|------------- Shark.java               #Shark Implementation for Fish class
|----- insect
|--------- Insect.java                  #Base class for all Insects
|--------- type
|------------- Butterfly.java           #Butterfly Implementation for an Insect Class
|------------- Caterpillar.java         #Caterpillar Implementation for an Insect Class
|----- mammal
|--------- LandMammal.java              #Base class for all Land Mammals
|--------- OceanicMammal.java           #Base class for all Oceanic Mammals
|--------- type
|------------- Cat.java                 #Cat Implementation for a Land Mammal
|------------- Dog.java                 #Dog Implementation for a Land Mammal
|------------- Dolphin.java             #Dolphin Implementation for an Oceanic Mammal
```

## Tests

To run both unit and integration tests, execute the command below:
```shell script
mvn test
```

### Unit Tests

Unit tests are in the folder structure below:
```shell script
app
|---- test
|------- com.aldren.modeling
|---------- animalia.subclass
|---------------- amphibian.type
|------------------- FrogTest.java
|------------- bird
|---------------- species
|------------------- OrphanRoosterTest.java
|------------------- RoosterTest.java
|---------------- type
|------------------- ChickenTest.java
|------------------- DuckTest.java
|------------------- ParrotTest.java
|------------------- SongBirdTest.java
|---------------- fish.type
|------------------- ClownFishTest.java
|------------------- GenericFishTest.java
|------------------- SharkTest.java
|---------------- insect.type
|------------------- ButterflyTest.java
|------------------- CaterpillarTest.java
|---------------- mammal.type
|------------------- CatTest.java
|------------------- DogTest.java
|------------------- DolphinTest.java
|---------- service
|------------- RoosterLanguageServiceTest       #Unit test for API service class
|------------- CounterServiceTest               #Test script for Counting the no of animals that can walk, fly, swim, and sing
```

### Integration Tests

Integration tests are in the folder structure below:
```shell script
app
|---- test
|------- com.aldren.modeling
|---------- ModelingAppTest         #Integration Test classs with RESTful calls
```