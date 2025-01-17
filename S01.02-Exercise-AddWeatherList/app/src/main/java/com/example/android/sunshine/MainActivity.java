/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // COMPLETED (1) Create a field to store the weather display TextView
    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // COMPLETED (2) Use findViewById to get a reference to the weather display TextView
        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        // COMPLETED (3) Create an array of Strings that contain fake weather data
        String[] fakeWeatherData = {
                "Today, Dec 4 - Cloudy - 27°C / 18°C",
                "Tomorrow - Thundershowers - 24°C / 18°C",
                "Tuesday - Rain - 21°C / 18°C",
                "Wednesday - Thunderstorms - 25°C / 18°C",
                "Thursday - Thunderstorms - 29°C / 18°C",
                "Friday - Mostly Sunny - 31°C / 18°C",
                "Saturday - PM Thunderstorms - 30°C / 19°C",
                "Sun, Dec 11 - PM Thunderstorms - 30°C / 19°C",
                "Mon, Dec 12 - Thunderstorms - 30°C / 20°C",
                "Tue, Dec 13 - Thunderstorms - 29°C / 20°C",
                "Wed, Dec 14 - Thunderstorms - 25°C / 18°C",
                "Thu, Dec 15 - Thunderstorms - 24°C / 17°C",
                "Fri, Dec 16 - Thunderstorms - 24°C / 17°C",
                "Sat, Sec 17 - Rain - 24°C / 17°C"
        };

        // COMPLETED (4) Append each String from the fake weather data array to the TextView
        for(String fakeWeatherDay : fakeWeatherData){
            mWeatherTextView.append(fakeWeatherDay+"\n\n\n");
        }
    }
}