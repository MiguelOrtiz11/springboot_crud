<%@ include file="common/header.jsp" %>
<%@ include file="common/navigation.jsp" %>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/add-todo">Adicionar Usuario</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Lista de registros</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th width="20%">Docente</th>
                    <th width="10%">Nombre</th>
                    <th width="10%">Salon</th>
                    <th width="30%">Descripcion</th>
                    <th width="10%">Fecha Inicio</th>
                    <th width="10%">Fecha Fin</th>
                    <th width="10%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.docenteEncargado}</td>
                        <td>${todo.nombre}</td>
                        <td>${todo.salon}</td>
                        <td>${todo.descripcion}</td>
                        <td>${todo.horarioInicio}</td>
                        <td>${todo.horarioFin}</td>
                        <td><a type="button" class="btn btn-success"
                               href="/update-todo?id=${todo.id}">Actualizar</a>
                            <a type="button" class="btn btn-warning"
                               href="/delete-todo?id=${todo.id}">Eliminar</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<%@ include file="common/footer.jsp" %>