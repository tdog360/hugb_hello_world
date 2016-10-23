package com.bangsapabbi.helloworld;

import net.joningi.icndb.ICNDBClient; //Init
import net.joningi.icndb.Joke; //Get single joke by ID


public class World {

    //private String greeting = "Hello world!"; 
    final ICNDBClient client = new ICNDBClient();

    public String greet() {
        //return greeting;
	Joke randJoke = client.getRandom();
	return randJoke.getJoke();
    }
}
