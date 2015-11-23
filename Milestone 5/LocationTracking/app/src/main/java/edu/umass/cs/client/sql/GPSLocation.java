package edu.umass.cs.client.sql;

import edu.umass.cs.client.cluster.Clusterable;

/**
 * This class represents an event report
 * 
 * @author Abhinav Parate
 */
public class GPSLocation implements Clusterable<GPSLocation> {

	/** Report id */
	public int id = -1;
	
	/** timestamp of the event */
	public long timestamp;
	
	/** latitude */
	public double latitude;
	
	/** longitude */
	public double longitude;
	
	/** accuracy */
	public float accuracy;

		
	/**
	 * Constructor without id
	 * @param timestamp
	 * @param lat
	 * @param lng
	 * @param accuracy
	 */
	public GPSLocation(long timestamp, double lat, double lng, float accuracy) {
		this.timestamp = timestamp;
		this.latitude = lat;
		this.longitude = lng;
		this.accuracy = accuracy;
	}
	
	/**
	 * Constructor with report id
	 * @param id
	 * @param timestamp
	 * @param lat
	 * @param lng
	 * @param accuracy
	 */
	public GPSLocation(int id, long timestamp, double lat, double lng, float accuracy) {
		this.id =id;
		this.timestamp = timestamp;
		this.latitude = lat;
		this.longitude = lng;
		this.accuracy = accuracy;
	}
	
	/**
	 * Empty Constructor
	 */
	public GPSLocation() {
		
	}
	
	public boolean equals(GPSLocation r){
		return this.id == r.id;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public float getAccuracy() {
		return accuracy;
	}
	
	public int getId() {
		return id;
	}
	
	public long getTimestamp() {
		return timestamp;
	}

	@Override
	public double distance(GPSLocation other) {
		return distance(getLatitude(), other.getLatitude(), getLongitude(), other.getLongitude(), 0, 0);
	}

	/*
	 * Thanks http://stackoverflow.com/questions/3694380/calculating-distance-between-two-points-using-latitude-longitude-what-am-i-doi !
	 *
	 * Calculate distance between two points in latitude and longitude taking
	 * into account height difference. If you are not interested in height
	 * difference pass 0.0. Uses Haversine method as its base.
	 *
	 * lat1, lon1 Start point lat2, lon2 End point el1 Start altitude in meters
	 * el2 End altitude in meters
	 * @returns Distance in Meters
	 */
	public static double distance(double lat1, double lat2, double lon1,
								  double lon2, double el1, double el2) {

		final int R = 6371; // Radius of the earth

		Double latDistance = Math.toRadians(lat2 - lat1);
		Double lonDistance = Math.toRadians(lon2 - lon1);
		Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
				+ Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
				* Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = R * c * 1000; // convert to meters

		double height = el1 - el2;

		distance = Math.pow(distance, 2) + Math.pow(height, 2);

		return Math.sqrt(distance);
	}
}