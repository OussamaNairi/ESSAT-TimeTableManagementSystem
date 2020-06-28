<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="tn.essatin.model.Nationalite"%>
<%@page import="tn.essatin.model.Identificateur"%>


<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Enseignants</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Tables -->
    <link href="css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">

</head>

<body>
<%@include file="header.jsp" %>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Ajouter un Enseignant</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
             <div class="row">
                <div class="col-lg-12">
                   <div class="panel panel-primary">
                   <div class="panel-heading">
                   Nouveau Enseignant
                        </div>
                        
                        <div class="panel-body">
                        <form action="AjouterEnseignant" method="post">
  <div class="form-group">
    <label >Nom</label>
    <input type="text" class="form-control" name="nom"  placeholder="Nom">
    
  </div>
  <div class="form-group">
    <label >Prenom</label>
    <input type="text" class="form-control" name="prenom" placeholder="Prenom">
  </div>
  <div class="form-group">
    <label>Email</label>
    <input type="text" class="form-control" name="mail" placeholder="Email">
  </div>
  <div class="form-group">
    <label>Adresse</label>
    <input type="text" class="form-control" name="adresse" placeholder="Adresse">
  </div>
  <div class="form-group">
    <label>Telephone</label>
    <input type="text" class="form-control" name="tel" placeholder="Telephone">
  </div>
  <div class="form-group">
    <label>Date de Naissance</label>
    <input type="text" class="form-control" name="dateDeNaissance" placeholder="">
  </div>
  <div class="form-group">
    <label>Lieu de Naissance</label>
    <input type="text" class="form-control" name="lieuDeNaissance" placeholder="Lieu de Naissance">
  </div>
  <div class="form-group">
   <label >Type Identificateur</label>
    <select  class="form-control" name="identificateur"  >
    <c:forEach var="iden" items="${iden}" >
    <option value="${iden.id}"> ${iden.designation}</option> 

</c:forEach>
    </select>
  </div>
  <div class="form-group">
    <label>Numero Identificateur</label>
    <input type="text" class="form-control" name="numeroIdentificateur" placeholder="">
  </div>
  <div class="form-group">
    <label>Sexe</label>
    <input type="text" class="form-control" name="sexe" placeholder="sexe">
  </div>
  <div class="form-group">
    <label >Nationalite</label>
    <select  class="form-control" name="nationalite"  >
    <c:forEach var="na" items="${na}" >
    <option value="${na.id}"> ${na.nom}</option> 

</c:forEach>
    </select>
    <div class="text-right">
                   <a href="AjouterNationalite"><i class="fa fa-plus"></i>Ajouter</a>
                   </div>
  </div>  <div class="form-group">
    <label>CNSS</label>
    <input type="text" class="form-control" name="cnss" placeholder="CNSS">
  </div>
  <div class="form-group">
    <label>CNRPS</label>
    <input type="text" class="form-control" name="cnrps" placeholder="CNRPS">
  </div>
  <div class="form-group">
    <label>Date Entree</label>
    <input type="text" class="form-control" name="dateEntree" placeholder="">
  </div>
  <div class="form-group">
    <label>Observation</label>
    <input type="text" class="form-control" name="observation" placeholder="Observation">
  </div>
  <div class="form-group">
    <label>Situation</label>
    <input type="text" class="form-control" name="situationM" placeholder="Situation">
  </div>
  <div class="form-group">
    <label>Nombre d'enfants</label>
    <input type="text" class="form-control" name="nombreEnfants" placeholder="Nombre d'enfants">
  </div>
  <div class="form-group">
    <label>Diplome</label>
    <input type="text" class="form-control" name="diplome" placeholder="Diplome">
  </div>
  <div class="form-group">
    <label>RIB IBAN</label>
    <input type="text" class="form-control" name="ribIban" placeholder="RIB IBAN">
  </div>
  <div class="form-group">
    <label >Photo</label>
    <input type="file" class="form-control-file" name="image">
  </div>
  <div class="form-group">
    <label>Poste</label>
    <input type="text" class="form-control" name="poste" placeholder="Poste">
  </div>
  <div class="form-group">
    <label>Etablissement d'origine</label>
    <input type="text" class="form-control" name="etablissementOrigine" placeholder="Etablissement d'origine">
  </div>
 

                        <div class="panel-footer">
                        
                            <button type="submit" class="btn btn-primary"><i class="fa fa-save">&nbsp;</i>Enregistrer</button>
                            <button type="reset" class="btn btn-danger"><i class="fa fa-arrow-left">&nbsp;</i>Annuler</button>
                           
                        </div>
                       </form>
                        </div>
                        
                 </div>
                 </div>
                 </div>
                        
                    

                            
        </div>
        <!-- /#page-wrapper -->

    
    <!-- /#wrapper -->

    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Tables -->
    <script src="js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="js/plugins/dataTables/dataTables.bootstrap.js"></script>

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>

</body>

</html>
