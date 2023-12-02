package com.buisness;

import com.presentation.model.Projet;
import com.presentation.model.Technologie;
import com.presentation.model.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface I_Gestion_Projet {
    Projet addProjet(Projet projet);
    Projet updateProjet(Projet projet);
    boolean deleteProjet(Projet projet);
    List<Projet> findAllProjets() throws SQLException;
    List<Projet> findAllProjetsByEmailChef(String email);

    Projet getProjetById(long l);

    void addMethodologieData(String methodologie, long l);

}
