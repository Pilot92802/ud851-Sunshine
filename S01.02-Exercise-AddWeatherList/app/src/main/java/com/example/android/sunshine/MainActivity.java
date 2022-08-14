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
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView weatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        weatherDisplay = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String [] weatherDataArray = {"Temperature: 80 deg"
                                        ,"Humidity: 40 pct"
                                        ,"Conditions: Partly Cloudy"
                                        ,"Pressure: Steady"
                                        ,"Data1: keeping going to test scroll"
                                        ,"Data2: keeping going to test scroll"
                                        ,"Data3: keeping going to test scroll"
                                        ,"Data4: keeping going to test scroll"
                                        ,"Data5: keeping going to test scroll"
                                        ,"Data6: keeping going to test scroll"
                                        ,"Data7: keeping going to test scroll"
                                        ,"Data8: keeping going to test scroll"
                                        ,"Data9: keeping going to test scroll"
                                        ,"Data10: keeping going to test scroll"
                                        ,"Data11: keeping going to test scroll"
                                        ,"Data12: keeping going to test scroll"
                                        ,"Data13: keeping going to test scroll"
        };

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String weatherData : weatherDataArray){
            weatherDisplay.append(weatherData + "\n\n");
        }
    }
}