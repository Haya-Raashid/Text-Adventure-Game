# Murder Mystery: Text Adventure Game

## Overview

A Java-based console text adventure game where the player explores a mysterious world, solves riddles, investigates clues, and gradually uncovers the truth behind a murder.

The game combines multiple locations, randomized events, health management, inventory items, and nested control structures to create an interactive branching gameplay experience.

## Technologies Used

- Java
- Java Scanner
- Math.random()
- Exception Handling
- Console-based Interface
  
## Gameplay

The player takes the role of **Sam Charles**, who awakens with no memory of how they arrived at the scene of a murder.

To uncover the truth, the player must:

- Explore different locations
- Investigate clues related to the murder
- Manage their health while solving challenges
- Collect important items
- Experience randomized events within locations
- 
## Features

- Interactive console-based gameplay
- Multiple locations to explore
- Riddles and puzzles integrated into the storyline
- Health system that changes based on player decisions
- Randomized events using `Math.random()`
- Inventory system for important items
- Branching gameplay scenarios
- Multiple nested loops and switch statements
- Input validation through conditional logic

## Game Locations

| Location | Description |
|---|---|
| The Blood Garden | The initial crime scene where the player discovers clues about the murder |
| The Chrono Lab | A mysterious laboratory containing evidence and unexpected encounters |
| The Chapel of Echoes | A dark location filled with strange clues and revelations |
| The Portal of Answers | The final area where the truth behind the mystery is revealed |

## Game State

The game maintains several variables to track the player's progress:

| Variable | Purpose |
|---|---|
| `health` | Tracks the player's remaining health |
| `hasKey` | Determines whether the player has obtained the key |
| `hasLighter` | Determines whether the player has obtained the lighter |
| `place` | Tracks the player's selected location |

The collected items determine whether the player can access the final area and progress toward the conclusion of the story.

## Programming Concepts

This project demonstrates the use of:

- `while` loops
- `do-while` loops
- Nested loops
- Nested `switch` statements
- `if-else` statements
- Boolean variables for game state
- Character and string input
- Random number generation
- Methods
- Exception handling
- `try-catch` blocks
- `Thread.sleep()` for timed delays

## Randomized Events

Several locations contain randomized scenarios. Each visit can trigger one of multiple possible events, such as discovering a clue, encountering a creature, or finding an item.

This is implemented using Java's random number generation:
`int choice = (int) (Math.random() * 2);`

## Nested Control Flow

One of the main programming challenges in this project was managing multiple levels of control flow.
The game uses:

- A main game loop
- Nested do-while and while loops
- Location-based switch statements
- Additional nested switch statements for randomized events
- Loops for repeatedly attempting riddles
- Conditional logic for inventory and game progression
