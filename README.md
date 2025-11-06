# RCO Auctions - Android Application

An Android application for managing and participating in auctions.

## Features

- **User Authentication** - Secure login system
- **Auction Listings** - View active and closed auctions
- **Auction Details** - Detailed view of auction items with countdown timers
- **Bidding System** - Place bids on auction items
- **Bid History** - Track your bids and bidding activity
- **Location Integration** - View auction locations on maps
- **Filtering** - Filter auctions by date, status, and other criteria

## Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **Networking**: Retrofit + OkHttp
- **Image Loading**: Glide, Picasso
- **Maps**: Google Maps SDK
- **UI**: Material Design Components
- **Dependency Injection**: Manual DI
- **Coroutines**: For asynchronous operations

## Project Structure

```
com.rco.auctions/
├── data/
│   ├── models/          # Data models
│   ├── network/         # API service interfaces
│   └── repository/      # Data repositories
├── ui/
│   ├── auction/         # Auction screens
│   ├── bid/             # Bid screens
│   ├── auth/            # Authentication screens
│   ├── main/            # Main screen
│   └── base/            # Base classes
└── utils/               # Utility classes
```

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/MuhammadNaeemBajwa/RCOAuctions.git
   cd RCOAuctions
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned directory

3. **Configure API Credentials**
   - Update the base URL in `RetrofitClient.kt` if needed
   - Add your Google Maps API key in `AndroidManifest.xml`

4. **Build and Run**
   - Connect an Android device or start an emulator
   - Click "Run" in Android Studio

## Requirements

- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 35 (Android 15)
- **Compile SDK**: 35

## Dependencies

See `app/build.gradle` for a complete list of dependencies.

## API Endpoints

The app connects to RCO Fox server:
- Base URL: `https://www.rcofox.com/`
- Auction Header List
- Auction Detail List
- Bid Management
- Max Bid Tracking

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is proprietary software. All rights reserved.

## Contact

For any queries or support, please contact the development team.

---

**Note**: This is a work in progress. More features will be added in future releases.

