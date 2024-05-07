<%@ include file="common/header.jsp" %>
<%@ include file="common/navigation.jsp" %>
<div class="container">

    <div class="panel panel-primary">
        <div class="panel-heading">Portal de acceso - sistema de notas</div>

        <div class="panel-body">
            <p class="text-muted">Si eres admin, haz click en el boton para administrar las clases.</p>
            <button type="button" class="btn btn-primary" onclick="window.location.href='/list-todos'">Portal a
                administrador
            </button>
        </div>

        <div class="panel-body">
            <p class="text-muted">Si eres profesor, haz click en el boton para ver las clases.</p>
            <button type="button" class="btn btn-primary" onclick="window.location.href='/list-professor'">Portal a
                profesores
            </button>
        </div>

    </div>
</div>

<%@ include file="common/footer.jsp" %>