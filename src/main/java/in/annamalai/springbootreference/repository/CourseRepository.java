package in.annamalai.springbootreference.repository;

import org.springframework.data.repository.JpaRepository;
import in.annamalai.springbootreference.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}