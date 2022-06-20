package com.ankita.model;

public class Employee {
        private String firsrName;
        private String lastName;
		public Employee(String firsrName, String lastName) {
		
			this.firsrName = firsrName;
			this.lastName = lastName;
		}
		public String getFirsrName() {
			return firsrName;
		}
		public void setFirsrName(String firsrName) {
			this.firsrName = firsrName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
}
