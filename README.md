# Basic project for Hunt The Wumpus in Java

Basic Hunt The Wumpus started using Eclipse 2018

## Videogame Basics

The obvious story is that users see a graphical screen and interact with the screen using a mouse and keyboard to affect the game. Every mouse click or keyboard press gets converted to a user event.

Breaking this down:

1. Graphical UI sends User Events to the Game Logic
2. Graphical UI redraws screen after Game Logic handles game event
3. Game Logic takes in User Events and after deciding what to do with this event, must describe to Graphical UI exactly what to draw.

### What are User Events?

In Hunt the Wumpus, User Events include things like:

* Moving to a new room
* Shooting and arrow
* Choosing a Map
* Answering a Trivia question
* and much, much more.

The Graphical UI will convert mouse clicks, button presses, keyboard presses and other basic events into User Events that the Game Logic needs to play the game.

### So what is Game Logic?

Game Logic is the part of the code which encapsulates the rules of the game. 

In the project described by the contest documents, there are different sections of game logic, High Score, Trivia, Cave, Game Locations, Player and Game Controller. 

* Game Controller is the one object which talks to the Graphical UI. That means it receives User Events and eventually describes what the Graphical UI should draw.
* Game Controller communicates with all the other parts of Game Logic that make sense for each User Event. For example, moving to a new room will probably send that event to Player and Game Locations, but probably NOT send an event to High Score or Trivia.

### Describing What Graphical UI should draw

Everything that the UI needs to draw should be updated after every User Event is handled. Here are examples of things that need to be described to the UI:

* Describe which room the player is in
* Describe what the room looks like
* Any messages for the hazards or near the Wumpus
* Current Trivia sessions
* Listing of Maps available to choose
* And much, much more

### What Does Graphical UI Get to do Then?

Graphical UI get to choose HOW to display everything and how the user interacts with the game. 

* All Graphics, mouse click handling, and visual ideas are chosen by Graphical UI
* How to display Trivia questions, current scores, messages are all decided by Graphical UI

## Versions

So far, this is only tested on Eclipse 2018/12 and Java SDK 11.0.2

## Testing using JUnit

This is setup to run JUnit version 5 or JUnit Jupiter. [Click here to see documentation for JUnit Jupiter](https://junit.org/junit5/docs/current/user-guide/).

### To modify this file in Eclipse

* Clicking on the tab connected to this pane labeled Markdown Source lets you edit this document
* Clicking on the tab labeled Preview lets you see whether you've changed it correctly
* The preview in Eclipse is not very accurate

Markdown is a way to write rich text documents using simple text. 
[Click here to learn how to write Markdown](https://guides.github.com/features/mastering-markdown/)