package home.avinash.CalculatorService;

import javax.jws.WebMethod;
import javax.jws.WebService;

import home.avinash.CalculatorService.Impl.CalculatorServiceImpl;

@WebService
public class CalculatorService {
	
	CalculatorServiceImpl impl = new CalculatorServiceImpl();
	
	@WebMethod
	 public int add(int a, int b) {
		return impl.add(a,b);
	}

	@WebMethod
	public int subtract(int a, int b) {
		return impl.subtract(a,b);
	}
	
	@WebMethod
	public int multiply(int a, int b) {
		return impl.multiply(a,b);
	}
	
	@WebMethod
	public int divide(int a, int b) {
		return impl.divide(a, b);
	}
	
}
