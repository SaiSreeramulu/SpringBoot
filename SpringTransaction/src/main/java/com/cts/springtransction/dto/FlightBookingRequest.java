package com.cts.springtransction.dto;

import com.cts.springtransction.entity.PassengerInfo;
import com.cts.springtransction.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;
    
    public FlightBookingRequest() {
    	
    }

	public FlightBookingRequest(PassengerInfo passengerInfo, PaymentInfo paymentInfo) {
		super();
		this.passengerInfo = passengerInfo;
		this.paymentInfo = paymentInfo;
	}

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
    
}