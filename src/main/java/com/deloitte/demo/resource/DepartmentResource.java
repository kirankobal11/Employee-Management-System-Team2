package com.deloitte.demo.resource;

import com.deloitte.demo.model.Department;
import com.deloitte.demo.service.DepartmentService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/departments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DepartmentResource {

    @Inject
    private DepartmentService departmentService;

    @GET
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GET
    @Path("/{id}")
    public Department getDepartmentById(@PathParam("id") int id) {
        return departmentService.getDepartmentById(id);
    }

    @POST
    public Response createDepartment(Department department) {
        departmentService.createDepartment(department);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateDepartment(@PathParam("id") int id,
