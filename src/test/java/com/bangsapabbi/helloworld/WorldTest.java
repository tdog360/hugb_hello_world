package com.bangsapabbi.helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Test;

public class WorldTest {

    @Test
    public void greetResultsInHello() {
        World world = new World();
      //  assertEquals("Hello world!", world.greet()); 
	assertThat(world.greet(), containsString("Chuck Norris"));
    }

}
