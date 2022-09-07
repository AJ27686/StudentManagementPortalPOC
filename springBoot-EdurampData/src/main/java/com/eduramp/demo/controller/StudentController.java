package com.eduramp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduramp.demo.dto.Student;
import com.eduramp.demo.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> list() {
		List<Student> list = studentRepository.findAll();
		return list;
	}

	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody List<Student> studentList) {
		studentRepository.saveAll(studentList);
	}

	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student update(@RequestBody Student student) {
		Student updatedStudent = studentRepository.save(student);
		return updatedStudent;
	}

	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		studentRepository.deleteById(id);
	}

	@GetMapping(path = "/find/{id}")
	public Student findById(@PathVariable int id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}

	@GetMapping(path="/find/name/{name}")
	public List<Student> findByName(@PathVariable("name") String name){
		return studentRepository.findByName(name);
	}

	@GetMapping(path = "find/address/{address}")
	public List<Student> listByAddress(@PathVariable("address") String address) {
		return studentRepository.findByAddress(address);
	}

	@GetMapping(path = "find/name/{name}/address/{address}")
	public List<Student> findByNameAndAddress(@PathVariable("name") String name, @PathVariable("address") String address) {

		return studentRepository.findByNameAndAddress(name, address);

	}

}
