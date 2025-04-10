# The-Movie-App

**The-Movie-App** is a fully functional Android application built with **Kotlin** that allows users to browse and explore movies using data fetched from the **TMDB API**. It features smooth paging with **ViewPager1**, local caching with **Room**, and efficient dependency injection using **Hilt (Dagger)**.

## Features

- **Explore Popular, Top Rated, and Upcoming Movies**
- **Detailed Movie Information**
  - Title, Overview, Rating, Poster, etc.
- **Pagination with ViewPager1**
- **Room Database for Caching**
  - Store and retrieve favorite movies locally
- **Retrofit Integration**
  - Fetch data from TMDB's free API
- **Dependency Injection**
  - Powered by Hilt and Dagger for better architecture
- **Material Design UI**
  - Smooth and responsive interface

## Tech Stack

- **Kotlin** — Main programming language  
- **Retrofit** — For network calls to TMDB  
- **Room** — Local database caching  
- **ViewPager1** — For movie category pagination  
- **Hilt (Dagger)** — Dependency injection  
- **TMDB API** — Free movie data provider  
- **MVVM Architecture** — Clean separation of concerns  
- **LiveData & ViewModel** — Lifecycle-aware data handling  
- **Coil / Glide** — (Optional) For image loading

## Screenshots

*(Add screenshots here in the future for better presentation)*

## Minimum Requirements

- **Android 7.0 (API 24)** and above  
- Internet connection for accessing TMDB API

## Getting Started

### Prerequisites

- Android Studio (latest version recommended)  
- A free API key from [https://www.themoviedb.org/](https://www.themoviedb.org/)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/The-Movie-App.git
