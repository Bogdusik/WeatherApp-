# WeatherApp

WeatherApp is an intuitive platform designed to provide real-time weather data. It allows users to search for any location and instantly view its current weather, including temperature, humidity, windspeed, and weather condition. With the use of dynamic visuals, the app makes weather data easy to understand, enhancing your everyday planning.

## Features

- **Location Search**: Users can search for any location by name (e.g., Tokyo, New York).
- **Real-time Weather Data**: Displays temperature, humidity, wind speed, and weather condition based on the current time.
- **Dynamic Weather Visuals**: Visuals that change based on the weather condition (Clear, Cloudy, Rain, Snow).
- **User-friendly GUI**: Simple and clear interface built using Java Swing.

## Technologies Used

- **Java**: Core programming language.
- **Swing**: GUI framework for building the user interface.
- **Open-Meteo API**: API for fetching real-time weather data.
- **JSON Simple**: For parsing and handling JSON data from APIs.

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/WeatherApp.git
   cd WeatherApp
   ```

2. **Install dependencies** (If needed, add any dependencies in a specific section here).

3. **Run the application**:
   - Compile the Java files:
     ```bash
     javac *.java
     ```
   - Run the application:
     ```bash
     java AppLauncher
     ```

## Usage

1. Open the application.
2. Enter a location name (e.g., "London") in the search bar.
3. Click the search button to fetch and display real-time weather data for that location.
4. The app will show the temperature, weather condition, humidity, and wind speed.
5. Weather images will dynamically change based on the current weather condition.

## Code Overview

### `AppLauncher.java`

- **Purpose**: Entry point of the application. It launches the `WeatherAppGui` interface.

### `WeatherApp.java`

- **Purpose**: Handles the backend logic of fetching weather data from the Open-Meteo API using the location name.
- **Methods**:
  - `getWeatherData(String locationName)`: Fetches weather data based on location coordinates.
  - `getLocationData(String locationName)`: Fetches location coordinates from the geolocation API.
  - `fetchApiResponse(String urlString)`: Makes an HTTP GET request to fetch data from the API.

### `WeatherAppGui.java`

- **Purpose**: Manages the graphical user interface (GUI) for displaying weather information.
- **Components**:
  - **Search Bar**: For entering location names.
  - **Weather Condition Image**: Dynamically updates based on weather condition.
  - **Temperature**: Displays current temperature in Celsius.
  - **Humidity & Windspeed**: Displays current humidity and windspeed data.
  - **Search Button**: Triggers the weather data retrieval when clicked.

## Screenshots

![WeatherApp Screenshot](assets/screenshot.png)

## Future Enhancements

- **Error Handling**: Improved error messages and better handling for invalid input.
- **Geolocation**: Automatically detect user location for weather data.
- **Additional Data**: Display extended weather forecast (e.g., 7-day forecast).
  
## License

Distributed under the MIT License. See `LICENSE` for more information.
