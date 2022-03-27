package in.annamalai.springbootreference.service;

import java.util.List;

import in.annamalai.springbootreference.model.Course;

public interface CourseService {
    public Course createCourse(Course course);

    public List<Course> getAllCourses();
    
    public Course getCourse(Long courseId);

    public Course updateCourse(Long courseId, Course course);

    public Course patchCourse(Long courseId, Course course);

    public Course deleteCourse(Long courseId);
}