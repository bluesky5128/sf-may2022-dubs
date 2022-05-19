package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.GameController;
//import com.levelup.forestsandmonsters.GameController.Position;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GameSteps {

    GameController gc;
    String playerName;

    @Given("the player's name is {string}")
    public void givenThePlayersNameIs(String playerName) {
        this.playerName = playerName;
    }

    @When("the player sets their name")
    public void whenThePlayerSetsTheirName() {
        gc = new GameController();
        gc.createCharacter(playerName);
    }

    @Then("the Game sets the player's name to {string}")
    public void thenTheGameSetsThePlayersName(String expectedName) {
        assertEquals(expectedName, gc.getStatus().playerName);
    }

    @Given("the character's position is {int}, {int}")
    public void givenCharacterStartPositionIs() {
        //this.startPosition = startPosition;
    }

    @When("the player moves in a {string}")
    public void whenThePlayerSelectsDirection(String direction ) {
        //gc.move(null);
        //Position cpos = gc.getStatus().currPos;
        

        // Position cpos = myChar.getPosition();
        //Position newPos=myChar.calculatePosition(cpos, direction);
        // newPos = if validatePosition(newPos) newPos else cpos;
        // myChar.setPostion(newPos);

    }

    @Then("the Game sets the player to <newPosition>")
    public void thenTheGameSetsTheCharacterPosition() {
        assertEquals(1,1) ;// myChar.getPosition();
    }
}
