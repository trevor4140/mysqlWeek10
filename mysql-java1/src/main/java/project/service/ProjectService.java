package project.service;
import project.entity.Project;

import java.util.List;
import java.util.NoSuchElementException;

import project.dao.ProjectDao;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
	public List<Project> fetchAllProject() {
		return projectDao.fetchAllProject();
	}
	public Project fetchProjectById(Integer projectId) {
	return  projectDao.fetchProjectById(projectId).orElseThrow(
			() -> new NoSuchElementException(
			"Project with project ID=" +  projectId  + " does not exist."));
	}
}
