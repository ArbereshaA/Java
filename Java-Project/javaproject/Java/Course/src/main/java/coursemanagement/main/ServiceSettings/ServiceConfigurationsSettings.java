package coursemanagement.main.ServiceSettings;

import coursemanagement.main.ServiceModules.*;
import coursemanagement.main.ServiceModules.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfigurationsSettings {

    @Bean
    public StudentServiceModules costumerServiceService() {
        return new DefaultStudentServiceModules();
    }

    @Bean
    public CourseServiceModules CourseerviceService() {
        return new DefaultCourseServiceModules();
    }

    @Bean
    public ProfessorServiceModules ProfessorService(){return new DefaultProfessorServiceModules(); }
}
