package lpgTask.lpg.data.mappers;

import lpgTask.lpg.models.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet resultSet, int i) throws SQLException {
        Category category = new Category();
        category.setCategory_id(resultSet.getInt("category_id"));
        category.setCategory_name(resultSet.getString("category_name"));
        return category;
    }
}
