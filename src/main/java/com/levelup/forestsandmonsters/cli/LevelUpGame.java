package com.levelup.forestsandmonsters.cli;

import java.util.ArrayList;
import java.util.List;

import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.GameController.GameStatus;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.standard.commands.Quit;

import ch.qos.logback.core.joran.conditional.ElseAction;

@ShellComponent
public class LevelUpGame implements Quit.Command {

  private final GameController gameController;
  private List<GameStatus> gameHistory;
  private boolean isGameStarted = false;
  public int AllSteps=0;
  
  public LevelUpGame() {
    super();
    this.gameController = new GameController();
    this.gameHistory = new ArrayList<GameStatus>();
  }

  @ShellMethodAvailability("notStartedCheck")
  @ShellMethod(value = "Create a character (characterName)", key = { "create-character", "create" })
  public void createCharacter(@ShellOption(defaultValue = "Player") String characterName) {
    gameController.createCharacter(characterName);
    GameStatus status = gameController.getStatus();

    System.out.println("Your character, " + status.playerName + " is created!");
  }

  @ShellMethodAvailability("notStartedCheck")
  @ShellMethod("Start the game")
  public void startGame() {
    isGameStarted = true;
    gameController.startGame();
    // TODO: Update this prompt. Also, do you want to get the game status and tell
    // the player where their character is?
    System.out.println("Welcome to DubsLife! You have entered a mysterious place.");
    System.out.println("Would you like to go North(N), South(S), East(E), West(W) or Exit(X)?");
  }

  @ShellMethod(value = "Move North", key = { "N", "n" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveNorth() {
    // System.out.println("You are at: " +gameController.getStatus().currPos.getRow() +" , " +
    // gameController.getStatus().currPos.getCol());
    // gameController.move(GameController.DIRECTION.NORTH);
    // System.out.println("You are at: " +gameController.getStatus().currPos.getRow() +" , " +
    // gameController.getStatus().currPos.getCol());
    gameController.move(GameController.DIRECTION.NORTH);
    updateStatus(gameController.getStatus());
    // System.out.println(gameController.getStatus().currPos.getRow());
    // updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "Move South", key = { "S", "s" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveSouth() {
    gameController.move(GameController.DIRECTION.SOUTH);
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "Move East", key = { "E", "e" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveEast() {
    gameController.move(GameController.DIRECTION.EAST);
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "Move West", key = { "W", "w" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveWest() {
    gameController.move(GameController.DIRECTION.WEST);
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "End the game", key = { "X", "x" })
  public void endGame() {
    System.out.println("You exit the mysterious world.");
    if(gameController.intSteps==0)
    {
      System.out.println("Thank you for playing <" + gameController.CharName + ">");
      System.out.println ("Starting Position: 1,1");
      System.out.println("   Ending Position: 1,1");
      System.out.println("   Number of Moves: 0");
    }
    else 
      printSummary();
    System.exit(0);
  }

  private void printSummary() {
    System.out.println("Exiting the mysterious land!");
    System.out.println("Thank you for playing, " + gameController.CharName );
     for (GameStatus status : gameHistory) {
       // TODO: Override toString on game status to print pretty
       System.out.println ("Starting Position: 1,1");
       System.out.println("   Ending Position: " + gameController.lastPos.getRow() + "," + gameController.lastPos.getCol() );
       System.out.println("   Number of Moves: " + gameController.intSteps);
       System.out.println(status);
       break;
     }
    // TODO: Print anything else you committed to in your mockup
  }

  private void updateStatus(GameStatus status) {
    this.gameHistory.add(status);
  }

  public Availability startedCheck() {
    return isGameStarted
        ? Availability.available()
        : Availability.unavailable("game not started");
  }

  public Availability notStartedCheck() {
    return !isGameStarted
        ? Availability.available()
        : Availability.unavailable("game already started");
  }

}
