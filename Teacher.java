package com;
class Teacher {   //super class
	   String designation = "Teacher";
	   String collegeName = "Regent";
	   void work(){  //method of super class
		System.out.println("Teacher teaching the student");
	   }
	}

	 class ITTeacher extends Teacher {   //sub class
	   String Subject = "Computer Science";
	   public static void main(String args[]){
		ITTeacher obj = new ITTeacher();   //create object of sub class
		System.out.println(obj.designation);
		System.out.println(obj.collegeName);
		System.out.println(obj.Subject);
		obj.work();
	   }
	}
