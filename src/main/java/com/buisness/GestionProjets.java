package com.buisness;

import com.data.GestionProjetsData;
import com.presentation.model.Projet;
import com.presentation.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestionProjets implements I_Gestion_Projet {
    GestionProjetsData gestionProjetsData = new GestionProjetsData();
    GestionUser gestionUser = new GestionUser();

    @Override
    public Projet addProjet(Projet projet) {
        return gestionProjetsData.addProjetData(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return gestionProjetsData.updateProjetData(projet);
    }

    @Override
    public boolean deleteProjet(Projet projet) {
        return gestionProjetsData.deleteProjetData(projet);
    }

    @Override
    public List<Projet> findAllProjets() throws SQLException {
        ResultSet res = gestionProjetsData.findAllProjetsData();
        ArrayList<Projet> projets = new ArrayList<>();
        while (res.next()) {
            Projet projet = new Projet();
            projet.setId(res.getLong("id"));
            projet.setNom(res.getString("nom"));
            projet.setNomClient(res.getString("nomClient"));
            projet.setChefProjet_id(res.getLong("chefProjet_id"));
            projet.setNombreJourDeveloppement(res.getInt("nombreJourDeveloppement"));
            projet.setDateDemarrage(res.getDate("dateDemarrage"));
            projet.setDateLiverison(res.getDate("dateLiverison"));
            projet.setDescription(res.getString("description"));
            projets.add(projet);
        }
        return projets;

    }
}
