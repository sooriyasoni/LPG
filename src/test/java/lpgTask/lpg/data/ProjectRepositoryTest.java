package lpgTask.lpg.data;

import lpgTask.lpg.models.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ProjectRepositoryTest {

    @Autowired
    ProjectRepository repository;

    @Test
    void shouldReturnAll() {
        List<Project> projects = repository.findAllProjects();
        assertNotNull(projects);
    }

}
