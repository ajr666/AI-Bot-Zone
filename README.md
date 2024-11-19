# AI Battle Platform
This project implements a Battle platform, supporting multiple players to match and compete on the web. The game is about, 2 snake bots on a board, they move 1 step each time. Either can they run into obstacles nor other snake’s body. The first snake fails to do so will lose. And the player, or the AI code written by the player, will manipulate the snake. 

## Features

- **AI Code Upload and Competition**: Users can upload their AI bots written in Java, Python, or C++ to compete in the Gluttonous Snake game, fostering a dynamic and engaging user experience.

- **Scalable Backend System**: The backend infrastructure is designed for scalability, consisting of:
  - A user-matching microservice to pair users with opponents of similar skill levels.
  - A bot code execution microservice for running AI scripts.
  - Real-time game session communication facilitated through WebSocket, ensuring lively and interactive gameplay.

- **Dynamic AI Script Execution**: Utilizing JOOR for on-the-fly compilation and execution of AI scripts, enhancing the platform's flexibility and user engagement.

- **Expanded Language Support with Docker**: Language support for AI code is expanded using Docker, enabling a broader range of AI scripts to be run and tested.

- **Efficient AI Execution**: The system's efficiency is significantly improved with multithreading and message queue-based microservices, streamlining AI execution and providing a smoother user experience.

- **Comprehensive Game Replays**: To aid in bot development and debugging, comprehensive game replays are provided, giving users valuable insights into their bots' performance and decision-making processes.

## highlight
A highlight of the platform is that players can either chose to play by themselves, or write their own bot code to implement the game API to compete the match.

The main challenge of the project is the complex communication process required for matching, creating game boards in the cloud, and managing battles. To address this, the backend system implements three microservices: WebSocket Server, Matching System, and Bot Code Execution System. They will use http or websocket to communicate.

1. Players initiate a matching request via the front-end interface.
2. The WebSocket Server receives the player’s request and forwards their information to the Matching System.
3. The Matchmaking System will runs a matching pool threa* that maintains a linked list of players awaiting matches. The system continuously scans the list, identifies two players with similar ratings, and successfully matches them. The matched player information is then sent back to the WebSocket Server.
4. Upon receiving the matched player information, the WebSocket Server starts a game thread to initiate a new game. The thread first generates a random, symmetric, and connected game map, which is sent to both players' front-end interfaces. The thread then enters a loop, waiting for input from the two players and determining the game's outcome.
5. If a player chooses to use their custom bot for the battle, the game thread sends the player’s bot code and the current game state to the Bot Execution System. The Bot Execution System maintains a message queue to store pending bot codes. Consumer threads within this system continuously retrieve and compile the bot codes, execute them, and return the results (the next move) to the game thread running on the WebSocket Server.
6. Once the game is underway, the game thread determines the winner and records the battle results in a SQL database, updating the players' ratings accordingly. 


## Prerequisites

- Java 17 or later
- Docker
- Any suitable IDE for SpringBoot development (e.g., IntelliJ IDEA, Eclipse)
