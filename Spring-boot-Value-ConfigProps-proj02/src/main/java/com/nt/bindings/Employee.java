package com.nt.bindings;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="emp.info")
public class Employee {

	    Integer id;
	    String name;
	    String desg;
	    Double salary;
	    List<String> nickNames;
	    Set<String> companies;
	    Map<String,Long> ids;
	    
	    
		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDesg() {
			return desg;
		}


		public void setDesg(String desg) {
			this.desg = desg;
		}


		public Double getSalary() {
			return salary;
		}


		public void setSalary(Double salary) {
			this.salary = salary;
		}


		public List<String> getNickNames() {
			return nickNames;
		}


		public void setNickNames(List<String> nickNames) {
			this.nickNames = nickNames;
		}


		public Set<String> getCompanies() {
			return companies;
		}


		public void setCompanies(Set<String> companies) {
			this.companies = companies;
		}


		public Map<String, Long> getIds() {
			return ids;
		}


		public void setIds(Map<String, Long> ids) {
			this.ids = ids;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", salary=" + salary + ", nickNames="
					+ nickNames + ", companies=" + companies + ", ids=" + ids + "]";
		
		}
	    
	    
}
