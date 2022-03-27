package in.annamalai.springbootreference.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.annamalai.springbootreference.model.Course;
import in.annamalai.springbootreference.repository.CourseRepository;
import in.annamalai.springbootreference.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return new ArrayList<>(courseRepository.findAll());
    }
    
    @Override
    public Course getCourse(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }
    
    @Override
    public Course updateCourse(Long courseId, Course course) {
        course.setId(courseId);
        return courseRepository.save(course);
    }
    
    @Override
    public Course patchCourse(Long courseId, Course course) {
        Course updatedCourse = courseRepository.findById(courseId).orElse(null);
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
        Course deletedCourse = courseRepository.findById(courseId).orElse(null);
        courseRepository.delete(deletedCourse);
        return deletedCourse;
    }
}