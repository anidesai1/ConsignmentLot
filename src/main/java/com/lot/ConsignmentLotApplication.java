package com.lot;

import com.lot.model.Car;
import com.lot.model.Owner;
import com.lot.model.Truck;
import com.lot.model.Vehicle;
import com.lot.service.OwnerService;
import com.lot.service.VehicalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConsignmentLotApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConsignmentLotApplication.class, args);

		OwnerService ownerService = context.getBean(OwnerService.class);

		Owner owner = new Owner();
		owner.setName("Ani");

		owner = ownerService.save(owner);

		VehicalService vehicalService = context.getBean(VehicalService.class);

		Truck truck = new Truck();
		truck.set4wd(true);
		truck.setMake("Dodge");
		truck.setOwner(owner);

		Vehicle v1 = vehicalService.save(truck);

		Car car = new Car();
		car.setMake("Ford");
		car.setType("Fiesta");
		car.setOwner(owner);

		Vehicle v2 = vehicalService.save(car);

		System.out.println(v1.getId());
		System.out.println(v1.getMake());
		System.out.println(v2.getId());
		System.out.println(v2.getMake());
	}

}
