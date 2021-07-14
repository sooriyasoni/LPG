package lpgTask.lpg.data;

import lpgTask.lpg.data.mappers.ProjectMapper;
import lpgTask.lpg.models.Project;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectJDBCTemplateRepository implements ProjectRepository{
    private final JdbcTemplate jdbcTemplate;

    public ProjectJDBCTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Project> findAllProjects() {
        final String sql = "Select ID, NAME, DESCRIPTION, CATEGORY_ID, " +
                "CREATION_DATE, UPDATE_DATE, LAST_PURCHASED_DATE" +
                "from project";
        return jdbcTemplate.query(sql, new ProjectMapper());
    }
}
