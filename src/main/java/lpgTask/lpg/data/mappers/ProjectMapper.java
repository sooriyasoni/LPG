package lpgTask.lpg.data.mappers;

import lpgTask.lpg.models.Category;
import lpgTask.lpg.models.Project;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectMapper implements RowMapper<Project> {
    @Override
    public Project mapRow(ResultSet resultSet, int i) throws SQLException {
        Project project = new Project();
        project.setProject_id(resultSet.getInt("project_id"));
        project.setName(resultSet.getString("name"));
        project.setDescription(resultSet.getString("description"));
        project.setCreation_date(resultSet.getDate("creation_date").toLocalDate());
        project.setUpdate_date(resultSet.getDate("update_date").toLocalDate());
        project.setLast_purchased_date(resultSet.getDate("last_purchased_date").toLocalDate());
        CategoryMapper categoryMapper = new CategoryMapper();
        project.setCategory(categoryMapper.mapRow(resultSet, i) );
        return project;
    }
}
