package PetStore;

import io.restassured.RestAssured;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.*;


import static io.restassured.RestAssured.get;

public class Check {

    @Test
    public void PetStore(){

   RestAssured.baseURI  = "https://petstore.swagger.io/v2/pet";
   RestAssured.basePath = "/api";

   get("/pet").prettyPeek();

    }
}