package in.annamalai.springbootreference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.annamalai.springbootreference.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}