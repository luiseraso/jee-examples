/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fup.ims.services;

import edu.fup.ims.bo.ClientLBO;
import edu.fup.ims.model.Client;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Luis Eraso
 */
@Path("/clients")
@Produces({"application/json", "application/xml"})
public class ClientRest {

    @Inject
    ClientLBO clientLBO;

    @GET
    public List<Client> listVariables() {
        return clientLBO.findAll();
    }

}
