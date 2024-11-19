# AI Battle Platform

Welcome to the AI Battle Platform Backend project! This repository houses the backend infrastructure for an innovative AI battle platform, where users can engage by uploading and competing with AI code in the classic Gluttonous Snake game. Developed with SpringBoot, this project aims to provide a seamless, interactive experience for AI enthusiasts and developers.

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


### Prerequisites

- Java 17 or later
- Docker
- Any suitable IDE for SpringBoot development (e.g., IntelliJ IDEA, Eclipse)
