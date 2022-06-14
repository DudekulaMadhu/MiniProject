package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.bean.TripBooking;

public interface TripBookingDAO extends JpaRepository<TripBooking, Integer>{

}
