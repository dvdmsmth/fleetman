package com.virtualpairprogrammers.fleetman.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtualpairprogrammers.fleetman.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	/**
	 * Finding a Vehicle by its name.
	 * 
	 * @param name
	 *            we are searching for.
	 * @return a single Vehicle.
	 */
	public Vehicle findByName(String name);
}
