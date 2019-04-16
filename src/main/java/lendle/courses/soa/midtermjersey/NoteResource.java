/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.soa.midtermjersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lendle
 */
@Path("note")
public class NoteResource {

    //2. (18%) return the corresponding note with the given id
    //remember to add the required annotations
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Note getNote(@PathParam("id") long id) {
        return NoteRepository.getNote(id);
    }

    //3. (18%) remove the corresponding note with the given id
    //remember to add the required annotations
    @Path("{id}")
    @DELETE
    public void removeNote(@PathParam("id") long id) {
        NoteRepository.removeNote(id);

    }

    //4. (18%) add a new note to the repository
    //remember to add the required annotations
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void addNote(Note note) {
        NoteRepository.addNote(note);
    }

    //5. (18%) update the corresponding note
    //remember to add the required annotations
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public void updateNote(Note note) {
        NoteRepository.updateNote(note);
    }
}
