package com.devopsfun.command;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.devopsfun.searching.Student;

@FunctionalInterface
interface StudentCriterion {
	// public boolean test(Student s );
	public int test2(Student s);

}

class EnthusiasticCriterion implements StudentCriterion {

	@Override
	public int test2(Student s) {
		// TODO Auto-generated method stub
		return s.getCources().size() * 2;
	}

}

class SmartCriterion implements StudentCriterion {

	@Override
	public int test2(Student s) {
		// TODO Auto-generated method stub
		return (int) (s.getGrade() * 3);
	}

}

class School {
	private static final Logger log = LoggerFactory.getLogger(RunningWild.class);

	public static void showStudents(List<Student> ls) {
		for (Student s : ls) {

			log.info("Student " + s);
		}
	}

	public static void showStudents(List<Student> ls, StudentCriterion c) {
		for (Student s : ls) {
			// if ()

			log.info("test " + c.test2(s));
		}
	}

	public static void showEnthusiasticStudents(List<Student> ls, StudentCriterion c) {
		log.info("Enth ");
		for (Student s : ls) {

			log.info("test " + c.test2(s));
 		}
	}

@Component
public class RunningWild implements CommandLineRunner {
	
	private final Logger logger = LoggerFactory.getLogger(RunningWild.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List <Student>  list = new ArrayList<Student>();
				
				
	list.add(new Student ("Lee", 4.3,"Math" ));

				
	list.add(new Student ("Fred", 3.3,"Math" ,"Geo"));
			list.add( new Student ("JAmes", 3.3,"Math" ,"Geo"));
					list.add(		new Student ("Nisse", 3.2,"Math" ,"Geo","Art"));
							list.add(	new Student ("Ola", 3.0,"Math" ,"Geo","Art","Data")
				
				);
	
	showStudents(list);

		
		
	}
}
	
	
	
	
	

}
