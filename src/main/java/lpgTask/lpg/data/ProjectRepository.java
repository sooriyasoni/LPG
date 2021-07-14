package lpgTask.lpg.data;

import lpgTask.lpg.models.Project;

import java.util.List;

public interface ProjectRepository {
    List<Project> findAllProjects();
}
