package dibe.develop.marketplace;

import dibe.develop.marketplace.entity.Currency;
import dibe.develop.marketplace.entity.Person;
import dibe.develop.marketplace.entity.Vehicle;
import dibe.develop.marketplace.enums.Body;
import dibe.develop.marketplace.enums.Transmission;
import dibe.develop.marketplace.service.PersonService;
import dibe.develop.marketplace.service.VehicleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDateTime;
import java.util.stream.Stream;

@SpringBootApplication
public class PriceImBoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceImBoxApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PersonService personService, VehicleService vehicleService) {
		return args -> {
			Stream.of("John Snow", "Julie Caesar", "Jennifer Lopez", "Helen Whatever", "Rachel Swift", "Goce Adzhiski").forEach(name -> {
				String[] nameSurname = name.split(" ");
				Person person = new Person(nameSurname[0], nameSurname[1], nameSurname[0].toLowerCase() + "." + nameSurname[1].toLowerCase() + "@domain.com");
				personService.save(person);
			});
			Stream.of("BMW E30", "Nissan Skyline", "Suzuki Maruti", "Opel Astra").forEach(name -> {
				String[] makeModel = name.split(" ");
				Vehicle vehicle = new Vehicle();
				vehicle.setMake(makeModel[0]);
				vehicle.setModel(makeModel[1]);
				vehicle.setHp(130);
				vehicle.setFuel("Petrol");
				vehicle.setCubic(2300);
				vehicle.setProductionYear(1989);
				vehicle.setKilometers(115000);
				vehicle.setColor("Black");
				vehicle.setTransmission(Transmission.MANUAL);
				vehicle.setRegistration(LocalDateTime.now());
				vehicle.setCountryOfRegistration("Germany");
				vehicle.setEmissions("Euro 4");
				vehicle.setBody(Body.WAGON);
				vehicle.setSteering("Left");
				vehicle.setDescription("FULL OPREMA NOVO NOVO");
				vehicle.setPrice(0.314);
				vehicle.setCurrency(Currency.BITCOIN);
				vehicle.setVIN("WZ008271237821");
				vehicle.setOwnerId(personService.findByNameAndSurname("Goce", "Adzhiski").getId());
				vehicleService.save(vehicle);
			});
			personService.findAll().forEach(System.out::println);
			vehicleService.findAll().forEach(System.out::println);
		};
	}
}
