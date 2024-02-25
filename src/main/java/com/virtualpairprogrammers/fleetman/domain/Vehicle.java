package com.virtualpairprogrammers.fleetman.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	private String name;
	private String odometer;
	private String status;
	private String latLong;
	private String currentDriver;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOdometer() {
		return odometer;
	}

	public void setOdometer(String odometer) {
		this.odometer = odometer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLatLong() {
		return latLong;
	}

	public void setLatLong(String latLong) {
		this.latLong = latLong;
	}

	public String getCurrentDriver() {
		return currentDriver;
	}

	public void setCurrentDriver(String currentDriver) {
		this.currentDriver = currentDriver;
	}

	@Override
	public String toString() {
		return "Vehicle{" + "id=" + id + ", name='" + name + '\'' + ", odometer='" + odometer + '\'' + ", status='" + status + '\''
				+ ", latLong='" + latLong + '\'' + ", currentDriver='" + currentDriver + '\'' + '}';
	}

}
