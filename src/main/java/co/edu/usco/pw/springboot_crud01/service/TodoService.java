package co.edu.usco.pw.springboot_crud01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usco.pw.springboot_crud01.model.Todo;
import co.edu.usco.pw.springboot_crud01.repository.TodoRepository;

@Service
public class TodoService implements ITodoService {

    // Inyecctar desde el repositorio
    @Autowired
    private TodoRepository todoRepository;

    //Obtener valores
    @Override
    public List<Todo> getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional<Todo> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(long id, String docenteEncargado, String nombre, String descripcion,
                        String horarioInicio, int salon, String horarioFin, String isDone) {
        todoRepository.save(new Todo(id, docenteEncargado, nombre, descripcion, horarioFin, horarioFin, salon, isDone));
    }

    @Override
    public void deleteTodo(long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }
}