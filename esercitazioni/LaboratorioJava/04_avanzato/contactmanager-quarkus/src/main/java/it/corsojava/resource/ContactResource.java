package it.corsojava.resource;

import java.net.URI;
import java.util.List;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import it.corsojava.entity.Contact;
import it.corsojava.service.ContactService;

/**
 * REST Resource: espone gli endpoint HTTP della rubrica.
 */
@Path("/api/contacts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContactResource {

    @Inject
    ContactService service;

    @GET
    public List<Contact> findAll(@QueryParam("cognome") String cognome) {
        if (cognome != null && !cognome.isBlank()) {
            return service.findByCognome(cognome);
        }
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {
        Contact contact = service.findById(id);

        if (contact == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(error("Contatto con id " + id + " non trovato"))
                    .build();
        }

        return Response.ok(contact).build();
    }

    @POST
    public Response create(@Valid Contact contact) {
        if (contact == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(error("Il corpo della richiesta è obbligatorio"))
                    .build();
        }

        Contact created = service.create(contact);

        return Response.created(URI.create("/api/contacts/" + created.id))
                .entity(created)
                .build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, @Valid Contact data) {
        if (data == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(error("Il corpo della richiesta è obbligatorio"))
                    .build();
        }

        Contact updated = service.update(id, data);

        if (updated == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(error("Contatto con id " + id + " non trovato"))
                    .build();
        }

        return Response.ok(updated).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        boolean deleted = service.delete(id);

        if (!deleted) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(error("Contatto con id " + id + " non trovato"))
                    .build();
        }

        return Response.noContent().build();
    }

    private ErrorMessage error(String message) {
        return new ErrorMessage(message);
    }

    /**
     * Piccolo oggetto JSON per uniformare i messaggi di errore.
     */
    public static class ErrorMessage {
        public String message;

        public ErrorMessage() {
        }

        public ErrorMessage(String message) {
            this.message = message;
        }
    }
}
