package info.inetsolv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/kishore")
public class EmployeeService {

	//@GetMapping(produces = { "application/json" })
	// @RequestMapping(produces= {"application/json"})
	public String display() {
		return "welcome to spring rest";
	}

	@GetMapping(produces = {"application/xml"})
	public Employee Show() {
		return new Employee(10, "kishore", 2000d);
	}

}
