/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.example.android.mocklocation;

/**
 *  Constants used in other classes in the app
 */
public final class LocationUtils {

    // Debugging tag for the application
    public static final String APPTAG = "Location Mock Tester";

    // Create an empty string for initializing strings
    public static final String EMPTY_STRING = new String();

    // Conversion factor for boot time
    public static final long NANOSECONDS_PER_MILLISECOND = 1000000;

    // Conversion factor for time values
    public static final long MILLISECONDS_PER_SECOND = 1000;

    // Conversion factor for time values
    public static final long NANOSECONDS_PER_SECOND =
                    NANOSECONDS_PER_MILLISECOND * MILLISECONDS_PER_SECOND;

    /*
     * Action values sent by Intent from the main activity to the service
     */
    // Request a one-time test
    public static final String ACTION_START_ONCE =
            "com.example.android.mocklocation.ACTION_START_ONCE";

    // Request continuous testing
    public static final String ACTION_START_CONTINUOUS =
                    "com.example.android.mocklocation.ACTION_START_CONTINUOUS";

    // Stop a continuous test
    public static final String ACTION_STOP_TEST =
                    "com.example.android.mocklocation.ACTION_STOP_TEST";

    /*
     * Extended data keys for the broadcast Intent sent from the service to the main activity.
     * Key1 is the base connection message.
     * Key2 is extra data or error codes.
     */
    public static final String KEY_EXTRA_CODE1 =
            "com.example.android.mocklocation.KEY_EXTRA_CODE1";

    public static final String KEY_EXTRA_CODE2 =
            "com.example.android.mocklocation.KEY_EXTRA_CODE2";

    /*
     * Codes for communicating status back to the main activity
     */

    // The location client is disconnected
    public static final int CODE_DISCONNECTED = 0;

    // The location client is connected
    public static final int CODE_CONNECTED = 1;

    // The client failed to connect to Location Services
    public static final int CODE_CONNECTION_FAILED = -1;

    // Report in the broadcast Intent that the test finished
    public static final int CODE_TEST_FINISHED = 3;

    /*
     * Report in the broadcast Intent that the activity requested the start to a test, but a
     * test is already underway
     *
     */
    public static final int CODE_IN_TEST = -2;

    // The test was interrupted by clicking "Stop testing"
    public static final int CODE_TEST_STOPPED = -3;

    // The name used for all mock locations
    public static final String LOCATION_PROVIDER = "fused";

    // An array of latitudes for constructing test data
    public static double[] WAYPOINTS_LAT = {
            44.88519,
            44.88513,
            44.88507,
            44.88503,
            44.88498,
            44.88491,
            44.88486,
            44.8848,
            44.88475,
            44.88469,
            44.88463,
            44.88456,
            44.88451,
            44.88445,
            44.88439,
            44.88433,
            44.88424,
            44.88419,
            44.88417,
            44.88414,
            44.88413,
            44.88413,
            44.88413,
            44.88414,
            44.88415,
            44.88416,
            44.88417,
            44.88418,
            44.88419,
            44.8842,
            44.8842,
            44.88417,
            44.88415,
            44.88415,
            44.88414,
            44.88413,
            44.88413,
            44.88412,
            44.88412,
            44.88412,
            44.88412,
            44.88412,
            44.88412,
            44.88417,
            44.88427,
            44.88438,
            44.88452,
            44.88463,
            44.88474,
            44.88485,
            44.88495
        };

    // An array of longitudes for constructing test data
    public static double[] WAYPOINTS_LNG = {
            -93.40402,
            -93.40401,
            -93.404,
            -93.404,
            -93.40399,
            -93.40399,
            -93.40398,
            -93.40397,
            -93.40396,
            -93.40394,
            -93.4039,
            -93.40387,
            -93.40387,
            -93.40388,
            -93.40388,
            -93.40387,
            -93.40387,
            -93.40387,
            -93.40393,
            -93.40393,
            -93.40387,
            -93.40383,
            -93.40376,
            -93.40369,
            -93.4036,
            -93.40354,
            -93.40346,
            -93.40337,
            -93.4033,
            -93.40321,
            -93.4031,
            -93.40308,
            -93.40317,
            -93.40325,
            -93.40333,
            -93.40341,
            -93.40348,
            -93.40357,
            -93.40367,
            -93.40376,
            -93.40383,
            -93.4039,
            -93.40396,
            -93.40399,
            -93.40402,
            -93.404,
            -93.40402,
            -93.40402,
            -93.40403,
            -93.40405,
            -93.40407
    };

    // An array of accuracy values for constructing test data
    public static float[] WAYPOINTS_ACCURACY = {
        3.0f,
        3.12f,
        3.5f,
        3.7f,
        3.12f,
        3.0f,
        3.12f,
        3.7f,
           1f,1f, 1f, 1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f,1f
    };

    // Mark the broadcast Intent with an action
    public static final String ACTION_SERVICE_MESSAGE =
            "com.example.android.mocklocation.ACTION_SERVICE_MESSAGE";

    /*
     * Key for extended data in the Activity's outgoing Intent that records the type of test
     * requested.
     */
    public static final String EXTRA_TEST_ACTION =
            "com.example.android.mocklocation.EXTRA_TEST_ACTION";

    /*
     * Key for extended data in the Activity's outgoing Intent that records the requested pause
     * value.
     */
    public static final String EXTRA_PAUSE_VALUE =
            "com.example.android.mocklocation.EXTRA_PAUSE_VALUE";

    /*
     * Key for extended data in the Activity's outgoing Intent that records the requested interval
     * for mock locations sent to Location Services.
     */
    public static final String EXTRA_SEND_INTERVAL =
            "com.example.android.mocklocation.EXTRA_SEND_INTERVAL";

    public static final String EXTRA_FILENAME =
            "com.example.android.mocklocation.EXTRA_FILENAME";
}
