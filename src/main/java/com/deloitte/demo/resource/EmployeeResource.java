package com.deloitte.demo.resource;

import com.deloitte.demo.model.Employee;
import com.deloitte.demo.service.EmployeeService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @Inject
    private EmployeeService employeeService;

    @GET
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GET
    @Path("/{id}")
    public Employee getEmployeeById(@PathParam("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @POST
    public Response createEmployee(Employee employee) {
        employeeService.createEmployee(employee);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateEmployee(@PathParam("id") int id, Employee employee) {
        employee.setId(id);
        employeeService.updateEmployee(employee);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteEmployee(@PathParam("id") int id) {
        employeeService.deleteEmployee(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
