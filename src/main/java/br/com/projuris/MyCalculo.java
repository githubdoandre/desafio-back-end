package br.com.projuris;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyCalculo implements Calculo {
	
	@Override
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		List<CustoCargo> listCusto = new ArrayList<>();
	
		List<String> listCargos = new ArrayList<>();	
		for (Funcionario funcionario: funcionarios) {
			if  (!listCargos.contains(funcionario.getCargo())) {
				listCargos.add(funcionario.getCargo());
			}	
		}
		
		for(int i=0; i<listCargos.size(); i++){ 
			String cargo = listCargos.get(i);
			List<Funcionario> listByCargo = funcionarios.stream()
				    .filter(p -> p.getCargo() == cargo).collect(Collectors.toList());
			
		    double soma = listByCargo.stream().map(item-> 
	        	item.getSalario()).mapToDouble(BigDecimal::doubleValue).sum();
		   
		    BigDecimal somab = new BigDecimal(soma, MathContext.DECIMAL64);
			
			CustoCargo custoCargo = new CustoCargo();
			custoCargo.setCargo(cargo);
			custoCargo.setCusto(somab);
			listCusto.add(custoCargo);		
		}
		
		return listCusto;
	}

	@Override
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		List<CustoDepartamento> listCusto = new ArrayList<>();
		
		List<String> listDepartamentos = new ArrayList<>();	
		for (Funcionario funcionario: funcionarios) {
			if  (!listDepartamentos.contains(funcionario.getDepartamento())) {
				listDepartamentos.add(funcionario.getDepartamento());
			}	
		}
		
		for(int i=0; i<listDepartamentos.size(); i++){ 
			String departamento = listDepartamentos.get(i);
			List<Funcionario> listByDepartamento = funcionarios.stream()
				    .filter(p -> p.getDepartamento() == departamento).collect(Collectors.toList());
			
		    double soma = listByDepartamento.stream().map(item-> 
	        	item.getSalario()).mapToDouble(BigDecimal::doubleValue).sum();
		   
		    BigDecimal somab = new BigDecimal(soma, MathContext.DECIMAL64);
			
			CustoDepartamento custoDepartamento = new CustoDepartamento();
			custoDepartamento.setDepartamento(departamento);
			custoDepartamento.setCusto(somab);
			listCusto.add(custoDepartamento);		
		}
		
		return listCusto;
	}

}
