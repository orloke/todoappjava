/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package todoapp;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

public class App {

    public static void main(String[] args) {
        ProjectController projectController = new ProjectController();

//        Project project = new Project();
//        project.setName("Projeto teste2");
//        project.setDescription("consegui con");
//        projectController.save(project);
//        project.setId(3);
//        project.setName("J�nior Dering");
//        project.setDescription("ol� a todos");
//        projectController.update(project);
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = " + projects.size());
//
//        projectController.removeById(2);
        TaskController taskController = new TaskController();

        Task task = new Task();
        task.setIdProject(3);
        task.setName("Acordar");
        task.setDescription("Tomar caf�");
        task.setIsCompleted(true);
        task.setDeadline(new Date());
        task.setUpdatedAt(new Date());
        task.setCreatedAt(new Date());

        taskController.save(task);

    }
}
