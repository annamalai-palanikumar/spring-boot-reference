package in.annamalai.springbootreference.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.Autowired;

import in.annamalai.springbootreference.model.Course;
import in.annamalai.springbootreference.repository.CourseRepository;

public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourse() {
        return new ArrayList<>(courseRepository.findAll());
    }
    
    @Override
    public Course getCourse(Long courseId) {
        return courseRepository.findById(courseId);
    }
    
    @Override
    public Course updateCourse(Long courseId, Course course) {
        course.setId(courseId);
        return courseRepository.save(course);
    }
    
    @Override
    public Course patchCourse(Long courseId, Course course) {
        Course updatedCourse = courseRepository.findById(courseId);
        if(course.getName() != null) {
            updatedCourse.setName(course.getName());
        }
        if(course.getAuthor() != null) {
            updatedCourse.setAuthor(course.getAuthor());
        }
        return courseRepository.save(updatedCourse);
    }

    @Override
    public Course deleteCourse(Long courseId) {
        Course deletedCourse = courseRepository.findById(courseId);
        courseRepository.delete(deletedCourse);
        return deletedCourse;
    }
}