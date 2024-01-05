package todo;

import java.util.List;
import java.util.ArrayList;

public class TaskManager {

    private List<Task> tareas;

    public TaskManager() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Task tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(Task tarea) {
        tareas.remove(tarea);
    }

    public List<Task> listarTareas() {
        return tareas;
    }
}