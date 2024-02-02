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

## Getting Started

### Prerequisites

- Java 11 or later
- Docker
- Any suitable IDE for SpringBoot development (e.g., IntelliJ IDEA, Eclipse)

### Setup

1. **Clone the repository**:
   ```
   git clone https://github.com/yourrepository/ai-battle-platform-backend.git
   ```

2. **Navigate to the project directory**:
   ```
   cd ai-battle-platform-backend
   ```

3. **Build the project** (Make sure Docker is running):
   ```
   ./mvnw clean install
   ```

4. **Run the application**:
   ```
   ./mvnw spring-boot:run
   ```

The application should now be up and running, ready to accept AI bot uploads and commence battles.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Acknowledgments

- Thanks to all contributors who have helped to build this engaging AI battle platform.
- Special thanks to the SpringBoot and Docker communities for their excellent tools and documentation.

For more information on how to use the platform or contribute to its development, please refer to the documentation or contact us directly. Let's push the boundaries of AI competitions together!
