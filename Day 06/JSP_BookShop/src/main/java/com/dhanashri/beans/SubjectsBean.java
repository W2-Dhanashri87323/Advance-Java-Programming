package com.dhanashri.beans;

import java.util.ArrayList;
import java.util.List;

import com.dhanashri.daos.BookDao;

public class SubjectsBean {
	private List<String> subjects;

	public SubjectsBean() {
		this.subjects = new ArrayList<>();
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public void fetchSubjects() {
		try(BookDao dao = new BookDao()) {
			  this.subjects = dao.findAllSubjects();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
