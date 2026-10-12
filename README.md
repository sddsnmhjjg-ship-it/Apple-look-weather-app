# Apple-Look Weather App (Windows .exe, Android .apk & Web)

A 60+ FPS iOS-inspired real-time weather application for Windows, Android & Web featuring a WebGL volumetric cloud & sky shader, live rain/snow physics with glass-card condensation droplets, official regional government weather alerts, interactive CARTO Doppler radar/wind/temperature map, and real-time solar arc tracking.

## Downloads (Latest Release 1.0.0)

| Platform / Package | Direct Download Link | Description |
| :--- | :--- | :--- |
| **Windows Desktop App (.exe)** | **[Download Weather-App.exe](https://github.com/sddsnmhjjg-ship-it/Apple-look-weather-app/releases/download/v1.0.0/Weather-App.exe)** | Standalone single-file Windows 10/11 desktop app (~3.2 MB, no install required) |
| **Android App (.apk)** | **[Download Weather-App.apk](https://github.com/sddsnmhjjg-ship-it/Apple-look-weather-app/releases/download/v1.0.0/Weather-App.apk)** | Ready-to-install 60+ FPS Android APK |
| **Web & App Source Code (.zip)** | **[Download Apple-Look-Weather-Source-Code.zip](https://github.com/sddsnmhjjg-ship-it/Apple-look-weather-app/releases/download/v1.0.0/Apple-Look-Weather-Source-Code.zip)** | Standalone Web HTML + Apple Weather cloud assets + Capacitor config |
| **Full Repository Source (.zip)** | **[Download Full Repo Source (.zip)](https://github.com/sddsnmhjjg-ship-it/Apple-look-weather-app/archive/refs/tags/v1.0.0.zip)** | Complete repository including Android Gradle project |
| **Single-File Web App (weather.html)** | **[View / Download weather.html](https://github.com/sddsnmhjjg-ship-it/Apple-look-weather-app/raw/main/weather.html)** | Main HTML5 / WebGL / Canvas source file |

> Browse all releases on the **[GitHub Releases Page](https://github.com/sddsnmhjjg-ship-it/Apple-look-weather-app/releases)**.

## Key Features
- **60+ FPS Mobile & Desktop Engine**: Half-resolution mediump volumetric cloud shader with spatial early-exit culling, pre-baked GPU particle sprite atlas, and batched canvas draw calls.
- **Dynamic Precipitation & Wet Glass Physics**: Real-time rain streaks, top-rim splashes, clinging/sliding water droplets on glass cards, and multi-depth falling snow.
- **Official Regional Government Weather Alerts**: Live NOAA/NWS CAP alerts + regional meteorological agency warnings (TMD, JMA, Environment Canada, Met Office, MeteoAlarm) with Apple-style blur-fade expansion.
- **Real-Time Solar Position Arc**: Live quadratic Bézier subdivision tracking the sun's exact position between local sunrise and sunset.
- **Interactive CARTO Weather Map**: Live RainViewer Doppler radar timeline, animated wind streamlines, and thermal layers.
