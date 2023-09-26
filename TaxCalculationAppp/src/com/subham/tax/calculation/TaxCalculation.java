package com.subham.tax.calculation;

import java.util.ArrayList;
import java.util.List;

import com.subham.tax.taxproperty.AddProperty;
import com.subham.tax.taxproperty.AddVehicle;

import java.util.Collection;

public class TaxCalculation {
	
	public void PropTax(AddProperty ad,int id) {
		
		System.out.println("PROPERTY TAX FOR PROPERTY ID -"+id+" is "+ad.getTax());
	  
	  
	 }
public void vehTax(ArrayList<AddVehicle> ad,String vehReg) {
		
	for(AddVehicle veh:ad) {
		if(veh.getRegistrationNumber().equals(vehReg)) {
			System.out.println("VEHICLE TAX FOR REGISTRATION NO - "+vehReg+" IS "+veh.getTax());
		}
	}
	  
	 

}
}
