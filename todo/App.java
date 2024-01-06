package todo;

import java.util.List;
import java.util.Date;

public class App {
  TaskManager gestorTareas = new TaskManager();

  // Agregar una tarea
  Task tarea = new Task("Llamar al médico", new Date(), "Pendiente");
  gestorTareas.agregarTarea(tarea);

  // Listar las tareas 
  List<Task> tareas = gestorTareas.listarTareas();
  for (Task t : tareas) {
      System.out.println(t.getTitulo());
  } 
}
 