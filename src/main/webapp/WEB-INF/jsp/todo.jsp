<%@ include file="common/header.jsp" %>
<%@ include file="common/navigation.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Adicionar Usuario</div>
                <div class="panel-body">
                    <form:form method="post" modelAttribute="todo">
                        <form:hidden path="id"/>

                        <fieldset class="form-group">
                            <form:label path="docenteEncargado">Docente encargado</form:label>
                            <form:input path="docenteEncargado" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="docenteEncargado" cssClass="text-warning"/>
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="nombre">Nombre</form:label>
                            <form:input path="nombre" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="nombre" cssClass="text-warning"/>
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="salon">Salon</form:label>
                            <form:input path="salon" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="salon" cssClass="text-warning"/>
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="descripcion">Descripcion</form:label>
                            <form:input path="descripcion" type="text" class="form-control"
                                        required="required"/>
                            <form:errors path="descripcion" cssClass="text-warning"/>
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="horarioInicio">Fecha inicio</form:label>
                            <form:input path="horarioInicio" type="time" class="form-control"
                                        required="required"/>
                            <small class="form-text text-muted">Formato: HH:MM</small>
                            <form:errors path="horarioInicio" cssClass="text-warning"/>
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="horarioFin">Fecha fin</form:label>
                            <form:input path="horarioFin" type="time" class="form-control"
                                        required="required"/>
                            <small class="form-text text-muted">Formato: HH:MM</small>
                            <form:errors path="horarioFin" cssClass="text-warning"/>
                        </fieldset>
                        <button type="submit" class="btn btn-success">Guardar</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="common/footer.jsp" %>