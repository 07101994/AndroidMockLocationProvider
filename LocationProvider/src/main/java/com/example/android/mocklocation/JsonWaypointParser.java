package com.example.android.mocklocation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by skreik on 8/15/14.
 */
public class JsonWaypointParser {

    public static Waypoint[] parseWaypointJson(String json)
    {
        try {
            JSONObject reader = new JSONObject(json);
            JSONObject gpx  = reader.getJSONObject("gpx");

            JSONArray waypoints = gpx.getJSONArray("wpt");

            Waypoint[] points = new Waypoint[waypoints.length()];

            for(int i = 0; i < waypoints.length(); i++)
            {
                JSONObject row = waypoints.getJSONObject(i);
                points[i] = new Waypoint(Double.parseDouble(row.getString("-lat")), Double.parseDouble(row.getString("-lon")));
            }

            return points;

        } catch (JSONException e) {
            e.printStackTrace();
        }


        return null;
    }
}
