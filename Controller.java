package com.klu.ims2;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/login")
	public String Login() {
		return "login";
	}
	
	@GetMapping("/Home")
	public String Home() {
		return "Home";
	}
	
	@GetMapping("/dashboard")
	public String Dashboard() {
		return "dashbord";
	}
	
	@GetMapping("/inventory")
	public String Inventory() {
		return "inventory";
	}
	
	@GetMapping("/supplychain")
	public String SupplyChain() {
		return "SupplyChain";
	}
	@GetMapping("/analytics")
	public String Analytics() {
		return "Analytics";
	}
	@GetMapping("/alerts")
	public String Alerts() {
		return "Alerts";
	}
	@GetMapping("/about")
	public String About() {
		return "About";
	}
	@GetMapping("/features")
	public String Features() {
		return "Features";
	}
	@GetMapping("/signup")
	public String Signup() {
		return "Signup";
	}
	@GetMapping("/settings")
	public String Settings() {
		return "Settings";
	}
	@GetMapping("/profile")
	public String Profile() {
		return "Profile";
	}
	@GetMapping("/bookademo")
	public String Demo() {
		return "Demo";
	}
	@GetMapping("/addproducts")
	public String Addproducts() {
		return "Addproducts";
	}
	@GetMapping("/createshipment")
	public String CreateShipment() {
		return "CreateShipment";
	}
	@GetMapping("/updateinventory")
	public String UpdateInventory() {
		return "UpdateInventory";
	}
	@GetMapping("/exportreport")
	public String ExportReport() {
		return "ExportReport";
	}
	@GetMapping("/runforecast")
	public String RunForecast() {
		return "RunForecast";
	}
	@GetMapping("/track")
	public String Track() {
		return "Track";
	}
	@GetMapping("/switchaccount")
	public String SwitchAccount() {
		return "SwitchAccount";
	}
	
}
